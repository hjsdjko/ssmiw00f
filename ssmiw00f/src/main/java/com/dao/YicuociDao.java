package com.dao;

import com.entity.YicuociEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YicuociVO;
import com.entity.view.YicuociView;


/**
 * 易错词
 * 
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
public interface YicuociDao extends BaseMapper<YicuociEntity> {
	
	List<YicuociVO> selectListVO(@Param("ew") Wrapper<YicuociEntity> wrapper);
	
	YicuociVO selectVO(@Param("ew") Wrapper<YicuociEntity> wrapper);
	
	List<YicuociView> selectListView(@Param("ew") Wrapper<YicuociEntity> wrapper);

	List<YicuociView> selectListView(Pagination page,@Param("ew") Wrapper<YicuociEntity> wrapper);
	
	YicuociView selectView(@Param("ew") Wrapper<YicuociEntity> wrapper);
	
}
