package net.jp.rirazou.sqlbuilder.impl;

/**
 * Created on 2014/06/28.
 *
 * @author Hiroaki Suzuki
 */
class TableColumn extends SimpleColumn {

    private String tableName;

    TableColumn(String tableName, String name) {
        super(name);
        this.tableName = tableName;
    }

    @Override
    public void writeTo(StringBuilder sql) {
        if (SQLUtils.isNotBlank(tableName)) {
            SQLUtils.encloseWithBackquote(sql, tableName);
            sql.append(".");
        }
        super.writeTo(sql);
    }
}
