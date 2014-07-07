package net.jp.rirazou.sqlbuilder.impl;

import net.jp.rirazou.sqlbuilder.SQLPartInternal;

/**
 * Created on 2014/06/28.
 *
 * @author Hiroaki Suzuki
 */
class AliasColumn extends AbstractColumn implements SQLPartInternal {

    private String alias;

    private AbstractColumn wrapped;

    AliasColumn(AbstractColumn column, String alias) {
        super(column.getName());
        this.wrapped = column;
        this.alias = alias;
    }

    @Override
    public void writeTo(StringBuilder sql) {
        wrapped.writeTo(sql);

        if (SQLUtils.isNotBlank(alias)) {
            sql.append(" ").append("AS").append(" ");
            SQLUtils.encloseWithBackquote(sql, alias);
        }
    }
}
