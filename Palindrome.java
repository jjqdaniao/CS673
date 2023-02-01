package Assignment1;

public class Palindrome {
    public static boolean test(String s){
        if (s.length() == 0){
            return false;
        }
        for (int i = 0, j = s.length()-1;i <s.length()/2;i++,j--){

            if (s.charAt(i) != s.charAt(j)){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "abba";
        String s2 = "abc";
        String s3 = "";
        String s4 = "a";
        System.out.println(s1);
        System.out.println(test(s1));
        System.out.println(s2);
        System.out.println(test(s2));
        System.out.println(s3);
        System.out.println(test(s3));
        System.out.println(s4);
        System.out.println(test(s4));

    }

}
