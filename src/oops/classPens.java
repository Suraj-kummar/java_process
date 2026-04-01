package oops;

public class classPens {
    public static void main(String[] args) {
        pen p1 = new  pen();
        p1.setColor("blue");
        System.out.println(p1.color);
    }
}


class  pen {
    String color;
    int tip;

    void  setColor(String newColor) {
        color = newColor;
    }
    void  setTip(int newTip){
        tip = newTip;
    }
}

class  Students{
    String name;
    int age;
    float precentage;

    void clacPercentage(int phy, int chem, int math){
        precentage = (phy + chem + math) / 3;
    }
}