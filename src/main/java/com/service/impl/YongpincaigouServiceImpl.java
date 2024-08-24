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


import com.dao.YongpincaigouDao;
import com.entity.YongpincaigouEntity;
import com.service.YongpincaigouService;
import com.entity.vo.YongpincaigouVO;
import com.entity.view.YongpincaigouView;

@Service("yongpincaigouService")
public class YongpincaigouServiceImpl extends ServiceImpl<YongpincaigouDao, YongpincaigouEntity> implements YongpincaigouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YongpincaigouEntity> page = this.selectPage(
                new Query<YongpincaigouEntity>(params).getPage(),
                new EntityWrapper<YongpincaigouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YongpincaigouEntity> wrapper) {
		  Page<YongpincaigouView> page =new Query<YongpincaigouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YongpincaigouVO> selectListVO(Wrapper<YongpincaigouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YongpincaigouVO selectVO(Wrapper<YongpincaigouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YongpincaigouView> selectListView(Wrapper<YongpincaigouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YongpincaigouView selectView(Wrapper<YongpincaigouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
