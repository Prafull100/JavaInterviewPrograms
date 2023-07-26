package org.example;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        // Online Java Compiler
// Use this editor to write, compile and run your Java code online
                // System.out.println("Hello, World!");
                int num=5;
                for (int i=0;i<=num;i++){

                    for(int j=num;j>i;j--){

                        System.out.print(" ");
                    }
                    for(int k=0; k<(2*i-1);k++){

                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }