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
@TableName("tb_persistence_declare")
public class PersistenceDeclareEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 持久声明对象id
	 */
	@TableId
	private String persistenceDeclareId;
	/**
	 * 对应领域关系[0-直接映射,1-字段映射]
	 */
	private Integer relevance;
	/**
	 * 领域对象声明id
	 */
	private String domainDeclareId;

}
