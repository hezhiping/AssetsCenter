/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.5.27 : Database - asset
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`asset` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `asset`;

/*Table structure for table `asset_incom` */

DROP TABLE IF EXISTS `asset_incom`;

CREATE TABLE `asset_incom` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `psn_code` int(11) DEFAULT NULL,
  `current_month` varchar(10) DEFAULT NULL,
  `json_data` text,
  `daily_incom` decimal(18,2) DEFAULT NULL,
  `daily_pay` decimal(18,2) DEFAULT NULL,
  `non_daily_incom` decimal(18,2) DEFAULT NULL,
  `non_daily_pay` decimal(18,2) DEFAULT NULL,
  `add_profit` decimal(18,2) DEFAULT NULL,
  `tag_status` varchar(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `current_year` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_11` (`psn_code`),
  CONSTRAINT `FK_Reference_11` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `asset_incom` */

/*Table structure for table `asset_out` */

DROP TABLE IF EXISTS `asset_out`;

CREATE TABLE `asset_out` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `psn_code` int(11) DEFAULT NULL,
  `current_month` varchar(10) DEFAULT NULL,
  `json_data` text,
  `original_capital` decimal(18,2) DEFAULT NULL,
  `income_surplus` decimal(18,2) DEFAULT NULL,
  `ratained_profit` decimal(18,2) DEFAULT NULL,
  `tag_status` char(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `current_year` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_12` (`psn_code`),
  CONSTRAINT `FK_Reference_12` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `asset_out` */

/*Table structure for table `const_category` */

DROP TABLE IF EXISTS `const_category`;

CREATE TABLE `const_category` (
  `category` varchar(10) NOT NULL COMMENT '类型编码',
  `cdescription` varchar(50) NOT NULL COMMENT '中文名称',
  `edescription` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `query_sql` varchar(2000) DEFAULT NULL COMMENT '特殊情况下数据来源于动态的sql语句，则在此编写数据来源规则',
  `remark` varchar(2000) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`category`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `const_category` */

insert  into `const_category`(`category`,`cdescription`,`edescription`,`query_sql`,`remark`) values ('1_CDLB','数据字典菜单类别','menu type',NULL,'菜单管理中选择类别的基础数据'),('2_ZCX','支出项','pay item',NULL,'包含支出的类别'),('3_SRX','收入项','income item',NULL,'收入类别的总称'),('4_BJSY','不计损益','no loss',NULL,'不计损益'),('5_YHKZL','银行卡种类','BankCardType',NULL,'银行卡种类'),('6_XSYH','线上银行','online bank',NULL,'线上银行'),('7_XYJK','信用借款','credit loan',NULL,'信用借款');

/*Table structure for table `const_dictionary` */

DROP TABLE IF EXISTS `const_dictionary`;

CREATE TABLE `const_dictionary` (
  `category` varchar(30) NOT NULL COMMENT '代码种类',
  `cost_code` int(30) NOT NULL AUTO_INCREMENT COMMENT '代码值',
  `en_us_caption` varchar(200) DEFAULT NULL COMMENT '英文描述',
  `zh_tw_caption` varchar(200) DEFAULT NULL COMMENT '繁体中文描述',
  `zh_cn_caption` varchar(200) DEFAULT NULL COMMENT '简体中文描述',
  `seq_no` decimal(38,0) DEFAULT NULL COMMENT '排序使用，优先级为本字段，其次为code字段',
  `level_no` varchar(10) DEFAULT NULL COMMENT '等级，职称需用',
  `const_type` varchar(6) DEFAULT NULL COMMENT '判断属性类型',
  `remark` varchar(2000) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`cost_code`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

/*Data for the table `const_dictionary` */

insert  into `const_dictionary`(`category`,`cost_code`,`en_us_caption`,`zh_tw_caption`,`zh_cn_caption`,`seq_no`,`level_no`,`const_type`,`remark`) values ('1_CDLB',1,'sysmenu','系统管理','系统管理',NULL,'','','系统管理下的子菜单，当为这个类型时，添加的菜单会到该目录下'),('1_CDLB',2,'basemenu','基本功能','基本功能',NULL,'','','基本功能下的子菜单，当为这个类型时，添加的菜单会到该目录下'),('1_CDLB',3,'assetsmenu','资产管理','资产管理',NULL,'','','资产管理功能下的子菜单，选择这个类型，添加的菜单会到该目录下'),('2_ZCX',4,'food','餐饮','餐饮','1','','','生活中吃饭项'),('2_ZCX',5,'traffic','交通','交通','2','','','生活中交通项'),('2_ZCX',6,'amusement','娱乐','娱乐','3','','','生活中娱乐项目'),('2_ZCX',7,'Social','社交','社交','4','','','生活中人际交往费用'),('2_ZCX',8,'room','住宿','住宿','5','','','生活中住宿花费项'),('2_ZCX',9,'shopping','购物','购物','6','','','生活购买东西'),('3_SRX',10,'wage','税后基本工资','税后基本工资',NULL,'','','税后基本工资'),('3_SRX',11,'','差旅补助','差旅补助',NULL,'','','差旅补助'),('3_SRX',12,'','过节费','过节费',NULL,'','','过节费'),('3_SRX',13,'','部门基金','部门基金',NULL,'','','部门基金'),('3_SRX',14,'','投资收益','投资收益',NULL,'','','投资收益'),('2_ZCX',15,'','投资损失','投资损失','7','','','投资损失'),('4_BJSY',16,'','不计损益','不计损益',NULL,'','','不计损益'),('5_YHKZL',17,'ICBC','工商银行储蓄卡','工商银行储蓄卡','1','','','工商银行储蓄卡'),('5_YHKZL',18,'','招商银行储蓄卡','招商银行储蓄卡','2','','','招商银行储蓄卡'),('5_YHKZL',19,'','建设银行储蓄卡','建设银行储蓄卡','3','','','建设银行储蓄卡'),('5_YHKZL',20,'','农业银行储蓄卡','农业银行储蓄卡','4','','','农业银行储蓄卡'),('5_YHKZL',21,'','农商银行储蓄卡','农商银行储蓄卡','5','','','农商银行储蓄卡'),('6_XSYH',22,'','支付宝','支付宝','1','','','支付宝'),('6_XSYH',23,'','微信','微信','2','','','微信'),('6_XSYH',24,'','余额宝','余额宝','3','','','余额宝'),('6_XSYH',25,'','投资理财','投资理财','4','','','投资理财'),('5_YHKZL',26,'','现金','现金','6','','','现金'),('7_XYJK',27,'','招行信用卡','招行信用卡','1','','','招行信用卡'),('7_XYJK',28,'','蚂蚁花呗','蚂蚁花呗','2','','','蚂蚁花呗'),('7_XYJK',29,'','京东白条','京东白条','3','','','京东白条');

/*Table structure for table `credit_loan` */

DROP TABLE IF EXISTS `credit_loan`;

CREATE TABLE `credit_loan` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `psn_code` int(11) DEFAULT NULL COMMENT '用户编号',
  `current_year` varchar(10) DEFAULT NULL COMMENT '当前年',
  `current_month` varchar(10) DEFAULT NULL COMMENT '当前月',
  `credit_exposure` decimal(18,2) DEFAULT NULL COMMENT '信用敞口',
  `credit_amount` decimal(18,2) DEFAULT NULL COMMENT '信用额度',
  `opening_balance` decimal(18,2) DEFAULT NULL COMMENT '期初余额',
  `current_use` decimal(18,2) DEFAULT NULL COMMENT '本期使用',
  `current_repay` decimal(18,2) DEFAULT NULL COMMENT '本期偿还',
  `ending_balance` decimal(18,2) DEFAULT NULL COMMENT '期末余额',
  `tag_status` char(1) DEFAULT NULL COMMENT '状态',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `FK_Reference_13` (`psn_code`),
  CONSTRAINT `FK_Reference_13` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `credit_loan` */

/*Table structure for table `currency_fund` */

DROP TABLE IF EXISTS `currency_fund`;

CREATE TABLE `currency_fund` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `psn_code` int(11) DEFAULT NULL,
  `current_month` varchar(10) DEFAULT NULL,
  `opening_balance` decimal(18,2) DEFAULT NULL,
  `period_incom` decimal(18,2) DEFAULT NULL,
  `period_pay` decimal(18,2) DEFAULT NULL,
  `ending_balance` decimal(18,2) DEFAULT NULL,
  `tag_status` char(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `current_year` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_9` (`psn_code`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `currency_fund` */

/*Table structure for table `fixed_asset` */

DROP TABLE IF EXISTS `fixed_asset`;

CREATE TABLE `fixed_asset` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `current_month` varchar(10) NOT NULL COMMENT '当前月',
  `asset_name` varchar(200) NOT NULL COMMENT '资产名称',
  `psn_code` int(11) NOT NULL COMMENT '用户编号',
  `asset_money` decimal(18,2) NOT NULL COMMENT '资产金额',
  `asset_remark` text COMMENT '资产备注',
  `tag_status` char(1) DEFAULT NULL COMMENT '资产状态标识',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `current_year` varchar(10) NOT NULL COMMENT '当前年',
  PRIMARY KEY (`id`,`asset_name`),
  KEY `FK_Reference_5` (`psn_code`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `fixed_asset` */

insert  into `fixed_asset`(`id`,`current_month`,`asset_name`,`psn_code`,`asset_money`,`asset_remark`,`tag_status`,`create_date`,`current_year`) values (1,'08','测试',1,'100.00','12312313','0','2018-08-02 16:24:04','2018'),(2,'08','测试2',1,'100.00','1231','0','2018-08-02 16:32:43','2018');

/*Table structure for table `fund_change` */

DROP TABLE IF EXISTS `fund_change`;

CREATE TABLE `fund_change` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `psn_code` int(11) DEFAULT NULL,
  `current_month` varchar(10) DEFAULT NULL,
  `consume_date` date DEFAULT NULL,
  `item` varchar(500) DEFAULT NULL,
  `money` decimal(18,2) DEFAULT NULL,
  `profit_loss_sort` varchar(100) DEFAULT NULL,
  `pay_mode` varchar(100) DEFAULT NULL,
  `pay_money` decimal(18,2) DEFAULT NULL,
  `incom_mode` varchar(100) DEFAULT NULL,
  `incom_money` decimal(18,2) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `tag_status` char(1) DEFAULT NULL,
  `current_year` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_10` (`psn_code`),
  CONSTRAINT `FK_Reference_10` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `fund_change` */

insert  into `fund_change`(`id`,`psn_code`,`current_month`,`consume_date`,`item`,`money`,`profit_loss_sort`,`pay_mode`,`pay_money`,`incom_mode`,`incom_money`,`create_date`,`tag_status`,`current_year`) values (1,1,'08',NULL,'12',NULL,'6',NULL,NULL,NULL,NULL,NULL,NULL,'2018'),(2,1,'09',NULL,'12',NULL,'7',NULL,NULL,NULL,NULL,NULL,NULL,'2018');

/*Table structure for table `invest_bank` */

DROP TABLE IF EXISTS `invest_bank`;

CREATE TABLE `invest_bank` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `psn_code` int(11) DEFAULT NULL,
  `invest_code` int(11) DEFAULT NULL,
  `current_month` varchar(10) DEFAULT NULL,
  `invest_name` varchar(200) DEFAULT NULL,
  `invest_date` date DEFAULT NULL,
  `invest_type` varchar(20) DEFAULT NULL,
  `invest_money` decimal(18,2) DEFAULT NULL,
  `invest_profit` decimal(18,2) DEFAULT NULL,
  `invest_profit_date` date DEFAULT NULL,
  `annualized_rate_return` varchar(50) DEFAULT NULL,
  `tag_status` char(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `current_year` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_4` (`psn_code`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `invest_bank` */

/*Table structure for table `pay_collection` */

DROP TABLE IF EXISTS `pay_collection`;

CREATE TABLE `pay_collection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `psn_code` int(11) DEFAULT NULL,
  `current_month` varchar(10) DEFAULT NULL,
  `receipt_item` varchar(500) DEFAULT NULL,
  `receipt_date` date DEFAULT NULL,
  `person` varchar(200) DEFAULT NULL,
  `receipt_pay` decimal(18,2) DEFAULT NULL,
  `tag_status` char(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `current_year` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_6` (`psn_code`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pay_collection` */

/*Table structure for table `person` */

DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
  `psn_code` int(11) NOT NULL,
  `cname` varchar(100) DEFAULT NULL,
  `fname` varchar(100) DEFAULT NULL,
  `lname` varchar(100) DEFAULT NULL,
  `gender` varchar(1) DEFAULT NULL,
  `title_no` varchar(100) DEFAULT NULL,
  `org_code` decimal(18,0) DEFAULT NULL,
  `org_ename` varchar(300) DEFAULT NULL,
  `org_cname` varchar(600) DEFAULT NULL,
  `pos_in_org` varchar(2000) DEFAULT NULL,
  `dept` varchar(200) DEFAULT NULL,
  `eaddress` varchar(1000) DEFAULT NULL,
  `caddress` varchar(1000) DEFAULT NULL,
  `tel` varchar(100) DEFAULT NULL,
  `fax` varchar(100) DEFAULT NULL,
  `email` varchar(300) DEFAULT NULL,
  `http` varchar(400) DEFAULT NULL,
  `highest_degree` varchar(400) DEFAULT NULL,
  `tag_status` char(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `remark` text,
  PRIMARY KEY (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `person` */

insert  into `person`(`psn_code`,`cname`,`fname`,`lname`,`gender`,`title_no`,`org_code`,`org_ename`,`org_cname`,`pos_in_org`,`dept`,`eaddress`,`caddress`,`tel`,`fax`,`email`,`http`,`highest_degree`,`tag_status`,`create_date`,`update_time`,`remark`) values (1,'何志平','he','zhiping','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `personal_loan` */

DROP TABLE IF EXISTS `personal_loan`;

CREATE TABLE `personal_loan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `psn_code` int(11) DEFAULT NULL,
  `current_month` varchar(10) DEFAULT NULL,
  `lend_person` varchar(100) DEFAULT NULL,
  `lend_date` date DEFAULT NULL,
  `lend_money` decimal(18,2) DEFAULT NULL,
  `accumulate_profit` decimal(18,2) DEFAULT NULL,
  `going` varchar(500) DEFAULT NULL,
  `remark` text,
  `create_date` datetime DEFAULT NULL,
  `tag_status` char(1) DEFAULT NULL,
  `current_year` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_7` (`psn_code`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `personal_loan` */

/*Table structure for table `sys_authoritie` */

DROP TABLE IF EXISTS `sys_authoritie`;

CREATE TABLE `sys_authoritie` (
  `AUTHORITY_ID` decimal(8,0) NOT NULL COMMENT '自动序列',
  `NAME` varchar(400) DEFAULT NULL COMMENT '权限代码名',
  `DISPLAY_NAME` varchar(400) DEFAULT NULL COMMENT '权限描述',
  `PARENT_ID` decimal(8,0) DEFAULT NULL COMMENT ' 上级id',
  PRIMARY KEY (`AUTHORITY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

/*Data for the table `sys_authoritie` */

/*Table structure for table `sys_log` */

DROP TABLE IF EXISTS `sys_log`;

CREATE TABLE `sys_log` (
  `log_code` decimal(18,0) NOT NULL,
  `psn_code` decimal(18,0) DEFAULT NULL,
  `log_type` varchar(40) DEFAULT NULL,
  `key_code` varchar(200) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `log_action` varchar(2000) DEFAULT NULL,
  `log_detail` text,
  `client_ip` varchar(30) DEFAULT NULL,
  `server_ip` varchar(300) DEFAULT NULL,
  `exception` text,
  `user_agent` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`log_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_log` */

/*Table structure for table `sys_resource` */

DROP TABLE IF EXISTS `sys_resource`;

CREATE TABLE `sys_resource` (
  `RESOURCE_ID` decimal(18,0) NOT NULL COMMENT '主键',
  `RESOURCE_TYPE` varchar(20) NOT NULL COMMENT '菜单、还是页面menu、url',
  `VALUE` varchar(255) DEFAULT NULL COMMENT 'URL',
  `ORDER_NUM` decimal(4,0) DEFAULT NULL COMMENT '顺序(权限控制按顺序匹配URL)',
  `PARENT_ID` decimal(18,0) DEFAULT NULL COMMENT '父菜单',
  `TARGET` varchar(20) DEFAULT NULL COMMENT '显示窗名称(mainFrame , _blank,_parent)',
  `ZH_CN_NAME` varchar(200) DEFAULT NULL COMMENT '菜单名，简体中文',
  `STATUS` decimal(1,0) NOT NULL DEFAULT '1' COMMENT '是否启用状态',
  `LAVELS` decimal(1,0) DEFAULT '0' COMMENT '层次，用于菜单等级',
  `REMARK` varchar(400) DEFAULT NULL COMMENT '备注',
  `IMG_URL` varchar(50) DEFAULT NULL COMMENT '快捷菜单图片的url',
  `TOTAL_SQL` varchar(4000) DEFAULT NULL COMMENT '快捷菜单图片上的统计数',
  `NAV_IMG_URL` varchar(200) DEFAULT NULL COMMENT 'Nav 菜单图片的url',
  `NAV_ENABLED` decimal(1,0) DEFAULT '0' COMMENT 'Nav enable',
  `OLD_TOTAL_SQL` varchar(4000) DEFAULT NULL COMMENT '快捷菜单图片上的统计数(查询老系统)',
  `ZH_TW_NAME` varchar(200) DEFAULT NULL COMMENT '菜单名，中文繁体',
  `EN_US_NAME` varchar(200) DEFAULT NULL COMMENT '菜单名，英文',
  `FLAG_LAN` char(2) DEFAULT '01' COMMENT '内网标示 (01：外网，10：内网，11：内外网)',
  `STMS_MENU_ID` decimal(38,0) DEFAULT NULL COMMENT '关联stms系统sys_menu.menu_id',
  `CLASS_NAME` varchar(50) DEFAULT NULL COMMENT '快捷通道的class名字',
  PRIMARY KEY (`RESOURCE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='web资源表';

/*Data for the table `sys_resource` */

insert  into `sys_resource`(`RESOURCE_ID`,`RESOURCE_TYPE`,`VALUE`,`ORDER_NUM`,`PARENT_ID`,`TARGET`,`ZH_CN_NAME`,`STATUS`,`LAVELS`,`REMARK`,`IMG_URL`,`TOTAL_SQL`,`NAV_IMG_URL`,`NAV_ENABLED`,`OLD_TOTAL_SQL`,`ZH_TW_NAME`,`EN_US_NAME`,`FLAG_LAN`,`STMS_MENU_ID`,`CLASS_NAME`) values ('1000','1','/assets/menulist',NULL,'0',NULL,'菜单管理','1',NULL,'菜单管理',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),('1010','1','/assets/userlist',NULL,'0',NULL,'用户管理','1',NULL,'用户管理',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),('1011','1','/assets/constCategory',NULL,'0',NULL,'数据字典类别','0',NULL,'数字字典类别',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),('1012','1','/assets/constDictionary',NULL,'0',NULL,'数据字典信息','1',NULL,'数据字典，存储一些基本数据信息',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),('2010','2','/assets/personInfo',NULL,'0',NULL,'修改个人信息','0',NULL,'',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),('2020','2','',NULL,'0',NULL,'个人参数配置','0',NULL,'配置个人参数，例如使用的银行卡，支付方式等',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),('2021','2','/assets/payItem',NULL,'2020',NULL,'配置支出项','0',NULL,'生活中会使用到的支出项',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),('2022','2','/assets/incomItem',NULL,'2020',NULL,'配置收入项','0',NULL,'生活中收入的项',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),('2023','2','/assets/bankCardItem',NULL,'2020',NULL,'配置银行卡种类','0',NULL,'个人使用的银行卡',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),('2024','2','/assets/onlineBankItem',NULL,'2020',NULL,'配置线上货币银行','0',NULL,'线上支付的平台，eg:支付宝、微信等',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),('2025','2','/assets/creditLoanItem',NULL,'2020',NULL,'信用借款','0',NULL,'刷的信用卡、花呗、白条等信用消费',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),('3030','3','/assets/fundChange',NULL,'0',NULL,'资金变动','0',NULL,'资金流水记录表，所有数据的来源',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),('3080','3','/assets/fixedAssets',NULL,'0',NULL,'固定资产','0',NULL,'',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `sys_resource_authoritie` */

DROP TABLE IF EXISTS `sys_resource_authoritie`;

CREATE TABLE `sys_resource_authoritie` (
  `AUTHORITY_ID` decimal(9,0) NOT NULL COMMENT '权限表主键',
  `RESOURCE_ID` decimal(9,0) NOT NULL COMMENT '资源表主键',
  PRIMARY KEY (`AUTHORITY_ID`,`RESOURCE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源功能集关联表';

/*Data for the table `sys_resource_authoritie` */

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
  `ROLE_ID` decimal(3,0) NOT NULL COMMENT '角色标识',
  `NAME` varchar(120) DEFAULT NULL COMMENT '角色名称',
  `PARENT_ID` decimal(3,0) DEFAULT NULL COMMENT '父角色标识',
  `DESCRIPTION` varchar(200) DEFAULT NULL COMMENT '简要描述角色',
  `STATE` decimal(1,0) NOT NULL DEFAULT '1' COMMENT '描述角色状态：0无效  1有效',
  `TYPE` decimal(1,0) NOT NULL DEFAULT '1' COMMENT '角色类型 , 1授予 ，2下发 ，3授予下发',
  `MANAGE_ROLES` varchar(400) DEFAULT NULL COMMENT '管理的角色，角色ID之间以逗号分隔',
  `CLASS_NAME` varchar(400) DEFAULT 'reg_peo' COMMENT '角色样式图标',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色数据表';

/*Data for the table `sys_role` */

/*Table structure for table `sys_role_authoritie` */

DROP TABLE IF EXISTS `sys_role_authoritie`;

CREATE TABLE `sys_role_authoritie` (
  `ROLE_ID` decimal(3,0) NOT NULL COMMENT '角色ID',
  `AUTHORITY_ID` decimal(8,0) NOT NULL COMMENT '资源集ID',
  `TYPE` decimal(1,0) NOT NULL DEFAULT '0' COMMENT '类型',
  PRIMARY KEY (`ROLE_ID`,`AUTHORITY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限表';

/*Data for the table `sys_role_authoritie` */

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `USERID` int(11) NOT NULL COMMENT '关键字，同psn_code',
  `LOGIN_NAME` varchar(400) NOT NULL COMMENT '登录名',
  `PASSWORD` varchar(300) NOT NULL COMMENT '密码',
  `ENABLED` int(11) NOT NULL DEFAULT '1' COMMENT '帐号状态 0 禁用,1正常,2-删除用户',
  `TOKEN_CHANGED` int(11) DEFAULT '0' COMMENT '标记是否已确认忘记密码邮件 0-未做忘记密码操作 1-未确认邮件  2-已确认邮件',
  `NODE_ID` int(11) NOT NULL DEFAULT '1' COMMENT '用户数据存储区域位置（未使用）',
  `EMAIL` varchar(400) DEFAULT NULL COMMENT '首选通信邮件地址(默认同登录名)',
  `MOBILE` decimal(30,0) DEFAULT NULL COMMENT '手机号码登录',
  `UKEYSN` varchar(80) DEFAULT NULL COMMENT 'ukey序列号',
  `UKEYPWD` varchar(128) DEFAULT NULL COMMENT 'ukey的pin密码,与用户表密码一致',
  `ISUKEY` char(1) DEFAULT NULL COMMENT '是否对此用户启用(1启用 ,null 不启用,启用的在外网不能登陆)',
  `ISINTERNAL` char(1) DEFAULT NULL COMMENT '是否基金委内用户(1是 ,0不是，是基金委用户的，不允许在外网登录)',
  `PLAIN_PWD` varchar(128) DEFAULT NULL COMMENT '不知道',
  `ADD_USER_ID` int(11) DEFAULT NULL COMMENT '邀请专家,添加人id',
  `AUTH_LOGIN_IP` varchar(200) DEFAULT NULL COMMENT '登录的ip范围控制',
  `LAST_ACCESS_IP` varchar(100) DEFAULT NULL COMMENT '最后一次登录的ip地址',
  `LOCALE` varchar(10) DEFAULT NULL COMMENT '不知道',
  `PASSWORD_UPDATE_TIME` date DEFAULT NULL COMMENT '密码更新时间',
  `LAST_LOGIN_TIME` datetime DEFAULT NULL COMMENT '最后登录时间',
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='能够登录的 人员信息表';

/*Data for the table `sys_user` */

insert  into `sys_user`(`USERID`,`LOGIN_NAME`,`PASSWORD`,`ENABLED`,`TOKEN_CHANGED`,`NODE_ID`,`EMAIL`,`MOBILE`,`UKEYSN`,`UKEYPWD`,`ISUKEY`,`ISINTERNAL`,`PLAIN_PWD`,`ADD_USER_ID`,`AUTH_LOGIN_IP`,`LAST_ACCESS_IP`,`LOCALE`,`PASSWORD_UPDATE_TIME`,`LAST_LOGIN_TIME`) values (1,'sa','202cb962ac59075b964b07152d234b70',1,0,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `sys_user_role` */

DROP TABLE IF EXISTS `sys_user_role`;

CREATE TABLE `sys_user_role` (
  `USER_ID` decimal(18,0) NOT NULL COMMENT '用户ID',
  `ROLE_ID` decimal(3,0) NOT NULL COMMENT '角色ID',
  `INS_ID` decimal(9,0) NOT NULL DEFAULT '0' COMMENT '单位ID',
  PRIMARY KEY (`USER_ID`,`ROLE_ID`,`INS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表';

/*Data for the table `sys_user_role` */

/*Table structure for table `user_const_dic` */

DROP TABLE IF EXISTS `user_const_dic`;

CREATE TABLE `user_const_dic` (
  `category` varchar(30) DEFAULT NULL,
  `psn_code` decimal(18,0) DEFAULT NULL,
  `cost_code` varchar(500) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增序列',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `user_const_dic` */

insert  into `user_const_dic`(`category`,`psn_code`,`cost_code`,`id`) values ('2_ZCX','1','4,5,6,7,8,9,15',8),('3_SRX','1','10,11,12,13,14',9),('5_YHKZL','1','19,20,21,26',10),('6_XSYH','1','22,23,24,25',11),('4_BJSY','1','16',12),('7_XYJK','1','27,28,29',13),('2_ZCX','2','1,2,3',14);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
