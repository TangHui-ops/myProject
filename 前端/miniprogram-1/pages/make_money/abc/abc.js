// abc/abc.js
const app = getApp()

Page({

  data: {
    navbarTitle:[],
    defaultTypeIndex:0,
    defaultTypeId:1,
    newMissionList:[],
    index:0,
  },

  search(e){
    wx.navigateTo({
      url: '../search/search',
    })
  },

  NewDetail(e){
    var detailid = e.currentTarget.dataset.detailid;
    wx.navigateTo({
      url: '../task/task?detailid='+detailid,
    })
  },
  
  onLoad:function(){
    var that = this;
    wx.request({
      // url: app.serverUrl +'/weixingxiaocx/missionType/selectTypeName',
      url: 'http://localhost:8080//weixingxiaocx/MissionType/selectTypeName',

      success (res) {
        var navbarTitles = res.data
        that.setData({
          navbarTitle:navbarTitles
        })
      }
    })
    that.fetchMissionList()
  },

  hearItemClick(e){
    var that = this
    var index = e.currentTarget.dataset.index
    this.setData({
      index:index
    })
    console.log(this.data.index)
    var typeid = e.currentTarget.dataset.typeid;

    that.setData({
      defaultTypeId:typeid
    })
    
    if(index === 0){
      wx.request({
        url: 'http://localhost:8080//weixingxiaocx/Mission/selectByNewest',
        success(res){
          var newList = res.data;
            that.setData({
              newMissionList:newList
            })
        }
      })
    }else if(index === 1){
      wx.request({
        url: 'http://localhost:8080//weixingxiaocx/Mission/selectByAll',
        success(res){
          var allList = res.data;
            that.setData({
              newMissionList:allList
            })
        }
      })
    }else if(index === 2){
      wx.request({
        url: 'http://localhost:8080//weixingxiaocx/Mission/priority',
        success(res){
          var priorityleList = res.data;
            that.setData({
              newMissionList:priorityleList
            })
        }
      })
    }else if(index === 3){
      wx.request({
        url: 'http://localhost:8080//weixingxiaocx/Mission/PopData',
        success(res){
          var popleList = res.data;
            that.setData({
              newMissionList:popleList
            })
        }
      })
    }else if(index === 4){
      wx.request({
        url: 'http://localhost:8080//weixingxiaocx/Mission/appleData',
        success(res){
          var appleList = res.data;
            that.setData({
              newMissionList:appleList
            })
        }
      })
    }else{
      var _index = index+1
      console.log('index:'+_index)
      wx.request({
        url: "http://localhost:8080//weixingxiaocx/Mission/selByTypeId/"+_index,
        success(res){
          var missionList = res.data;
            that.setData({
              newMissionList:missionList
            })
        }
      })
    }

    this.setData({
      defaultTypeIndex:index
    })

  },

  fetchMissionList(){
    var that = this;

    wx.request({
      url: 'http://localhost:8080//weixingxiaocx/Mission/selectByNewest',
      success(res){
        var newList = res.data;
          that.setData({
            newMissionList:newList
          })
      }
    })
  },
})