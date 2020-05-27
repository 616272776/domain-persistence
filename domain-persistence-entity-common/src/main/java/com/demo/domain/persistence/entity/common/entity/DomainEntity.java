package com.demo.domain.persistence.entity.common.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * 
 * @author 
 * @email 
 * @date 2020-05-21 10:57:22
 */
@Data
@TableName("tb_domain")
public class DomainEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 领域对象id
	 */
	@TableId
	private String domainId;
	/**
	 * 领域声明对象id
	 */
	private String domainDeclareId;
	/**
	 * 领域对象类型名
	 */
	private String domainClassName;
	/**
	 * 领域对象名
	 */
	private String domainName;
	/**
	 * 领域对象描述
	 */
	private String domainDescribe;

}
