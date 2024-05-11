package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiujicihuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiujicihuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiujicihuiView;


/**
 * 六级词汇
 *
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
public interface LiujicihuiService extends IService<LiujicihuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiujicihuiVO> selectListVO(Wrapper<LiujicihuiEntity> wrapper);
   	
   	LiujicihuiVO selectVO(@Param("ew") Wrapper<LiujicihuiEntity> wrapper);
   	
   	List<LiujicihuiView> selectListView(Wrapper<LiujicihuiEntity> wrapper);
   	
   	LiujicihuiView selectView(@Param("ew") Wrapper<LiujicihuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiujicihuiEntity> wrapper);
   	
}

