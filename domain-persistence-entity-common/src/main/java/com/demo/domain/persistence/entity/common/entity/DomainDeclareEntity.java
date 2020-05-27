package com.demo.domain.persistence.entity.common.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * 
 * @author 苏敏
 * @email 
 * @date 2020-05-20 11:20:58
 */
@Data
@TableName("tb_domain_declare")
public class DomainDeclareEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 领域对象声明id
	 */
	@TableId
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
