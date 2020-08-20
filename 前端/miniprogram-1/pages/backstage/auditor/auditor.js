import request from "../../../service/nelwork.js";
// pages/auditor/auditor.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    searchVal:'',
    searchVal1:'',
    type:''

  },

  handleInput(event){
    this.setData({
      searchVal:event.detail.value
    });
  },
  handleEditInfo(event){
    if(this.data.searchVal == ''){
      wx.showModal({
        title:"提示",
        content:'请填写用户ID'
      })
      return false;
    }
    const index = event.currentTarget.dataset.index;
    var userId=parseInt(this.data.searchVal);
    wx.navigateTo({
      url: '/pages/backstage/auditorinfo/auditorinfo?byUserId='+userId,
      
    })
  },
  handleInput1(event){
    this.setData({
      searchVal1:event.detail.value
    });
  },
  b(event){
    if(this.data.searchVal1 == ''){
      wx.showModal({
        title:"提示",
        content:'请输入用户ID'
      })
      return false;
    }
    const index = event.currentTarget.dataset.index;
  
    var that=this;
    var userId = parseInt(this.data.searchVal1);
    request({
      url:'StateInfo',
      data:{
        id:userId
      }
    }).then(res=>{
      console.log(res);
      that.setData({
        type: res.data
    });
    }).catch(err=>{
      console.log(err)
    })

  },

  c(e){
    // const index = event.currentTarget.dataset.index;

    // wx.navigateTo({
    //   url: '/pages/backstage/state_select/state_select?userStateId=' + 1,
    // })
    var that = this;
    console.log(e);
    var index = e.currentTarget.dataset.index
    let after = JSON.stringify(that.data.type[index]);
    console.log(after);
    wx.navigateTo({
      url: "/pages/backstage/state_select/state_select?userState="+after ,
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  // 页面初始化 options为页面跳转所带来的参数
  var that=this;
    request({
      url:'AllStateInfo',
    }).then(res=>{
      console.log(res);
      that.setData({
        type: res.data

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


})