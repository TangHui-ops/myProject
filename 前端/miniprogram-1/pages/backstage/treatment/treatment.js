import request from "../../../service/nelwork.js";
 var app=getApp()
// var contextList = {
//   contextList:['星星藏进星夜，还有人没睡眠。海洋藏不住我对你的思念。明天又是一年，一分又是一天。嘴里的碎碎念念，希望变成身边的岁岁年年'],
//   applyList:['蔬菜们在举办比瘦大赛，茄子看到了黄瓜，发现黄瓜的腰很细，于是茄子一直在嘀嘀咕咕:没瓜细呀没瓜细呀没关系.'],
//   reportList:['火山喷发出爆浆芝士 月亮融化成流星 海滩的沙粒是黄油饼 你笑起来嘴角的梨涡 盛放着整个宇宙'],
// }
// wx.setStorageSync('contextList', contextList);

Page({
 
  /**
   * 页面的初始数据
   */
 data:{
//   contextList:[{
//     id:1,
//     context:'星星藏进星夜，还有人没睡眠。海洋藏不住我对你的思念。明天又是一年，一分又是一天。嘴里的碎碎念念，希望变成身边的岁岁年年',
//    },{
//     id:2,
//     context:'星星藏进星夜，还有人没睡眠。海洋藏不住我对你的思念。明天又是一年，一分又是一天。嘴里的碎碎念念，希望变成身边的岁岁年年',
//    }],
//  applyList:[{
//   id:1,
//   apply:'蔬菜们在举办比瘦大赛，茄子看到了黄瓜，发现黄瓜的腰很细，于是茄子一直在嘀嘀咕咕:没瓜细呀没瓜细呀没关系.'
// },{
//   id:2,
//   apply:'蔬菜们在举办比瘦大赛，茄子看到了黄瓜，发现黄瓜的腰很细，于是茄子一直在嘀嘀咕咕:没瓜细呀没瓜细呀没关系.'
// },],
// reportList:[{
//   id:1,
//   report:'火山喷发出爆浆芝士 月亮融化成流星 海滩的沙粒是黄油饼 你笑起来嘴角的梨涡 盛放着整个宇宙'}],
  currentTab:1,
  id:0,

  
   
 },


 onLoad:function(options){
   this.data.id=options.id;
  console.log(options.id);
  // 页面初始化 options为页面跳转所带来的参数
  var that=this;
    request({
      url:'type',
    }).then(res=>{
      console.log(res);
      that.setData({
        type: res.data

     });
    }).catch(err=>{
      console.log(err)
    })
    
   request({
    url:'index',
    data:{
      id:1
    }
  }).then(res=>{
    console.log(res);
    that.setData({
     result: res.data
   });
  }).catch(err=>{
    console.log(err)
  })
 },
 


 tabclick:function(e){
     var that = this;
     console.log(e);
     var index = e.currentTarget.dataset.index
     let after = JSON.stringify(that.data.result[index]);
     console.log(after);
     wx.navigateTo({
       url: "/pages/backstage/complain/complain?data="+after+"&id="+ this.data.id ,
     })
 },

 //滑动切换
 swiperTab:function( e ){
  var that=this;

  that.setData( { 
  
    currentTab: e.target.dataset.current 
    
   }) 

 },
 //点击切换
 clickTab: function( e ) { 
 
  var that = this; 
  
  if( this.data.currentTab === e.target.dataset.current ) { 
   return false; 
  } else { 
   that.setData( { 
    currentTab: e.target.dataset.current 
    
 }) 
   
   request({
    url:'index',
    data:{
      id:e.target.dataset.current 
    }
  }).then(res=>{
    console.log(res);
    that.setData({
     result: res.data
   });
  }).catch(err=>{
    console.log(err)
  })
  
  } 
 },

  /**
   * 生命周期函数--监听页面加载
   */


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