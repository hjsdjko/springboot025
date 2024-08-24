package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YongpinfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YongpinfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YongpinfenleiView;


/**
 * 用品分类
 *
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public interface YongpinfenleiService extends IService<YongpinfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YongpinfenleiVO> selectListVO(Wrapper<YongpinfenleiEntity> wrapper);
   	
   	YongpinfenleiVO selectVO(@Param("ew") Wrapper<YongpinfenleiEntity> wrapper);
   	
   	List<YongpinfenleiView> selectListView(Wrapper<YongpinfenleiEntity> wrapper);
   	
   	YongpinfenleiView selectView(@Param("ew") Wrapper<YongpinfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YongpinfenleiEntity> wrapper);

   	

}

