package gavin.framework.util;

import org.apache.commons.lang3.StringUtils;

public final class StringUtil {
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static String[] splitString(String str, String splitter) {
        return StringUtils.split(str, splitter);
    }
}
