import request from '../../../../service/nelwork.js'
const app = getApp()
Page({
  data: {
    loading: false,
    content:"",
    contact:""
  },

  onLoad: function(options){
    request({
      url:'insert/feedback',
      data:{
        feedbackP:1,
        feedbackCon:"abc",
      }
    }).then(res=>{
      console.log(res);   
    }).catch(err=>{
      console.log(err)
    })
    },

    name: function (e) {   
      that.setData({
        name: e.detail.value
      })
    }, 
  formSubmit: function (e) {
 
    console.log(app.globalData.userInfo);
    console.log(e.detail.value.opinion);
    // let _that = this;
    // let content = e.detail.value.opinion;
    // let contact = e.detail.value.contact;
    // let regPhone = /^1[0-9]\d{9}$/;
    // let regEmail = /^[a-z\d\.]+@[a-z\d\-]+\.[a-z\d\-]+$/i;
    // if (content == "") {
    //   wx.showModal({
    //     title: '提示',
    //     content: '反馈内容不能为空!',
    //   })
    //   return false
    // }
    // if (contact == "") {
    //   wx.showModal({
    //     title: '提示',
    //     content: '手机号或者邮箱不能为空!',
    //   })
    //   return false
    // }
    // if (contact == "" && content == "") {
    //   wx.showModal({
    //     title: '提示',
    //     content: '反馈内容,手机号或者邮箱不能为空!',
    //   })
    //   return false
    // }
    // if ((!regPhone.test(contact) && !regEmail.test(contact)) || (regPhone.test(contact) && regEmail.test(contact))) { 
    //   wx.showModal({
    //     title: '提示',
    //     content: '您输入的手机号或者邮箱有误!',
    //   })
    //   return false
    // } else {
    //   this.setData({
    //     loading: true
    //   })
    //   let model, system, platform;
    //   wx.getSystemInfo({
    //     success: function (res) {
    //       model = res.model;
    //       system = res.system;
    //       platform = res.platform;
    //     }
    //   })
    //   request({
    //     url: '/feedback',
    //     data: {
       
    //     }}).then(res=>{
       
    //       let status = res.data.status;
    //       if (status == 1) {
    //         _that.setData({
    //           loading: false,
    //           contact: '',
    //           contant: ''
    //         })
    //         wx.showToast({
    //           title: '成功',
    //           icon: 'success',
    //           duration: 1500
    //         })
    //       }}).catch(err=>{
    //       console.log("接口调用失败")
    //     })}}}
  }}
)
