package testsamples;

public class TestSamples {

    public static void main(String[] args) {
        /*
        при использвании типа var нужно инициализировать переменную
        это ошибка:    var x; x = 10;
        */
        
        var x = 10;
        System.out.println(x); // 10
        
        final int LIMIT = 5;
        System.out.println(LIMIT);  // 5
        // LIMIT=57; // так мы уже не можем написать, так как LIMIT - константа
        
        long num = 2147483649L;
        /*Здесь число 2147483649 является допустимым для типа long, 
        но выходит за предельные значения для типа int. 
        И так как все целочисленные значения по умолчанию расцениваются 
        как значения типа int, то компилятор укажет нам на ошибку*/
        
        int z = 123_456;
        int y = 234_567__789;
        System.out.println(z);  // 123456
        System.out.println(y);  // 234567789
        
        String name = "Tom";
        int age = 30;
        float height = 1.7f;
         
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
        
        
    }
    
}
