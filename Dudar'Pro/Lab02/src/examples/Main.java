package examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Float> digits = new ArrayList<>(4);
        digits.add(1.1f);
        digits.add(2.2f);
        digits.add(3.3f);
        digits.add(4.4f);

        for (Float x : digits) {
            System.out.println(x);
        }
        System.out.println("");

        ArrayList<Float> digits2 = (ArrayList<Float>) digits.clone();
        digits2.remove(digits2.size() - 2);
        digits2.set(1, 5.2f);
        digits2.set(0, 3.55f);

        for (Float x : digits2) {
            System.out.println(x);
        }

        /*ArrayList<Float> example = new ArrayList<>(4);
        example.add(1.1f);
        example.add(2.2f);
        example.add(3.3f);
        example.add(4.4f);

        for(Float x : example){
            System.out.println(x);
        }

        LinkedList<Boolean> example2 = new LinkedList<>();
        example2.add(true);
        example2.add(false);
        example2.add(true);
        example2.add(false);

        int i = 0;
        while (i < example2.size()) {
            System.out.println(example2.get(i));
            i++;
        }*/

//        int[] some = new int[4];
//
//        ArrayList<Integer> some_dyn = new ArrayList<>(5);
//        some_dyn.add(56);
//        some_dyn.add(6);
//        some_dyn.add(5);
//        some_dyn.add(7);
//        some_dyn.add(435);
//        some_dyn.add(8);
//
//        //some_dyn.clear();
//        some_dyn.remove(1);
//
//        for(Integer x : some_dyn) {
//            System.out.println(x);
//        }
//
//        LinkedList<String> names = new LinkedList<>();
//        names.add("Tom");
//        names.add("George");
//        names.add("Bill");
//        names.add("Jon");
//
//        names.add(1, "Alex");
//
//        //some_dyn.clear();
//        //some_dyn.remove(1);
//
//        for(String x : names) {
//            System.out.println(x);
//        }
    }
}
