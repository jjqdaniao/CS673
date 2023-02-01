package Assignment1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class First_100_Fibonacci {
    public static List<BigInteger> calculate(int n) {

        List<BigInteger> list = new ArrayList<BigInteger>();
        list.add(BigInteger.ONE);
        list.add(BigInteger.ONE);

        for (int i = 2;i<n;i++){
            BigInteger sum = BigInteger.ZERO;
            sum = sum.add(list.get(i-1));

            sum = sum.add(list.get(i-2));
            list.add(sum);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(calculate(100));
        System.out.println(calculate(100).size());

    }
}
