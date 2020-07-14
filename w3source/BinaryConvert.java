package w3source;

import java.util.Scanner;

public class BinaryConvert {

    public static void main(String[] args) {

        // sum of binary numbers
//        int i=0;
//        int carry = 0;
//        int [] finalSumOutput = new int[10];
//        Scanner s = new Scanner(System.in);
//        System.out.println("enter first input:");
//        long n1= s.nextLong();
//        System.out.println("enter second input:");
//        long n2= s.nextLong();
//
//        while (n1 != 0 || n2 != 0) {
//            finalSumOutput[i++] = (int) (carry + (n1 % 10 + n2 % 10) % 2);
//            carry = (int) ((n1 % 10 + n2 % 10 + carry) / 2);
//            n1 = n1 / 10;
//            n2 = n2 / 10;
//        }
//        if (carry != 0) {
//            finalSumOutput[i++] = carry;
//        }
//        i--;
//        System.out.println("output:");
//        while (i >= 0) {
//            System.out.print(finalSumOutput[i--]);
//        }
//        int a = 123_456_78;
//        System.out.println();
//        System.out.println(a);

        //multiply of tow binary number
        long binary1, binary2, multiply = 0;
        int digit, factor = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("first binary number: ");
        binary1 = scanner.nextLong();
        System.out.println("second binary number: ");
        binary2 = scanner.nextLong();

        while (binary2 != 0) {
            digit = (int) (binary2 % 10);
            if (digit == 1) {
                binary1 = binary1 * factor;
                multiply = binaryproduct((int) binary1, (int) multiply);
            } else {
                binary1 = binary1 * factor;
            }
            binary2 = binary2 / 10;
            factor = 10;
        }

        //convert decimal to binary
//        long decimal = 0;
//        int i = 1, j;
//        int [] binary = new int[100];
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter decimal number: ");
//        decimal = scanner.nextLong();
//        //decimal = decimal/2;
//        while (decimal != 0){
//            binary[i++] = (int) (decimal%2);
//            decimal = decimal/2;
//        }
//        for (j = i-1; j>0; j--){
//            System.out.print(binary[j]);
//        }

        //convert binary to decimal
//        long binary = 0 , decimal = 0;
//        int j = 1 , remainder;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter binary number: ");
//        binary = scanner.nextLong();
//        while (binary != 0){
//            remainder = (int) (binary%10);
//            decimal = decimal + remainder * j;
//            binary = binary/10;
//            j = j*2;
//        }
//        System.out.println(decimal);

        //check whether java is installed in your computer
//        System.out.println("java version:" + System.getProperty("java.version"));
//        System.out.println("java runtime version: " + System.getProperty("java.runtime.version"));
//        System.out.println("java home: " + System.getProperty("java.home"));
//        System.out.println("java vendor: " + System.getProperty("java.vendor"));
//        System.out.println("java vendor url: " + System.getProperty("java.vendor.url"));
//        System.out.println("java class path: " + System.getProperty("java.class.path"));

        //sum of digits of an integer
//        int number = 0 , sum =0;
//        System.out.println("enter number: ");
//        Scanner scanner = new Scanner(System.in);
//        number = scanner.nextInt();
//        while (number != 0){
//            sum = sum + (number%10);
//            number = number/10;
//        }
//        System.out.println(sum);

        //find the number of bits required to flip to convert two given integers
//        System.out.println(bitSwapRequired(27 , 23));

    }// end psvm


        static int binaryproduct(int binary1, int binary2)
        {
            int i = 0, remainder = 0;
            int[] sum = new int[20];
            int binary_prod_result = 0;

            while (binary1 != 0 || binary2 != 0)
            {
                sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
                remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
                binary1 = binary1 / 10;
                binary2 = binary2 / 10;
            }
            if (remainder != 0)
            {
                sum[i++] = remainder;
            }
            --i;
            while (i >= 0)
            {
                binary_prod_result = binary_prod_result * 10 + sum[i--];
            }
            return binary_prod_result;
        }

    public static int bitSwapRequired(int x, int y) {
        int ctr = 0;
        for (int z = x ^ y; z != 0; z = z >>> 1) {
            ctr += z & 1;
        }
        return ctr;
    }
}
