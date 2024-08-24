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


import com.dao.ChukudengjiDao;
import com.entity.ChukudengjiEntity;
import com.service.ChukudengjiService;
import com.entity.vo.ChukudengjiVO;
import com.entity.view.ChukudengjiView;

@Service("chukudengjiService")
public class ChukudengjiServiceImpl extends ServiceImpl<ChukudengjiDao, ChukudengjiEntity> implements ChukudengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChukudengjiEntity> page = this.selectPage(
                new Query<ChukudengjiEntity>(params).getPage(),
                new EntityWrapper<ChukudengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChukudengjiEntity> wrapper) {
		  Page<ChukudengjiView> page =new Query<ChukudengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChukudengjiVO> selectListVO(Wrapper<ChukudengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChukudengjiVO selectVO(Wrapper<ChukudengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChukudengjiView> selectListView(Wrapper<ChukudengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChukudengjiView selectView(Wrapper<ChukudengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
