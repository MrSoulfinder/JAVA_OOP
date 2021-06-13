package javaapplication24;
import java.util.Scanner;
public class JavaApplication24 {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s=new String();
    s=in.nextLine();

char num[]={'1','2','3',
            '4','5','6',
            '7','8','9'};
String lttr[]={ " ","abc","def",
                "ghi","jkl","mno",
                "pqrs","tuv","wxyz"};

for(int i=0; i<s.length(); i++){
    char c1=s.charAt(i);
        for(int c=0; c<lttr.length; c++){
            for(int a=0; a<lttr[c].length(); a++){
                char c2=lttr[c].charAt(a);

                if (c1==c2)
                    for (int j=0; j<a+1; j++){
                      System.out.print(num[c]);
                    }
                }
            }
            System.out.print(" ");
        }
    }   
}