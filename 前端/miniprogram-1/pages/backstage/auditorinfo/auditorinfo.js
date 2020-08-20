// pages/auditorinfo/auditorinfo.js
import request from "../../../service/nelwork.js";

Page({

  /**
   * 页面的初始数据
   */
  data: {
    byUserId:'',
    opinion:'',
    items:[
      {name:'封号',value:'3'},
      {name:'冻结',value:'2'},
      {name:'正常',value:'1'},
    ],
    radio:0,
    text1:'',
    text2:'',
    upd:'',
    i:'何某'
    // userName:'智慧',
    // taskID:2076932,
    // type:'投票',
    // release:'奢华建行卡',
    // oldTime:new Date().toLocaleString(),
    // newTime:new Date().toLocaleString(),
    // src:null,
    // pictures: [ 'https://file06.16sucai.com/2016/0506/e8b0927571340ae2018d5a156864a753.jpg',
    //        'https://file06.16sucai.com/2016/0506/6ff4d8c8e7714e84347356f7fd1092d4.jpg'
    // ]

  },
  handleInput2:function(e){
    var that = this;
    this.setData({
      radio:e.detail.value,
      
    });
    this.data.radio=e.detail.value;

  },
  handleInput:function(event){
    this.setData({
      opinion:event.detail.value,
    });
  },


  handleInput4(event){
    this.setData({
      text2:event.detail.value,
    });
  },
  handleEditInfo(event){
    if(this.data.opinion == ''){
      wx.showModal({
        title:"提示",
        content:'请输入操作原因'
      })
      return false;
    }else if(this.data.text2 == ''){
      wx.showModal({
        title:"提示",
        content:'请输入结束时间'
      })
      return false;
   }
    var that=this;
    var setUserId =parseInt(this.data.byUserId);
    var user=wx.getStorageSync('userid');
      request({
        url:'updateState',
        data:{
          userId:setUserId,
          userS:this.data.radio,
          userStateDt:this.data.text2,
          userStateP:user.userId,
          userStateReason:this.data.opinion,
        }
      }).then(res=>{
        that.setData({
          upd:res.data,
        });
        this.data.upd=res.data
        console.log(this.data.upd);
        if(this.data.upd==true){
          wx.showToast({
            title: '操作成功',
            icon: '',
            image: '',
            duration: 1500,
            mask: true,
            success: function(res) {
                setTimeout(function() {
                    wx.navigateBack()
                }, 1500)
            },
        })
        }else{
          wx.showModal({
            title:"提示",
            content:'操作失败'
          })
        }
      }).catch(err=>{
        console.log(err)
      })

  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
      // 页面初始化 options为页面跳转所带来的参数
  var that=this;
  var buserId=options.byUserId;
  this.data.byUserId=buserId;
    request({
      url:'getUserInfo',
      data:{
        userId:buserId
      }
    }).then(res=>{
      console.log(res);
      that.setData({
        userInfo:res.data,
        
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

