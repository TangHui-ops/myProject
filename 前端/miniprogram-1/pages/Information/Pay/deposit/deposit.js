// pages/deposit/deposit.js
import request from "../../../../service/nelwork";
Page({

  /**
   * 页面的初始数据
   */
  data: {
   
    userid:wx.getStorageSync('userid'),
  },
 
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  
    this.setData({
      userid:wx.getStorageSync('userid'),
    })
   
  },
  searchBox:function(e){
    var that=this;
    var n=parseFloat(e.detail.value.qie);
   if(n<=that.data.userid.userBalance){
  
    request({
      url:'money',
      data:{
        id:that.data.userid.userId,
        n:n,
      }
    }).then(res=>{
      console.log(res);
      wx.setStorageSync('userid', res.data);

      wx.showToast({
        title: '提现成功',
        icon: 'succes',
        duration: 1000,
        mask:true,
    
    });
  
    
    }).catch(err=>{
      console.log(err)
    })
    // var v = parseDecimal( userid.userBalance);
    // var v=parseFloat(this.data.userid.userBalance);
  
    //     n+=v
    // console.log(n)
    wx.navigateBack({ changed: true });
  }else{
    wx.showModal({

      title:'提现失败',
     
      content:'这位用户你并没有你填写的这么有钱，O(∩_∩)O哈哈~',
     
      success:function(res) {
     
       if(res.confirm) {
     
        console.log('用户点击确定')
     
       }
     
      }
     
     })
  
  }
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