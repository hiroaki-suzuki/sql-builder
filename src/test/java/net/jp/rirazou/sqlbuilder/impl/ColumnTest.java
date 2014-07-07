package net.jp.rirazou.sqlbuilder.impl;

import net.jp.rirazou.sqlbuilder.Column;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ColumnTest {

    @Test
    public void testSimpleColumn() throws Exception {
        Column sut = new SimpleColumn("col1");
        assertThat(sut.toString(), is("`col1`"));
    }

    @Test
    public void testTableColumn() throws Exception {
        Column sut = new TableColumn("T", "col1");
        assertThat(sut.toString(), is("`T`.`col1`"));
    }

    @Test
    public void testAliasColumn() throws Exception {
        Column sut;

        sut = new TableColumn("T", "col1").as("name");
        assertThat(sut.toString(), is("`T`.`col1` AS `name`"));

        sut = new SimpleColumn("col1").as("name");
        assertThat(sut.toString(), is("`col1` AS `name`"));
    }
}