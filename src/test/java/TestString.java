import org.junit.Test;
import util.StringUtils;

public class TestString {

    @Test
    public void test() throws Exception {
        if(StringUtils.isNotNullOrEmpty("a")) {
            System.out.print("[StringUtils#isNotNullOrEmpty(a)]OK!!!/t");
        }

        if(StringUtils.isNotNullOrEmpty("")) {
            System.out.print("[StringUtils#isNotNullOrEmpty()]OK!!!");
        }
    }
}
