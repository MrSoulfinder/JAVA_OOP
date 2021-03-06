package javaapplication2;
import java.util.*;

public class JavaApplication2 {

    public static void main(String[] args) {
             Random rand = new Random();
       System.out.println("Кукусики, вот рандомные  числа: ");
       int arr[] = new int[20];
       
       for(int i =0;i<20;i++)
       {
           arr[i] = rand.nextInt(11);
       }
       
       for(int x : arr)
       {
           System.out.println(x);
       }
       
       System.out.println(" ");
       
       int max = arr[0];
       int maxInd = 0;
       
       for(int ind = 0; ind< arr.length;ind++)
       {
           if(arr[ind]>max)
           {
               max = arr[ind];
               maxInd = ind;
           }
       }
      
       System.out.print("Максимальное число: ");
       System.out.println(arr[maxInd]);
       
       System.out.println(" ");
       
        for (int h = 0; h < arr.length; h++)
        {
            if (arr[h] == max)
            {
                System.out.println( "Его позиция: ");
                System.out.println(h+1);
            }
        }
    }
    
}
