package TestPrograms;

import java.lang.reflect.Array;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Program to Extract strMatching from str1
public class TestSelenium {

           public static void main(String[] args) {
               String str1 = "PpppRrrraAaaFfffUuuuLlllPPP";

               String strMatching = "PRaFUL";

       //        Set<Character> chrList = new HashSet<>();



               for(int j = 0 ; j < strMatching.length(); j++) {

                   char ch1 = strMatching.charAt(j);

                   for(int i = 0 ; i < str1.length(); i++) {

                       char ch = str1.charAt(i);

                       if(ch == ch1) {

                          // chrList.add(ch);
                           System.out.print(ch);
                           break;

                       }

                   }

               }
//
//
//
//               System.out.println(chrList);
       }
    }



