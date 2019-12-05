package com.liuchongyang.common.utils;

/**
 * 
 * @ClassName: StringUtil 
 * @Description: 字符串工具类
 * @author: 86157
 * @date: 2019年12月5日 下午6:34:49
 */
public class StringUtil {
		public static boolean hasLength(String src){
			return src != null && src.length() > 0;
		}
		//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
		public static boolean hasText(String src){
			return src != null && src.trim().length() > 0;
		}
		//方法3：返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内，例如“中呀被”(5分)
		public static String randomChineseString(int length){
			return null;
		}
		//方法4：返回中文姓名，必须以真实姓开头，百家姓在“六、附百家姓”里，名使用1-2个随机汉字(8分)，内部调用randomChineseString()方法(3分)。返回示例：“刘呀被”、“欧阳及为”
		public static String generateChineseName(){
			return null;
		}
}
