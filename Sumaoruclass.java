package hackerrank;

 

import java.util.*;
import java.lang.*;
import java.io.*;

 

public class Sumaoruclass {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//String a[]= {"a","jk","abb","mn","abc"};
//String b[]= {"bb","kj","bbc","op","def"};
//String a[]= {"tea","tea","act"};
//String b[]= {"ate","toe","acts"};
String b[] = {"aacde" };
String a[] = {"bacde" };
for(int i: getMinimumDifference(a,b))
    System.out.println(i);
    }

 

    private static int[] getMinimumDifference(String[] a, String[] b) {
        int[] output=new int[a.length];
        for(int i=0;i<a.length;i++) {
            if(a[i].length()!=b[i].length())
                output[i]=-1;
            else {
                output[i]=sortAndVerifyWord(a[i],b[i]);
            }
        }
        
            return output;
    }

 

    private static int sortAndVerifyWord(String string1, String string2) {
        char c1[]=string1.toCharArray();
        char c2[]=string2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1, c2))    
        return 0;
        else 
        {
            return getDifference(string1,string2);
        }
    }



    private static int getDifference(String string1, String string2) {
        int counter=0;
        for(int i=0;i<string2.length();i++)
            if(!string1.contains(Character.toString(string2.charAt(i))))
                counter++;
        return counter;
    }

 

    

 

}