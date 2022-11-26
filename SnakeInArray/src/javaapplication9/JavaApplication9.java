package javaapplication9;
import java.util.LinkedList;

class Node{
    int i;
    int j;

    Node(int i, int j){
        this.i=i;
        this.j=j;
    }

   @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.i;
        hash = 67 * hash + this.j;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Node other = (Node) obj;
        
        if (this.i != other.i) {
            return false;
        }
        if (this.j != other.j) {
            return false;
        }
        return true;
    } 
}



class Snake{
    LinkedList<Node> sn=new LinkedList<Node>();
    Node a = new Node(8,7);
    int [][] field = new int[10][10];
    
       
    Snake(){
        Node n1= new Node(5, 5);
        Node n2= new Node(5, 6);
        Node n3= new Node(5, 7);
        
        sn.addFirst(n1);
        sn.addFirst(n2);
        sn.addFirst(n3);
    }
    
    void apple(){
        int i = (int)(Math.random()*10)+1;
        int j = (int)(Math.random()*10)+1;
        Node a = new Node(i, j);
            
    }

    void randomMove(){
        
       
        Node oldHead = sn.peekFirst();
        Node newHead = null;
        do{
            int rand = (int)(Math.random()*4)+1;
            switch(rand){
            case 1:
                newHead = new Node(oldHead.i-1,oldHead.j);
           
            break;
            case 2:
               newHead = new Node(oldHead.i,oldHead.j+1);
            
            break;
            case 3:
                newHead = new Node(oldHead.i+1,oldHead.j);
           
            break;
            case 4:
                newHead = new Node(oldHead.i,oldHead.j-1);
            
            break;
            }
        }while(sn.contains(newHead) ||
            newHead.i < 0 || newHead.i > (field.length-1) || 
            newHead.j <0 || newHead.j > (field.length-1));
        
       
        if(newHead.i==a.i && newHead.j==a.j){
            sn.addFirst(newHead);
            int i = (int)(Math.random()*10)+1;
            int j = (int)(Math.random()*10)+1;
            a = new Node(i,j);
        }
        else{
            sn.addFirst(newHead);
            sn.pollLast();    
        }
    }
    
    void print(){
    for(int i=0; i<field.length; i++){
       for(int j=0; j<field[i].length; j++){
            Node temp = new Node(i,j);
            if(sn.contains(temp))
                System.out.print("X");
            else if(temp.equals(a))
                System.out.print("A");
            else
                System.out.print(".");
            }
        System.out.println();
        }
    System.out.println(); 
    }
}

public class JavaApplication9 {
    public static void main(String[] args) {
        Snake p = new Snake();
        
        p.print();
        
        for(int t=0; t<40; t++){
            p.randomMove();
            p.print();
      }  
    }
}