package javaapplication8;

class DequeTest{ 
    int size = 0; 
    int s[] = new int[100]; 
 
DequeTest() 
    {  
        
    } 
 
 void putLast(int item) 
 { 
    s[size] = item; 
    size++; 
 } 
 void putFirst(int item) 
 { 
    for(int i = size-1; i>=0; i--) 
 { 
    s[i+1] = s[i]; 
 } 
    s[0] = item; 
    size++; 
 } 
 
 void pickLast() 
 { 
 
    System.out.println("Последний элемент "+s[size-1]); 
    s[size-1] = 0; 
    size--; 
 } 
 
 void pollLast() 
 { 
    System.out.println("Последний элемент "+s[size-1]); 
 } 
 
 void pollFirst() 
 { 
    System.out.println("Первый элемент "+s[0]); 
 } 
 
 void pickFirst() 
 { 
    System.out.println("Первый элемент "+s[0]); 
    for(int i = 1; i <s.length; i++) 
 { 
    s[i-1] = s[i]; 
 } 
    size--; 
 
 } 
 
 public void size() { 
     System.out.println("Array is "); 
 for (int i = 0; i < s.length; i++) 
 { 
    System.out.print(s[i]+ " "); 
 } 
 } 
 
} 
public class JavaApplication8 { 
 
 public static void main(String[] args) { 
 DequeTest test = new DequeTest(); 
 
 
    test.putLast(2); 
    test.size(); 
 System.out.println(""); 
 
    test.putLast(10); 
    test.size(); 
    test.putFirst(8); 
    test.size(); 
 System.out.println("");
 
    test.putFirst(9); 
    test.size();
    test.pickFirst(); 
    
    test.size(); 
 System.out.println(""); 
    test.pickFirst(); 
    test.size(); 
 System.out.println(""); 
 
    test.pickLast(); 
    test.size(); 
 System.out.println(""); 
 } 
 
}
