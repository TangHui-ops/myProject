// task/task.js.js
const app = getApp()
var util = require('../../../utils/util')
Page({
  data: {
    task1: {
      title: "标题： ",
      publisher: "发布方：",
      number: "编号：",
      category: "类别：",
      unitprice: "单价：",
      verification: "文字验证：",
      remark: "备注：",
      zhidingdaoqi: "置顶到期：",
      deadline: "截止时间："
    },
    taskDetail: [],
    trialT: '',
    img: [],
    centent_Show_verification:false,
    centent_Show_remark:false


  },

  /** 返回首页 */
  fhsy(){
    wx.navigateTo({
      url: '../home/home',
    })
  },

  /** 举报 */
  jubao(event) {
    wx.navigateTo({
      url: '../jubao/jubao',
    })
  },

  /**跳转到店铺页面 */
  dianpu(event) {
    wx.navigateTo({
      url: '',
    })
  },

  onLoad(params) {
    var that = this
    var detailid = params.detailid
    wx.request({
      url: 'http://localhost:8080//weixingxiaocx/Mission/missionDetail/' + detailid,

      success(res) {
        var taskDetail = res.data
        console.log(taskDetail)
        that.setData({
          taskDetail: taskDetail
        })
        var verification = taskDetail.missionText
        var remark = taskDetail.missionVerify
        if(verification == null || verification == ""){
          that.setData({
            centent_Show_verification:false
          })
        }else{
          that.setData({
            centent_Show_verification:true
          })
        }

        if(remark == null || remark == ""){
          that.setData({
            centent_Show_remark:false
          })
        }else{
          that.setData({
            centent_Show_remark:true
          })
        }

        var img = taskDetail.missionStep;

        img = img.split(',')
        var imgArr = []
        imgArr.push(img)
        console.log(imgArr)
        for (var i = 0; i < imgArr.length; i++) {
          var im = imgArr[i]
        }
        if (im != null && im != undefined && im != '') {
          img = JSON.parse(im)
        }
        that.setData({
          img: img
        })
      }
    })
},

  orderMoney(e) {
    var twodetailid = e.currentTarget.dataset.twodetailid;
    var num = e.currentTarget.dataset.num
    if (num >= 1) {
      wx.navigateTo({
        url: '../tpyz/tpyz?detailid=' + twodetailid,
      })
    } else {
      wx.showToast({
        title: '该任务已结束，去做其他任务吧',
        icon: 'none',
        duration: 2000
      })
    }

    //获得开始时间
    var trialT = util.formatTime(new Date());
    wx.setStorageSync('trialT', trialT)
    this.setData({
      trialT: trialT
    })

    //获取用户信息
    wx.getUserInfo({
      success: function (res) {
        console.log(res)
      }
    })
  }
})