// pages/complain/complain.js
// var contextList = (wx.getStorageSync('contextList') || [])
import request from "../../../service/nelwork.js";
import util from "../../../utils/util";
Page({
  
  /**
   * 页面的初始数据
   */
  data: {
     id:0,

  },
    

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  var that=this;
  this.data.id=options.id;
console.log(options.id);
    let after=JSON.parse(options.data);
    var dateee = new Date(after.afterTime).toJSON();
   var afterTime=new Date(+new Date(dateee) + 8 * 3600 * 1000).toISOString().replace(/T/g, ' ').replace(/\.[\d]{3}Z/, '');
    that.setData({
      after: after,
      afterTime: afterTime
      
    })
    console.log(afterTime);
    
  
  },
  //通过
  tabclick:function(e){

    var name=1;
  
    var id= e.currentTarget.dataset['index'];
    request({
      url:'upAfter',
      data:{
        id: id,
        afterDp:this.data.id,
        name:name,
    
      }
    }).then(res=>{
      console.log(res);

      if(res.data){
        wx.showToast({
          title: '成功',
          icon: 'succes',
          duration: 1000,
          mask:true
      });
      wx.navigateBack({ changed: true });
      // wx.navigateTo({
      //   url: "/pages/backstage/treatment/treatment" ,
      // })
      }

     
    }).catch(err=>{
      console.log(err)
    })
  
  }
,

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