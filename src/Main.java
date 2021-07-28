import mapSort.TestObject;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, TestObject> testObjectMap = TestObject.getTestObjectMap();

        LinkedHashMap<Integer, TestObject> sortedTestObject = TestObject.getSortedTestObjectBasedOnPosition(testObjectMap);

        for (Iterator iterator = sortedTestObject.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry entry = (Map.Entry) iterator.next();
            TestObject bean = (TestObject) entry.getValue();
            System.out.println(bean);
        }
    }
}
