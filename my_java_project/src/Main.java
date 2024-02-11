//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Box{
    int x,y,z;
    void volume(){
        System.out.println("volume is :"+ x*y*z);
    }
}
public class Main {
    public static void main(String[] args) {
        Box my_box=new Box();
        //int volume;
        my_box.x=10;
        my_box.y=20;
        my_box.z=30;
       // volume=my_box.x*my_box.y*my_box.z;
        my_box.volume();




        }







}