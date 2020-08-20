// pages/setting/setting.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    nowTime:new Date(),
    indexCurr:0,
    navbarTitle: ['系统信息','系统公告'],
    //系统消息列表数据
    MessageList:[{
      id:0,
      title:"保证金充值",
      nowTime:"05/04 10:01",
      content:"审核成功，充值999.0元，当前保证金9审核成功，充值999.0元，当前保证金9审核成功，充值999.0元，当前保证金9审核成功，充值999.0元，当前保证金9",
    },{
      id:0,
      title:"保证金充值",
      nowTime:"05/04 10:00",
      content:"审核成功，充值999.0元，当前保证金9审核成功，充值999.0元，当前保证金9审核成功，充值999.0元，当前保证金9审核成功，充值999.0元，当前保证金9",
    },{
      id:0,
      title:"保证金充值",
      nowTime:"05/04 10:01",
      content:"审核成功，充值999.0元，当前保证金9审核成功，充值999.0元，当前保证金9审核成功，充值999.0元，当前保证金9审核成功，充值999.0元，当前保证金9",
    },{
      id:0,
      title:"保证金充值",
      nowTime:"05/04 10:00",
      content:"审核成功，充值999.0元，当前保证金9审核成功，充值999.0元，当前保证金9审核成功，充值999.0元，当前保证金9审核成功，充值999.0元，当前保证金9",
    }],
    //系统公告列表数据
    AnnouList:[{
      id:1,
      nowTime:"05/04 10:11",
      title:"邀请赠送活动",
      content:"比特金(Bitcoin:)是什么什么什么什么什么比特金(Bitcoin:)是什么什么什么什么什么"
    }]
  },

  hearItemClick(event){
    const index = event.currentTarget.dataset.index;
    this.setData({
      indexCurr:index
    })
    console.log(index)
  },

  /**
   * 获取系统消息数据列表
   */
  getMessageList(){
    let that = this;
    wx.request({
      url: 'url',
      success : (res) => {
        if(res.data.code===0){
          that.setData({
            MessageList:res.data.data.MessageList
          })
        }
      }
    })
  },

  /**
   * 获取系统公告数据列表
   */
  getAnnouList(){
    let that = this;
    wx:wx.request({
      url: 'url',
      success: (result) => {
        if(res.data.code===0){
          that.setData({
            AnnouList:result.data.date.AnnouList
          })
        }
      },
    })
  },

  /**
  * 跳转到详情页面
  */
  skippage(e){
    // 自定义属性
    var id = e.currentTarget.dataset.msgid;
    wx.navigateTo({
      url: '/pages/backstage/setting-details/setting-details?goodsId='+id,
    })
  },


  /**
   * 生命周期函数-监听页面加载
   */
  onLoad:function(options){
    //调用获取系统消息列表函数
    this.getMessageList();
    //调用获取系统公告列表函数
    this.getAnnouList();
  }
})