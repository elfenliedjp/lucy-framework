import org.junit.Test;
import util.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestString {

    @Test
    public void test() throws Exception {
        System.out.println( "[START]TestString -------------------------" );
        if(StringUtils.isNotNullOrEmpty("a")) {
            System.out.println("[StringUtils#isNotNullOrEmpty(a)]OK!!!");
        }

        if(StringUtils.isNullOrEmpty("")) {
            System.out.println("[StringUtils#isNullOrEmpty()]OK!!!");
        }
        System.out.println( "[END]TestString -------------------------" );
    }
}
