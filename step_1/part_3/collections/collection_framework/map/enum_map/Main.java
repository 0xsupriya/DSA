package step_1.part_3.collections.collection_framework.map.enum_map;

import java.util.*;

enum Day {
    MON, TUE, WED, THU, FRI
}

public class Main {
    public static void main(String[] args) {
        EnumMap<Day, String> map = new EnumMap<>(Day.class);

        map.put(Day.MON, "Monday");
        map.put(Day.TUE, "Tuesday");
        map.put(Day.WED, "Wednesday");

        System.out.println("Value for TUE: " + map.get(Day.TUE));
        System.out.println("Contains key FRI: " + map.containsKey(Day.FRI));

        System.out.println("All entries:");
        for (Map.Entry<Day, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
