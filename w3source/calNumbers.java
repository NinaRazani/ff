package w3source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.LinkedList;

public class calNumbers {

    public static void main(String[] args) {

        // decide whether a number is even or not
//        int n =0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter number:" );
//        n = scanner.nextInt();
//        if (n %2 == 0)
//            System.out.println("1");
//        else
//            System.out.println("0");

        // decide the sum of tow number is equals to third number or not
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter three number: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        System.out.println( decide(a,b,c));

        //calculate the sum of digits of a number and write the number in english
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            int sum = 0;
//            String str = br.readLine();
//            char[] numStr = str.toCharArray();
//            for (int i = 0; i < numStr.length; i ++) {
//                sum += numStr[i] - '0'; //********
//            }
//            System.out.println("Original Number: "+str);
//            print_number(sum);
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        //arrang odd numbers before even numbers in an array
//        int j = 0;
//        int[] arrays = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
//        int[] arrangarr = new int[10];
//        for (int n:arrays
//             ) {
//            if (n % 2 != 0) {
//                arrangarr[j] = n;
//                j++;
//            }
//        }
//        for (int n:arrays
//        ) {
//            if (n % 2 == 0) {
//                arrangarr[j] = n;
//                j++;
//            }
//        }
//        for (int n: arrangarr
//             ) {
//            System.out.print(n + ",");
//        }

        //left-shift an array
//        int[] a = {4,7,2,0,3,5,17,32,25,98};
//        int temp;
//        int h = a[0];
//        for (int i = 1 ; i<a.length ; i++){
//            a[i-1] = a[i];
//        }
//        a[a.length-1] = h;
//        for (int n: a
//             ) {
//            System.out.print(n+ " ");
//        }

        //merge two sorted array
//        int[] x = {3, 7, 8, 11, 14, 15};
//        int[] y = {2, 5, 6, 9, 12};
//        int[] merge = new int[x.length + y.length];
//        int i = 0, j = 0, h = 0;
//        while (i < x.length && j < y.length) {
//            if (x[i] < y[j]) {
//                merge[h] = x[i];
//                h++;
//                i++;
//            } else {
//                merge[h] = y[j];
//                h++;
//                j++;
//            }
//        }
//        while (j < y.length) {
//            merge[h] = y[j];
//            h++;
//            j++;
//        }
//        while (i < x.length) {
//            merge[h] = x[i];
//            h++;
//            i++;
//        }
//        System.out.println(Arrays.toString(merge));

        //checking if a number is palindrome or not
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter number: ");
//        long num = scanner.nextLong();
//        String str = String.valueOf(num);
//        char[] chrnum = str.toCharArray();
//        int i = 0; boolean flag = false;
//        while (i != chrnum.length/2){
//            if (chrnum[i] == chrnum[chrnum.length-i-1]){
//                i++;
//                flag = true;
//            }
//            else{
//             flag = false;
//             break;
//            }
//        }
//        System.out.println(flag);

        //find a contiguous subarray with largest sum
//        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        System.out.print(max_SubArray(nums));

        //subarray with smallest sum
//        ArrayList<Integer> nums = new ArrayList<Integer>();
//        nums.add(-2);
//        nums.add(1);
//        nums.add(-3);
//        nums.add(4);
//        System.out.println(min_SubArray(nums));

        //
//        int[] arr = {1,2,4,5,6};
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int index=0;
//        for (int i=1 ; i<arr.length ; i++){
//            if (arr[i] == a) {
//                index = i;
//                break;
//            }
//            else if (arr[i] > a) {
//                index = i - 1;
//                break;
//            }
//            else if (i == arr.length-1) {
//                index =i+1;
//            }
//        }
//        System.out.println(index);

        // calculate the median of an unsorted array **** using Queue ****
//        int[] nums = {10,2,38,23,38,23,21};
//        System.out.println(Arrays.toString(nums));
//        int n = nums.length;
//        if (n < 1){
//            System.out.println("false");
//        }
//        Queue<Integer> min = new PriorityQueue<Integer>(n); // Queue is an interface so we must call a class
//        // that implement this interface such as PriorityQueue
//        for (int num: nums
//             ) {
//            min.add(num); //create a min heap
//        }
//        // check if n is odd or even
//        if ((n & 1) == 0){  // odd : divide by 2 and minute from 1
//            n >>= 1;
//            n -= 1;
//        }
//        else {  // even : divide by 2
//            n >>= 1;
//        }
//        int i = 0;
//        while (i < n) {
//            min.remove(); // remove operator in min heap
//            i++;
//        }
//        System.out.print(min.remove());

        // check which number in an array occurs only once
//        int nums[] = {10, 20, 10, 20, 30, 40, 40, 30, 50};
//        int result;
//        System.out.println("Source Array : "+Arrays.toString(nums));
//        result = getSingleNumber(nums);
//        System.out.println("\n"+result+" appears only once.");

        //remove duplicates then return length of array
//        int nums[] = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7 ,7};
//        System.out.println("array:" + Arrays.toString(nums));
//        System.out.println("length before deleting duplicates:" + nums.length);
//        System.out.println("length after deleting duplicates: " + removeDuplicates(nums));

        //min path sum in a two dimension array
//        int[][] grid = new int[][] {{7,4,2},
//                                    {0,5,6},
//                                    {3,1,2}};
//
//            System.out.println("Sum of all numbers along its path: "+minPathSum(grid));

        //get the index of the first and the last number of a subarray where the sum of numbers is zero
//        int[] nums = {4, 7 , 1 , 2 , 3, -6 , 5 ,4};
//        System.out.println("origimal array:" + Arrays.toString(nums));
//        System.out.println("indexes of subarray : " + subArraySum(nums));

        // remove specified element and return new length
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter specified number: ");
//        int value = scanner.nextInt();
//        int[] S = {1,3,5,6,7,9,6};
//        int j = 0;
//        for (int i = 0 ; i<S.length ; i++){
//            if (S[i] != value){
//                S[i] = S[i];
//                j++;
//            }
//        }
//        System.out.println(j);

        //remove nth element from end  -----> another and better solution in solution class
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter specified number: ");
//        int n = scanner.nextInt();
//        int k = 0;
//        int[] S = {1,3,5,6,7,9,6};
//        for (int i = S.length-1 ; i>0 ; i--){
//            if (i != S.length-n){
//                S[i] = S[i];
//            }
//            else {
//                k = i;
//                }
//            }
//        for (int h = k ; h<S.length-1 ; h++){
//            S[h] =S[h+1];
//        }
//        for (int l = 0 ; l<S.length-1 ; l++){
//            System.out.print(S[l] + " ");
//        }

        // calculate the gcd of two number
//        calNumbers call = new calNumbers();
//        System.out.println("the gcd of numbers : " + call.euclid(48 , 24)); // if we define the method non-static
        System.out.println("the gcd of numbers : " + euclid(125463 , 9658));


    }//End of psvm

