package com.entity.vo;

import com.entity.ShenlingyongpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 申领用品
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
public class ShenlingyongpinVO  implements Serializable {
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
	 * 申领数量
	 */
	
	private Integer shenlingshuliang;
		
	/**
	 * 申领原因
	 */
	
	private String shenlingyuanyin;
		
	/**
	 * 申领时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenlingshijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：申领数量
	 */
	 
	public void setShenlingshuliang(Integer shenlingshuliang) {
		this.shenlingshuliang = shenlingshuliang;
	}
	
	/**
	 * 获取：申领数量
	 */
	public Integer getShenlingshuliang() {
		return shenlingshuliang;
	}
				
	
	/**
	 * 设置：申领原因
	 */
	 
	public void setShenlingyuanyin(String shenlingyuanyin) {
		this.shenlingyuanyin = shenlingyuanyin;
	}
	
	/**
	 * 获取：申领原因
	 */
	public String getShenlingyuanyin() {
		return shenlingyuanyin;
	}
				
	
	/**
	 * 设置：申领时间
	 */
	 
	public void setShenlingshijian(Date shenlingshijian) {
		this.shenlingshijian = shenlingshijian;
	}
	
	/**
	 * 获取：申领时间
	 */
	public Date getShenlingshijian() {
		return shenlingshijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
