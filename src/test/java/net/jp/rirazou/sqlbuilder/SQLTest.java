package net.jp.rirazou.sqlbuilder;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static net.jp.rirazou.sqlbuilder.SQLUtils.*;

public class SQLTest {

    private SQL sql;

    @Before
    public void setUp() throws Exception {
        sql = new SQL();
    }
    
    @Test
    public void testSimpleSQL() throws Exception {
        sql.select(column("col1"), column("col2"), column("col3"));
        assertThat(sql.toSQL(), is("SELECT col1, col2, col3 FROM table1 WHERE col1 = 1"));
    }
}