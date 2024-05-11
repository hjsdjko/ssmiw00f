<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(147, 193, 7, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">用户名</view>
				<input :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(147, 193, 7, 0.07)","borderColor":"rgba(0, 0, 0, 0.25)","borderRadius":"16rpx","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.yonghuming" placeholder="用户名"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(147, 193, 7, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">密码</view>
				<input :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(147, 193, 7, 0.07)","borderColor":"rgba(0, 0, 0, 0.25)","borderRadius":"16rpx","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" placeholder="密码"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(147, 193, 7, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">姓名</view>
				<input :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(147, 193, 7, 0.07)","borderColor":"rgba(0, 0, 0, 0.25)","borderRadius":"16rpx","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xingming" placeholder="姓名"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(147, 193, 7, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">性别</view>
				<input :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(147, 193, 7, 0.07)","borderColor":"rgba(0, 0, 0, 0.25)","borderRadius":"16rpx","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xingbie" placeholder="性别"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="touxiangTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">头像</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-if="ruleForm.touxiang" :src="ruleForm.touxiang" mode="aspectFill"></image>
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(147, 193, 7, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">身份证</view>
				<input :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(147, 193, 7, 0.07)","borderColor":"rgba(0, 0, 0, 0.25)","borderRadius":"16rpx","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.shenfenzheng" placeholder="身份证"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(147, 193, 7, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">手机</view>
				<input :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(147, 193, 7, 0.07)","borderColor":"rgba(0, 0, 0, 0.25)","borderRadius":"16rpx","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.shouji" placeholder="手机"></input>
			</view>
									
			<!-- 否 -->
 
			
			          				          				          				          				          				          				          							
			          				          				          				          				          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(147, 193, 7, 1)","borderColor":"rgba(147, 193, 7, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																																	
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												yonghuming: '',
																mima: '',
																xingming: '',
																xingbie: '',
																touxiang: '',
																shenfenzheng: '',
																shouji: '',
												},
																																																																// 登陆用户信息
				user: {},
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																																																
																																																			
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`yonghu`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
															if(o=='yonghuming'){
					this.ruleForm.yonghuming = obj[o];
					continue;
					}
																				if(o=='mima'){
					this.ruleForm.mima = obj[o];
					continue;
					}
																				if(o=='xingming'){
					this.ruleForm.xingming = obj[o];
					continue;
					}
																				if(o=='xingbie'){
					this.ruleForm.xingbie = obj[o];
					continue;
					}
																				if(o=='touxiang'){
					this.ruleForm.touxiang = obj[o];
					continue;
					}
																				if(o=='shenfenzheng'){
					this.ruleForm.shenfenzheng = obj[o];
					continue;
					}
																				if(o=='shouji'){
					this.ruleForm.shouji = obj[o];
					continue;
					}
														}
																																																															}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																
			// 多级联动参数
																																																
																																													
																																													
																																													
																																													touxiangTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
																											
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																								if((!this.ruleForm.yonghuming)){
					this.$utils.msg(`用户名不能为空`);
					return
				}
																																								if((!this.ruleForm.mima)){
					this.$utils.msg(`密码不能为空`);
					return
				}
																																																																																																																																																												if(this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
					this.$utils.msg(`身份证应输入身份证格式`);
					return
				}
																																																if(this.ruleForm.id){
					await this.$api.update(`yonghu`, this.ruleForm);
				}else{
					await this.$api.add(`yonghu`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>
