package com.liuchongyang.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
	
	/**
	 * 
	 * @Title: read 
	 * @Description: 流处理工具类
	 * @param in
	 * @return
	 * @throws IOException
	 * @return: List<String>
	 */
	public static List<String> read(InputStream in) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(in));
		List<String> list = new ArrayList<String>();
		String str = "";
		
		while((str=read.readLine()) != null) {
			list.add(str);
		}
		
		return list;
	}
	
	public static String readFile(File file, String charset) throws IOException {
		// 创建输出流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
		// 定义缓冲对象
		StringBuffer sb = new StringBuffer();
		// 定义读取每行的结果
		String content = null;
		// 循环读取
		while ((content = br.readLine()) != null) {
			// 加入缓冲对象
			sb.append(content);
		}
		// 关闭流
		br.close();
		// 返回结果
		return sb.toString();
	}
}
