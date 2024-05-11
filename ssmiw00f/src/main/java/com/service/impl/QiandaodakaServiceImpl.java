package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QiandaodakaDao;
import com.entity.QiandaodakaEntity;
import com.service.QiandaodakaService;
import com.entity.vo.QiandaodakaVO;
import com.entity.view.QiandaodakaView;

@Service("qiandaodakaService")
public class QiandaodakaServiceImpl extends ServiceImpl<QiandaodakaDao, QiandaodakaEntity> implements QiandaodakaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiandaodakaEntity> page = this.selectPage(
                new Query<QiandaodakaEntity>(params).getPage(),
                new EntityWrapper<QiandaodakaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiandaodakaEntity> wrapper) {
		  Page<QiandaodakaView> page =new Query<QiandaodakaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiandaodakaVO> selectListVO(Wrapper<QiandaodakaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiandaodakaVO selectVO(Wrapper<QiandaodakaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiandaodakaView> selectListView(Wrapper<QiandaodakaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiandaodakaView selectView(Wrapper<QiandaodakaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
