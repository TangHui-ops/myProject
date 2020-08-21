var saomao = document.getElementById("saomadenglu");
var zhanghu = document.getElementById("zhanghudenglu");
var formlogin = document.getElementById("formlogin");
var formlogin2 = document.getElementById("formlogin2");

window.onload = function(){
    aomao.onclick = function(){
        formlogin2.style.display="none";
        formlogin.style.display="block";
        zhanghu.style.color = "#999999";
        saomao.setAttribute('style','font-weight:700;color:red');
    }
    zhanghu.onfocus = function(){
        formlogin.style.display="none";
        formlogin2.style.display="block";
        saomao.style.color = "#999999";
        zhanghu.setAttribute('style','font-weight:700;color:red');
    }
}