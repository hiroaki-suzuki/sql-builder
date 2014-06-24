package net.jp.rirazou.sqlbuilder;

/**
 * Created by rirazou on 2014/06/23.
 */
class TableColumn extends AbstractColumn {

    private String tableName;

    TableColumn(String tableName, String name) {
        super(name);
        this.tableName = tableName;
    }

    String getTableName() {
        return tableName;
    }

    @Override
    public void writeTo(StringBuilder sql) {

    }
}
