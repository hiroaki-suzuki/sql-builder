package net.jp.rirazou.sqlbuilder;

/**
 * Created on 2014/07/07.
 *
 * @author Hiroaki Suzuki
 */
public interface SQL {

    SQL select();

    SQL from();

    SQL where();

    SQL groupBy();

    SQL having();

    SQL orderBy();

    SQL forUpdate();

    SQL union();

    SQL unionAll();

    SQL intersect();

    SQL except();
}
