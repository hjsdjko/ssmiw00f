package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YicuociEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YicuociVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YicuociView;


/**
 * 易错词
 *
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
public interface YicuociService extends IService<YicuociEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YicuociVO> selectListVO(Wrapper<YicuociEntity> wrapper);
   	
   	YicuociVO selectVO(@Param("ew") Wrapper<YicuociEntity> wrapper);
   	
   	List<YicuociView> selectListView(Wrapper<YicuociEntity> wrapper);
   	
   	YicuociView selectView(@Param("ew") Wrapper<YicuociEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YicuociEntity> wrapper);
   	
}

