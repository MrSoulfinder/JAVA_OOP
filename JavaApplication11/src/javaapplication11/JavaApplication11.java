package javaapplication11;

interface Movable
{
    int getX();
    int getY();
    
    void move(int x,int y);
}

class Graph
{
    String backgroundColor;
    String texture;
}

class Background extends Graph
{
    String color;
    String texture;
    
    public String backgroundColor(){
        return color;
    }

    public String texture(){
        return texture;
    }
}

class MyWindow implements Movable
{
    int x;
    int y;
    public int getX(){
        return x;
    } 

    public int getY(){
        return y;
    } 

    public void move(int x,int y){
        
    }
}

class Point extends Graph implements Movable
{
    int x;
    int y; 
    
    Point (int x, int y){
        this.x = x;
         this.y = y;
    }
    
    public int getX(){
        return x;
    } 

    public int getY(){
        return y;
    } 

     public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }
    
    public void move(int x, int y){
    }

    String color;
    String texture;
    
    public String backgroundColor(){
        return color;
    }
    public String texture(){
        return texture;
    }
}

class Rectangle extends Point
{
    int sideA;
    int sideB;
   
    Rectangle(int x,int y,int sideA,int sideB)
    {
        super(x,y);
        
        this.sideA = sideA;
        this.sideB = sideB;
    }
    
    @Override
    public int getX() 
    {
        return x;
    }
    
    @Override
    public void setX(int x)
    {
        this.x = x;
    }
    
    @Override
    public int getY() 
    {
        return y;
    }

    @Override
    public void setY(int y)
    {
        this.y = y;
    }
    
    public int getSideA() 
    {
        return sideA;
    }

    public void setSideA(int sideA)
    {
        this.sideA = sideA;
    }
    
    public int getSideB() 
    {
        return sideB;
    }

    public void setSideB(int sideB)
    {
        this.sideB = sideB;
    }
}

class Ellipse extends Rectangle
{
    double ellipticity;
    

    Ellipse(int x,int y,int sideA,int sideB)
    {
        super(x, y, sideA, sideB);
    }
    
    public void ellipticity()
    {
        System.out.println(sideB/sideA);
    }
    
    @Override
    public int getX() 
    {
        return x;
    }
    
    @Override
    public void setX(int x)
    {
        this.x = x;
    }
    
    @Override
    public int getY() 
    {
        return y;
    }

    @Override
    public void setY(int y)
    {
        this.y = y;
    }
    
    @Override
    public int getSideA() 
    {
        return sideA;
    }

    @Override
    public void setSideA(int sideA)
    {
        this.sideA = sideA;
    }
    
    @Override
    public int getSideB() 
    {
        return sideB;
    }

    @Override
    public void setSideB(int sideB)
    {
        this.sideB = sideB;
    }
    
}

class Circle extends Point
{
    int radius;
    
    Circle(int x,int y, int radius)
    {
        super(x, y);
        
        this.radius = radius;
    }
    
    @Override
    public int getX() 
    {
        return x;
    }
    
    @Override
    public void setX(int x)
    {
        this.x = x;
    }
    
    @Override
    public int getY() 
    {
        return y;
    }

    @Override
    public void setY(int y)
    {
        this.y = y;
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
}


public class JavaApplication11 {
    public static void main(String[] args) {
         Circle v = new Circle(3,6,4);
         System.out.println(v.getRadius());
         
         Point P = new Point(12,17);
         System.out.println(P.getX());
         
         Ellipse E = new Ellipse(31,21,9,5);
         System.out.println(E.getX());
         
         Rectangle R = new Rectangle(67,78,11,64);
         System.out.println(R.getSideA());
    }
}
