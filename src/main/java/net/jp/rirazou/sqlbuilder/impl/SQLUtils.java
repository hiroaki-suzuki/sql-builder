package net.jp.rirazou.sqlbuilder.impl;

import static net.jp.rirazou.sqlbuilder.impl.SQLConst.BACKQUOTE;

/**
 * SQLのユーティリティクラス。
 * <p/>
 * Created by rirazou on 2014/06/22.
 */
class SQLUtils {

    static void encloseWithBackquote(StringBuilder sb, String str) {
        sb.append(BACKQUOTE);
        sb.append(str);
        sb.append(BACKQUOTE);
    }

    static boolean isBrank(String str) {
        int len;
        if (str == null || (len = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < len; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static boolean isNotBrank(String str) {
        return !isBrank(str);
    }
}
