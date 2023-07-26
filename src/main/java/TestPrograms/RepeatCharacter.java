package TestPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatCharacter {




            public static void main(String[] args){

                String str1="Prafull Anandrao Patil";

                Map<Character,Integer> occurances=new HashMap<Character,Integer>();

                for(int i=0; i<str1.length();i++){

                    char ch=str1.charAt(i);

                    if(occurances.get(ch)==null || occurances.get(ch)==0){

                        occurances.put(ch,1);
                    }
                    else {

                        int count= occurances.get(ch)+1;
                        occurances.put(ch,count);
                    }
                }

                System.out.println(occurances.entrySet().stream().filter((k) -> k.getValue() > 1)
                        .collect(Collectors.toMap(k -> k.getKey(), k -> k.getValue())));





            }
}
