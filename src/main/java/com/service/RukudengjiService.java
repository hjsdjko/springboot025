package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RukudengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RukudengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RukudengjiView;


/**
 * 入库登记
 *
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public interface RukudengjiService extends IService<RukudengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RukudengjiVO> selectListVO(Wrapper<RukudengjiEntity> wrapper);
   	
   	RukudengjiVO selectVO(@Param("ew") Wrapper<RukudengjiEntity> wrapper);
   	
   	List<RukudengjiView> selectListView(Wrapper<RukudengjiEntity> wrapper);
   	
   	RukudengjiView selectView(@Param("ew") Wrapper<RukudengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RukudengjiEntity> wrapper);

   	

}

