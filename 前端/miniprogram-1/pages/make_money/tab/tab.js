// pages/setting/setting.js
//获取应用实例
const app = getApp()

Page({

  /**
   * 页面的初始数据
   */
  data: {
    nowTime:new Date(),
    indexCurr:0,
    navbarTitle: ['最新','综合','优先','人气','苹果'],
    //综合数据
  zonghe:[{
      id:1,
      tp:"../im/Y.png",
      title:"发帖",
      nowTime:"所有地方都",
      content:"编号：6468468",
      dj:"单价:50元"
    }],
    youxian:[{
      id:2,
      tp:"../im/Y.png",
      title:"发帖",
      nowTime:"按时服药",
      content:"编号：6468468",
      dj:"单价:50元"
    }],
    renqi:[{
      id:3,
      tp:"../im/Y.png",
      title:"发帖",
      nowTime:"似乎地方",
      content:"编号：6468468",
      dj:"单价:50元"
    }],
   pingguo:[{
      id:4,
      tp:"../im/Y.png",
      title:"发帖",
      nowTime:"爱验收规范",
      content:"编号：6468468",
      dj:"单价:50元"
    }]
  },

  hearItemClick:function(event){
    const index = event.currentTarget.dataset.index;
    this.setData({
      indexCurr:index
    })
    console.log(index)
    console.log("----")
  },
 
 

  /**
   * 生命周期函数-监听页面加载
   */
  onLoad:function(options){
    wx.request({
      url: app.serverUrl + '/weixingxiaocx/missionType/selectTypeAll', //仅为示例，并非真实的接口地址
      header: {
        'content-type': 'application/json' // 默认值
      },
      success (res) {
        console.log(res.data)
      }
    })
  }
})