package org.gvp.common;

/**
 * 字符串工具类
 */
public class StringUtil {

    /**
     * 字符串首字母大写
     */
    public static String firstCharToUpperCase(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }
}
