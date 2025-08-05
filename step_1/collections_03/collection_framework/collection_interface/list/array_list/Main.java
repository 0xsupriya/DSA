package step_1.collections_03.collection_framework.collection_interface.list.array_list;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // made a arrayList
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Supriya");
        arrayList.add("Arijit");

        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.contains("supriya"));

        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
