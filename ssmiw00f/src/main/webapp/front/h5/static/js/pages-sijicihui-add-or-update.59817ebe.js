(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-sijicihui-add-or-update"],{1976:function(r,e,t){"use strict";var i,a=function(){var r=this,e=r.$createElement,t=r._self._c||e;return t("v-uni-view",{staticClass:"content"},[t("v-uni-form",{staticClass:"app-update-pv"},[t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"rgba(147, 193, 7, 1)",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[r._v("单词")]),t("v-uni-input",{style:{boxShadow:"0 0 16rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(147, 193, 7, 0.07)",borderColor:"rgba(0, 0, 0, 0.25)",borderRadius:"16rpx",color:"rgba(255, 144, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{placeholder:"单词"},model:{value:r.ruleForm.danci,callback:function(e){r.$set(r.ruleForm,"danci",e)},expression:"ruleForm.danci"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"rgba(147, 193, 7, 1)",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[r._v("等级")]),t("v-uni-input",{style:{boxShadow:"0 0 16rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(147, 193, 7, 0.07)",borderColor:"rgba(0, 0, 0, 0.25)",borderRadius:"16rpx",color:"rgba(255, 144, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{placeholder:"等级"},model:{value:r.ruleForm.dengji,callback:function(e){r.$set(r.ruleForm,"dengji",e)},expression:"ruleForm.dengji"}})],1),t("v-uni-view",{staticClass:"cu-form-group",class:"left"==r.left?"":"active",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.tupianTap.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[r._v("图片")]),t("v-uni-view",{staticClass:"right-input",staticStyle:{padding:"0"},style:{textAlign:"left"}},[r.ruleForm.tupian?t("v-uni-image",{staticClass:"avator",style:{width:"88rpx",boxShadow:"0 0 16rpx rgba(0,0,0,.3)",borderRadius:"100%",textAlign:"left",height:"88rpx"},attrs:{src:r.ruleForm.tupian,mode:"aspectFill"}}):t("v-uni-image",{staticClass:"avator",style:{width:"88rpx",boxShadow:"0 0 16rpx rgba(0,0,0,.3)",borderRadius:"100%",textAlign:"left",height:"88rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1)],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"rgba(147, 193, 7, 1)",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[r._v("字母")]),t("v-uni-input",{style:{boxShadow:"0 0 16rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(147, 193, 7, 0.07)",borderColor:"rgba(0, 0, 0, 0.25)",borderRadius:"16rpx",color:"rgba(255, 144, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{placeholder:"字母"},model:{value:r.ruleForm.zimu,callback:function(e){r.$set(r.ruleForm,"zimu",e)},expression:"ruleForm.zimu"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"rgba(147, 193, 7, 1)",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[r._v("音标")]),t("v-uni-input",{style:{boxShadow:"0 0 16rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(147, 193, 7, 0.07)",borderColor:"rgba(0, 0, 0, 0.25)",borderRadius:"16rpx",color:"rgba(255, 144, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{placeholder:"音标"},model:{value:r.ruleForm.yinbiao,callback:function(e){r.$set(r.ruleForm,"yinbiao",e)},expression:"ruleForm.yinbiao"}})],1),t("v-uni-view",{staticClass:"cu-form-group input",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"rgba(147, 193, 7, 1)",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.tingliTap.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[r._v("听力")]),t("v-uni-view",{staticClass:"right-input",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(147, 193, 7, 0.07)",borderColor:"rgba(0, 0, 0, 0.25)",borderRadius:"16rpx",color:"rgba(255, 144, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"}},[r._v(r._s(r.ruleForm.tingli?r.ruleForm.tingli:"点击上传听力"))])],1),t("v-uni-view",{staticClass:"cu-form-group select",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[r._v("发布日期")]),t("v-uni-picker",{attrs:{mode:"date",value:r.ruleForm.faburiqi},on:{change:function(e){arguments[0]=e=r.$handleEvent(e),r.faburiqiChange.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"uni-input",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"16rpx",color:"rgba(255, 144, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"}},[r._v(r._s(r.ruleForm.faburiqi?r.ruleForm.faburiqi:"请选择发布日期"))])],1)],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"308rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[r._v("翻译")]),t("v-uni-textarea",{style:{boxShadow:"0 0 16rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0, 0, 0, 0.26)",borderRadius:"16rpx",color:"rgba(255, 144, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"280rpx"},attrs:{placeholder:"翻译"},model:{value:r.ruleForm.fanyi,callback:function(e){r.$set(r.ruleForm,"fanyi",e)},expression:"ruleForm.fanyi"}})],1),t("v-uni-view",{staticClass:"btn"},[t("v-uni-button",{staticClass:"bg-red",style:{boxShadow:"0 0 16rpx rgba(0,0,0,0) inset",backgroundColor:"rgba(147, 193, 7, 1)",borderColor:"rgba(147, 193, 7, 1)",borderRadius:"8rpx",color:"#fff",borderWidth:"1",width:"80%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.onSubmitTap.apply(void 0,arguments)}}},[r._v("提交")])],1)],1)],1)},o=[];t.d(e,"b",(function(){return a})),t.d(e,"c",(function(){return o})),t.d(e,"a",(function(){return i}))},4908:function(r,e,t){"use strict";t.r(e);var i=t("b7ef"),a=t.n(i);for(var o in i)"default"!==o&&function(r){t.d(e,r,(function(){return i[r]}))}(o);e["default"]=a.a},70371:function(r,e,t){var i=t("a9ac");"string"===typeof i&&(i=[[r.i,i,""]]),i.locals&&(r.exports=i.locals);var a=t("4f06").default;a("192bd3bc",i,!0,{sourceMap:!1,shadowMode:!1})},"815d":function(r,e,t){"use strict";var i=t("70371"),a=t.n(i);a.a},a9ac:function(r,e,t){var i=t("24fb");e=i(!1),e.push([r.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.container[data-v-8e763f7e]{padding:%?20?%}.content[data-v-8e763f7e]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-attachment:fixed;background-size:cover;background-position:50%}uni-textarea[data-v-8e763f7e]{border:%?1?% solid #eee;border-radius:%?20?%;padding:%?20?%}.title[data-v-8e763f7e]{width:%?180?%}.avator[data-v-8e763f7e]{width:%?150?%;height:%?60?%}.right-input[data-v-8e763f7e]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:left;padding:0 %?24?%}.cu-form-group.active[data-v-8e763f7e]{-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between}.btn[data-v-8e763f7e]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;padding:%?20?% 0}.cu-form-group[data-v-8e763f7e]{padding:0 %?24?%;background-color:initial;min-height:inherit}.cu-form-group + .cu-form-group[data-v-8e763f7e]{border:0}.cu-form-group uni-input[data-v-8e763f7e]{padding:0 %?30?%}.uni-input[data-v-8e763f7e]{padding:0 %?30?%}.cu-form-group uni-textarea[data-v-8e763f7e]{padding:%?30?%;margin:0}.cu-form-group uni-picker[data-v-8e763f7e]::after{line-height:%?88?%}.select .uni-input[data-v-8e763f7e]{line-height:%?88?%}.input .right-input[data-v-8e763f7e]{line-height:%?88?%}',""]),r.exports=e},b7ef:function(r,e,t){"use strict";var i=t("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,t("ac6a"),t("96cf");var a=i(t("3b8d")),o=i(t("e2b1")),n={data:function(){return{ruleForm:{danci:"",dengji:"",tupian:"",zimu:"",yinbiao:"",fanyi:"",tingli:"",faburiqi:""},user:{}}},components:{wPicker:o.default},computed:{},onLoad:function(){var r=(0,a.default)(regeneratorRuntime.mark((function r(e){var t,i,a,o;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return t=uni.getStorageSync("nowTable"),r.next=3,this.$api.session(t);case 3:if(i=r.sent,this.user=i.data,this.ruleForm.userid=uni.getStorageSync("userid"),e.refid&&(this.ruleForm.refid=e.refid),!e.id){r.next=13;break}return this.ruleForm.id=e.id,r.next=11,this.$api.info("sijicihui",this.ruleForm.id);case 11:i=r.sent,this.ruleForm=i.data;case 13:if(!e.cross){r.next=44;break}a=uni.getStorageSync("crossObj"),r.t0=regeneratorRuntime.keys(a);case 16:if((r.t1=r.t0()).done){r.next=44;break}if(o=r.t1.value,"danci"!=o){r.next=21;break}return this.ruleForm.danci=a[o],r.abrupt("continue",16);case 21:if("dengji"!=o){r.next=24;break}return this.ruleForm.dengji=a[o],r.abrupt("continue",16);case 24:if("tupian"!=o){r.next=27;break}return this.ruleForm.tupian=a[o],r.abrupt("continue",16);case 27:if("zimu"!=o){r.next=30;break}return this.ruleForm.zimu=a[o],r.abrupt("continue",16);case 30:if("yinbiao"!=o){r.next=33;break}return this.ruleForm.yinbiao=a[o],r.abrupt("continue",16);case 33:if("fanyi"!=o){r.next=36;break}return this.ruleForm.fanyi=a[o],r.abrupt("continue",16);case 36:if("tingli"!=o){r.next=39;break}return this.ruleForm.tingli=a[o],r.abrupt("continue",16);case 39:if("faburiqi"!=o){r.next=42;break}return this.ruleForm.faburiqi=a[o],r.abrupt("continue",16);case 42:r.next=16;break;case 44:this.styleChange();case 45:case"end":return r.stop()}}),r,this)})));function e(e){return r.apply(this,arguments)}return e}(),methods:{styleChange:function(){this.$nextTick((function(){}))},faburiqiChange:function(r){this.ruleForm.faburiqi=r.target.value,this.$forceUpdate()},tupianTap:function(){var r=this;this.$api.upload((function(e){r.ruleForm.tupian=r.$base.url+"upload/"+e.file,r.$forceUpdate(),r.$nextTick((function(){r.styleChange()}))}))},tingliTap:function(){var r=this;this.$api.uploadMedia((function(e){r.ruleForm.tingli=r.$base.url+"upload/"+e.file,r.$forceUpdate()}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var r=(0,a.default)(regeneratorRuntime.mark((function r(){return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(!this.ruleForm.id){r.next=5;break}return r.next=3,this.$api.update("sijicihui",this.ruleForm);case 3:r.next=7;break;case 5:return r.next=7,this.$api.add("sijicihui",this.ruleForm);case 7:this.$utils.msgBack("提交成功");case 8:case"end":return r.stop()}}),r,this)})));function e(){return r.apply(this,arguments)}return e}(),optionsChange:function(r){this.index=r.target.value},bindDateChange:function(r){this.date=r.target.value},getDate:function(r){var e=new Date,t=e.getFullYear(),i=e.getMonth()+1,a=e.getDate();return"start"===r?t-=60:"end"===r&&(t+=2),i=i>9?i:"0"+i,a=a>9?a:"0"+a,"".concat(t,"-").concat(i,"-").concat(a)},toggleTab:function(r){this.$refs[r].show()}}};e.default=n},c942:function(r,e,t){"use strict";t.r(e);var i=t("1976"),a=t("4908");for(var o in a)"default"!==o&&function(r){t.d(e,r,(function(){return a[r]}))}(o);t("815d");var n,l=t("f0c5"),u=Object(l["a"])(a["default"],i["b"],i["c"],!1,null,"8e763f7e",null,!1,i["a"],n);e["default"]=u.exports}}]);