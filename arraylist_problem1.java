//wap to remove duplicates from arraylist and sort it

import java.util.*;

public class arraylist_problem1 {
    public static void main(String[] args) {
        List<Integer> ob = new ArrayList<>();
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int r = sc.nextInt();
        System.out.printf("Enter your %d elements: \n", r);
        for (i = 0; i < r; i++) {
            System.out.print("=> ");
            int n = sc.nextInt();
            if (!ob.contains(n)) {
                ob.add(n);
            }
        }
        Collections.sort(ob);
        System.out.println(ob);

    }
}

// another approach

/*
 * for (i = 0; i < r; i++) {
 * ob.add(i, sc.nextInt());
 * }
 * Collections.sort(ob);
 * i = 1;
 * while (i < ob.size()) {
 * if (ob.get(i) == ob.get(i - 1)) {
 * ob.remove(i);
 * } else {
 * i++;
 * }
 * }
 */
