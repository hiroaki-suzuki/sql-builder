package net.jp.rirazou.sqlbuilder.impl;

import net.jp.rirazou.sqlbuilder.SQLPartInternal;

/**
 * Created on 2014/06/29.
 *
 * @author Hiroaki Suzuki
 */
abstract class AbstractSQLPart implements SQLPartInternal {

    @Override
    public String toString() {
        StringBuilder sql = new StringBuilder();
        writeTo(sql);
        return sql.toString();
    }
}
