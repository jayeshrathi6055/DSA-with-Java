// import java.util.*;
import java.util.ArrayList;

public class recurssionProblems {
    // Keypad variables
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    static void reverseString(StringBuilder s) {
        if (s.length() == 0) {
            return;
        }
        System.out.print(s.charAt(s.length() - 1));
        s.delete(s.length() - 1, s.length());
        reverseString(s);
    }

    static void reverseString(String s, int index) {
        if (index == -1) {
            return;
        }
        System.out.print(s.charAt(index));
        reverseString(s, index - 1);
    }

    static void firstAndLastOccurance(String str, char findStr, int firstIndex, int lastIndex) {
        if (firstIndex == str.length()) {
            System.out.println("Not found");
            return;
        }
        char value = str.charAt(firstIndex);
        if (value != findStr) {
            firstIndex++;
            firstAndLastOccurance(str, findStr, firstIndex, lastIndex);
        } else {
            value = str.charAt(lastIndex);
            if (value != findStr) {
                lastIndex--;
                firstAndLastOccurance(str, findStr, firstIndex, lastIndex);
            } else {
                System.out.println("First occurance is " + firstIndex + " and last occurance is " + lastIndex);
                return;
            }
        }
    }

    static boolean checkSortedArray(int[] arr, int startIndex){
        if(startIndex==arr.length-1){
            return true;
        }
        if(arr[startIndex]<arr[startIndex+1]){
            startIndex++;
            return checkSortedArray(arr, startIndex);
        }else{
            return false;
        }
    }

    static void MoveAllX(String str, int index, int count, String newString){
        if(index==str.length()){
            for(int i = count;i>=0;i--){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(index);
        if (curr=='x'){
            count++;
            MoveAllX(str, index+1, count, newString);
        }else{
            MoveAllX(str, index+1, count, newString+curr);
        }
        
    }

    static void removeDuplicates(String str, int index, String s){
        if(index==str.length()){
            System.out.println(s);
            return;
        }
        s+=str.charAt(index);
        for(int i = 0;i<s.length();i++){
            if(str.charAt(index)==s.charAt(i)){
                s = s.substring(0, s.length()-1);
                break;
            }
        }
        index++;
        removeDuplicates(str, index, s);
    }

    public static void subsequencesWithLoop(String str){
        for(int i = 0;i<str.length();i++){
            for (int j = str.length();j>=i;j--){
                System.out.print(str.substring(i, j)+" ");
            }
        }
        System.out.println();
    }

    public static void subsequences(String str, int i , int j){
        if(i==str.length()-1){
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.substring(i, j)+" ");
        if(i+1==j){
            j = str.length();
            i++;
            subsequences(str, i, j);
        }else{
            j--;
            subsequences(str, i, j);
        }
    }

    public static void keypadCombination(String str, int index, String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = keypad[currChar-'0'];
        for (int i = 0;i<mapping.length();i++){
            keypadCombination(str, index+1, combination+mapping.charAt(i));
        }
    }

    public static void stringPermutation(String str, String newString){
        if(str.length()==0){
            System.out.println(newString);
            return;
        }
        for(int i = 0; i< str.length(); i++){
            char curr = str.charAt(i);
            String nStr = str.substring(0,i)+str.substring(i+1);
            stringPermutation(nStr, newString+curr);
        }
    }

    public static int countPaths(int i, int j, int n, int m){
        if (i == n || j==m){
            return 0;
        }
        if (i == n-1 && j==m-1){
            return 1;
        }
        // move downwards
        int downwards = countPaths(i+1,j,n,m);
        // move right
        int right  = countPaths(i,j+1, n, m);

        return downwards+right;
    }

    public static int placeTiles(int n, int m){
        if (m == n){
            return 2;
        }
        if (n<m){
            return 1;
        }
        // vertical tiles
        int vertical = placeTiles(n-m,m);
        // horizontal tiles
        int horizontal  = placeTiles(n-1, m);

        return vertical+horizontal;
    }

    public static int callGuests(int n){
        if(n<=1){
            return 1;
        }
        return (callGuests(n-1)+(callGuests(n-2)*(n-1)));
    }

    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            for(int i = 0;i< subset.size();i++){
                System.out.print(subset.get(i)+" ");
            }
            System.out.println();
        }
        // subset.add(n);  ->It is not working
        findSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Anavrin");
        reverseString(s);
        System.out.println();
        String s1 = "abaachaefaah";
        reverseString(s1, s1.length() - 1);
        System.out.println();
        firstAndLastOccurance(s1, 'a', 0, s1.length() - 1);
        int[] arr = {1,2,3,4,5};
        System.out.println(checkSortedArray(arr, 0));
        String s2 = "axbcxxdefgxhxhalkaxhalx";
        MoveAllX(s2, 0, 0, "");
        removeDuplicates(s2, 0, "");
        subsequences("abcdef",0,6);
        System.out.println();
        keypadCombination("578",0,"");
        stringPermutation("abc", "");
        System.out.println(countPaths(0,0,3,4));
        System.out.println(placeTiles(4, 2));
        System.out.println(callGuests(5));
        ArrayList<Integer> subset = new ArrayList<>();
        // findSubsets(3, subset);
    }
}