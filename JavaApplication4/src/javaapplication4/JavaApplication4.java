package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
         int fir = 0;
       int sec =0;
       int third = 1;
       int next;
       
       System.out.print(fir+" "+sec+" "+third+" ");
       for(int i = 4; i <=21;i++)
       {
           next = fir+sec+third;
           System.out.print(next+" ");
           
           fir = sec;
           sec = third;
           third = next;
       }
    }
}

