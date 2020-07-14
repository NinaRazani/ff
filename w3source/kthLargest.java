package w3source;

import java.util.*;

public class kthLargest {

    public static void main(String[] args) {

//        PriorityQueue<Integer> pQueue =
//                new PriorityQueue<Integer>(Collections.reverseOrder());

        // Adding items to the pQueue using add()
//        pQueue.add(1);
//        pQueue.add(4);
//        pQueue.add(17);
//        pQueue.add(7);
//        pQueue.add(25);
//        pQueue.add(3);
//        pQueue.add(100);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("which k is your desired:");
//        int k = scanner.nextInt();
//
//        for (int i = 0 ; i < k-1 ; i++){
//            pQueue.remove();
//        }
//        System.out.println(pQueue.peek());
//
//        Iterator itr = pQueue.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        //another solution

        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        int k = 3;
        System.out.println("Original Array: ");
        Arrays.sort(arr , Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        System.out.println(k +" largest elements of the said array are:");
        Arrays.sort(arr, Collections.reverseOrder()); // sort the array ascending instead of descending
        System.out.println(arr[k-1]);
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");


    }



}
