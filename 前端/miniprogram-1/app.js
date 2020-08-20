//app.js
import request from "service/nelwork.js";
// App({ globalData: { name: '张三', age: 18 }, onLoad: function(){ console.log(this.globalData.name); } })

var a = "ssss";

App({
  onLaunch: function () {
    // 展示本地存储能力
    var logs = wx.getStorageSync('logs') || []
    logs.unshift(Date.now())
    wx.setStorageSync('logs', logs)


    // 登录
    wx.login({
      success:function(){
        
        wx.getUserInfo({
         success:function(res){
         var simpleUser = res.userInfo;
         console.log(simpleUser)
         request({
          url:'tenlu',
          data:{
            name:simpleUser.nickName,
            username:simpleUser.gender,
            pwd:simpleUser.language 
          }
        }).then(res=>{
         var  id=res.data;
         console.log(id)
         
         wx.setStorageSync('userid', id);
          if(id.userType==0){
            wx.navigateTo({
              url: '/pages/backstage/personage/personage?id='+id.userId,
              });
            
            }else{
              wx.switchTab({
              url:  '/pages/make_money/home/home',
            });}
       
        }).catch(err=>{
          console.log(err)
        })
        
      }
    })
  }
  })
 // this.globalData.userid=id;
    wx.getSetting({
      success: res => {
        if (res.authSetting['scope.userInfo']) {
          // 已经授权，可以直接调用 getUserInfo 获取头像昵称，不会弹框
          wx.getUserInfo({
            success: res => {
              // 可以将 res 发送给后台解码出 unionId
              this.globalData.userInfo = res.userInfo;
              
            
              // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
              // 所以此处加入 callback 以防止这种情况
              if (this.userInfoReadyCallback) {
                this.userInfoReadyCallback(res)
              }
            }
          })
        }
      }

    })
  },
  globalData:{
    userInfo: null,
    userid:null,
  }
 
})