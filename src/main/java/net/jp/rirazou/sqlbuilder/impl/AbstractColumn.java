package net.jp.rirazou.sqlbuilder.impl;

import net.jp.rirazou.sqlbuilder.Column;

/**
 * Created on 2014/06/27.
 *
 * @author Hiroaki Suzuki
 */
abstract class AbstractColumn extends AbstractSQLPart implements Column {

    private String name;

    AbstractColumn(String name) {
        this.name = name;
    }

    @Override
    public AliasColumn as(String alias) {
        return new AliasColumn(this, alias);
    }

    @Override
    public final String getName() {
        return name;
    }
}
