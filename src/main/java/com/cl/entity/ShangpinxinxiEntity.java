package com.cl.entity;

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
 * 商品信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-17 15:56:14
 */
@TableName("shangpinxinxi")
public class ShangpinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangpinxinxiEntity() {
		
	}
	
	public ShangpinxinxiEntity(T t) {
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
	 * 商品标题
	 */
					
	private String shangpinbiaoti;
	
	/**
	 * 商品分类
	 */
					
	private String shangpinfenlei;
	
	/**
	 * 品牌
	 */
					
	private String pinpai;
	
	/**
	 * 服务
	 */
					
	private String fuwu;
	
	/**
	 * 商品性详情
	 */
					
	private String shangpinxingxiangqing;
	
	/**
	 * 商品视频
	 */
					
	private String shangpinshipin;
	
	/**
	 * 商品图片
	 */
					
	private String shangpintupian;
	
	/**
	 * 单限
	 */
					
	private Integer onelimittimes;
	
	/**
	 * 库存
	 */
					
	private Integer alllimittimes;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 积分
	 */
					
	private Integer jf;
	
	/**
	 * 价格
	 */
					
	private Double price;
	
	/**
	 * 会员价
	 */
					
	private Double vipprice;
	
	
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
	 * 设置：商品标题
	 */
	public void setShangpinbiaoti(String shangpinbiaoti) {
		this.shangpinbiaoti = shangpinbiaoti;
	}
	/**
	 * 获取：商品标题
	 */
	public String getShangpinbiaoti() {
		return shangpinbiaoti;
	}
	/**
	 * 设置：商品分类
	 */
	public void setShangpinfenlei(String shangpinfenlei) {
		this.shangpinfenlei = shangpinfenlei;
	}
	/**
	 * 获取：商品分类
	 */
	public String getShangpinfenlei() {
		return shangpinfenlei;
	}
	/**
	 * 设置：品牌
	 */
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
	/**
	 * 设置：服务
	 */
	public void setFuwu(String fuwu) {
		this.fuwu = fuwu;
	}
	/**
	 * 获取：服务
	 */
	public String getFuwu() {
		return fuwu;
	}
	/**
	 * 设置：商品性详情
	 */
	public void setShangpinxingxiangqing(String shangpinxingxiangqing) {
		this.shangpinxingxiangqing = shangpinxingxiangqing;
	}
	/**
	 * 获取：商品性详情
	 */
	public String getShangpinxingxiangqing() {
		return shangpinxingxiangqing;
	}
	/**
	 * 设置：商品视频
	 */
	public void setShangpinshipin(String shangpinshipin) {
		this.shangpinshipin = shangpinshipin;
	}
	/**
	 * 获取：商品视频
	 */
	public String getShangpinshipin() {
		return shangpinshipin;
	}
	/**
	 * 设置：商品图片
	 */
	public void setShangpintupian(String shangpintupian) {
		this.shangpintupian = shangpintupian;
	}
	/**
	 * 获取：商品图片
	 */
	public String getShangpintupian() {
		return shangpintupian;
	}
	/**
	 * 设置：单限
	 */
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
	/**
	 * 设置：库存
	 */
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：积分
	 */
	public void setJf(Integer jf) {
		this.jf = jf;
	}
	/**
	 * 获取：积分
	 */
	public Integer getJf() {
		return jf;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * 设置：会员价
	 */
	public void setVipprice(Double vipprice) {
		this.vipprice = vipprice;
	}
	/**
	 * 获取：会员价
	 */
	public Double getVipprice() {
		return vipprice;
	}

}
