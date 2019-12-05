package com.liuchongyang.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @ClassName: StringUtil 
 * @Description: 随机数工具类
 * @author: 86157
 * @date: 2019年12月5日 下午6:34:02
 */
public class RandomUtil {
	
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
		public static int random(int min, int max){
			Random r = new Random();
			
			return r.nextInt(max - min + 1) + min;
		}
		
		//public static void main(String[] args) {
			//for (int i = 0; i < 10; i++) {
				//int random = RandomUtil.random(1, 3);
				//System.out.println(random);
			//}
		//}
		
		
		//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
		public static int[] subRandom (int min, int max, int subs){
			int[] array = new int[subs];
			
			Set<Integer> set = new HashSet<Integer>();
			
			while(set.size() != subs) {
				set.add(random(min, max));
			}
			
			int i = 0;
			for (Integer n : set) {
				array[i] = n;
				i++;
			}
			return array;
		}
		//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
		public static char randomCharacter (){
			String src = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
			return src.charAt(random(0, src.length()-1));
		}
		//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
		public static String randomString(int length){
			String str = "";
			for (int i = 0; i < length; i++) {
				str += randomCharacter();
			}
			return str;
		}
}
