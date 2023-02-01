package Assignment1;

public class Multiplication_Table {

    public static void main(String[] args) {
        for(int j = 1; j <= 12; ++j) {
            for (int i = 1; i <= 12; ++i) {
                //formating the table
                System.out.print(String.format("%4d",j*i));
            }
            System.out.println();
        }
    }
}
