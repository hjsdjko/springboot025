package com.entity.vo;

import com.entity.RukudengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 入库登记
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public class RukudengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用品名称
	 */
	
	private String yongpinmingcheng;
		
	/**
	 * 用品分类
	 */
	
	private String yongpinfenlei;
		
	/**
	 * 用品图片
	 */
	
	private String yongpintupian;
		
	/**
	 * 入库数量
	 */
	
	private Integer yongpinshuliang;
		
	/**
	 * 供应商
	 */
	
	private String gongyingshang;
		
	/**
	 * 入库备注
	 */
	
	private String rukubeizhu;
		
	/**
	 * 入库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rukushijian;
		
	/**
	 * 入库人员
	 */
	
	private String rukurenyuan;
				
	
	/**
	 * 设置：用品名称
	 */
	 
	public void setYongpinmingcheng(String yongpinmingcheng) {
		this.yongpinmingcheng = yongpinmingcheng;
	}
	
	/**
	 * 获取：用品名称
	 */
	public String getYongpinmingcheng() {
		return yongpinmingcheng;
	}
				
	
	/**
	 * 设置：用品分类
	 */
	 
	public void setYongpinfenlei(String yongpinfenlei) {
		this.yongpinfenlei = yongpinfenlei;
	}
	
	/**
	 * 获取：用品分类
	 */
	public String getYongpinfenlei() {
		return yongpinfenlei;
	}
				
	
	/**
	 * 设置：用品图片
	 */
	 
	public void setYongpintupian(String yongpintupian) {
		this.yongpintupian = yongpintupian;
	}
	
	/**
	 * 获取：用品图片
	 */
	public String getYongpintupian() {
		return yongpintupian;
	}
				
	
	/**
	 * 设置：入库数量
	 */
	 
	public void setYongpinshuliang(Integer yongpinshuliang) {
		this.yongpinshuliang = yongpinshuliang;
	}
	
	/**
	 * 获取：入库数量
	 */
	public Integer getYongpinshuliang() {
		return yongpinshuliang;
	}
				
	
	/**
	 * 设置：供应商
	 */
	 
	public void setGongyingshang(String gongyingshang) {
		this.gongyingshang = gongyingshang;
	}
	
	/**
	 * 获取：供应商
	 */
	public String getGongyingshang() {
		return gongyingshang;
	}
				
	
	/**
	 * 设置：入库备注
	 */
	 
	public void setRukubeizhu(String rukubeizhu) {
		this.rukubeizhu = rukubeizhu;
	}
	
	/**
	 * 获取：入库备注
	 */
	public String getRukubeizhu() {
		return rukubeizhu;
	}
				
	
	/**
	 * 设置：入库时间
	 */
	 
	public void setRukushijian(Date rukushijian) {
		this.rukushijian = rukushijian;
	}
	
	/**
	 * 获取：入库时间
	 */
	public Date getRukushijian() {
		return rukushijian;
	}
				
	
	/**
	 * 设置：入库人员
	 */
	 
	public void setRukurenyuan(String rukurenyuan) {
		this.rukurenyuan = rukurenyuan;
	}
	
	/**
	 * 获取：入库人员
	 */
	public String getRukurenyuan() {
		return rukurenyuan;
	}
			
}
