package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YongpincaigouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YongpincaigouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YongpincaigouView;


/**
 * 用品采购
 *
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public interface YongpincaigouService extends IService<YongpincaigouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YongpincaigouVO> selectListVO(Wrapper<YongpincaigouEntity> wrapper);
   	
   	YongpincaigouVO selectVO(@Param("ew") Wrapper<YongpincaigouEntity> wrapper);
   	
   	List<YongpincaigouView> selectListView(Wrapper<YongpincaigouEntity> wrapper);
   	
   	YongpincaigouView selectView(@Param("ew") Wrapper<YongpincaigouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YongpincaigouEntity> wrapper);

   	

}

