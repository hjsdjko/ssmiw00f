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
 * 四级词汇
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
@TableName("sijicihui")
public class SijicihuiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SijicihuiEntity() {
		
	}
	
	public SijicihuiEntity(T t) {
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
	 * 单词
	 */
					
	private String danci;
	
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
	 * 设置：单词
	 */
	public void setDanci(String danci) {
		this.danci = danci;
	}
	/**
	 * 获取：单词
	 */
	public String getDanci() {
		return danci;
	}
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
