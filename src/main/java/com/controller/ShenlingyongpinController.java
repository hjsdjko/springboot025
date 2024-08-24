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

import com.entity.ShenlingyongpinEntity;
import com.entity.view.ShenlingyongpinView;

import com.service.ShenlingyongpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 申领用品
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
@RestController
@RequestMapping("/shenlingyongpin")
public class ShenlingyongpinController {
    @Autowired
    private ShenlingyongpinService shenlingyongpinService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShenlingyongpinEntity shenlingyongpin,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shenlingyongpin.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenlingyongpinEntity> ew = new EntityWrapper<ShenlingyongpinEntity>();

		PageUtils page = shenlingyongpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenlingyongpin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShenlingyongpinEntity shenlingyongpin, 
		HttpServletRequest request){
        EntityWrapper<ShenlingyongpinEntity> ew = new EntityWrapper<ShenlingyongpinEntity>();

		PageUtils page = shenlingyongpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenlingyongpin), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShenlingyongpinEntity shenlingyongpin){
       	EntityWrapper<ShenlingyongpinEntity> ew = new EntityWrapper<ShenlingyongpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shenlingyongpin, "shenlingyongpin")); 
        return R.ok().put("data", shenlingyongpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShenlingyongpinEntity shenlingyongpin){
        EntityWrapper< ShenlingyongpinEntity> ew = new EntityWrapper< ShenlingyongpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shenlingyongpin, "shenlingyongpin")); 
		ShenlingyongpinView shenlingyongpinView =  shenlingyongpinService.selectView(ew);
		return R.ok("查询申领用品成功").put("data", shenlingyongpinView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShenlingyongpinEntity shenlingyongpin = shenlingyongpinService.selectById(id);
        return R.ok().put("data", shenlingyongpin);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShenlingyongpinEntity shenlingyongpin = shenlingyongpinService.selectById(id);
        return R.ok().put("data", shenlingyongpin);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShenlingyongpinEntity shenlingyongpin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shenlingyongpin);
        shenlingyongpinService.insert(shenlingyongpin);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShenlingyongpinEntity shenlingyongpin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shenlingyongpin);
        shenlingyongpinService.insert(shenlingyongpin);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShenlingyongpinEntity shenlingyongpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shenlingyongpin);
        shenlingyongpinService.updateById(shenlingyongpin);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<ShenlingyongpinEntity> list = new ArrayList<ShenlingyongpinEntity>();
        for(Long id : ids) {
            ShenlingyongpinEntity shenlingyongpin = shenlingyongpinService.selectById(id);
            shenlingyongpin.setSfsh(sfsh);
            shenlingyongpin.setShhf(shhf);
            list.add(shenlingyongpin);
        }
        shenlingyongpinService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shenlingyongpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
