/*
 Navicat Premium Data Transfer

 Source Server         : Mac os X - zcy
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : demo_springboot

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 09/09/2018 17:20:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_area
-- ----------------------------
DROP TABLE IF EXISTS `tb_area`;
CREATE TABLE `tb_area` (
  `area_id` int(2) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `area_name` varchar(200) NOT NULL COMMENT '区域名称',
  `priority` int(2) NOT NULL DEFAULT '0' COMMENT '优先级',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `last_modify_time` datetime DEFAULT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`area_id`),
  UNIQUE KEY `UK_AREA` (`area_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_area
-- ----------------------------
BEGIN;
INSERT INTO `tb_area` VALUES (1, '东苑', 2, NULL, NULL);
INSERT INTO `tb_area` VALUES (2, '北苑', 1, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