    public static void print_number(int n) {
        int x;
        int y;
        int z;
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println("Sum of the digits of the said number: " + n);
        if (n < 10) {
            System.out.println(number[n]);
        } else if (n < 100) {
            x = n / 10;
            y = n - x * 10;
            System.out.println("In English: " + number[x] + " " + number[y]);
        } else {
            x = n / 100;
            y = (n - x * 100) / 10;
            z = n - x * 100 - y * 10;
            System.out.println("In English: " + number[x] + " " + number[y] + " " + number[z]);
        }
    }

    public static boolean decide(int a, int b, int c) {
        if (a + b == c)
            return true;
        else
            return false;
    }

    public static int max_SubArray(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int max = nums[0];
        int max_Begin = 0;
        int max_End = 0;
        int begin = 0;
        int end = 0;
        int sum = 0;
        while (end < nums.length) {
            sum += nums[end];
            if (sum < 0) {
                sum = 0;
                begin = end + 1;
            } else {
                if (sum > max) {
                    max = sum;
                    max_Begin = begin;
                    max_End = end;
                }
            }
            end++;
        }
        return max;
    }

    public static int min_SubArray(ArrayList<Integer> nums) {
        int[] nums1 = new int[nums.size()];
        nums1[0] = nums.get(0);
        int min = nums1[0];
        for (int i = 1; i < nums.size(); ++i) {
            nums1[i] = Math.min(nums.get(i), nums.get(i) + nums1[i - 1]);
            min = Math.min(min, nums1[i]);
        }
        return min;
    }

    public static int getSingleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i]; //exclusive OR
        }
        return result;
    }

    static int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length <= 1) {
            return nums.length;
        }
        int current_pos = 0;
        int moving_pos;
        for (moving_pos = 1; moving_pos < nums.length; moving_pos++) {
            if (nums[current_pos] != nums[moving_pos]) {
                nums[current_pos + 1] = nums[moving_pos];
                current_pos++;
            }
        }
        return current_pos + 1;
    }

    public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] temp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    temp[i][j] = grid[i][j];
                    continue;
                }
                // Compute temp
                int from_up = i == 0 ? Integer.MAX_VALUE : temp[i - 1][j];
                int from_left = j == 0 ? Integer.MAX_VALUE : temp[i][j - 1];
                temp[i][j] = Math.min(from_up, from_left) + grid[i][j];
            }
        }
        return temp[m - 1][n - 1];
    }

    public static List<Integer> subArraySum(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        if (nums == null || nums.length == 0)  //nums == null : is initially null , nums.length == 0 :
        // became empty
        {
            return temp;
        }
        int presum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(presum, -1);
        for (int i = 0; i < nums.length; i++) {
            presum += nums[i];
            if (map.containsKey(presum)) {
                temp.add(map.get(presum) + 1);
                temp.add(i);
                return temp;
            }
            map.put(presum, i);
        }
        return temp;
    }

    public static int euclid(int x , int y){

        if (x == 0 || y == 0) {
            return 1;
        }
        if (x < y) {
            int t = x;
            x = y;
            y = t;
        }
        if (x % y == 0) {
            return y;
        } else {
            return euclid(y, x % y);
        }
    }

}