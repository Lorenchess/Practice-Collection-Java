package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        Collections.addAll(collection, "a", "b", "c"); //adding multiple items at once

        String[] colArr = collection.toArray(new String[0]); //automatically creates the array with the necessary capacity

        for (var curr : colArr) {
            System.out.println(curr);
        }

        String str = collection.toString();
        System.out.println(str);

        /**
         * Collection<String> other = new ArrayList<>();
         *  other.addAll(collection);
         *
         */

        Collection<String> other = new ArrayList<>(collection);

        System.out.println(other == collection); //false since we have two new ArrayList objects located in memory their reference point to dif obj

        System.out.println(other.equals(collection)); //

    }
}
