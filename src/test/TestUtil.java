package test;

import org.junit.Test;

import mapSort.TestObject;

import java.util.*;

public class TestUtil {

    @Test
    public void MapSortTest() {
        Map<Integer, TestObject> testObjectMap = TestObject.getTestObjectMap();

        LinkedHashMap<Integer, TestObject> sortedTestObject = TestObject.getSortedTestObjectBasedOnPosition(testObjectMap);

        for (Iterator iterator = sortedTestObject.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry entry = (Map.Entry) iterator.next();
            TestObject bean = (TestObject) entry.getValue();
            System.out.println(bean);
        }
    }

}
