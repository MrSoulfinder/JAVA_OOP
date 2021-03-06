package javaapplication1;
import java.util.*;

import java.util.Random;
public class JavaApplication1 {

    public static void main(String[] args) {
           Random rand = new Random();
        int arr[] = new int[10];
        int num;
        
        for(int i =0;i<arr.length;i++)
       {
           arr[i] = rand.nextInt(21);
       }
        
        for(int x:arr)
        {
            System.out.println(x);
        }
        
        System.out.println(" ");
        
        for(int i= 0; i < arr.length; i++)//arr.length считает на 1 больше размер
        {
            for (int j = arr.length -1; j>i ;j--)
            {
                if(arr[j-1]> arr[j])
                {
                    num = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = num;
                }
                
            }
        }
        
        for(int x:arr)
        {
            System.out.println(x);
        }
    }
    
}
  
