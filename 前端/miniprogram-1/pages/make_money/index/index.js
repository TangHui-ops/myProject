//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
    nowTime:new Date(),
    indexCurr:0,
    navbarTitle: ['接单任务','接单记录','我的发布'],
    trialLogs:[],
    auditList:["全部","待提交","审核中","不合格","已完成"],
    publishList:[],
    missionHeadline:null
  },

  hearItemClick(event){
    const index = event.currentTarget.dataset.index;
    if(index == 0){
      //调用获取系统消息列表函数
      this.getTrialLogList();
    }else if(index == 1){
      //调用获取系统消息列表函数
      this.getTrialLogList();
    } else if(index == 2){
      this.getMissionPublish();
    }
    this.setData({
      indexCurr:index
    })
  },

  onLoad:function(options){
    //调用获取系统消息列表函数
    this.getTrialLogList();
  },
  
  //我的发布
  getMissionPublish(){
    var that=this;
    wx.request({
      url: 'http://localhost:8080/weixingxiaocx/Mission/selectPublish',
      method:'GET',
      data:{},
      success:function(res){
        console.log(res)
        var publishList=res.data;
        console.log(publishList)
        if(publishList==null){
          var toastText='获取数据失败';
          wx.showToast({
            title: toastText,
            icon:'',
            duration:2000 //弹出时间
          })
        }else{
          that.setData({
            publishList:publishList
          })
        }
      }
    })
  },
  //接单任务
  getTrialLogList(){
    var that=this;
    wx.request({
      url: 'http://localhost:8080/weixingxiaocx/trialLog/trialLogList',
      method:'GET',
      data:{},
      success:function(res){
        var trialLogs=res.data;
        if(trialLogs==null){
          var toastText='获取数据失败';
          wx.showToast({
            title: toastText,
            icon:'',
            duration:2000 //弹出时间
          })
        }else{
          that.setData({
            trialLogs:trialLogs
          })
        }
      }
    })
  },
  
  //审核
  AuditType:function(e){
    var that=this;
    var index = e.currentTarget.dataset.index
    console.log(index)
    if(index == 0){
      this.getTrialLogList()
    }else if(index == 1){
      wx.request({
        url: 'http://localhost:8080/weixingxiaocx/trialLog/selectNotSubmit',
        method:'GET',
        success:function(res){
          var notSubmit = res.data;
          that.setData({
            trialLogs:notSubmit
          });
        }
      })
    }else if(index == 2){
      wx.request({
        url: 'http://localhost:8080/weixingxiaocx/trialLog/selectByAuditId',
        method:'GET',
        success:function(res){
          var auditList = res.data;
          that.setData({
            trialLogs:auditList
          });
        }
      })
    }else if(index == 3){
      wx.request({
        url: 'http://localhost:8080/weixingxiaocx/trialLog/selectByNotAudit',
        method:'GET',
        success:function(res){
          var notAuditList = res.data;
          that.setData({
            trialLogs:notAuditList
          });
        }
      })
    }else if(index == 4){
      wx.request({
        url: 'http://localhost:8080/weixingxiaocx/trialLog/selectByAuditFinish',
        method:'GET',
        success:function(res){
          var auditListFinish = res.data;
          that.setData({
            trialLogs:auditListFinish
          });
        }
      })
    }
    
  },

  //删除任务记录
  shanchu:function(e){
    var that=this;
    wx.showModal({
      title: '提示',
      content: '确定要删除吗？',
      success:function(sm){
        if(sm.confirm){
          wx.request({
            url: 'http://localhost:8080/weixingxiaocx/trialLog/deltrialLogById',
            data: { 
              trialId: e.target.dataset.trialid
            },
            method:'GET',
            success:function(res){
              console.log(e)
              var result=res.statusCode;
              var toastText="删除成功";
              if(result!=200){
                toastText = "删除失败";
              }else{
                that.data.trialLogs.splice(e.target.dataset.index,1)
                that.setData({
                  trialLogs:that.data.trialLogs
                });
              }
              wx.showToast({
                title: toastText,
                icon:'',
                duration:2000
              });
            }
          })
        }
      }
    })
  },
  //删除任务发布
  shanchu2:function(e){
    var that=this;
    wx.showModal({
      title: '提示',
      content: '确定要删除吗？',
      success:function(sm){
        if(sm.confirm){
          wx.request({
            url: 'http://localhost:8080/weixingxiaocx/Mission/delMissionById',
            data: { 
              missionId: e.target.dataset.missionid
            },
            method:'GET',
            success:function(res){
              console.log(e)
              var result=res.statusCode;
              var toastText="删除成功";
              if(result!=200){
                toastText = "删除失败";
              }else{
                that.data.missionList.splice(e.target.dataset.index,1)
                that.setData({
                  missionList:that.data.missionList
                });
              }
              wx.showToast({
                title: toastText,
                icon:'',
                duration:2000
              });
            }
          })
        }
      }
    })
  },

   //跳转到任务记录详情页
  handleDetail:function(e){
    var trialId = e.currentTarget.dataset.trialid
    console.log(trialId)
    wx.navigateTo({
      url: '../Mytask/Mytask?trialId='+trialId,
    })
  },
  //跳转到我的发布详情页
  handleDetail2:function(e){
    var missionId = e.currentTarget.dataset.missionid
    //console.log(missionId)
    wx.navigateTo({
      url: '../Mytaskpublish/Mytaskpublish?missionId='+missionId,
    })
  },

  // 跳转接单赚钱
  makeMoney:function(event){
    wx.navigateTo({
      url: '../abc/abc',
    })
  },
  indexHome:function(event){
    wx.navigateTo({
      url: '../home/home',
    })
  }
})
