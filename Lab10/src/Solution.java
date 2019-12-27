import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution<K, V, T> {
    public ArrayList<T> newArrayList(ArrayList<T> arrayList) {
        ArrayList<T> myArr = new ArrayList<T>(arrayList);
        System.out.println(myArr.size() + " items were added to ArrayList");
        return myArr;
    }

    public HashSet<T> newHashSet(HashSet<T> hashSet) {
        HashSet<T> myHashSet = new HashSet<>(hashSet);
        System.out.println(myHashSet.size() + " items were added to HashSet");
        return myHashSet;
    }

    public HashMap<K, V> newHashMap(HashMap<K, V> hashMap) {
        HashMap<K, V> myHashMap = new HashMap<>(hashMap);
        myHashMap.put(123, "va;ue");
        myHashMap.get(123);
        System.out.println(myHashMap.size() + " items were added to HashMap");
        return hashMap;
    }
}

class Task3 {
    public static void main(String[] args) {
        Solution<String, Integer, Integer> solution = new Solution<>();
        ArrayList<Integer> arrayList = new ArrayList<> ();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        ArrayList<Integer> array = solution.newArrayList(arrayList);
        System.out.println("ArrayList: ");

        for (Object item : array)
            System.out.print(item + " ");

        System.out.println();

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        HashSet<Integer> newHashSet = solution.newHashSet(hashSet);
        System.out.println("HashSet: ");

        for (Object item : newHashSet) {
            System.out.print(item + " ");
        }

        System.out.println();

        HashMap<String, Integer> newHashMap = new HashMap<>();
        newHashMap.put("One", 1);
        newHashMap.put("Two", 2);
        newHashMap.put("Three", 3);

        System.out.println("HashMap: ");
        HashMap<String, Integer> hashMapTest = solution.newHashMap(newHashMap);
        for (String item : hashMapTest.keySet()) {
            String key = item;
            int value = hashMapTest.get(item);
            System.out.println(key + " " + value);
        }
    }
}
