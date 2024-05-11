package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 易错词
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
@TableName("yicuoci")
public class YicuociEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YicuociEntity() {
		
	}
	
	public YicuociEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 易错单词
	 */
					
	private String yicuodanci;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：易错单词
	 */
	public void setYicuodanci(String yicuodanci) {
		this.yicuodanci = yicuodanci;
	}
	/**
	 * 获取：易错单词
	 */
	public String getYicuodanci() {
		return yicuodanci;
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
