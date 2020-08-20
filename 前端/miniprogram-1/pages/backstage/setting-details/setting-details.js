Page({

  /**
   * 页面的初始数据
   */
  data: {
    DetailsList:[{
      id:0,
      title:'title',
      nowTime:'05/04 10:00',
      image:'../../image/11.jpg',
      content:'content'
    }]
  },

  /**
   * 获取详情信息
   */
  getDetailsList(){
    wx.request({
      url: 'url',
      success: (result) => {
        if(res.data.code===0){
          that.setData({
            DetailsList:result.data.date.DetailsList
          })
        }
      },
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log(options)
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
    
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
    
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {
    
  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {
    
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
    
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
    
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
    
  }
})