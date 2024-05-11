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


import com.dao.SijicihuiDao;
import com.entity.SijicihuiEntity;
import com.service.SijicihuiService;
import com.entity.vo.SijicihuiVO;
import com.entity.view.SijicihuiView;

@Service("sijicihuiService")
public class SijicihuiServiceImpl extends ServiceImpl<SijicihuiDao, SijicihuiEntity> implements SijicihuiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SijicihuiEntity> page = this.selectPage(
                new Query<SijicihuiEntity>(params).getPage(),
                new EntityWrapper<SijicihuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SijicihuiEntity> wrapper) {
		  Page<SijicihuiView> page =new Query<SijicihuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SijicihuiVO> selectListVO(Wrapper<SijicihuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SijicihuiVO selectVO(Wrapper<SijicihuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SijicihuiView> selectListView(Wrapper<SijicihuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SijicihuiView selectView(Wrapper<SijicihuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
