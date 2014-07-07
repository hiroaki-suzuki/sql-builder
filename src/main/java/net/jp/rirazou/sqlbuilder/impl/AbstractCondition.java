package net.jp.rirazou.sqlbuilder.impl;

import net.jp.rirazou.sqlbuilder.Condition;

/**
 * Created on 2014/07/05.
 *
 * @author Hiroaki Suzuki
 */
abstract class AbstractCondition extends AbstractSQLPart implements Condition {

    @Override
    public Condition and(Condition other) {
        return null;
    }

    @Override
    public Condition or(Condition other) {
        return null;
    }

    @Override
    public Condition not(Condition other) {
        return null;
    }
}
