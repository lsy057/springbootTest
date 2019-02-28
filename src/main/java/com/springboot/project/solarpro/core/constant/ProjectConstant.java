package com.springboot.project.solarpro.core.constant;

public class ProjectConstant {

	// 项目基础包名称，根据自己公司的项目修改
	public static final String BASE_PACKAGE = "com.springboot.project.solarpro";

	// Model所在包
	public static final String MODEL_PACKAGE = BASE_PACKAGE + ".model";

	// Mapper所在包
	public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".dao";

	// Service所在包
	public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";

	// ServiceImpl所在包
	public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";

	// Controller所在包
	public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".controller";

	// Mapper插件基础接口的完全限定名
	public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.universal.Mapper";

	//文件上传储存的地址
	public static final String SAVEFILEPATH = "E://img";

	public static final String USERTYPE = "1";
	public static final String LOGINUSER = "2";
	public static final String SUPERADMIN = "3";



}
