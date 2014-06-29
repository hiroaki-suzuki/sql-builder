package net.jp.rirazou.sqlbuilder;

/**
 * Created on 2014/06/28.
 *
 * @author Hiroaki Suzuki
 */
public interface Column extends SQLPart {

    String getName();

    Column as(String alias);
}
