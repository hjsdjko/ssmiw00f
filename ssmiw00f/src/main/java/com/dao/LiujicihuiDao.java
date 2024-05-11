package com.dao;

import com.entity.LiujicihuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiujicihuiVO;
import com.entity.view.LiujicihuiView;


/**
 * 六级词汇
 * 
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
public interface LiujicihuiDao extends BaseMapper<LiujicihuiEntity> {
	
	List<LiujicihuiVO> selectListVO(@Param("ew") Wrapper<LiujicihuiEntity> wrapper);
	
	LiujicihuiVO selectVO(@Param("ew") Wrapper<LiujicihuiEntity> wrapper);
	
	List<LiujicihuiView> selectListView(@Param("ew") Wrapper<LiujicihuiEntity> wrapper);

	List<LiujicihuiView> selectListView(Pagination page,@Param("ew") Wrapper<LiujicihuiEntity> wrapper);
	
	LiujicihuiView selectView(@Param("ew") Wrapper<LiujicihuiEntity> wrapper);
	
}
