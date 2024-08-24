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
 * 公告信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-25 22:52:23
 */
@TableName("gonggaoxinxi")
public class GonggaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GonggaoxinxiEntity() {
		
	}
	
	public GonggaoxinxiEntity(T t) {
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
	 * 公告编号
	 */
					
	private String gonggaobianhao;
	
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
	 * 设置：公告编号
	 */
	public void setGonggaobianhao(String gonggaobianhao) {
		this.gonggaobianhao = gonggaobianhao;
	}
	/**
	 * 获取：公告编号
	 */
	public String getGonggaobianhao() {
		return gonggaobianhao;
	}
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
