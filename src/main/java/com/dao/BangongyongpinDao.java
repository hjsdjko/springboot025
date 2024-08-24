package com.dao;

import com.entity.BangongyongpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BangongyongpinVO;
import com.entity.view.BangongyongpinView;


/**
 * 办公用品
 * 
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public interface BangongyongpinDao extends BaseMapper<BangongyongpinEntity> {
	
	List<BangongyongpinVO> selectListVO(@Param("ew") Wrapper<BangongyongpinEntity> wrapper);
	
	BangongyongpinVO selectVO(@Param("ew") Wrapper<BangongyongpinEntity> wrapper);
	
	List<BangongyongpinView> selectListView(@Param("ew") Wrapper<BangongyongpinEntity> wrapper);

	List<BangongyongpinView> selectListView(Pagination page,@Param("ew") Wrapper<BangongyongpinEntity> wrapper);

	
	BangongyongpinView selectView(@Param("ew") Wrapper<BangongyongpinEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BangongyongpinEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BangongyongpinEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BangongyongpinEntity> wrapper);



}
