package interface_2;

interface A {
    int foo = 0;
    int bar();
    int bee ();
}

interface B {
    int foo = 1;
    int bar();
    double bee ();
}

class C implements A, B {
    public int bar(){return 5; }
    public int bee(){return 61; }           
    
    /*невозможно создать два метода
    с разными типами значений*/
    
    public double bee(){return 34.5; }      
}

public class Interface_2 {

    public static void main(String[] args) {
        C c = new C();
        System.out.println(((B)c).foo); //подсказываем откуда взять поле
                                        // путём явного преобразования 
                                        
        c.bar(); // реалтзация одного метода в классе позволяет удовлетворить 
                 //сразу нескольким интерфейсам
        
    }
    
}
