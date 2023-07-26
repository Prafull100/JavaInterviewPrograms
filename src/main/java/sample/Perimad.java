package sample;

public class Perimad {

    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int num=5;
        for (int i=num;i>=0;i--){

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
