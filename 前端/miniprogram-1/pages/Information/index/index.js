//index.js
//获取应用实例
const app = getApp()

Page({
  handleShowModal(){
    wx.showModal({
      title: '标题',
      content: '请您好好考虑考虑铁子',
     cancelText: '返回',
     confirmText: '退出',
     userid:wx.getStorageSync('userid'),
    })
  },
  data: {
    motto: 'Hello World',
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo')
  },
  //事件处理函数
  bindViewTap: function() {
    wx.navigateTo({
      url: '../../logs/logs'
    })
  },
  onLoad: function () {
   
    this.setData({
      userid:wx.getStorageSync('userid'),
    })
    if (app.globalData.userInfo) {
      this.setData({
        userInfo: app.globalData.userInfo,
        hasUserInfo: true
      })
    } else if (this.data.canIUse){
      // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
      // 所以此处加入 callback 以防止这种情况
      app.userInfoReadyCallback = res => {
        this.setData({
          userInfo: res.userInfo,
          hasUserInfo: true
        })
      }
    } else {
      // 在没有 open-type=getUserInfo 版本的兼容处理
      wx.getUserInfo({
        success: res => {
          app.globalData.userInfo = res.userInfo
          this.setData({
            userInfo: res.userInfo,
            hasUserInfo: true
          })
        }
      })
    }
  },
  getUserInfo: function(e) {
    console.log(e)
    app.globalData.userInfo = e.detail.userInfo
    this.setData({
      userInfo: e.detail.userInfo,
      hasUserInfo: true
    })
  },

  //单机跳转
  Cilek1(){
    wx.navigateTo({
      url: '/pages/Information/Pay/recharge/recharge',
      
    })
  },
  Cilek2(){
    wx.navigateTo({
      url: '/pages/Information/Pay/deposit/deposit',
    })
  },
  Cilek3(){
    wx.navigateTo({
      url: '/pages/Information/money/index',
    })
  },
  //列表单击事件
    //收支账单
  Click_the_jump(){
    wx.navigateTo({
      url: '/pages/Information/bill/px',
    })
  },
    //微信绑定
  Click_the_jump1(){
    wx.navigateTo({
      url: '/pages/Information/binding/index2',
    })
  },
    //我的店铺
  Click_the_jump2(){
    wx.navigateTo({
      url: '/pages/Information/myshop/IShop/IShop',
    })
  },
    //我要反馈
  Click_the_jump3(){
    wx.navigateTo({
      url: '/pages/Information/feedback/kk/kk',
    })
  },
    //常见问题
  Click_the_jump4(){
    wx.navigateTo({
      url: '/pages/Information/FAQ/index3/index3',
    })
  },


})
