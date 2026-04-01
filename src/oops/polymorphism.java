package oops;


// - Compile TIme Polymorphism
//    * method Overloading

// - Run Time Polymorphism
//    * method Overriding

// TYPE OF POLYMORPHISM

// METHOD OVERLOADING :------   Multiple functions with same name but differnt parameters

//METHOD OVERRIDING :------ Parent and child both contain the same function with a differnt defination

public class polymorphism {

    public static void main(String[] args) {
        deer d = new deer();
        d.eat();
    }

}


// Method overloading ------------->
// class calculator {
//    int sum(int a, int b) {
//        return a + b;
//    }
//
//    float sum ( float a, float b) {
//        return a + b;
//
//    }
//    int sum (int a, int b, int c) {
//        return  a+ b + c;
//    }
// }



// METHOD OVERRIDING-------------->
  class Animl {
    void eat () {
        System.out.println("eats anything");
    }
}

class deer extends   Animl {
    void eat() {
        System.out.println("eat grass");
    }
}