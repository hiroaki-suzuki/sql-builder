package net.jp.rirazou.sqlbuilder;

import static net.jp.rirazou.sqlbuilder.SQLUtils.DOT;

/**
 *
 * Created by rirazou on 2014/06/21.
 */
abstract class AbstractColumn implements Column {

    private String name;

    private String alias;

    AbstractColumn(String name) {
        this.name = name;
        alias = "";
    }

    @Override
    public Column as(String alias) {
        return null;
    }

    String getAlias() {
        return alias;
    }

    @Override
    public String getName() {
        return name;
    }
}
