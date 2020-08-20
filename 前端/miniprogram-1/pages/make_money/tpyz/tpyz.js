
const app = getApp()
var imagesList1 = [];

var util = require('../../../utils/util')

Page({
  data: { //imagesList
    imagesList: [],
    currentTab: 0,
    insd: true,
    obj: [],
    tempFilePaths: [],
    tempFiles:[],
    twodetailid: '',
    texts: [{

      id: 0,
      fbf: "发布方：",
      bianhao: "编号：",
      leibie: "类别：",
      danjia: "单价：",
      yanzhen: "文字验证：",
      beizhu: "备注："
    }],
    taskDetail: [],
    trialT: '',
    trialCt: '',
    id: 1,
    centent_Show:true,
    centent_Show_verification:false,
    centent_Show_remark:false
  },

  uploader: function () {
    var that = this
    let maxLength = 1;
    let flag = true;
    wx.chooseImage({
      count: 1,
      sizeType: ['original', 'compressed'],
      sourceType: ['album', 'camera'],
      success: (res) => {

        var len = res.tempFiles.length
        if (len === 1) {
          var tempFilePaths = res.tempFilePaths
          that.setData({
            tempFilePaths: tempFilePaths,
            centent_Show:false
          })
          wx.showLoading({
            title: '上传成功',
            icon: '',
            duration: 500
          })
        }else{
          wx.showModal({
            content: '最多能上传1张图',
            showCancel: false,
            success: function (res) {
              if (res.confirm) {
                console.log('确定');
              }
            }
          })
        }

        if (flag == true && res.tempFiles.length <= maxLength) {
          console.log(res.tempFilePaths);
          imagesList1.push(res.tempFilePaths);
          this.setData({
            imagesList: imagesList1
          })
        }
      },
    })
  },



  fanhuishouye(event) {
    wx.navigateTo({
      url: '/pages/home/home',
    })
  },



  fhsy(event) {
    wx.navigateTo({
      url: '/pages/home/home',
    })
  },



  onLoad: function (params) {
    wx.showModal({
      title: "请按备注及操作说明完成任务，完成后按要求在【我的任务】里. 上传验证图，请在20分钟内完成操作，超时您将需要重新抢单。",
      showCancel: false,
      success: function (res) {
        console.log("用户点击了确定按钮")
      }
    })
    var that = this

    var twodetailid = params.detailid
    that.setData({
      twodetailid: twodetailid
    })

    var trialT = (wx.getStorageSync('trialT'))

    that.setData({
      trialT: trialT
    })


    wx.request({
      url: 'http://localhost:8080//weixingxiaocx/Mission/missionDetail/' + twodetailid,

      success(res) {
        var taskDetail = res.data

        that.setData({
          taskDetail: taskDetail
        })

        var yanzhen = taskDetail.missionText
        var beizhu = taskDetail.missionVerify
        if(yanzhen == null || yanzhen == ""){
          that.setData({
            centent_Show_verification:false
          })
        }else{
          that.setData({
            centent_Show_verification:true
          })
        }

        if(beizhu == null || beizhu == ""){
          that.setData({
            centent_Show_remark:false
          })
        }else{
          that.setData({
            centent_Show_remark:true
          })
        }
      }
    })
  },



  addTrialLog: function (options) {
    var trialText = options.detail.value.trialText
    var that = this
    that.setData({
      trialText: trialText
    })

  },

  subtn: function (options) {
    var trialCt = util.formatTime(new Date());
    this.setData({
      trialCt: trialCt
    })
    console.log(options)
    var tempFilePaths = this.data.tempFilePaths
    if (tempFilePaths != '') {
      wx.request({
        url: 'http://localhost:8080//weixingxiaocx/triallog/insert',
        data: {
          // trialId: 3,
          missionId: this.data.twodetailid,
          // userId:1,
          trialS: this.data.tempFilePaths,
          trialText: this.data.trialText,
          trialT: this.data.trialT,
          trialCt: this.data.trialCt,
        }
      })
      wx.showToast({
        title: '上传成功',
        icon: '',
        mask: true,
        duration: 1500
      })
      wx.navigateTo({
        url: '../abc/abc',
      })
    } else {
      wx.showModal({
        content: '上传失败，请重新上传',
        showCancel: false,
        success: function (res) {
          if (res.confirm) {
            console.log('用户点击确定')
          }
        }
      });
    }
  },



  /** 丢弃 */
  handleShowmodal() {
    wx.showModal({
      title: '选择丢弃任务将不再对您展示，您确认丢弃吗？',
      success: function (res) {
        console.log(res)
        if (res.cancel) {
          console.log("用户点击了取消按钮")
        }
        if (res.confirm) {
          console.log("用户点击了确定按钮")
          wx.navigateBack({
            complete: (res) => {
              console.log(res)
            },
          })
          wx.showToast({
            title: '丢弃成功',
            icon: '',
            mask: true,
            duration: 500
          })
        }

      }

    })
    var trialT = this.data.trialT
    var trialT_2 = trialT + 20
    if (trialT == trialT_2) {
      wx.navigateBack({
        complete: (res) => {
          console.log(res)
        },
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