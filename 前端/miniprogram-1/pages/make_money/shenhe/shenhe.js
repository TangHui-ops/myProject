// pages/shenhe/shenhe.js
const app=getApp();
Page({
  data:{
    currentTab:0,
    insd:true,
    head:[],
    obj:[],
    texts:[],
    amage:[],
    Idi:1,
    },

    swiperTab(e){
      let index=e.detail.current;
      
      this.setData({
        currentTab:index,
      })
    },

    clickTab:function(e){
     var thtt = this;  
     var Idis = e.target.dataset.auditid
     wx.request({
      url: 'http://localhost:8080/weixingxiaocx/trialLog/list?auditId='+Idis,
      success:function(res){
        // console.log(res)
        thtt.setData({
          texts : res.data
        })
       }
     })
      if( this.data.currentTab === e.target.dataset.current ) { 
        return false; 
       } else { 
      this.setData({
        currentTab: e.currentTarget.dataset.idx,
        Idi:e.target.dataset.auditid
        })
        //全局变量
        app.globalData.currentTab = e.currentTarget.dataset.idx;
       }

      },

      onShow() {
        this.setData({
          currentTab: app.globalData.currentTab,
        })
      },
      swiperChange: function (e) {
        this.setData({
          currentTab: e.detail.current,
        })
        //全局变量
        app.globalData.currentTab = e.detail.current;
      },

    handleClick(event){
      this.setData({
        trialId :event.currentTarget.dataset.trialid
      })
      var id = this.data.trialId
      wx.navigateTo({
        url: '../rwxq/rwxq?id='+id,
      })
    },

   

    
    onLoad:function(options){
      // 页面初始化 options为页面跳转所带来的参数
     },
    
    

     onReady:function(){ 
      var that = this;
      var Id = this.data.Idi; 
     
      wx.request({
        url: 'http://localhost:8080/weixingxiaocx/auditType/auditTypeList',
        success:function(res){
       that.setData({
        head : res.data,
      }) 
    }
  })
      wx.request({
        url: 'http://localhost:8080/weixingxiaocx/trialLog/list?auditId='+Id,
        success:function(res){
          // console.log(res)
          that.setData({
            texts : res.data
          })  
        }
      })
   
  },
})
