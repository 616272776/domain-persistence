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
@TableName("tb_template_detail")
public class TemplateDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 模板细节id
	 */
	@TableId
	private Long templateDetailId;
	/**
	 * 模板id
	 */
	private Long templateId;
	/**
	 * 字段参考值，列如：[xxx,xxx]
	 */
	private String fieldReference;
	/**
	 * 字段名称
	 */
	private String fieldName;
	/**
	 * 字段渲染[0-文本,1-密码,2-邮箱,3-单选,4-多选,5-图片,6-文件,7-日期]
	 */
	private Integer fieldRenderer;
	/**
	 * 字段类型[0-String,1-Integer,2-Date]
	 */
	private Integer fieldType;
	/**
	 * 是否需要检索[0-不需要，1-需要]
	 */
	private Integer searchType;

}
