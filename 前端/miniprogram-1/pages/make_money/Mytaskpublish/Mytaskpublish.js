// task/task.js.js
Page({
  ju:function(event){
    wx.navigateTo({
      url: '/pages/jubao/jubao',
    })
  },
  qiangdan:function(event){
    wx.navigateTo({
      url: '',
    })
  },
  diuqi:function(event){
    wx.navigateTo({
      url: 'url',
    })
  },
  fhsy:function(event){
    wx.navigateTo({
      url: '/pages/home/home',
    })
  },
  data: {
    mHidden:true,
    task1:{
      title:"标题： ",
      publisher:"发布方：",
      number:"编号：",
      category:"类别：",
      unitprice:"单价：",
      verification:"文字验证：",
      remark:"备注：",
      zhidingdaoqi:"置顶到期：",
      deadline:"截止时间："
    },
    missionList:[],
    imgArr:[],
    img:'',
  },
  changeModel:function(){
    this.setData({
      mHidden:true
    });
  },
  modelCancel:function(){
    this.setData({
      mHidden:true
    });
  },

  //双击，放大图片
  handleImage :function(event){
    console.log(event)
    var that = this,
    index = event.currentTarget.dataset.index,
    img = that.data.img;
    wx.previewImage({
      current: img[index],
      urls: img
    })
  },

  onLoad:function(options){
    var that=this;
    wx.request({
      url: 'http://localhost:8080/weixingxiaocx/Mission/selectMissionID',
      method:'GET',
      data:{
        missionId:options.missionId
      },
      success:function(res){
        var missionList=res.data;
        var images = missionList.missionPattern
        console.log(images)
        that.setData({
          missionList:missionList,
        })
        if(missionList==null){
          var toastText='获取数据失败';
          wx.showToast({
            title: toastText,
            icon:'',
            duration:2000 //弹出时间
          })
        }
      }
    })
  },

  onShow:function(options){
    
  }
})