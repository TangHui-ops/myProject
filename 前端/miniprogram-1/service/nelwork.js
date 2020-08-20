export default function request(options){
  return new Promise((resolve,reject)=>{
    var u="http://localhost:8080/weixingxiaocx/";
    wx.request({
      url:u+options.url,
      method:options.method||'get',
      data: options.data||{},
      success:function(res){
        resolve(res)
      },
      fail:function(err){
      reject(err)
      }
    })
  })
  
 
}

