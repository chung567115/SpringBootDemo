/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : sbd

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2018-01-03 00:03:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_gitchat
-- ----------------------------
DROP TABLE IF EXISTS `tbl_gitchat`;
CREATE TABLE `tbl_gitchat` (
  `id` int(8) unsigned NOT NULL AUTO_INCREMENT,
  `author` varchar(6) DEFAULT '',
  `date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `url` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tbl_gitchat
-- ----------------------------
INSERT INTO `tbl_gitchat` VALUES ('1', 'chung', '2018-01-02 21:07:10', 'http://gitbook.cn/gitchat/activity/5a444c451f6ee91a25846ac1');
INSERT INTO `tbl_gitchat` VALUES ('2', 'chung', '2018-01-02 21:07:33', 'http://gitbook.cn/gitchat/activity/5a444c451f6ee91a25846ac1');
INSERT INTO `tbl_gitchat` VALUES ('3', 'charle', '2018-01-02 21:07:47', 'http://gitbook.cn/gitchat/activity/5a444c451f6ee91a25846ac1');
INSERT INTO `tbl_gitchat` VALUES ('5', 'Zhang', '2018-01-02 22:19:05', 'http://gitbook.cn/gitchat/activity/5a444c451f6ee91a25846ac1');
INSERT INTO `tbl_gitchat` VALUES ('6', 'ZhangC', '2018-01-02 22:19:05', 'http://gitbook.cn/gitchat/activity/5a444c451f6ee91a25846ac1');
INSERT INTO `tbl_gitchat` VALUES ('7', 'ZC', '2018-01-02 22:59:13', 'http://gitbook.cn/gitchat/activity/5a444c451f6ee91a25846ac1');
INSERT INTO `tbl_gitchat` VALUES ('8', 'excep', '2018-01-02 23:56:26', 'http://gitbook.cn/gitchat/activity/5a444c451f6ee91a25846ac1');
