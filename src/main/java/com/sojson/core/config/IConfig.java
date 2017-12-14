package com.sojson.core.config;

import java.util.Properties;


public class IConfig {

	/**
	 * 同步锁
	 */
	private static final Object obj = new Object();
	
	/**
	 * 配置文件
	 */
	private static Properties prop = null;
	
	/**
	 * 配置对象单例模式
	 */
	private static IConfig config = null;
	
	/**
	 * 获取单例模式对象实例
	 * @return 唯一对象实例
	 */
	public static IConfig getInstance(){
		if(null==config){
			synchronized (obj) {
				config = new IConfig();
			}
		}
		return config;
	}
	
	/**
	 */
	public static String get(String key){
		return prop.getProperty(key);
	}
	
}
