package oops;


//   ABSTRACTION :-----------  hiding all the unnecessary details and showing only the importanat parts to the user.
// TYPE:----- 1. Abstract Classes  2. Interfaces!!!!

// Abstract  Classes  :-------- Cannot create an instance of abstract class
//                       ------- Can have abstraction/non-abstract methods
//                          ------ Can have constructors



public class Abstraction {
    public static void main(String[] args) {
  Horse  h = new Horse();
  h.eat();
  h.walk();

  Chicken c = new Chicken();
  c.walk();
  c.eat();
    }
}

// Abstract  Classes ---------------->

abstract  class Animal {
    void eat () {
        System.out.println( "animal eats");
    }
    abstract void walk ();
}

 class Horse extends Animal {
     void walk() {
         System.out.println("walks on 4 legs");
     }
 }

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}