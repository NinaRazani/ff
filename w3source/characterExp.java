package w3source;

import java.io.Console;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;

public class characterExp {

    public static void main(String[] args) {
        //reverse a string
//        System.out.println(" Input string: ");
//        Scanner scanner = new Scanner(System.in);
//        char [] letters = scanner.nextLine().toCharArray();//toCharArray : convert a given string into a sequence of characteres
//        System.out.println("reverse string:");
//        for (int i= letters.length-1 ; i>=0 ; i--){
//            System.out.print(letters[i]);
//        }
        //count the number of digits, letters, space in a string
//        String string;
//        Scanner scanner = new Scanner(System.in);
//        string = scanner.nextLine();
//        count(string);

        //list of available characters
//        System.out.println("list of available characters: ");
//        for (String str: Charset.availableCharsets().keySet()
//             ) {
//            System.out.println(str);
//        }

        // assci value of a given character
//        int chr = 'Z';
//        System.out.println(chr);

        // print in a special format
//        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);

//        int n;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input number: ");
//        n = in .nextInt();
//        return size of a file
//        System.out.println("F/nina.txt :" + new File("nina.txt").length() + "bytes");
//
//        return date and time
//        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());

        //uppercase every first word in a string
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("input a string: ");
//        String str = scanner.nextLine();
//        String upper_case_line = "";
//        Scanner line_scan = new Scanner(str);
//        while (line_scan.hasNext()){
//            String word = line_scan.next();
//            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
//        }
//        System.out.println(upper_case_line.trim());

       // return next to last word in a string
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("input a string: ");
//        String str = scanner.nextLine();
//        String words[] = str.split(" ");
//        String last_to_next = words[words.length -2];
//        System.out.println(last_to_next);

        //insert a word in the middle of a string
//        String string = "java 15";
//        String word = "tutorial";
//        System.out.println(string.substring(0,5) + word + string.substring(4));

        //rotate a string from offset
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter string: ");
//        String stri = scanner.nextLine();
//        char[] chr = stri.toCharArray();
//        System.out.println("enter offset");
//        int offset = scanner.nextInt();
//        int len = chr.length;
//        offset %= len;
//        reverse(chr,0, len-offset-1);
//        reverse(chr, len - offset, len - 1);
//        reverse(chr, 0, len - 1);
//        System.out.println(Arrays.toString(chr));

        //find all longest word in a dictionary
//        String[] dictionary = {"cat" , "flag" , "green" , "country" , "w3resource"};
//        System.out.println(Arrays.toString(dictionary));
//        int max = dictionary[0].length();
//        int index = 0;
//        for (int i=1 ; i < dictionary.length ; i++){
//            if (max < dictionary[i].length()){
//                max = dictionary[i].length();
//                index = i;
//            }
//        }
//        System.out.println("the max element value is:" + max + "\n" + "the index of longest word is:" + index);

        // check if a given array has all unique characters or not
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        System.out.println(str.charAt(2));
//        char[] chr = str.toCharArray();
//        Arrays.sort(chr);
//        for (char cr:chr
//             ) {
//            System.out.print(cr + " ");
//        }
//        for (int i=1 ; i < chr.length ; i++) {
//            if (chr[i - 1] == chr[i]) {
//                System.out.println("false");
//            }
//        }

        //check if tow word is anagram or not
//        String str1 = "wxyz";
//        String str2 = "zyxw";
//        for (int i = 0 ; i < str1.length() ; i++){
//            System.out.print(str1.charAt(i)+1 + " ");
//            System.out.print(str2.charAt(i)+1);
//            System.out.print(" , ");
//        }
//        System.out.println();
//        System.out.println("Check if two given strings are anagrams or not?: "+anagram_test(str1,str2));

        //return the index of the first unique character
//        String str = "wresourcew";
//        char[] chr = str.toCharArray();
//        int[] freq = new int[10];
//        for (int i = 0 ; i<chr.length-1 ; i++){
//            for (int j = i+1 ; j<chr.length ; j++){
//                if (chr[i] == chr[j]){
//                    freq[i] = chr[j];
//                    break;
//                }
//            }
//        }
//        for (int i = 0 ; i<chr.length ; i++)
//            for (int j =0 ; j<freq.length ; j++){
//                if (chr[i]==freq[j]){
//                    for (int k = i ; k<chr.length-1 ; k++){
//                        chr[k] = chr[k+1];
//                    }
//                }
//            }
//        System.out.println(chr[0]);
//        /*** another solution*/
//        System.out.println("First unique character of the above: "+first_Uniq_Char(s));

        //check if a given string is a permutation of another given string
//        String st1 = "xxzz";
//        String st2 = "yxzx";
//        int[] arr = new int[500];
//        for (int i = 0 ; i<st1.length() ; i++){
//            arr[st1.charAt(i)] += 1;
//        }
//        for (int i = 0 ; i<st2.length() ; i++){
//            arr[st2.charAt(i)] -= 1;
//        }
//        for (int k = 0 ; k<arr.length ; k++){
//            if (arr[k] != 0) {
//                System.out.println("false");
//                break;
//            }
//        }

    } // End of psvm

    public static void count(String s){
        char [] ch = s.toCharArray();
        int letters = 0;
        int digits = 0;
        int space = 0;
        int other = 0;
        for (int i=0 ; i < s.length() ; i++){
            if (Character.isLetter(ch[i])) { //character class: wraps the value of all the primitive type char into an object
                letters++;
            }
            else if (Character.isSpaceChar(ch[i])) {
                space++;
            }
            else if (Character.isDigit(ch[i])) {
                digits++;
            }
            else{
                other++;
            }
        }
        System.out.println("letters# :" + letters);
        System.out.println("digits# :" + digits);
        System.out.println("space# :" + space);
        System.out.println("others# :" + other);
    }

    private static void reverse(char[] str , int start , int end){

        while (start < end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start ++;
            end --;
        }
    }

    public static boolean anagram_test(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        } else if (str1.length() != str2.length()) {
            return false;
        } else if (str1.length() == 0 && str2.length() == 0) {
            return true;
        }
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) { //
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

    public static int first_Uniq_Char(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }

}
