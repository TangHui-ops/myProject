// pages/rwxq/rwxq.js
  Page({

    data: {
      mHidden:true,
     task1:{
       title:"标题： ",
       publisher:"接收者：",
       number:"编号：",
       category:"类别：",
       unitprice:"单价：",
       verification:"文字验证：",
       remark:"备注：",
       zhidingdaoqi:"领取时间：",
       deadline:"完成时间："
     },
     taskDetail:[],
    img:[],
    ids:0,
    },


  onLoad: function (options) {
    var that = this
    this.setData({
      ids:options.id
    })
    wx.request({
      url: 'http://localhost:8080/weixingxiaocx/trialLog/listId?trialId='+options.id,
      success:function(res){
        var taskDetail = res.data
        var imgmi = taskDetail.trialS
        var imgg = imgmi.split(",")
        var images = JSON.stringify(imgg)
        var imgArr = []
        imgArr.push(images)
        for (var i = 0; i < imgArr.length; i++) {
          var im = images[i]
        }
        
        if (images != null && images != undefined && images != '') {
          im = JSON.parse(images)
        }
        console.log(im)
        console.log(res)
     that.setData({
      taskDetail : res.data,
      img: im 
    })
   }
  })
  },
  tg(event){
    console.log(this.data.ids)
    wx.request({
      url: 'http://localhost:8080/weixingxiaocx/trialLog/update?trialId='+this.data.ids+'&'+'auditId='+4,
      success:function(res){   
     wx.navigateTo({
      url: '/pages/shenhe/shenhe',
    })
   }
  })
  },
  btg(event){
    wx.request({
      url: 'http://localhost:8080/weixingxiaocx/trialLog/update?trialId='+this.data.ids+'&'+'auditId='+5,
      success:function(res){   
     wx.navigateTo({
      url: '/pages/shenhe/shenhe',
    })
   }
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

  }
})