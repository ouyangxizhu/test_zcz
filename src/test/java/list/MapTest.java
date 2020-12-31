package list;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    @Test
    public void testEmptyMap(){
        Map<Object, Object> hashMap = new HashMap();
        for (Map.Entry<Object, Object> objectObjectEntry : hashMap.entrySet()) {
            System.out.println(objectObjectEntry.getKey());
        }
    }
}
