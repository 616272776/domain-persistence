package com.demo.domain.persistence.template.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * 
 * @author 
 * @email 
 * @date 2020-05-14 09:23:35
 */
@Data
@TableName("tb_form_item")
public class FormItemEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 表单id
	 */
	@TableId
	private Long formItemId;
	/**
	 * 表单id
	 */
	private Long formId;
	/**
	 * 字段名称
	 */
	private String fieldName;
	/**
	 * 字段值
	 */
	private String fieldValue;
	/**
	 * 字段类型[0-String,1-Integer,2-Date]
	 */
	private Integer fieldType;


}
