import net.jp.rirazou.sqlbuilder.Column;
import net.jp.rirazou.sqlbuilder.impl.TempUtils;

/**
 * Created on 2014/06/28.
 *
 * @author Hiroaki Suzuki
 */
public class Main {
    public static void main(String[] args) {
        Column column = TempUtils.newSimpleColumn("col1");
        System.out.println(column);
    }
}
