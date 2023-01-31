import java.util.*;

public class arraylist_methods {
    public static void main(String[] args) {
        ArrayList<Integer> ob1 = new ArrayList<>();
        // ArrayList<Integer> ob2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int r, i;
        int arr[] = new int[10];
        System.out.println("Enter the range: ");
        System.out.print("=> ");
        r = sc.nextInt();
        // object of arraylist
        for (i = 0; i < r; i++) {
            System.out.printf("Element %d: ", i + 1);
            ob1.add(i, sc.nextInt()); // adds element in the specified position
        }
        ob1.add(20); // appends(adds in last) element
        ob1.add(1, 70);
        System.out.println("\n[The Elements are....]");
        for (i = 0; i < ob1.size(); i++) { // size of the list
            System.out.printf("Element %d: %d\n", i + 1, ob1.get(i)); // returns element in specified index
        }
        System.out.println(ob1.indexOf(70)); // returns the index of the specified element
        System.out.println(ob1.clone()); // clones the list
        ob1.clear(); // Clears the list of all elements
        System.out.println(ob1.isEmpty()); // checks whether the list is empty or not
    }
}