package com.entity.model;

import com.entity.SijicihuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 四级词汇
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
public class SijicihuiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 等级
	 */
	
	private String dengji;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 字母
	 */
	
	private String zimu;
		
	/**
	 * 音标
	 */
	
	private String yinbiao;
		
	/**
	 * 翻译
	 */
	
	private String fanyi;
		
	/**
	 * 听力
	 */
	
	private String tingli;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：等级
	 */
	 
	public void setDengji(String dengji) {
		this.dengji = dengji;
	}
	
	/**
	 * 获取：等级
	 */
	public String getDengji() {
		return dengji;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：字母
	 */
	 
	public void setZimu(String zimu) {
		this.zimu = zimu;
	}
	
	/**
	 * 获取：字母
	 */
	public String getZimu() {
		return zimu;
	}
				
	
	/**
	 * 设置：音标
	 */
	 
	public void setYinbiao(String yinbiao) {
		this.yinbiao = yinbiao;
	}
	
	/**
	 * 获取：音标
	 */
	public String getYinbiao() {
		return yinbiao;
	}
				
	
	/**
	 * 设置：翻译
	 */
	 
	public void setFanyi(String fanyi) {
		this.fanyi = fanyi;
	}
	
	/**
	 * 获取：翻译
	 */
	public String getFanyi() {
		return fanyi;
	}
				
	
	/**
	 * 设置：听力
	 */
	 
	public void setTingli(String tingli) {
		this.tingli = tingli;
	}
	
	/**
	 * 获取：听力
	 */
	public String getTingli() {
		return tingli;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
