package test.url;

import javax.lang.model.element.VariableElement;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.bilibili.com/read/cv3860455/?spm_id_from=333.788.b_636f6d6d656e74.28");
        System.out.println(url);
    }
}
