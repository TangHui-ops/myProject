// pages/home/home.js
Page({ 
  data: { 
    contentImgUrls:[
  
      {
        title:'接单赚钱',
        url:'../../../image/zdzq.png'
      },{
        title:'发布任务',
        url:'../../../image/fbru.png'
      },{
         title:'审核任务',
         url:'../../../image/shru.png'
      },{
        title:'我的任务',
              
        url:'../../../image/wdru .png'
      }
    ]
  },
  jiedan(event){
    wx.navigateTo({
      url: '../../make_money/abc/abc',
    })
  },
  fabu(event){
    wx.navigateTo({
      url: '../../make_money/Mpage/Mpage',
    })
  },
  shenhe(event){
    wx.navigateTo({
      url: '../../make_money/shenhe/shenhe',
    })
  },
  wode(event){
    wx.navigateTo({
      url: '../../make_money/index/index',
    })
  }

    
})
