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
 * 物资出库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-16 23:57:34
 */
@TableName("wuzichuku")
public class WuzichukuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WuzichukuEntity() {
		
	}
	
	public WuzichukuEntity(T t) {
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
	@TableId
	private Long id;
	/**
	 * 出库单号
	 */
					
	private String chukudanhao;
	
	/**
	 * 物资名称
	 */
					
	private String wuzimingcheng;
	
	/**
	 * 物资分类
	 */
					
	private String wuzifenlei;
	
	/**
	 * 数量
	 */
					
	private String shuliang;
	
	/**
	 * 出库日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chukuriqi;
	
	
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
	 * 设置：出库单号
	 */
	public void setChukudanhao(String chukudanhao) {
		this.chukudanhao = chukudanhao;
	}
	/**
	 * 获取：出库单号
	 */
	public String getChukudanhao() {
		return chukudanhao;
	}
	/**
	 * 设置：物资名称
	 */
	public void setWuzimingcheng(String wuzimingcheng) {
		this.wuzimingcheng = wuzimingcheng;
	}
	/**
	 * 获取：物资名称
	 */
	public String getWuzimingcheng() {
		return wuzimingcheng;
	}
	/**
	 * 设置：物资分类
	 */
	public void setWuzifenlei(String wuzifenlei) {
		this.wuzifenlei = wuzifenlei;
	}
	/**
	 * 获取：物资分类
	 */
	public String getWuzifenlei() {
		return wuzifenlei;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：出库日期
	 */
	public void setChukuriqi(Date chukuriqi) {
		this.chukuriqi = chukuriqi;
	}
	/**
	 * 获取：出库日期
	 */
	public Date getChukuriqi() {
		return chukuriqi;
	}

}
