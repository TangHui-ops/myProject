// pages/recharge/recharge.js
import request from "../../../../service/nelwork";
Page({
 
  data: {
    userid:wx.getStorageSync('userid'),
  },
 
  searchBox:function(e){
   
    var that=this;
    var n=parseFloat(e.detail.value.qie);
    console.log(that.data.userid.userId);
    request({
      url:'Trade',
      data:{
        id:that.data.userid.userId,
        n:n,
      }
    }).then(res=>{
      console.log(res);
      wx.setStorageSync('userid', res.data);
      this.data.userId=wx.getStorageSync('userid');
     
      wx.showToast({
        title: '充值成功',
        icon: 'succes',
        duration: 1000,
        mask:true
    });
    this.onLoad();
   
    }).catch(err=>{
      console.log(err)
    })
    wx.navigateBack({ changed: true });
    // var v = parseDecimal( userid.userBalance);
    // var v=parseFloat(this.data.userid.userBalance);
  
    //     n+=v
    // console.log(n)
  },
  })