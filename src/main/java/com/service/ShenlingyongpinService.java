package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenlingyongpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenlingyongpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenlingyongpinView;


/**
 * 申领用品
 *
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public interface ShenlingyongpinService extends IService<ShenlingyongpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenlingyongpinVO> selectListVO(Wrapper<ShenlingyongpinEntity> wrapper);
   	
   	ShenlingyongpinVO selectVO(@Param("ew") Wrapper<ShenlingyongpinEntity> wrapper);
   	
   	List<ShenlingyongpinView> selectListView(Wrapper<ShenlingyongpinEntity> wrapper);
   	
   	ShenlingyongpinView selectView(@Param("ew") Wrapper<ShenlingyongpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenlingyongpinEntity> wrapper);

   	

}

