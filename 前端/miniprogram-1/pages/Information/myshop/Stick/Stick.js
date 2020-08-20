// Stick/Stick.js
Page({
  data: {
    items: [
      {value: '30', name: '30元/小时'},
      {value: '288', name: '288元/天', checked: 'true'},
      {value: '1588', name: '1588元/周'},
      {value: '4888', name: '4888/月'},
    ],
    counter: 0,
    modalHidden: true
  },
  radioChange(e) {
    console.log('radio发生change事件，携带value值为：', e.detail.value)

    const items = this.data.items
    for (let i = 0, len = items.length; i < len; ++i) {
      items[i].checked = items[i].value === e.detail.value
    }
    this.setData({
      items
    })

    // 获取当前价格
    this.setData({
      counter: this.data.counter = e.detail.value
    })
  },

  //确认值付效果弹窗
  quedingClike:function(){
    wx.showModal({
      title:'提示',
      content:'铁子，你是穷的叮当响啊。',
      showCancel: false,
    })
  },

  text_click: function() {
    this.setData({
      modalHidden: false,
    })
  },

  /**
   * 点击取消
   */
  modalCandel: function() {
    // do something
    this.setData({
      modalHidden: true
    })
  },

  /**
   *  点击确认
   */
  modalConfirm: function() {
    // do something
    this.setData({
      modalHidden: true
    })
  }
})