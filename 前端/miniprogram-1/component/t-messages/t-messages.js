// pages/feedback/childCpns/t-messages/t-messages.js
Component({
  /**
   * 组件的属性列表
   */
  properties: {
    context:String,
  },

  /**
   * 组件的初始数据
   */
  data: {
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo'),
    nowTime:new Date().toLocaleString()
  },

  /**
   * 组件的方法列表
   */
  methods: {
    handleContext(){
      wx.navigateTo({
        url: '/pages/details/details?id=123',
      })
    }
  }
})
