package net.jp.rirazou.sqlbuilder.impl;

import net.jp.rirazou.sqlbuilder.Column;

/**
 * Created on 2014/06/28.
 *
 * @author Hiroaki Suzuki
 */
public class TempUtils {

    public static Column newSimpleColumn(String columnName) {
        return new SimpleColumn(columnName);
    }

    public static Column newTableColumn(String tableName, String columnName) {
        return new TableColumn(tableName, columnName);
    }
}
