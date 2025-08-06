package step_1.collections_03.collection_framework.collection_interface.set.enum_set;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        enum Color {
            RED, GREEN, BLUE
        }

        EnumSet<Color> colors = EnumSet.of(Color.RED, Color.GREEN);
        System.out.println(colors); // [RED, GREEN]

    }
}
