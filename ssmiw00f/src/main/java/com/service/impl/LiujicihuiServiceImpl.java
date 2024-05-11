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


import com.dao.LiujicihuiDao;
import com.entity.LiujicihuiEntity;
import com.service.LiujicihuiService;
import com.entity.vo.LiujicihuiVO;
import com.entity.view.LiujicihuiView;

@Service("liujicihuiService")
public class LiujicihuiServiceImpl extends ServiceImpl<LiujicihuiDao, LiujicihuiEntity> implements LiujicihuiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiujicihuiEntity> page = this.selectPage(
                new Query<LiujicihuiEntity>(params).getPage(),
                new EntityWrapper<LiujicihuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiujicihuiEntity> wrapper) {
		  Page<LiujicihuiView> page =new Query<LiujicihuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiujicihuiVO> selectListVO(Wrapper<LiujicihuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiujicihuiVO selectVO(Wrapper<LiujicihuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiujicihuiView> selectListView(Wrapper<LiujicihuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiujicihuiView selectView(Wrapper<LiujicihuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
