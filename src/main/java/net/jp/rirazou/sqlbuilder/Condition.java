package net.jp.rirazou.sqlbuilder;

/**
 * Created on 2014/07/03.
 *
 * @author Hiroaki Suzuki
 */
public interface Condition extends SQLPart {

    Condition and(Condition other);

    Condition or(Condition other);

    Condition not(Condition other);
}
