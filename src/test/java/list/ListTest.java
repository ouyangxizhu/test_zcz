package list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    @Test
    public void testSize(){
        List<String> lis = new ArrayList(10);
        System.out.println(lis.size());//0
    }
}
