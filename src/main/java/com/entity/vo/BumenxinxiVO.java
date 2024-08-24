package com.entity.vo;

import com.entity.BumenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 部门信息
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public class BumenxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 部门图片
	 */
	
	private String bumentupian;
		
	/**
	 * 成立日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chengliriqi;
		
	/**
	 * 部门人数
	 */
	
	private Integer bumenrenshu;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 部门详情
	 */
	
	private String bumenxiangqing;
				
	
	/**
	 * 设置：部门图片
	 */
	 
	public void setBumentupian(String bumentupian) {
		this.bumentupian = bumentupian;
	}
	
	/**
	 * 获取：部门图片
	 */
	public String getBumentupian() {
		return bumentupian;
	}
				
	
	/**
	 * 设置：成立日期
	 */
	 
	public void setChengliriqi(Date chengliriqi) {
		this.chengliriqi = chengliriqi;
	}
	
	/**
	 * 获取：成立日期
	 */
	public Date getChengliriqi() {
		return chengliriqi;
	}
				
	
	/**
	 * 设置：部门人数
	 */
	 
	public void setBumenrenshu(Integer bumenrenshu) {
		this.bumenrenshu = bumenrenshu;
	}
	
	/**
	 * 获取：部门人数
	 */
	public Integer getBumenrenshu() {
		return bumenrenshu;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：部门详情
	 */
	 
	public void setBumenxiangqing(String bumenxiangqing) {
		this.bumenxiangqing = bumenxiangqing;
	}
	
	/**
	 * 获取：部门详情
	 */
	public String getBumenxiangqing() {
		return bumenxiangqing;
	}
			
}
