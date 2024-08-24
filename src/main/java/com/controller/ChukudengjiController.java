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

import com.entity.ChukudengjiEntity;
import com.entity.view.ChukudengjiView;

import com.service.ChukudengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 出库登记
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
@RestController
@RequestMapping("/chukudengji")
public class ChukudengjiController {
    @Autowired
    private ChukudengjiService chukudengjiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChukudengjiEntity chukudengji,
		HttpServletRequest request){
        EntityWrapper<ChukudengjiEntity> ew = new EntityWrapper<ChukudengjiEntity>();

		PageUtils page = chukudengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chukudengji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChukudengjiEntity chukudengji, 
		HttpServletRequest request){
        EntityWrapper<ChukudengjiEntity> ew = new EntityWrapper<ChukudengjiEntity>();

		PageUtils page = chukudengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chukudengji), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChukudengjiEntity chukudengji){
       	EntityWrapper<ChukudengjiEntity> ew = new EntityWrapper<ChukudengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chukudengji, "chukudengji")); 
        return R.ok().put("data", chukudengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChukudengjiEntity chukudengji){
        EntityWrapper< ChukudengjiEntity> ew = new EntityWrapper< ChukudengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chukudengji, "chukudengji")); 
		ChukudengjiView chukudengjiView =  chukudengjiService.selectView(ew);
		return R.ok("查询出库登记成功").put("data", chukudengjiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChukudengjiEntity chukudengji = chukudengjiService.selectById(id);
        return R.ok().put("data", chukudengji);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChukudengjiEntity chukudengji = chukudengjiService.selectById(id);
        return R.ok().put("data", chukudengji);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChukudengjiEntity chukudengji, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chukudengji);
        chukudengjiService.insert(chukudengji);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChukudengjiEntity chukudengji, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chukudengji);
        chukudengjiService.insert(chukudengji);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChukudengjiEntity chukudengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chukudengji);
        chukudengjiService.updateById(chukudengji);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chukudengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
