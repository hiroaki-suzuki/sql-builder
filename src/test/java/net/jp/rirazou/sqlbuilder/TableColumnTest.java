package net.jp.rirazou.sqlbuilder;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TableColumnTest {

    @Test
    public void testCreateTableColumn() throws Exception {
        Column sut = new TableColumn("T", "col1");
        assertThat(sut.getName(), is("col1"));
        assertThat(((TableColumn)sut).getTableName(), is("T"));
    }

    @Test
    public void testCreateTableColumnWithAlias() throws Exception {
        Column sut = new TableColumn("T", "col1").as("as");
        assertThat(sut.getName(), is("col1"));
        assertThat(((TableColumn)sut).getAlias(), is("T"));
        assertThat(((TableColumn)sut).getTableName(), is("T"));
    }
}