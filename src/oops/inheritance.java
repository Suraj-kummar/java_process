package oops;

// inheritance is when propetites and methosa of base class are passed on to  a derived class

// types----------

// single level inhe:-----
// multi level inhe:------  BASE CLAS -- DERIVED CLASS -- DERIVED CLASS
// hierarchial inher :-------  BASE CLASS ---DERIVED CLASS
//                                 DERIVED CLASS---|

// hybrid inher:-------

public class inheritance {
    public static void main(String[] args) {




    }
}

class  animal {
    String color;
    void eat () {
        System.out.println("eats");
    }
    void breathe () {
        System.out.println("breath");
    }
}

// Derived class

//class  Fish extends  Animal{
//    int fins;
//
//    void swim () {
//        System.out.println("swims in water");
//    }
//}


//  MULTI LEVEL

// class Mammals extends Animal{
//     int legs;
//
// }
//
//  class Dog  extends  Mammals{
//    String breed;
//  }



//   HIERARCHAIL INHE

class Mammals extends animal{
     void walk (){
         System.out.println("walks");
     }

 }


class fish extends animal{
    void swim (){
        System.out.println("swim");
    }

}
class birds extends animal{
    void fly (){
        System.out.println("fly");
    }

}