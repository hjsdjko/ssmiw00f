package com.entity.vo;

import com.entity.XuexibijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 学习笔记
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
public class XuexibijiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 学习进度
	 */
	
	private String xuexijindu;
		
	/**
	 * 学习心得
	 */
	
	private String xuexixinde;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：学习进度
	 */
	 
	public void setXuexijindu(String xuexijindu) {
		this.xuexijindu = xuexijindu;
	}
	
	/**
	 * 获取：学习进度
	 */
	public String getXuexijindu() {
		return xuexijindu;
	}
				
	
	/**
	 * 设置：学习心得
	 */
	 
	public void setXuexixinde(String xuexixinde) {
		this.xuexixinde = xuexixinde;
	}
	
	/**
	 * 获取：学习心得
	 */
	public String getXuexixinde() {
		return xuexixinde;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
