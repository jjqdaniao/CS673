package Assignment1;

public class Leap_Year {
    public static boolean define(int y) {
        if((y%4==0&&y%100!=0)||(y%400==0)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("2000"+'\n'+define(2000));
        System.out.println("1900"+'\n'+define(1900));

    }
}
