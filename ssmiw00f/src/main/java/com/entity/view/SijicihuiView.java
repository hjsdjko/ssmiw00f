package com.entity.view;

import com.entity.SijicihuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 四级词汇
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
@TableName("sijicihui")
public class SijicihuiView  extends SijicihuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SijicihuiView(){
	}
 
 	public SijicihuiView(SijicihuiEntity sijicihuiEntity){
 	try {
			BeanUtils.copyProperties(this, sijicihuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
