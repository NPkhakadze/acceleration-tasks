import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MyStructure {
    // ArrayList for storing elements and HashMap which keeps element and its position
    private static ArrayList<Integer> myArr;
    private static HashMap<Integer,Integer> indices;

    public static ArrayList<Integer> getMyArr() {
        return myArr;
    }

    public MyStructure() {
        myArr = new ArrayList<Integer>();
        indices = new HashMap<Integer,Integer>();
    }

    public static void insert(int element) {
        if(!indices.containsKey(element)) {
            int length = myArr.size();
            myArr.add(element);
            indices.put(element,length);
        }
    }

    public static void remove(int element) {
        Integer position = indices.get(element);
        indices.remove(element);

        Integer lastElement = myArr.get(myArr.size()-1);
        Collections.swap(myArr,position,myArr.size()-1);
        myArr.remove(myArr.size()-1);
        indices.put(lastElement,position);
    }

}



