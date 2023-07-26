package sample;
// String Swap Program
public class StringReplace {

    public static void main(String args[]){

//        String s1="Prafull"; String temp;
//        String s2="Hupendra";
//         if(s1 !=s2){
//
//             temp=s1;
//             s1=s2;
//             s2=temp;
//
//             System.out.println("String s1 is "+s1 + "  And String s2 is "+s2);
//         }


                String str1 = "Hello1";
                String str2 = "World";

                System.out.println("Before swapping:");
                System.out.println("String 1: " + str1);
                System.out.println("String 2: " + str2);

                // Swapping strings without using any methods
                str1 = str1 + str2;
                str2 = str1.substring(0, str1.length() - str2.length());
                str1 = str1.substring(str2.length());

                System.out.println("\nAfter swapping:");
                System.out.println("String 1: " + str1);
                System.out.println("String 2: " + str2);

    }
}
