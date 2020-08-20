Page({
  data: {
    Alipay:'',
    AuthCode:'',
  // length:0

  },


  //下拉刷新
  onPullDownRefresh:function()
 {
    wx.showNavigationBarLoading() //在标题栏中显示加载
    //模拟加载
    setTimeout(function()
    {
        // complete
        wx.hideNavigationBarLoading() //完成停止加载
        wx.stopPullDownRefresh() //停止下拉刷新
    },1500);

  },

  //点击获取验证码 网络请求 【已完成】
  formSubmit:function(e) {
    console.log('form发生了submit事件，携带数据为：', e.detail.value)
    let  alipayid =  e.detail.value.Alipay  //获取用户输入 支付宝账号
    var v= /^[\u4E00-\u9FA5]+$/ //判断用户名字
    //console.log(ali)
    if(alipayid==' '||alipayid.length<11){
        wx:wx.showModal({ //提示
          title:'提示',
          content: '请输入正确的电话号码~',
          showCancel: false, //隐藏取消按钮
        })

        return false
    }else{
      wx.request({
        url: 'http://localhost:8080/weixingxiaocx/sendsms', //请求网址 localhost本地链接
        method:"POST",
        header: { 'content-type': 'application/x-www-form-urlencoded' }, //设置请求的
        data:{
          'telphone':alipayid,    //传递telphone的值 ~
        },
        success(){
            wx:wx.showModal({ //提示
            title:'提示',
            content: '发送成功，手机号码为'+e.detail.value.Alipay+'注意查收~',
            showCancel: false, //隐藏取消按钮
          })
        }
      })
    }
  },

  //获取 authcode_input 表单
  authcode_input:function(e){
    this.setData({ AuthCode: e.detail.value })
  },
  //获取 alipay_input  表单
  alipay_input:function(e){
    this.setData({ Alipay: e.detail.value })
  },

  //绑定支付宝条件判断 and 网络请求
  bindalipay:function(){
    let  alipayid =  this.data.Alipay   //得到用户输入的支付宝
    let authcodeid =  this.data.AuthCode //得到用户输入的验证码

    if(alipayid =='' || authcodeid == '' ){
      wx:wx.showModal({ //提示
        title:'提示',
        content: '支付宝账号和验证码都不能为空~',
        showCancel: false, //隐藏取消按钮
      })
    }else if( alipayid.length<11 || authcodeid.length<6 ){
      wx:wx.showModal({ //提示
        title:'提示',
        content: '支付宝账号或者验证码长度有误',
        showCancel: false, //隐藏取消按钮
      })
    }else{
      //实现更新数据库用户 信息
      wx.request({
        url: 'http://localhost:8080/weixingxiaocx//bindalipay', //请求网址 localhost本地链接
        method:"POST",
        header: { 'content-type': 'application/x-www-form-urlencoded' }, //设置请求的
        data:{
          'telphone':alipayid,    //传递telphone的值 ~
          'yzm':authcodeid,
          'userid':926431686,
        },
        success(){
            wx:wx.showModal({ //提示
            title:'提示',
            content: '成功',
            showCancel: false, //隐藏取消按钮
          })
        },
        fail:function(){
          wx:wx.showModal({ //提示
            title:'提示',
            content: '授权码错误~',
            showCancel: false, //隐藏取消按钮
          })
        }
      })

    }

  },

  

  formBindsubmit: function (e) {
    
   
  },
  formReset: function () {
  
  }
  

  // else if(name==' '){
    //   wx:wx.showModal({
    //     title:'提示',
    //     content: '请输入真实姓名',
        
    //   })
    //   return false
    // }
    //else if(!v.test(name)){

    //   wx:wx.showModal({
    //     title:'提示',
    //     content: '姓名只能为中文 ',
      
    //   })
    //   console.log(e.detail.value)
    // }
    
})