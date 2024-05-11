package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiandaodakaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiandaodakaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiandaodakaView;


/**
 * 签到打卡
 *
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
public interface QiandaodakaService extends IService<QiandaodakaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiandaodakaVO> selectListVO(Wrapper<QiandaodakaEntity> wrapper);
   	
   	QiandaodakaVO selectVO(@Param("ew") Wrapper<QiandaodakaEntity> wrapper);
   	
   	List<QiandaodakaView> selectListView(Wrapper<QiandaodakaEntity> wrapper);
   	
   	QiandaodakaView selectView(@Param("ew") Wrapper<QiandaodakaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiandaodakaEntity> wrapper);
   	
}

