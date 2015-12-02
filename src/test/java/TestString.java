import org.junit.Test;
import util.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
