package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 出库登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
@TableName("chukudengji")
public class ChukudengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChukudengjiEntity() {
		
	}
	
	public ChukudengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 用品编号
	 */
					
	private String yongpinbianhao;
	
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
	 * 出库数量
	 */
					
	private Integer yongpinshuliang;
	
	/**
	 * 供应商
	 */
					
	private String gongyingshang;
	
	/**
	 * 出库备注
	 */
					
	private String chukubeizhu;
	
	/**
	 * 出库时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chukushijian;
	
	/**
	 * 出库人员
	 */
					
	private String chukurenyuan;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：用品编号
	 */
	public void setYongpinbianhao(String yongpinbianhao) {
		this.yongpinbianhao = yongpinbianhao;
	}
	/**
	 * 获取：用品编号
	 */
	public String getYongpinbianhao() {
		return yongpinbianhao;
	}
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
	 * 设置：出库数量
	 */
	public void setYongpinshuliang(Integer yongpinshuliang) {
		this.yongpinshuliang = yongpinshuliang;
	}
	/**
	 * 获取：出库数量
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
	 * 设置：出库备注
	 */
	public void setChukubeizhu(String chukubeizhu) {
		this.chukubeizhu = chukubeizhu;
	}
	/**
	 * 获取：出库备注
	 */
	public String getChukubeizhu() {
		return chukubeizhu;
	}
	/**
	 * 设置：出库时间
	 */
	public void setChukushijian(Date chukushijian) {
		this.chukushijian = chukushijian;
	}
	/**
	 * 获取：出库时间
	 */
	public Date getChukushijian() {
		return chukushijian;
	}
	/**
	 * 设置：出库人员
	 */
	public void setChukurenyuan(String chukurenyuan) {
		this.chukurenyuan = chukurenyuan;
	}
	/**
	 * 获取：出库人员
	 */
	public String getChukurenyuan() {
		return chukurenyuan;
	}

}
