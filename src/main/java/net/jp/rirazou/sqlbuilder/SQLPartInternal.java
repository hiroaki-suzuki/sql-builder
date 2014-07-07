package net.jp.rirazou.sqlbuilder;

/**
 * Created on 2014/06/28.
 *
 * @author Hiroaki Suzuki
 */
public interface SQLPartInternal extends SQLPart {

    void writeTo(StringBuilder sql);
}
