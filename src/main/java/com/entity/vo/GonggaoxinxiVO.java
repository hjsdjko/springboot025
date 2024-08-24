package com.entity.vo;

import com.entity.GonggaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 公告信息
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public class GonggaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 公告标题
	 */
	
	private String gonggaobiaoti;
		
	/**
	 * 公告图片
	 */
	
	private String gonggaotupian;
		
	/**
	 * 公告内容
	 */
	
	private String gonggaoneirong;
		
	/**
	 * 公告时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gonggaoshijian;
		
	/**
	 * 发布人员
	 */
	
	private String faburenyuan;
				
	
	/**
	 * 设置：公告标题
	 */
	 
	public void setGonggaobiaoti(String gonggaobiaoti) {
		this.gonggaobiaoti = gonggaobiaoti;
	}
	
	/**
	 * 获取：公告标题
	 */
	public String getGonggaobiaoti() {
		return gonggaobiaoti;
	}
				
	
	/**
	 * 设置：公告图片
	 */
	 
	public void setGonggaotupian(String gonggaotupian) {
		this.gonggaotupian = gonggaotupian;
	}
	
	/**
	 * 获取：公告图片
	 */
	public String getGonggaotupian() {
		return gonggaotupian;
	}
				
	
	/**
	 * 设置：公告内容
	 */
	 
	public void setGonggaoneirong(String gonggaoneirong) {
		this.gonggaoneirong = gonggaoneirong;
	}
	
	/**
	 * 获取：公告内容
	 */
	public String getGonggaoneirong() {
		return gonggaoneirong;
	}
				
	
	/**
	 * 设置：公告时间
	 */
	 
	public void setGonggaoshijian(Date gonggaoshijian) {
		this.gonggaoshijian = gonggaoshijian;
	}
	
	/**
	 * 获取：公告时间
	 */
	public Date getGonggaoshijian() {
		return gonggaoshijian;
	}
				
	
	/**
	 * 设置：发布人员
	 */
	 
	public void setFaburenyuan(String faburenyuan) {
		this.faburenyuan = faburenyuan;
	}
	
	/**
	 * 获取：发布人员
	 */
	public String getFaburenyuan() {
		return faburenyuan;
	}
			
}
