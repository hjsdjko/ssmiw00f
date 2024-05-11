package com.dao;

import com.entity.QiandaodakaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiandaodakaVO;
import com.entity.view.QiandaodakaView;


/**
 * 签到打卡
 * 
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
public interface QiandaodakaDao extends BaseMapper<QiandaodakaEntity> {
	
	List<QiandaodakaVO> selectListVO(@Param("ew") Wrapper<QiandaodakaEntity> wrapper);
	
	QiandaodakaVO selectVO(@Param("ew") Wrapper<QiandaodakaEntity> wrapper);
	
	List<QiandaodakaView> selectListView(@Param("ew") Wrapper<QiandaodakaEntity> wrapper);

	List<QiandaodakaView> selectListView(Pagination page,@Param("ew") Wrapper<QiandaodakaEntity> wrapper);
	
	QiandaodakaView selectView(@Param("ew") Wrapper<QiandaodakaEntity> wrapper);
	
}
