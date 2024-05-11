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


import com.dao.YicuociDao;
import com.entity.YicuociEntity;
import com.service.YicuociService;
import com.entity.vo.YicuociVO;
import com.entity.view.YicuociView;

@Service("yicuociService")
public class YicuociServiceImpl extends ServiceImpl<YicuociDao, YicuociEntity> implements YicuociService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YicuociEntity> page = this.selectPage(
                new Query<YicuociEntity>(params).getPage(),
                new EntityWrapper<YicuociEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YicuociEntity> wrapper) {
		  Page<YicuociView> page =new Query<YicuociView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YicuociVO> selectListVO(Wrapper<YicuociEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YicuociVO selectVO(Wrapper<YicuociEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YicuociView> selectListView(Wrapper<YicuociEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YicuociView selectView(Wrapper<YicuociEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
