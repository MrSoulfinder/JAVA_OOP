package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {
    
    public static void main(String[] args) {
        ///объявляем два массива цифру кнопки и буквы на кнопке
        char [] nums = {'1','2','3',
                        '4','5','6',
                        '7','8','9',
                            '0'};
        String [] letters = {" ", "abc", "def",
                            "ghi","jkl","mno",
                            "pqrs","tuv","wxyz"};
        
        ///вводим сообщение в строку 
        System.out.println("Enter your message: ");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        
        
        ///ищём совпадения в тексте с массивом букв и цифр и выводим  
        System.out.println("You need to press: ");
        for (int i=0; i<message.length(); i++){
            char a1 = message.charAt(i);
            
            for (int j=0; j<letters.length; j++){
                for ( int k=0; k<letters[j].length(); k++){
                    char b1 = letters[j].charAt(k);
                    
                    if (a1 == b1)
                        for (int h=0; h<k+1; h++){
                            System.out.print(nums[j]);
                        }
                }
            }
            System.out.print(" ");
        }
            
    }
}
   
    
