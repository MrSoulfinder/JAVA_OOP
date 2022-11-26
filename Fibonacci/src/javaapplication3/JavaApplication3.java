package javaapplication3;

public class JavaApplication3 {

    public static void main(String[] args) {
        int fir = 1;
       int sec =1;
       int next;
       
       System.out.print(fir+" "+sec+" ");
       for(int i = 3; i <=20;i++)
       {
           next = fir+sec;
           System.out.print(next+" ");
           
           fir = sec;
           sec = next;
       }
    }
    
}
