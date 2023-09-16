package exercise;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public class App {
    public static List findWhere(List<Map<String, String>> books, Map<String, String> where) {

        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> book : books) {
            if (isFind(book, where)) {
                result.add(book);
            }
        }

        return result;
    }

    private static boolean isFind(Map<String, String> book, Map<String, String> where) {
        for (Map.Entry<String, String> whereEntry : where.entrySet()) {
            if (!book.getOrDefault(whereEntry.getKey(), "").equals(whereEntry.getValue())) {
                return false;
            }
        }
        return true;
    }
}
//END
