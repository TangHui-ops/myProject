// pages/Mpage/Mpage.js
const date = new Date()
const years = []
const months = []
const days = []


for (let i = 1990; i <= date.getFullYear(); i++) {
  years.push(i)
}

for (let i = 1; i <= 12; i++) {
  months.push(i)
}

for (let i = 1; i <= 31; i++) {
  days.push(i)
}

var object = {};
if (Object.keys(object ).length === 0) {
   console.log('')
}

Page({
  flush: function (event) {
     this.setData({
       "num1": event.detail.value
     })
     this.setData({ 
      ds:this.data.num1*this.data.num2
    })
  },

  flushe: function (event) {
    this.setData({
      "num2": event.detail.value
    })
    this.setData({ 
      ds:this.data.num1*this.data.num2
    })
  },


  data:{
    undefined,
    num1:'',
    num2:'',
    ds:'',
    years,
    year: date.getFullYear(),
    months,
    month: 2,
    days,
    day: 2,
    value: [9999, 1, 1],
    hiddenName:true,
    hiddenNames:true,
    hiddenNamem:true,
    files: [],
    filesw:[],
    useList:[],
    sbs:[],
    missionPatterns:[],
    missionContents:[],
    state: '',
   stata: '',
   missionsys:1,
   missiontype:1,
 state: '',
 stata: '',
 
  },
  
  select_use: function(e) {
    this.setData({
      state: e.currentTarget.dataset.key,
      missiontype: e.target.dataset.missiontype,
    });
    console.log(e.target.dataset.missiontype)
  },
  select_sb: function(e) {
    console.log(e.target.dataset.missionsys)
    this.setData({
      stata: e.currentTarget.dataset.key,
      missionsys:e.target.dataset.missionsys
    });
     console.log(this.data.missionsys)
  },
  clickMem:function(e){
    this.setData({
        hiddenNamem:!this.data.hiddenNamem
    })
},
  clickMes:function(e){
    this.setData({
        hiddenNames:!this.data.hiddenNames
    })
},


previewImageq: function(e){
  wx.previewImage({
      current: e.currentTarget.id, // 当前显示图片的http链接
      urls: this.data.filesw // 需要预览的图片http链接列表
  })
},


previewImage: function(e){
  wx.previewImage({
      current: e.currentTarget.id, // 当前显示图片的http链接
      urls: this.data.files // 需要预览的图片http链接列表
  })
},
  clickMe:function(e){
    this.setData({
        hiddenName:!this.data.hiddenName
    })
},
  bindChange(e) {
    const val = e.detail.value
    this.setData({
      year: this.data.years[val[0]],
      month: this.data.months[val[1]],
      day: this.data.days[val[2]],
    })
  },
//选择用途后加样式
select_use: function(e) {
  this.setData({
    state: e.currentTarget.dataset.key,
  });
},
select_sb: function(e) {
  this.setData({
    stata: e.currentTarget.dataset.key,
  });
},
onReady: function() {
var that = this;
wx.request({
  url: 'http://localhost:8080/weixingxiaocx/MissionType/selectTypeName',
  success:function(res){
    // console.log(res)
    that.setData({
      useList : res.data
    })
  }
}),
wx.request({
  url: 'http://localhost:8080/weixingxiaocx/Sys/select',
  success:function(res){
    // console.log(res)
    that.setData({
      sbs : res.data
    })
  }
})
},

chooseImagew:function(){
  let thats = this;
  wx.showActionSheet({
    itemList: ['从相册中选择','拍照'],
    itemColor:"#f7982a",
    success:function(re){
      if (!re.cancel){
        if(re.tapIndex == 0){
          thats.chooseWxImagew('album')
        }else if (re.tapIndex == 1){
          thats.chooseWxImagew('camera')
        }
      }
    }
  })
},

chooseWxImagew:function(type){
  let thats = this;
  wx.chooseImage({
    sizeType:['original','compressed'],
    sourceType: ['album', 'camera'],
    success:function(re){
      var tempFilePaths = re.tempFilePaths
      thats.setData({
        filesw:thats.data.filesw.concat(re.tempFilePaths),
        logo:re.tempFilePaths[0],  
        missionContents: thats.data.missionContents.concat(tempFilePaths)
      })
      var tempFilePaths = re.tempFilePaths
      console.log(thats.data.missionContents);
      wx.uploadFile({
        filePath: tempFilePaths[0],
        name: 'file',
        formData:{
          'user':'test'
        },
      })
    }
  })
},

chooseImage:function(){
  let that = this;
  wx.showActionSheet({
  itemList: ['从相册中选择','拍照'],
  itemColor:"#f7982a",
  success:function(res){
    if(!res.cancel){
      if(res.tapIndex == 0){
        that.chooseWxImage('album')
      
      }else if(res.tapIndex ==1){
        that.chooseWxImage('camera')
      }
    }
  }
  })
  },

chooseWxImage:function(type){
let that = this;
wx.chooseImage({
  sizeType:['original','compressed'],
  sourceType: ['album', 'camera'],
  success:function(res){
    var tempFilePaths = res.tempFilePaths
    that.setData({
      files: that.data.files.concat(res.tempFilePaths),
      logo:res.tempFilePaths[0],
      missionPatterns: that.data.missionPatterns.concat(tempFilePaths)
    })
    console.log(that.data.missionPatterns);
   var tempFilePaths = res.tempFilePaths
  wx.uploadFile({
    filePath: tempFilePaths[0],
    name: 'file',
  //  url: 'http://localhost:8080/weixingxiaocx/identityAudit',
    formData:{
      'user':'test'
    },
    success:function(res){
      var data = res.data
    }
  })
  }
})
},

add:function(options){
console.log(options);
var missionPattern = this.data.missionPatterns
var missionContent = this.data.missionContents
var li = missionPattern.join(',');
var lis = missionContent.join(',');
wx.request({
 url: 'http://localhost:8080/weixingxiaocx/Mission/add',
  method:'POST',
  data:{
    missionNo: 234234,
    missionSys:this.data.missionsys,
    missionType:this.data.missiontype,
    missionMana:1,
    missionContent:lis,
    missionHeadline: options.detail.value.missionHeadline,
    missionSt: new Date(),
    missionCt: options.detail.value.missionCt,
    missionMoney: options.detail.value.missionMoney,
    missionNum: options.detail.value.missionNume,
    missionAll: this.data.ds,
    missionText:options.detail.value.missionText,
    missionLink:options.detail.value.missionLink,
    missionVerify:options.detail.value.missionVerify,
    missionPattern:li,
  }
})
wx.showToast({
  title: '发布成功',
  duration:2000
})
wx.navigateTo({
  url: '/pages/home/home',
})
},
/**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },



  formSubmit: function (e) {
    console.log(e);
    var missionHeadline = e.detail.value.missionHeadline
    var missionMoney = e.detail.value.missionMoney
    var missionNum = e.detail.value.missionNum
    var missionText = e.detail.value.missionText
    if(missionText == ''){
      wx.showToast({
        title: '备注不能为空',
        icon: "none"
      })
    }
    if(missionMoney < 0.5){
      wx.showToast({
        title: '出价不能低于0.5元',
      })
    }
    if (missionNum < 50){
      wx.showToast({
        title: '数量不能少于50单',
      })
    }
    if (missionHeadline == '') {
      wx.showToast({
        title: "标题不能为空",
        icon: "none"
      })
      return;
    } else if (missionMoney == '') {
      wx.showToast({
        title: '出价不能为空',
        icon: "none"
      })
      return;
    } else if (missionNum == '') {
      wx.showToast({
        title: '数量不能为空',
        icon: "none"
      })
      return;
    }
    // console.log(2222);
    var npr = { 'missionHeadline':missionHeadline,'missionMoney':missionMoney,'missionNum':missionNum};
  }
  })