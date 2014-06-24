package net.jp.rirazou.sqlbuilder;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SQLUtilsTest {

    @Test
    public void testCreateColumn() throws Exception {
        AbstractColumn column = SQLUtils.column("col1");
        assertThat(column.getName(), is("col1"));
    }

    @Test
    public void testCreateColumnWithAlias() throws Exception {
        AbstractColumn column = SQLUtils.column("col1").as("c1");
        assertThat(column.getName(), is("col1"));
        assertThat(column.getAlias(), is("c1"));
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertThat(SQLUtils.isEmpty(""), is(true));
        assertThat(SQLUtils.isEmpty(null), is(true));
    }

    @Test
    public void testIsNotEmpty() throws Exception {
        assertThat(SQLUtils.isNotEmpty(""), is(false));
        assertThat(SQLUtils.isNotEmpty(null), is(false));
    }
}