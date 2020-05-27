/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.20 : Database - domaintransfer
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`domaintransfer` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `domaintransfer`;

/*Table structure for table `tb_domain` */

DROP TABLE IF EXISTS `tb_domain`;

CREATE TABLE `tb_domain` (
  `domain_id` varchar(32) COLLATE utf8mb4_bin NOT NULL COMMENT '领域对象id',
  `domain_declare_id` varchar(32) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '领域声明对象id',
  `domain_class_name` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '领域对象类型名',
  `domain_name` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '领域对象名',
  `domain_describe` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '领域对象描述',
  PRIMARY KEY (`domain_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `tb_domain` */

insert  into `tb_domain`(`domain_id`,`domain_declare_id`,`domain_class_name`,`domain_name`,`domain_describe`) values 
('1','1','form','表单','村民填写的表单信息');

/*Table structure for table `tb_domain_declare` */

DROP TABLE IF EXISTS `tb_domain_declare`;

CREATE TABLE `tb_domain_declare` (
  `domain_declare_id` varchar(32) COLLATE utf8mb4_bin NOT NULL COMMENT '领域对象声明id',
  `domain_class_name` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '领域对象类型名',
  `domain_name` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '领域对象名',
  `domain_describe` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '领域对象描述',
  PRIMARY KEY (`domain_declare_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `tb_domain_declare` */

insert  into `tb_domain_declare`(`domain_declare_id`,`domain_class_name`,`domain_name`,`domain_describe`) values 
('1','form','表单','村民填写的表单信息');

/*Table structure for table `tb_persistence` */

DROP TABLE IF EXISTS `tb_persistence`;

CREATE TABLE `tb_persistence` (
  `persistence_id` varchar(32) COLLATE utf8mb4_bin NOT NULL COMMENT '持久对象id',
  `persistence_declare_id` varchar(32) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '持久声明对象id',
  `persistence_class_name` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '持久对象类型名',
  `persistence_name` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '持久对象名',
  `domain_describe` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '持久对象描述',
  `extractWay` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '数据提取方式',
  `location` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '数据存储位置',
  `relevance` tinyint DEFAULT NULL COMMENT '对应领域关系[0-直接映射,1-字段映射]',
  PRIMARY KEY (`persistence_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `tb_persistence` */

insert  into `tb_persistence`(`persistence_id`,`persistence_declare_id`,`persistence_class_name`,`persistence_name`,`domain_describe`,`extractWay`,`location`,`relevance`) values 
('1','1','form','表单基本信息','表单基本信息','1','mysql',0),
('2','2','formItem','表单基本项','表单的每一个基本项','1','mysql',1);

/*Table structure for table `tb_persistence_declare` */

DROP TABLE IF EXISTS `tb_persistence_declare`;

CREATE TABLE `tb_persistence_declare` (
  `persistence_declare_id` varchar(32) COLLATE utf8mb4_bin NOT NULL COMMENT '持久声明对象id',
  `relevance` tinyint DEFAULT NULL COMMENT '对应领域关系[0-直接映射,1-字段映射]',
  `domain_declare_id` varchar(32) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '领域对象声明id',
  PRIMARY KEY (`persistence_declare_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `tb_persistence_declare` */

insert  into `tb_persistence_declare`(`persistence_declare_id`,`relevance`,`domain_declare_id`) values 
('1',0,'1'),
('2',1,'1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
