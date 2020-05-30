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
@TableName("tb_persistence")
public class PersistenceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 持久对象id
	 */
	@TableId
	private String persistenceId;
	/**
	 * 持久声明对象id
	 */
	private String persistenceDeclareId;
	/**
	 * 持久对象类型名
	 */
	private String persistenceClassName;
	/**
	 * 对应领域关系[0-直接映射,1-字段映射]
	 */
	private Integer relevance;
	/**
	 * 持久对象名
	 */
	private String persistenceName;
	/**
	 * 持久对象描述
	 */
	private String persistenceDescribe;
	/**
	 * 数据提取方式
	 */
	private String extractWay;
	/**
	 * 数据存储位置
	 */
	private String location;

}
