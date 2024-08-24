package com.dao;

import com.entity.ChukudengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChukudengjiVO;
import com.entity.view.ChukudengjiView;


/**
 * 出库登记
 * 
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public interface ChukudengjiDao extends BaseMapper<ChukudengjiEntity> {
	
	List<ChukudengjiVO> selectListVO(@Param("ew") Wrapper<ChukudengjiEntity> wrapper);
	
	ChukudengjiVO selectVO(@Param("ew") Wrapper<ChukudengjiEntity> wrapper);
	
	List<ChukudengjiView> selectListView(@Param("ew") Wrapper<ChukudengjiEntity> wrapper);

	List<ChukudengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ChukudengjiEntity> wrapper);

	
	ChukudengjiView selectView(@Param("ew") Wrapper<ChukudengjiEntity> wrapper);
	

}
