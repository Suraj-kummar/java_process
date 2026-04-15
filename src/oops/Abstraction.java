package oops;


//   ABSTRACTION :-----------  hiding all the unnecessary details and showing only the importanat parts to the user.
// TYPE:----- 1. Abstract Classes  2. Interfaces!!!!

// Abstract  Classes  :-------- Cannot create an instance of abstract class
//                       ------- Can have abstraction/non-abstract methods
//                          ------ Can have constructors

//  INTERFACES :-------------------- iterfaces is blurprinys of a class
// ----- all methods are public, abstarct & without impelementation
// ----- Used to achived total abstrsction
//  Variable in the interface are final, public, and static 


public class Abstraction {
    public static void main(String[] args) {
  queen q =  new queen();
  q.moves();
    }
}

// Abstract  Classes ---------------->

abstract  class Animal {
    String color;

     Animal() {
        color = " brown";
    }

    
    void eat () {
        System.out.println( "animal eats");
    }
    abstract void walk ();
}

 class Horse extends Animal {
    void changecolor(){
        color = "dark brown ";
    }
     void walk() {
         System.out.println("walks on 4 legs");
     }
 }

class Chicken extends Animal {
    void changecolor(){
        color = "yellow ";
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}


interface ChessPlayer {
    void moves();
}

class queen implements  ChessPlayer{
    public void moves() {
        System.out.println("up, down, left, right, dioganal(in all 4)");
    }
}
class  Rook implements ChessPlayer{
    public  void moves() {
        System.out.println("u, down, left, right");
    }
}
class  king implements  ChessPlayer{
    public void moves() {
        System.out.println("left,right");
    }
}