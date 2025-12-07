// package arraylist;

import java.util.*;

public class ContainerWithMostWater {

    public static int containerwater(ArrayList<Integer> list) {

        int maxContainer = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int area = height * width;
                maxContainer = Math.max(maxContainer, area);
            }
        }

        return maxContainer;
    }

    public static int containerwater1(ArrayList<Integer> list) {
        int maxContainer = Integer.MIN_VALUE;

        int lp = 0;
        int rp = list.size()-1;

        while (lp < rp) {
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;
            int area = height * width;
            maxContainer = Math.max(maxContainer, area);

            if (list.get(lp) < list.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxContainer;

    }

    public static void main(String args[]) {
        System.out.println("Hello");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(7);
        list.add(2);

        System.out.println(list);
        System.out.println(containerwater1(list));

    }
}
