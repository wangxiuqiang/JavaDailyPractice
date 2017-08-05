/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : hotel

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-07-08 10:44:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `passwd` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('admin', 'admin');

-- ----------------------------
-- Table structure for chef
-- ----------------------------
DROP TABLE IF EXISTS `chef`;
CREATE TABLE `chef` (
  `id` int(20) NOT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `age` int(10) NOT NULL,
  `money` int(20) NOT NULL,
  `address` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `tel` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of chef
-- ----------------------------
INSERT INTO `chef` VALUES ('1', '大黄', '23', '4500', 'b', '120');
INSERT INTO `chef` VALUES ('2', '大红', '21', '4300', 'c', '119');

-- ----------------------------
-- Table structure for houseanddesk
-- ----------------------------
DROP TABLE IF EXISTS `houseanddesk`;
CREATE TABLE `houseanddesk` (
  `names` char(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `flag` int(2) NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `tag` int(10) NOT NULL,
  `id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of houseanddesk
-- ----------------------------
INSERT INTO `houseanddesk` VALUES ('兰花阁', '2', null, '1', '1');
INSERT INTO `houseanddesk` VALUES ('富贵轩', '0', null, '1', '2');
INSERT INTO `houseanddesk` VALUES ('华山阁', '0', null, '1', '3');
INSERT INTO `houseanddesk` VALUES ('清风阁', '0', null, '1', '4');
INSERT INTO `houseanddesk` VALUES ('黑风阁', '0', null, '1', '5');
INSERT INTO `houseanddesk` VALUES ('1号餐桌', '0', null, '2', '6');
INSERT INTO `houseanddesk` VALUES ('2号餐桌', '0', null, '2', '7');
INSERT INTO `houseanddesk` VALUES ('3号餐桌', '0', null, '2', '8');
INSERT INTO `houseanddesk` VALUES ('4号餐桌', '0', null, '2', '9');
INSERT INTO `houseanddesk` VALUES ('5号餐桌', '0', null, '2', '10');
INSERT INTO `houseanddesk` VALUES ('6号餐桌', '0', null, '2', '11');

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `id` int(20) NOT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `tel` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('1', '强哥', '0');
INSERT INTO `member` VALUES ('2', '小样', '1');
INSERT INTO `member` VALUES ('11', '11', '12');

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(20) NOT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `price` int(20) NOT NULL,
  `flag` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '香辣虾', '90', '1');
INSERT INTO `menu` VALUES ('2', '回锅肉', '58', '1');
INSERT INTO `menu` VALUES ('3', '老式肉片', '38', '1');
INSERT INTO `menu` VALUES ('4', '酸菜鱼', '68', '1');
INSERT INTO `menu` VALUES ('5', '红烧茄子', '35', '2');
INSERT INTO `menu` VALUES ('6', '酸辣土豆丝', '25', '2');
INSERT INTO `menu` VALUES ('7', '麻婆豆腐', '30', '2');
INSERT INTO `menu` VALUES ('8', '鱼香肉丝', '60', '2');
INSERT INTO `menu` VALUES ('9', '三鲜汤', '40', '1');
INSERT INTO `menu` VALUES ('10', '青菜豆腐汤', '20', '1');
INSERT INTO `menu` VALUES ('11', '酸菜粉丝汤', '30', '1');
INSERT INTO `menu` VALUES ('12', '紫菜蛋花汤', '50', '2');
INSERT INTO `menu` VALUES ('13', '西红柿鸡蛋汤', '20', '2');
INSERT INTO `menu` VALUES ('14', '凤凰玉米羹', '60', '2');
INSERT INTO `menu` VALUES ('15', '可乐', '5', '0');
INSERT INTO `menu` VALUES ('16', '苏打水', '2', '0');
INSERT INTO `menu` VALUES ('17', '啤酒', '10', '0');
INSERT INTO `menu` VALUES ('18', '雪碧', '5', '0');
INSERT INTO `menu` VALUES ('19', '茅台', '900', '0');
INSERT INTO `menu` VALUES ('20', '国窖', '500', '0');

-- ----------------------------
-- Table structure for menuin
-- ----------------------------
DROP TABLE IF EXISTS `menuin`;
CREATE TABLE `menuin` (
  `id` int(20) NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 NOT NULL,
  `price` int(20) NOT NULL,
  `flag` int(10) NOT NULL,
  `num` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of menuin
-- ----------------------------
INSERT INTO `menuin` VALUES ('1', '香辣虾', '90', '1', '1');
INSERT INTO `menuin` VALUES ('1', '老式肉片', '38', '1', '1');
INSERT INTO `menuin` VALUES ('1', '酸菜鱼', '68', '1', '1');
INSERT INTO `menuin` VALUES ('1', '可乐', '5', '1', '2');
INSERT INTO `menuin` VALUES ('1', '苏打水', '2', '1', '2');

-- ----------------------------
-- Table structure for waiter
-- ----------------------------
DROP TABLE IF EXISTS `waiter`;
CREATE TABLE `waiter` (
  `id` int(20) NOT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `age` int(10) NOT NULL,
  `money` int(20) NOT NULL,
  `address` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `tel` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of waiter
-- ----------------------------
INSERT INTO `waiter` VALUES ('1', '小兰', '20', '3000', 'a', '22231');
INSERT INTO `waiter` VALUES ('2', '小青', '22', '3100', 'b', '1');
SET FOREIGN_KEY_CHECKS=1;
