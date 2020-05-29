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
@TableName("tb_domain")
public class DomainEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 领域id
	 */
	@TableId
	private Long domainId;
	/**
	 * 领域名称
	 */
	private String domainName;
	/**
	 * 创建日期
	 */
	private Date createTime;
	/**
	 * 更新日期
	 */
	private Date updateTime;

}
