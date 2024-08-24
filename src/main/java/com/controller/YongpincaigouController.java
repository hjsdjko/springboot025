package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YongpincaigouEntity;
import com.entity.view.YongpincaigouView;

import com.service.YongpincaigouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 用品采购
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
@RestController
@RequestMapping("/yongpincaigou")
public class YongpincaigouController {
    @Autowired
    private YongpincaigouService yongpincaigouService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YongpincaigouEntity yongpincaigou,
		HttpServletRequest request){
        EntityWrapper<YongpincaigouEntity> ew = new EntityWrapper<YongpincaigouEntity>();

		PageUtils page = yongpincaigouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yongpincaigou), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YongpincaigouEntity yongpincaigou, 
		HttpServletRequest request){
        EntityWrapper<YongpincaigouEntity> ew = new EntityWrapper<YongpincaigouEntity>();

		PageUtils page = yongpincaigouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yongpincaigou), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YongpincaigouEntity yongpincaigou){
       	EntityWrapper<YongpincaigouEntity> ew = new EntityWrapper<YongpincaigouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yongpincaigou, "yongpincaigou")); 
        return R.ok().put("data", yongpincaigouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YongpincaigouEntity yongpincaigou){
        EntityWrapper< YongpincaigouEntity> ew = new EntityWrapper< YongpincaigouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yongpincaigou, "yongpincaigou")); 
		YongpincaigouView yongpincaigouView =  yongpincaigouService.selectView(ew);
		return R.ok("查询用品采购成功").put("data", yongpincaigouView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YongpincaigouEntity yongpincaigou = yongpincaigouService.selectById(id);
        return R.ok().put("data", yongpincaigou);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YongpincaigouEntity yongpincaigou = yongpincaigouService.selectById(id);
        return R.ok().put("data", yongpincaigou);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YongpincaigouEntity yongpincaigou, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yongpincaigou);
        yongpincaigouService.insert(yongpincaigou);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YongpincaigouEntity yongpincaigou, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yongpincaigou);
        yongpincaigouService.insert(yongpincaigou);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YongpincaigouEntity yongpincaigou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yongpincaigou);
        yongpincaigouService.updateById(yongpincaigou);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yongpincaigouService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
