package oops;

public class GettersSetter {

    public static void main(String[] args) {
        pens p1 =  new pens();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("black");
        System.out.println(p1.getColor());
    }

}
class  pens {
   private String color;
    private int tip;


  String getColor() {
      return  this.color;
  }
  int getTip() {
      return this.tip;
  }
    void  setColor(String newColor) {
        this.color = newColor;
    }
    void  setTip(int newTip){
        this.tip = newTip;
    }
}