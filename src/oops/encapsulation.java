package oops;



// encapsulation is defined aas the wrapping up of data and method under a single unit. it also implements data hiding.


//  CONSTRUCTORS----
// :- constrctor is a special method which is invoked automatically at time of object cretion.
// :- constrctors have the same name as class or str.
// :- constors don't have  a return type
// :- construtors are only called once , ata object creaton
//:- memory allocation happens when constructor is called...




public class encapsulation {
    public static void main(String[] args) {
        student s1 = new student("suraj");
        System.out.println(s1.name);
    }
}

class  student {
     String name;
     int roll;

      student(String name) {
          this.name = name;

      }
}


