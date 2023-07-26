package sample;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args){

//                int[] originalArray = {1, 2, 3, 4, 5};
//                int[] copiedArray = new int[originalArray.length];
//
//                System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
//
//                System.out.println("Original Array: " + Arrays.toString(originalArray));
//                System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        int[] originalArray={1,2,3,4,5,6,7,8};
        int[] copyArray=new int[originalArray.length];
        System.arraycopy(originalArray,0,copyArray,0,originalArray.length);
        System.out.println("originalArray is: "+Arrays.toString(originalArray));
        System.out.println("copyArray is: "+Arrays.toString(copyArray));
            }
        }


