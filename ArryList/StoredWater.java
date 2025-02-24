import java.util.ArrayList;

public class StoredWater {

    // 2 pointer approach
    public static int sotredwater1(ArrayList<Integer> height) {
        int MaxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            MaxWater = Math.max(MaxWater, currWater);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;

            }
        }
        return MaxWater;

    }

    // Bruteforce Approch
    public static int sotredwater(ArrayList<Integer> height) {
        int maxWater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = 0; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int cirrWater = ht * width;
                maxWater = Math.max(maxWater, cirrWater);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(sotredwater(height));
        System.out.println();
        System.out.println(sotredwater1(height));

    }
}
