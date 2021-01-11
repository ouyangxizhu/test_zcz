package test.string;

import java.util.StringTokenizer;

/**
 * @author czz
 */
public class StringTokenizerTest {
    public static void main(String[] args) {
        String str = "runoob,google,tao:bao,facebook,zhihu";
        StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
//            System.out.println(st.nextToken(":"));
//            System.out.println(st.nextElement());
        }
    }
}
