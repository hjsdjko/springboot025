package com.dao;

import com.entity.RukudengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RukudengjiVO;
import com.entity.view.RukudengjiView;


/**
 * 入库登记
 * 
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public interface RukudengjiDao extends BaseMapper<RukudengjiEntity> {
	
	List<RukudengjiVO> selectListVO(@Param("ew") Wrapper<RukudengjiEntity> wrapper);
	
	RukudengjiVO selectVO(@Param("ew") Wrapper<RukudengjiEntity> wrapper);
	
	List<RukudengjiView> selectListView(@Param("ew") Wrapper<RukudengjiEntity> wrapper);

	List<RukudengjiView> selectListView(Pagination page,@Param("ew") Wrapper<RukudengjiEntity> wrapper);

	
	RukudengjiView selectView(@Param("ew") Wrapper<RukudengjiEntity> wrapper);
	

}
