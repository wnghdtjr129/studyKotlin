package ch06;

import java.util.List;

public class CollectionUtils {
    public static List<String> uppercaseAll(List<String> items) {
        int index = 0;
        for (String item : items) {
            items.set(index++, item.toUpperCase());
        }

        items.set(0, null);
        return items;
    }
}
