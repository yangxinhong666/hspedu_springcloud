/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : localhost:3306
 Source Schema         : e_commerce_center_db

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 07/08/2024 22:27:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `NAME` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户名',
  `pwd` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
  `mobile` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '手机号码',
  `email` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邮箱',
  `gender` tinyint NULL DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES (1, 'smith', '202cb962ac59075b964b07152d234b70', '123456789000', 'smith@sohu.com', 1);
INSERT INTO `member` VALUES (2, 'yang', 'e10adc3949ba59abbe56e057f20f883e', '18384741646', '123456@qq.com', 1);
INSERT INTO `member` VALUES (3, 'yang1', 'aaa42296669b958c3cee6c0475c8093e', '183847416461', '1234561@qq.com', 1);
INSERT INTO `member` VALUES (9, 'abc', 'c33367701511b4f6020ec61ded352059', '123456789', '123@189.com', 2);
INSERT INTO `member` VALUES (16, 'abc', 'c33367701511b4f6020ec61ded352059', '123456789', '123@189.com', 2);

SET FOREIGN_KEY_CHECKS = 1;
