package com.liuchongyang.common.utils;

import java.io.BufferedReader;
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
}
