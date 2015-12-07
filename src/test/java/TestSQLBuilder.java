import org.junit.Test;
import util.sql.SQLBuilder;

public class TestSQLBuilder {
    @Test
    public void testSQLNor() throws Exception {
        System.out.println( "[START]TestSQLBuilder -------------------------" );
        String sql;
        // SELECT * FROM HOGE
        sql = new SQLBuilder().selectAll().from( "hoge" ).build();
        if(sql.equals("SELECT * FROM hoge")) {
            System.out.println("[SELECT * FROM hoge]OK!!!");
        } else {
            throw new Exception("不一致:[SELECT * FROM hoge] == [" + sql + "]");
        }
        System.out.println( "[END]TestSQLBuilder -------------------------" );
    }
}
