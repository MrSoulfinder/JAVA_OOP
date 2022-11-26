package javaapplication5;

import java.util.Scanner;
import java.lang.Math;

public class JavaApplication5 {
    
    public static void main(String[] args) {
       
        int UnknownNumber, UserNumber, TrysCount = 0;
        Scanner input = new Scanner(System.in);
        int p = 1;
        int m = 2;
        int Answer = 1;
        
        do{
        System.out.println("Слабо угадать число (от 0 до 100).");

        UnknownNumber = (int)Math.floor(Math.random() * 100);
        
         Answer = 1;
        do {
		TrysCount++;

		System.out.print("Введите cвоё число: ");

		UserNumber = input.nextInt();
				
		if (UserNumber > UnknownNumber)
		System.out.println("Число меньше.");
            
		else if (UserNumber < UnknownNumber)            	
		System.out.println("Число больше.");	 		 		

		else 
		System.out.println("Вы угадали, было легко!");
                
        } while (UserNumber != UnknownNumber);
        
        System.out.println("Твоё количество попыток: " + TrysCount);
        TrysCount = 0;
        System.out.println("Сыграем ещё? \nВведи 1, чтобы попытать удачу или введи 2, чтобы я отвалил!\n");
        
        Answer = input.nextInt(); 
        }
        while (Answer == p);
    }
}