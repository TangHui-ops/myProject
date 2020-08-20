// IShop/IShop.js
import request from '../../../../service/nelwork.js'
var app=getApp()
Page({


  //数据绑定
  data:{
    //初始值
    name: "心态" ,
    userid: 92643 ,
    fadan: 80 ,
    zongfadan: 80 ,
    chengjiaodan: 80 ,
    tousu: 1 ,
    beishensu: 2 ,
    beijubao: 8 ,
    jierenwu: 10 , 
    shensu: 3 ,
    beitousu: 0 ,
    currentTab:0
  },



  onLoad: function(options){




  //使用封装的request发送网络请求
/** 
request({
    url: "i/Store",
    data:{
      storeId:1
    }
  }).then(res => {
    console.log(res)
    this.setData({
     list :res.data
    })
  }).catch(err =>{
    console.log(err)
  })
 */

//用户表的
request({
  url: "h/userid",
  data:{
    id: 1,
  }
}).then(res => {
  console.log(res)
  this.setData({
  list :res.data
 
  })
 }).catch(err =>{
   console.log(err)
})
 

  //任务表的
  request({
    url: "Mission/qiqi",
    data:{

      
      mission: 1,
    }
  }).then(res => {
    console.log(res)
    this.setData({
      ay :res.data
    })
   }).catch(err =>{
     console.log(err)
  })
   


//投诉表的

request({
  url: "after/ai",
  data:{
    after_type_id: 1
  }
}).then(res => {
  console.log(res)
  this.setData({
  k :res.data
  })
 }).catch(err =>{
   console.log(err)
})




request({
  url: "after/ai",
  data:{
    after_type_id: 2
  }
}).then(res => {
  console.log(res)
  this.setData({
  a :res.data
  })
 }).catch(err =>{
   console.log(err)
})




request({
  url: "after/ai",
  data:{
    after_type_id: 3
  }
}).then(res => {
  console.log(res)
  this.setData({
  b :res.data
  })
 }).catch(err =>{
   console.log(err)
})



// var that = this;//把this对象复制到临时变量that
//  request({
//    url: "h/userid",
//   data: {storeId:1},
//   // {
//   //   //id:"1",
//   //   //name:'Leanne Graham'
//   // },
//   success: function (res){
//     console.log(res.data);
//     this.userData = res.data; //无效不能实时的渲染到页面
//     that.setData({ userData: res.data });//和页面进行绑定可以动态的渲染到页面

//   },
//   fail: function (res){
//     console.log(res.data);
//     this.userData = "数据获取失败";
//   }
// })

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


  





  // 店铺置顶跳转
  dianpuzd:function(){
    wx.navigateTo({
      url: '/pages/Information/myshop/Stick/Stick',
    })
  },

  //点击关注效果
  guanzhu:function(){
    wx.showModal({
      title:'提示',
      content:'不能关注自己哦！',
      showCancel: false,
    })
  },


    //滑动切换
    swiperTab:function( e ){
      var that=this;
      that.setData({
       currentTba:e.detail.current
      });
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
      } 
     } 
  

})


  //提交
  // handleTabClick(event){
  //   console.log(event)
  // }
