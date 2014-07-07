package net.jp.rirazou.sqlbuilder.impl;

/**
 * Created on 2014/06/28.
 *
 * @author Hiroaki Suzuki
 */
class SimpleColumn extends AbstractColumn {

    SimpleColumn(String name) {
        super(name);
    }

    @Override
    public void writeTo(StringBuilder sql) {
        SQLUtils.encloseWithBackquote(sql, getName());
    }
}
