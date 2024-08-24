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


import com.dao.ShenlingyongpinDao;
import com.entity.ShenlingyongpinEntity;
import com.service.ShenlingyongpinService;
import com.entity.vo.ShenlingyongpinVO;
import com.entity.view.ShenlingyongpinView;

@Service("shenlingyongpinService")
public class ShenlingyongpinServiceImpl extends ServiceImpl<ShenlingyongpinDao, ShenlingyongpinEntity> implements ShenlingyongpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenlingyongpinEntity> page = this.selectPage(
                new Query<ShenlingyongpinEntity>(params).getPage(),
                new EntityWrapper<ShenlingyongpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenlingyongpinEntity> wrapper) {
		  Page<ShenlingyongpinView> page =new Query<ShenlingyongpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShenlingyongpinVO> selectListVO(Wrapper<ShenlingyongpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenlingyongpinVO selectVO(Wrapper<ShenlingyongpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenlingyongpinView> selectListView(Wrapper<ShenlingyongpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenlingyongpinView selectView(Wrapper<ShenlingyongpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
