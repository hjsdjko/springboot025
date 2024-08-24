package com.dao;

import com.entity.YongpincaigouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YongpincaigouVO;
import com.entity.view.YongpincaigouView;


/**
 * 用品采购
 * 
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public interface YongpincaigouDao extends BaseMapper<YongpincaigouEntity> {
	
	List<YongpincaigouVO> selectListVO(@Param("ew") Wrapper<YongpincaigouEntity> wrapper);
	
	YongpincaigouVO selectVO(@Param("ew") Wrapper<YongpincaigouEntity> wrapper);
	
	List<YongpincaigouView> selectListView(@Param("ew") Wrapper<YongpincaigouEntity> wrapper);

	List<YongpincaigouView> selectListView(Pagination page,@Param("ew") Wrapper<YongpincaigouEntity> wrapper);

	
	YongpincaigouView selectView(@Param("ew") Wrapper<YongpincaigouEntity> wrapper);
	

}
