package net.jp.rirazou.sqlbuilder.impl;

import static net.jp.rirazou.sqlbuilder.impl.SQLConst.DOT;

/**
 * Created on 2014/06/28.
 *
 * @author Hiroaki Suzuki
 */
class TableColumn extends AbstractColumn {

    private String tableName;

    TableColumn(String tableName, String name) {
        super(name);
        this.tableName = tableName;
    }

    @Override
    public void writeTo(StringBuilder sql) {
        if (SQLUtils.isNotBrank(tableName)) {
            SQLUtils.encloseWithBackquote(sql, tableName);
            sql.append(DOT);
        }
        SQLUtils.encloseWithBackquote(sql, getName());
    }
}
