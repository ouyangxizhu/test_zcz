package list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListTest {
    @Test
    public void testSize(){
        List<String> lis = new ArrayList(10);
        System.out.println(lis.size());//0
    }

    @Test
    public void testCopy(){
        List<Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        printList(list);
        List<Integer> list1 = new ArrayList<>(list);
        list.remove(9);
        printList(list);
        printList(list1);
    }

    @Test
    public void testListImmutable() {
        final List strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("world");
        Collections.unmodifiableList(Stream.of("hello", "world").collect(Collectors.toList()));
//        List unmodifiableStrList = Lists.of("hello", "world");
//        unmodifiableStrList.add("again");
    }

    public static void printList(List<Integer> list) {
        System.out.println(list.parallelStream().map(integer -> String.valueOf(integer)).collect(Collectors.joining(",")));
    }

}
