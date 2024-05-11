package com.dao;

import com.entity.SijicihuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SijicihuiVO;
import com.entity.view.SijicihuiView;


/**
 * 四级词汇
 * 
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
public interface SijicihuiDao extends BaseMapper<SijicihuiEntity> {
	
	List<SijicihuiVO> selectListVO(@Param("ew") Wrapper<SijicihuiEntity> wrapper);
	
	SijicihuiVO selectVO(@Param("ew") Wrapper<SijicihuiEntity> wrapper);
	
	List<SijicihuiView> selectListView(@Param("ew") Wrapper<SijicihuiEntity> wrapper);

	List<SijicihuiView> selectListView(Pagination page,@Param("ew") Wrapper<SijicihuiEntity> wrapper);
	
	SijicihuiView selectView(@Param("ew") Wrapper<SijicihuiEntity> wrapper);
	
}
