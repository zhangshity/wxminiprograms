DROP TABLE IF EXISTS `homepage_template`;
CREATE TABLE `homepage_template` (
    `TEMPLATE_ID` bigint(18) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '首页模板ID  主键',
    `TEMPLATE_NAME` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '首页模板名称',
    `STORE_ID` bigint(18) NOT NULL COMMENT '店铺ID',
    `STATUS` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'enable' COMMENT '状态：enable-正常，disable-失效，delete-删除',
    `CREATE_TIME` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
    `CREATE_BY` bigint(18) NOT NULL COMMENT '创建人ID',
    `UPDATE_TIME` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
    `UPDATE_BY` bigint(18) NOT NULL COMMENT '更新人ID',
    PRIMARY KEY (`TEMPLATE_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;