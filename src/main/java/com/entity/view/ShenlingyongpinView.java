package com.entity.view;

import com.entity.ShenlingyongpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 申领用品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
@TableName("shenlingyongpin")
public class ShenlingyongpinView  extends ShenlingyongpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenlingyongpinView(){
	}
 
 	public ShenlingyongpinView(ShenlingyongpinEntity shenlingyongpinEntity){
 	try {
			BeanUtils.copyProperties(this, shenlingyongpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
