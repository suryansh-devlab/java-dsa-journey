package code.array;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(7);
        list.add(17);
        list.add(27);
        list.add(37);
        list.add(47);
        list.add(57);
        list.add(67);
        list.add(77);
        list.add(87);
        list.add(97);
        list.add(7);
        list.add(17);
        list.add(27);
        list.add(37);
        list.add(47);

        System.out.println(list);
        list.set(0, 1);
        System.out.println(list);
        System.out.println(list.contains(88));
        list.remove(1);
        System.out.println(list);
    }
}