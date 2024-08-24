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


import com.dao.YongpinfenleiDao;
import com.entity.YongpinfenleiEntity;
import com.service.YongpinfenleiService;
import com.entity.vo.YongpinfenleiVO;
import com.entity.view.YongpinfenleiView;

@Service("yongpinfenleiService")
public class YongpinfenleiServiceImpl extends ServiceImpl<YongpinfenleiDao, YongpinfenleiEntity> implements YongpinfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YongpinfenleiEntity> page = this.selectPage(
                new Query<YongpinfenleiEntity>(params).getPage(),
                new EntityWrapper<YongpinfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YongpinfenleiEntity> wrapper) {
		  Page<YongpinfenleiView> page =new Query<YongpinfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YongpinfenleiVO> selectListVO(Wrapper<YongpinfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YongpinfenleiVO selectVO(Wrapper<YongpinfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YongpinfenleiView> selectListView(Wrapper<YongpinfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YongpinfenleiView selectView(Wrapper<YongpinfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
