package sample;

public class DuplicateArrayElements {

    public static void main(String[] args){

        int arr[]={1,3,4,6,2,1,6,8,6,7,4}; //1,4,6

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}