import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        //Creating Arraylist to cotain different objects
        ArrayList obj = new ArrayList();
        //adding different objects in the arraylist
        obj.add("Avanish");
        obj.add(2);
        System.out.println(obj);
        //Creating Arraylist to cotain only String objects
        ArrayList<String> str;
        str = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            str.add(Integer.toString(i));

        }
        // System.out.println("str = "+str);
        str.add(1, "hello");
        System.out.println("str = " + str);
        // Converting str to Array and storing them to an Object array
        Object[] str1 = str.toArray();
        System.out.println(Arrays.toString(str1));
        //An Iterator works like a for loop
        Iterator itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ArrayList newlist = new ArrayList();
        //Adding all objects from str to newlist
        newlist.addAll(str);
        // newlist.set(3,"Avanish");
        System.out.println(newlist.toString());
        newlist.add(3, "avanish");
        System.out.println("newlist = " + newlist);
        //containsAll() works only with collections
        if (newlist.containsAll(str)) {
            System.out.println("voila!");
        }
        //contains() works only with collection elements
        if (newlist.contains("hello")) {
            System.out.println("voila!");
        }
        str.clear();
        newlist.clear();
        System.out.println("str = " + str);
        System.out.println("newlist = " + newlist);

        ArrayList<Integer> integ;
        integ = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integ.add(i);

        }
        Iterator itr1 = integ.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }


}
