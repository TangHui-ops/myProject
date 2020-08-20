// task/task.js.js
Page({
  ju:function(event){
    wx.navigateTo({
      url: '/pages/jubao/jubao',
    })
  },
  qiangdan:function(event){
    wx.navigateTo({
      url: '',
    })
  },
  diuqi:function(event){
    wx.navigateTo({
      url: 'url',
    })
  },
  fhsy:function(event){
    wx.navigateTo({
      url: '/pages/home/home',
    })
  },
  data: {
    mHidden:true,
    task1:{
      title:"标题： ",
      publisher:"发布方：",
      number:"编号：",
      category:"类别：",
      unitprice:"单价：",
      verification:"文字验证：",
      remark:"备注：",
      zhidingdaoqi:"置顶到期：",
      deadline:"截止时间："
    },
    // taskDetail:{
    //   title:"1分钟贷任性完成",
    //   publisher:" 941242",
    //   number:"2136345",
    //   category:"高价",
    //   unitprice:"8.0",
    //   verification:"姓名+手机号后四位",
    //   remark:"不限苏宁新老用户，只限首次申请任性贷有额度秒过，无须借款。1分钟就能完成任务!已后台数据为准必须开流做单!只需要微信操作、1分钟出额度!",
    //   zhidingdaoqi:"2020-05-14 14:57:02",
    //   deadline:"2020-06-1 14:57:02"
    // },
    trialLogs:[],
    imgArr:[],
    img:''
  },
  changeModel:function(){
    this.setData({
      mHidden:true
    });
  },
  modelCancel:function(){
    this.setData({
      mHidden:true
    });
  },
  diuqi:function(){
    this.setData({
      mHidden:true
    });
  },

  //双击，放大图片
  handleImage :function(event){
    console.log(event)
    var that = this,
    index = event.currentTarget.dataset.index,
    img = that.data.img;
    wx.previewImage({
      current: img[index],
      urls: img
    })
  },

  // handleShowmodal1(){
  //   wx.showModal({
  //     title:'请按备注及操作说明完成任务，完成后按要求在【我的任务】里. 上传验证图，请在20分钟内完成操作，超时您将需要重新抢单。',
  //     showCancel: false,
  //     success: function(res){
  //       console.log(res)
  //       if(res.confirm){
  //         wx.navigateTo({
  //           url: '/pages/tpyz/tpyz',
  //         })
  //        console.log("用户点击了确定按钮")
  //      }
       
  //     }
  
  //   })
  
  // },
  // handleShowmodal(){
  //   wx.showModal({
  //     title:'选择丢弃任务将不再对您展示，您确认丢弃吗？',
  //     success: function(res){
  //      console.log(res)
  //      if(res.cancel){
  //        console.log("用户点击了取消按钮")
  //      }
  //      if(res.confirm){
  //        wx.navigateTo({
  //          url: '/pages/jdzq/jdzq',
  //        })
  //       console.log("用户点击了确定按钮")
  //     }
      
  //    }
        
  //   })
 
  // },

  onLoad:function(options){
    var that=this;
    wx.request({
      url: 'http://localhost:8080/weixingxiaocx/trialLog/selectByTrialId',
      method:'GET',
      data:{
        trialId:options.trialId
      },
      success:function(res){
        var trialLogs=res.data;
         //console.log(trialLogs)
         var images = trialLogs.missionPattern;
         var imgArr = []
         imgArr.push(images)
         for (var i = 0; i < imgArr.length; i++) {
           var im = images[i]
         }
        
         if (images != null && images != undefined && images != '') {
           im = JSON.parse(images)
        }
        that.setData({
          trialLogs:trialLogs,
          img: im
          
        })
        if(trialLogs==null){
          var toastText='获取数据失败';
          wx.showToast({
            title: toastText,
            icon:'',
            duration:2000 //弹出时间
          })
        }
      }
    })
  }
})