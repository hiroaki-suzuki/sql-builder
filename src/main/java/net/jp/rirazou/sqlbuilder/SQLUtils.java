package net.jp.rirazou.sqlbuilder;

/**
 * SQLのユーティリティクラス。
 * <p/>
 * Created by rirazou on 2014/06/22.
 */
class SQLUtils {

    static final String DOT = ".";

    static final String SPACE = " ";

    /**
     * 列インスタンスを生成する。
     *
     * @param name 列名
     * @return 列インスタンス
     */
    static TableColumn column(String name) {
        return new TableColumn("", name);
    }

    /**
     * sがnullか空文字かを判定する。
     *
     * @param s 検証文字列
     * @return
     */
    static final boolean isEmpty(String s) {
        return (s == null || s.length() == 0);
    }

    /**
     * sがnullか空文字ではないかを判定する。
     *
     * @param s 検証文字列
     * @return
     */
    static final boolean isNotEmpty(String s) {
        return !isEmpty(s);
    }
}
