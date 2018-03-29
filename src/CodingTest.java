
import java.util.*;

public class CodingTest {

    public static void main(String[] args) {
        // Used two simple Lists to store these numbers
        List<Integer> list = Arrays.asList(8, 5, 6, 4, 3, 1, 2, 7, 9, 10);
        List<Integer> list_two = Arrays.asList(9, 13, 8, 6, 14, 11, 12, 7, 10, 15);

        System.out.println("\n########## Problem two answers ##########\n");
        System.out.println("1 - 10 list: " + Arrays.toString(list.toArray()));
        System.out.println("6 - 15 list: " + Arrays.toString(list_two.toArray()));

        // Remove duplicates and sort using a Set which does this for you
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        set.addAll(list_two);

        // Back to a list because its easier to work with
        List<Integer> newList = new ArrayList<Integer>(set);

        // Remove middle element, only works for odds
        newList.remove((newList.size() / 2));

        // Print in reverse order and print the size
        Collections.reverse(newList);
        System.out.println();
        System.out.println("Reverse order: " + Arrays.toString(newList.toArray()));
        System.out.println("Size is: " + newList.size());


        // Used a map here to store key/value pairs. It also ignores duplicate keys
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(5, 50);
        map.put(5, 50);

        System.out.println();
        System.out.println("Key/value paris: " + Arrays.asList(map));
        System.out.println("Size: " + map.size());


        System.out.println();
        System.out.println("########## Problem three ##########");

        // This would work for any 'n' number of times. Just need to change the n value.
        int n = 5;

        int currentNumber = 1;
        int numberOfDots = n - 1;
        char ch = '0';

        for (int i = 1; i <= n; i++) {
            String str = "";

            char[] nums = new char[currentNumber++];
            Arrays.fill(nums, ch += 1);
            char[] dots = new char[numberOfDots--];
            Arrays.fill(dots, '.');

            str += new String(dots);
            str += new String(nums);
            System.out.println(str);
        }

    }
}

