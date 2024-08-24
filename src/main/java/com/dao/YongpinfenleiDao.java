package com.dao;

import com.entity.YongpinfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YongpinfenleiVO;
import com.entity.view.YongpinfenleiView;


/**
 * 用品分类
 * 
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public interface YongpinfenleiDao extends BaseMapper<YongpinfenleiEntity> {
	
	List<YongpinfenleiVO> selectListVO(@Param("ew") Wrapper<YongpinfenleiEntity> wrapper);
	
	YongpinfenleiVO selectVO(@Param("ew") Wrapper<YongpinfenleiEntity> wrapper);
	
	List<YongpinfenleiView> selectListView(@Param("ew") Wrapper<YongpinfenleiEntity> wrapper);

	List<YongpinfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YongpinfenleiEntity> wrapper);

	
	YongpinfenleiView selectView(@Param("ew") Wrapper<YongpinfenleiEntity> wrapper);
	

}
