/*
Navicat MySQL Data Transfer

Source Server         : mzwua
Source Server Version : 50142
Source Host           : localhost:3306
Source Database       : db_ssmdemo

Target Server Type    : MYSQL
Target Server Version : 50142
File Encoding         : 65001

Date: 2017-11-18 00:22:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `db_user_info`
-- ----------------------------
DROP TABLE IF EXISTS `db_user_info`;
CREATE TABLE `db_user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `account` varchar(20) NOT NULL COMMENT '账号',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `nick_name` varchar(20) DEFAULT NULL COMMENT '昵称',
  `real_name` varchar(10) DEFAULT NULL COMMENT '真实姓名',
  `gender` tinyint(1) DEFAULT NULL COMMENT '性别：0-女  1-男',
  `age` int(4) DEFAULT NULL COMMENT '年龄',
  `email` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话号码',
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of db_user_info
-- ----------------------------
INSERT INTO `db_user_info` VALUES ('1', 'helloWorld', 'F82D132F9BB018CA', '梦飞扬', '吴中生有', '1', '20', '89757@gmail.com', '18888888888', '2017-11-17 23:57:04');
