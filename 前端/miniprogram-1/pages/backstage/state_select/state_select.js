import request from "../../../service/nelwork.js";
Page({

  /**
   * 页面的初始数据
   */
  data: {
    userState:'',
    

  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.setData({
      userState: options.userState,
    })
    
    // 页面初始化 options为页面跳转所带来的参数
  var that=this;
  let userStateInfo=JSON.parse(options.userState);

  request({
    url:'StateInfo',
    data:{
      id:userStateInfo.userStateId
    }
  }).then(res=>{
    console.log(res);
    that.setData({
      type: res.data

   });
  }).catch(err=>{
    console.log(err)
  })

  request({
    url:'getUserInfo',
    data:{
      userId:userStateInfo.userId
    }
  }).then(res=>{
    console.log(res);
    that.setData({
      userInfo:res.data
    });
  }).catch(err=>{
    console.log(err)
  })
    
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

  },
  handleImage :function(event){
    console.log(event.currentTarget.dataset.src)
    var that = this,
    index = event.currentTarget.dataset.index,
    pictures = this.data.pictures;
    wx.previewImage({
      current: pictures[index],
      urls: pictures
    })
  }
})