package com.dao;

import com.entity.ShenlingyongpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenlingyongpinVO;
import com.entity.view.ShenlingyongpinView;


/**
 * 申领用品
 * 
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public interface ShenlingyongpinDao extends BaseMapper<ShenlingyongpinEntity> {
	
	List<ShenlingyongpinVO> selectListVO(@Param("ew") Wrapper<ShenlingyongpinEntity> wrapper);
	
	ShenlingyongpinVO selectVO(@Param("ew") Wrapper<ShenlingyongpinEntity> wrapper);
	
	List<ShenlingyongpinView> selectListView(@Param("ew") Wrapper<ShenlingyongpinEntity> wrapper);

	List<ShenlingyongpinView> selectListView(Pagination page,@Param("ew") Wrapper<ShenlingyongpinEntity> wrapper);

	
	ShenlingyongpinView selectView(@Param("ew") Wrapper<ShenlingyongpinEntity> wrapper);
	

}
