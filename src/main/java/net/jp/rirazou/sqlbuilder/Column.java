package net.jp.rirazou.sqlbuilder;

/**
 * SQLの列が持つインターフェース。
 *
 * @author rirazou
 */
public interface Column extends SQLPart {

    String getName();

    Column as(String alias);
}
