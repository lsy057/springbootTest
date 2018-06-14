CREATE TABLE `system_log` (
  `id` varchar(32) NOT NULL,
  `description` varchar(50) DEFAULT NULL COMMENT '日志信息描述',
  `method` varchar(20) DEFAULT NULL COMMENT '方法名称',
  `log_type` varchar(10) DEFAULT NULL COMMENT '日志类型 0是正常，1是异常',
  `request_ip` varchar(30) DEFAULT NULL COMMENT '请求的ip',
  `exception_code` varchar(50) DEFAULT NULL COMMENT '异常错误码',
  `exception_detail` varchar(255) DEFAULT NULL COMMENT '异常详情',
  `params` varchar(1000) DEFAULT NULL COMMENT '请求参数',
  `user_id` varchar(32) DEFAULT NULL COMMENT '请求的用户id',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统日志表';


CREATE TABLE `sys_role` (
  `id` varchar(36) NOT NULL COMMENT '角色名称',
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名称，用于显示',
  `role_desc` varchar(255) DEFAULT NULL COMMENT '角色描述',
  `role_value` varchar(255) DEFAULT NULL COMMENT '角色值，用于权限判断',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `is_disable` int(1) DEFAULT NULL COMMENT '是否禁用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

CREATE TABLE `user_role` (
  `id` varchar(36) NOT NULL,
  `user_id` varchar(36) DEFAULT NULL COMMENT '用户ID',
  `role_id` varchar(36) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关系表';

CREATE TABLE `sys_perm` (
  `id` varchar(36) NOT NULL,
  `perm_name` varchar(255) DEFAULT NULL COMMENT '权限名称',
  `perm_desc` varchar(255) DEFAULT NULL COMMENT '权限描述',
  `perm_value` varchar(255) DEFAULT NULL COMMENT '权限值',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `is_disable` int(1) DEFAULT NULL COMMENT '是否禁用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `role_perm` (
  `id` varchar(36) NOT NULL,
  `perm_id` varchar(32) DEFAULT NULL COMMENT '权限id',
  `role_id` varchar(32) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限表';

INSERT INTO `sys_role` VALUES ('1', '财务', '负责发工资', 'cw', '2018-05-26 00:37:52', null, '0');
INSERT INTO `sys_role` VALUES ('2', '人事', '负责员工', 'rs', '2018-05-26 00:38:18', null, '0');
INSERT INTO `user_role` VALUES ('1', '1', '1');
INSERT INTO `user_role` VALUES ('2', '1', '2');
INSERT INTO `sys_perm` VALUES ('1', '创建', '创建权限', 'create', '2018-05-26 00:39:16', null, '0');
INSERT INTO `sys_perm` VALUES ('2', '删除', '删除权限', 'delete', '2018-05-26 00:39:39', null, '0');
INSERT INTO `sys_perm` VALUES ('3', '修改', '修改权限', 'update', '2018-05-26 00:39:58', null, '0');
INSERT INTO `sys_perm` VALUES ('4', '查询', '查询权限', 'select', '2018-05-26 00:40:16', null, '0');
INSERT INTO `role_perm` VALUES ('1', '1', '1');
INSERT INTO `role_perm` VALUES ('2', '2', '1');
INSERT INTO `role_perm` VALUES ('3', '1', '2');
INSERT INTO `role_perm` VALUES ('4', '2', '2');
INSERT INTO `role_perm` VALUES ('5', '3', '2');
INSERT INTO `role_perm` VALUES ('6', '4', '2');



CREATE TABLE `sys_permission_init` (
  `id` varchar(255) NOT NULL,
  `url` varchar(255) DEFAULT NULL COMMENT '程序对应url地址',
  `permission_init` varchar(255) DEFAULT NULL COMMENT '对应shiro权限',
  `sort` int(100) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `sys_permission_init` VALUES ('1', '/userInfo/login', 'anon', '1');
INSERT INTO `sys_permission_init` VALUES ('2', '/userInfo/selectAll', 'anon', '2');
INSERT INTO `sys_permission_init` VALUES ('3', '/logout', 'anon', '3');
INSERT INTO `sys_permission_init` VALUES ('4', '/**', 'authc', '0');
INSERT INTO `sys_permission_init` VALUES ('5', '/userInfo/selectAlla', 'authc, roles[admin]', '6');
INSERT INTO `sys_permission_init` VALUES ('6', '/sysPermissionInit/aaa', 'anon', '5');


UPDATE sys_permission_init
SET permission_init = 'authc, roles[cw]'
WHERE
	id = 5;


UPDATE sys_permission_init
SET permission_init = 'authc, roles[cw1]'
WHERE
id = 5;


INSERT INTO `sys_permission_init` VALUES ('7', '/excel/test', 'anon', '7');
INSERT INTO `sys_permission_init` VALUES ('8', '/excel/test2', 'anon', '8');