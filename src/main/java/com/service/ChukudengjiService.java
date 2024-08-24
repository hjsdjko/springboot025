package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChukudengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChukudengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChukudengjiView;


/**
 * 出库登记
 *
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public interface ChukudengjiService extends IService<ChukudengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChukudengjiVO> selectListVO(Wrapper<ChukudengjiEntity> wrapper);
   	
   	ChukudengjiVO selectVO(@Param("ew") Wrapper<ChukudengjiEntity> wrapper);
   	
   	List<ChukudengjiView> selectListView(Wrapper<ChukudengjiEntity> wrapper);
   	
   	ChukudengjiView selectView(@Param("ew") Wrapper<ChukudengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChukudengjiEntity> wrapper);

   	

}

