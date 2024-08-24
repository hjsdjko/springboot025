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

import com.entity.YongpinfenleiEntity;
import com.entity.view.YongpinfenleiView;

import com.service.YongpinfenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 用品分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
@RestController
@RequestMapping("/yongpinfenlei")
public class YongpinfenleiController {
    @Autowired
    private YongpinfenleiService yongpinfenleiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YongpinfenleiEntity yongpinfenlei,
		HttpServletRequest request){
        EntityWrapper<YongpinfenleiEntity> ew = new EntityWrapper<YongpinfenleiEntity>();

		PageUtils page = yongpinfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yongpinfenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YongpinfenleiEntity yongpinfenlei, 
		HttpServletRequest request){
        EntityWrapper<YongpinfenleiEntity> ew = new EntityWrapper<YongpinfenleiEntity>();

		PageUtils page = yongpinfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yongpinfenlei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YongpinfenleiEntity yongpinfenlei){
       	EntityWrapper<YongpinfenleiEntity> ew = new EntityWrapper<YongpinfenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yongpinfenlei, "yongpinfenlei")); 
        return R.ok().put("data", yongpinfenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YongpinfenleiEntity yongpinfenlei){
        EntityWrapper< YongpinfenleiEntity> ew = new EntityWrapper< YongpinfenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yongpinfenlei, "yongpinfenlei")); 
		YongpinfenleiView yongpinfenleiView =  yongpinfenleiService.selectView(ew);
		return R.ok("查询用品分类成功").put("data", yongpinfenleiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YongpinfenleiEntity yongpinfenlei = yongpinfenleiService.selectById(id);
        return R.ok().put("data", yongpinfenlei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YongpinfenleiEntity yongpinfenlei = yongpinfenleiService.selectById(id);
        return R.ok().put("data", yongpinfenlei);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YongpinfenleiEntity yongpinfenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yongpinfenlei);
        yongpinfenleiService.insert(yongpinfenlei);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YongpinfenleiEntity yongpinfenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yongpinfenlei);
        yongpinfenleiService.insert(yongpinfenlei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YongpinfenleiEntity yongpinfenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yongpinfenlei);
        yongpinfenleiService.updateById(yongpinfenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yongpinfenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
