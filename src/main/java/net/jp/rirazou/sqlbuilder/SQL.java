package net.jp.rirazou.sqlbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rirazou on 2014/06/20.
 */
class SQL {

    private List<AbstractColumn> columns = new ArrayList<AbstractColumn>();

    SQL select(AbstractColumn... columns) {
        this.columns.addAll(Arrays.asList(columns));
        return this;
    }

    /**
     * SELECT句をsqlに書き込む。
     *
     * @param sql SELECT句の書き込み先
     */
    private void writeSelectTo(StringBuilder sql) {
        sql.append("SELECT");

        boolean isFirst = true;
        for (AbstractColumn column : columns) {
            if (isFirst) {
                isFirst = false;
            } else {
                sql.append(",");
            }
            sql.append(" ");
            column.writeTo(sql);
        }
    }

    String toSQL() {
        StringBuilder sql = new StringBuilder();
        writeSelectTo(sql);
        sql.append(" FROM table1 WHERE col1 = 1");
        return sql.toString();
    }

    @Override
    public String toString() {
        return toSQL();
    }
}
