package net.jp.rirazou.sqlbuilder;

/**
 * SQLの構成要素が持つべきインターフェース。
 *
 * Created by rirazou on 2014/06/21.
 */
interface SQLPart {

    /**
     * この要素のSQL文字列をsqlに書き込む。
     *
     * @param sql 書き込むSQL
     */
    void writeTo(StringBuilder sql);
}
