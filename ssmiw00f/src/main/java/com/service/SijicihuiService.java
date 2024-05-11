package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SijicihuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SijicihuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SijicihuiView;


/**
 * 四级词汇
 *
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
public interface SijicihuiService extends IService<SijicihuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SijicihuiVO> selectListVO(Wrapper<SijicihuiEntity> wrapper);
   	
   	SijicihuiVO selectVO(@Param("ew") Wrapper<SijicihuiEntity> wrapper);
   	
   	List<SijicihuiView> selectListView(Wrapper<SijicihuiEntity> wrapper);
   	
   	SijicihuiView selectView(@Param("ew") Wrapper<SijicihuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SijicihuiEntity> wrapper);
   	
}

