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


import com.dao.RukudengjiDao;
import com.entity.RukudengjiEntity;
import com.service.RukudengjiService;
import com.entity.vo.RukudengjiVO;
import com.entity.view.RukudengjiView;

@Service("rukudengjiService")
public class RukudengjiServiceImpl extends ServiceImpl<RukudengjiDao, RukudengjiEntity> implements RukudengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RukudengjiEntity> page = this.selectPage(
                new Query<RukudengjiEntity>(params).getPage(),
                new EntityWrapper<RukudengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RukudengjiEntity> wrapper) {
		  Page<RukudengjiView> page =new Query<RukudengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<RukudengjiVO> selectListVO(Wrapper<RukudengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RukudengjiVO selectVO(Wrapper<RukudengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RukudengjiView> selectListView(Wrapper<RukudengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RukudengjiView selectView(Wrapper<RukudengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
