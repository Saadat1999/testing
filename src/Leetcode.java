import java.util.ArrayList;
import java.util.List;

public class Leetcode {
    public static void main(String[] args) { // Selection sort O(n^2);
        sieve(10);

    }

    public static int[] sieve(int n) {
        // code here
        boolean[] arr = new boolean[n+1];

        for(int i=2; i<arr.length; i++) {
            arr[i] = true;
        }
         // 2 3 4 5 6 7

        return findPrime(arr);

    }

    static int[] findPrime(boolean[] arr ) {
        for(int i=2; i<arr.length; i++) {
            int index = i;
            int times = 2;
            if(arr[index]) {
                while(index*times<arr.length) {
                    arr[index*times] = false;
                    times++;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i]) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(Integer :: intValue).toArray();
    }

}
