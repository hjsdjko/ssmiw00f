package com.entity.vo;

import com.entity.YicuociEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 易错词
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
public class YicuociVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 字母
	 */
	
	private String zimu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 发音
	 */
	
	private String fayin;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
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
	 * 设置：发音
	 */
	 
	public void setFayin(String fayin) {
		this.fayin = fayin;
	}
	
	/**
	 * 获取：发音
	 */
	public String getFayin() {
		return fayin;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
