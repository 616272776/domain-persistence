package com.demo.domain.persistence.template.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 
 * @email 
 * @date 2020-05-14 09:23:35
 */
@Data
@TableName("tb_template")
public class TemplateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 模板id
	 */
	@TableId
	private Long templateId;
	/**
	 * 模板名称
	 */
	private String templateName;
	/**
	 * 领域id
	 */
	private String domainId;
	/**
	 * 创建日期
	 */
	private Date createTime;
	/**
	 * 更新日期
	 */
	private Date updateTime;

}
