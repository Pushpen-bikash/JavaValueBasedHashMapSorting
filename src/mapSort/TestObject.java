package mapSort;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//public class TestObject implements Comparable {
public class TestObject {
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDrawingNum() {
        return drawingNum;
    }

    public void setDrawingNum(String drawingNum) {
        this.drawingNum = drawingNum;
    }

    private String position;
    private String itemName;
    private String drawingNum;

    public TestObject(String position, String itemName, String drawingNum){
        this.position = position;
        this.itemName = itemName;
        this.drawingNum = drawingNum;
    }

//    @Override
//    public int compareTo(Object obj) {
//        return this.position.compareTo(((TestObject)obj).position);
//    }

    @Override
    public String toString() {
        return "[ position=" + position + ", itemName=" + itemName + ", drawingNum=" + drawingNum + "]";
    }

    public static LinkedHashMap<Integer, TestObject> getSortedTestObjectBasedOnPosition(Map<Integer, TestObject> testObjectMap){
        ValueComparator valueComparator =  new ValueComparator(testObjectMap);
        TreeMap<Integer, TestObject> sortedTestObject  = new TreeMap<Integer, TestObject>(valueComparator);
        sortedTestObject.putAll(testObjectMap);
        return new LinkedHashMap<Integer, TestObject>(sortedTestObject);
    }

    public static HashMap<Integer, TestObject> getTestObjectMap(){
        HashMap<Integer, TestObject> testObjectMap = new HashMap<>();
        testObjectMap.put(2, new TestObject("2", "test2", "drawing2"));
        testObjectMap.put(1, new TestObject("1", "test1", "drawing1"));
        testObjectMap.put(0, new TestObject("0", "test0", "drawing0"));
        testObjectMap.put(3, new TestObject("3", "test3", "drawing3"));
        testObjectMap.put(4, new TestObject("", "testEm", "drawingEm"));
        return testObjectMap;
    }
}
