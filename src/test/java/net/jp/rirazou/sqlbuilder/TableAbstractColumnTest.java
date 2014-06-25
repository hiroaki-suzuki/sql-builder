package net.jp.rirazou.sqlbuilder;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TableAbstractColumnTest {

    @Test
    public void testCreateTableColumn() throws Exception {
        TableColumn sut = new TableColumn("T", "col1");
        assertThat(sut.getTableName(), is("T"));
        assertThat(sut.getName(), is("col1"));
    }

    @Test
    public void testCreateTableNameWith() throws Exception {
        TableColumn sut = (TableColumn) new TableColumn("T", "col1").as("user");
        assertThat(sut.getTableName(), is("T"));
        assertThat(sut.getName(), is("col1"));
        assertThat(sut.getAlias(), is("user"));
    }
}