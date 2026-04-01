package String;
import  java.util.*;
public class firstC {

    public static void main(String[] args) {
        char arr [] = {'a','b','c','d'};
        String str = "abcd";
        String str2 =  new String("xyz");

        Scanner sc = new Scanner(System.in);
        String name;
        name =  sc.next();
        System.out.println(name);

//        String length
        String  fullName = "Tony Stark";
        System.out.println(fullName.length());

//         Concatenation
        String firstName  = " suraj";
        String lastName  = " sinha";
        String puraName  = firstName + " " + lastName;
        System.out.println(puraName);
        System.out.println(puraName.charAt(3));
        
    }
}
