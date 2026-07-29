package coding;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        System.out.println(task18(6));
    }

    //Write a Java Program to reverse a string without using String inbuilt function.
    public static void task1() {
        String word = "java backend";

        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }

        System.out.println(sb);
    }

    //Write a Java Program to swap two numbers without using the third variable.
    static void task2() {
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    //Write a Java Program to count the number of words in a string using HashMap.
    static void task3() {
        String sentence = "This is a long sentence";

        Map<String, Integer> countOfWords = new HashMap<>();
        String[] s = sentence.split(" ");
        for (String word : s) {
            countOfWords.put(word, countOfWords.getOrDefault(word, 0) + 1);
        }

        System.out.println(countOfWords);
    }

    //Write a Java Program to iterate HashMap using While and advance for loop.
    static void task4() {
        String sentence = "This is a long sentence";

        Map<String, Integer> countOfWords = new HashMap<>();
        String[] s = sentence.split(" ");
        for (String word : s) {
            countOfWords.put(word, countOfWords.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countOfWords.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("=========================");

        Iterator<Map.Entry<String, Integer>> entryIterator = countOfWords.entrySet().iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> next = entryIterator.next();
            System.out.println(next.getKey() + " " + next.getValue());
        }
    }

    //Write a Java Program to find whether a number is prime or not in the most efficient way?
    static boolean task5() {
        int n = new Scanner(System.in).nextInt();
        if (n == 1) {
            return false;
        } else if (n > 0 && n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            System.out.println(n + " is not a prime number");
            return false;
        }

        for (int i = 5; i * i < n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                System.out.println(n + " is not a prime number");
                return false;
            }

        }
        System.out.println(n + " is a prime number");
        return true;
    }

    //Write a Java Program to find whether a string or number is palindrome or not
    static void task6() {
        String word = new Scanner(System.in).nextLine();

        int start=0, end=word.length()-1;
        while(start<end) {
            if(word.charAt(start)!=word.charAt(end)) {
                System.out.println(word+" is not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println(word+" is a palindrome");
    }

    //Write a Java Program for the Fibonacci series in recursion.
    static int task7(int n) {
        if(n<=1) return n;

        return task7(n-1) + task7(n-2);
    }

    //Write a Java Program to iterate ArrayList using for-loop, while-loop,and advance for-loop.
    static void task8() {
        List<Integer> list = List.of(1,2,3,4,5);
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("==============");

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
        System.out.println("==============");
        for(int i : list) {
            System.out.println(i);
        }
    }

    //Write a Java Program to find the duplicate characters in a string.
    static void task9(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()>1) {
                System.out.println("Duplicate found " + entry.getKey());
                return;
            }
        }
    }

    //Write a Java Program to find the second-highest number in an array.
    static void task10(int[] arr) {
        int highest=Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for(int i : arr) {
            if(i>highest) {
                second=highest;
                highest=i;
            } else if(i>second && i!=highest) {
                second=i;
            }
        }

        System.out.println(second);
    }

    //Write a Java Program to check Armstrong number.
    static void task11(int number) {
        int digits = String.valueOf(number).length();
        int digit = number;
        int armstrong = 0;
        while(digit>0) {
            int rem = digit%10;
            armstrong+= (int) Math.pow(rem, digits);
            digit/=10;
        }

        System.out.println(armstrong==number);
    }

    //Write a Java Program to remove all white spaces from a string without using replace()
    static void task12(String word) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            if(c!=' ') {
                sb.append(c);
            }
        }

        System.out.println(sb);
    }

    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
    static int[] task13(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            int num = arr[i];
            int rem = target-num;
            if(map.containsKey(rem)) {
                return new int[] {i, map.get(rem)};
            }
            map.put(num, i);
        }

        throw new RuntimeException("no such pair");
    }

    //Write a program that accepts comma-separated strings, sorts the
    //strings in ascending order, and outputs the concatenated string of sorted strings.
    static void task14(String sentence) {
        String[] split = sentence.split(",");
        Arrays.sort(split);
        String join = String.join(" ", split);
        System.out.println(join);
    }

    public static boolean task15() {
        String word = "luck";
        String p = "u*";


        String[] split = p.split("\\*");
        if(word.contains(split[0])) {
            return word.contains(split[1]);
        }
            return false;
    }

    public static String task16(String input) {
        String[] split = input.split(",");
        Arrays.sort(split);
        String join = String.join("", split);

        return join;
    }

    public void task17(List<Integer> list) {
        for(int i=0; i<list.size(); i++) {

        }

        for(int i : list) {

        }

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            int i = iterator.next();
        }
        int i = 0;
        while(i<list.size()) {

        }
    }

    public static int task18(int n) {
        if(n<=1) return n;

        return task18(n-1) + task18(n-2);
    }
}
