package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YicuociEntity;
import com.entity.view.YicuociView;

import com.service.YicuociService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 易错词
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-04 19:55:11
 */
@RestController
@RequestMapping("/yicuoci")
public class YicuociController {
    @Autowired
    private YicuociService yicuociService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YicuociEntity yicuoci, HttpServletRequest request){

        EntityWrapper<YicuociEntity> ew = new EntityWrapper<YicuociEntity>();
		PageUtils page = yicuociService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yicuoci), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YicuociEntity yicuoci, HttpServletRequest request){
        EntityWrapper<YicuociEntity> ew = new EntityWrapper<YicuociEntity>();
		PageUtils page = yicuociService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yicuoci), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YicuociEntity yicuoci){
       	EntityWrapper<YicuociEntity> ew = new EntityWrapper<YicuociEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yicuoci, "yicuoci")); 
        return R.ok().put("data", yicuociService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YicuociEntity yicuoci){
        EntityWrapper< YicuociEntity> ew = new EntityWrapper< YicuociEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yicuoci, "yicuoci")); 
		YicuociView yicuociView =  yicuociService.selectView(ew);
		return R.ok("查询易错词成功").put("data", yicuociView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        YicuociEntity yicuoci = yicuociService.selectById(id);
        return R.ok().put("data", yicuoci);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        YicuociEntity yicuoci = yicuociService.selectById(id);
        return R.ok().put("data", yicuoci);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YicuociEntity yicuoci, HttpServletRequest request){
    	yicuoci.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yicuoci);

        yicuociService.insert(yicuoci);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YicuociEntity yicuoci, HttpServletRequest request){
    	yicuoci.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yicuoci);

        yicuociService.insert(yicuoci);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YicuociEntity yicuoci, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yicuoci);
        yicuociService.updateById(yicuoci);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yicuociService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YicuociEntity> wrapper = new EntityWrapper<YicuociEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yicuociService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
