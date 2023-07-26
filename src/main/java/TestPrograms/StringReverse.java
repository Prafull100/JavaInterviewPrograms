package TestPrograms;

public class StringReverse {

    public static void main(String[] args){

        String name="prafull";

        for (int i= name.length() -1; i>=0; i--){

            char ch= name.charAt(i);
            System.out.print(ch);

        }

    }
}
