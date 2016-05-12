//====================================================================
// 
// Project Name：信牛科技最新Mybatis 架构版本    @author Royal
// Create Time：2016-05-06 15:54:14
// ===================================================================
package com.xinniuBBS.bbs.entity;

import com.ecommerce.core.PagerModel;

import java.io.Serializable;

/**
 * java bean实体类
 * 
 * @author Royal
 * 
 */
public class BbsWendaType extends Entity {
	private static final long serialVersionUID = -7718972800788865367L;
	/**
	 * 基础设置
	 */
    
     private Long bbs_type_id; //
     private String bbs_type_name; //
     private Long bbs_type_fathertypeid; //

	public Long getBbs_type_id() {
		return bbs_type_id;
	}

	public void setBbs_type_id(Long bbs_type_id) {
		this.bbs_type_id = bbs_type_id;
	}

	public String getBbs_type_name() {
		return bbs_type_name;
	}

	public void setBbs_type_name(String bbs_type_name) {
		this.bbs_type_name = bbs_type_name;
	}

	public Long getBbs_type_fathertypeid() {
		return bbs_type_fathertypeid;
	}

	public void setBbs_type_fathertypeid(Long bbs_type_fathertypeid) {
		this.bbs_type_fathertypeid = bbs_type_fathertypeid;
	}
}

