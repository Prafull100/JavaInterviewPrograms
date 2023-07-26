---------------- factorial------------------
5! = 5 x 4 x 3 x 2 x 1 = 120

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
------//----------
5! = 5 x 4 x 3 x 2 x 1 = 120


class Calculation{  
 void fact(int  n){  
  int fact=1;  
  for(int i=1;i<=n;i++){  
   fact=fact*i;  
  }  
 System.out.println("factorial is "+fact);  
}  
public static void main(String args[]){  
 new Calculation().fact(5);//calling method with anonymous object  
}  
}  
------------Odd/even program-------------------
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}

-------------Array Print------------------

public class ArrayPrint {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("The numbers in the array are:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

-----------------Smallest Numbetr--------------

public class SmallestNumber {
    public static void main(String[] args) {
        int[] numbers = {9, 5, 1, 8, 3, 2, 7, 6, 4};

        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("The smallest number in the array is: " + smallest);
    }
}

--------------Largest Number-----------

public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {9, 5, 1, 8, 3, 2, 7, 6, 4};

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number in the array is: " + largest);
    }
}

--------------Array Ascending order------------------
public class SortAsc {    
    public static void main(String[] args) {        
            
        //Initialize array     
        int [] arr = new int [] {5, 2, 8, 7, 1};     
        int temp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}

---//---
import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] numbers = {9, 5, 1, 8, 3, 2, 7, 6, 4};

        // Print the original array
        System.out.println("Original array:");
        printArray(numbers);

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Array in ascending order:");
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}


-------------Array Descending order------------------

public class SortAsc {    
    public static void main(String[] args) {        
            
        //Initialize array     
        int [] arr = new int [] {5, 2, 8, 7, 1};     
        int temp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}

------//--------

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
        Integer[] numbers = {9, 5, 1, 8, 3, 2, 7, 6, 4};

        // Print the original array
        System.out.println("Original array:");
        printArray(numbers);

        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // Print the sorted array
        System.out.println("Array in descending order:");
        printArray(numbers);
    }

    public static void printArray(Integer[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}


---------------print string------------

public class PrintString {
    public static void main(String[] args) {
        String message = "Hello, world!";
        System.out.println(message);
    }
}



--------------Print string in reverse order------------------

public class Reverse   
{    
    public static void main(String[] args) {    
        String string = "Dream big";    
         
        for(int i = string.length()-1; i >= 0; i--){    
             System.out.print(string.charAt(i));    
        }    
    }    
}  

---------------Print Character at specific length-----------

public class Reverse   
{    
    public static void main(String[] args) {    
        String string = "Dream big";    
         int i=string.length();
        //for(int i = string.length()-1; i >= 0; i--){    
             System.out.print(string.charAt(i-7));    
            
    }    
}  

------------Fibonacci program-------------------
Here is the Fibonacci sequence:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...


public class FibonacciExample1 {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,number=10,i;
        System.out.print(n1+" "+n2);
        for(i=2;i<number;++i){
            n3=n1+n2;
            System.out.print(" " +n3);
            n1=n2;
            n2=n3;
            
        }
    }
}


-----------Prime Number-----------

public class Reverse   
{    
    public static void main(String[] args) {    
        int number = 121;    
        //  int i=string.length();
        //for(int i = string.length()-1; i >= 0; i--){    
            //  System.out.print(string.charAt(i-7));    
        if(number <=1){
            System.out.print(number+ " Is not prime number"); 
        }    
        else{
        for(int i=2;i<=number;i++){
            
            if(number % i==0){
                System.out.print(number+ " Is not prime number"); 
                break;
            }
            else{
                System.out.print(number+ " Is prime number"); 
                break;
            }
        }

    }    
    }
}  


------------Palindrom Program-------------
//Palindrome number in c: A palindrome number is a number that is same after reverse. For example 121, 34543, 343, 131, 48984 are the palindrome numbers.


class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
} 

-----------Amstrong program-------------------

//1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643
Summing up the values: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.

import java.util.Scanner;  
import java.lang.Math;  

public class ArmstsrongNumberExample  
{  
//function to check if the number is Armstrong or not  
static boolean isArmstrong(int n)   
{   
int temp, digits=0, last=0, sum=0;   
//assigning n into a temp variable  
temp=n;   
//loop execute until the condition becomes false  
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   
temp = n;   
while(temp>0)   
{   
//determines the last digit from the number      
last = temp % 10;   
//calculates the power of a number up to digit times and add the resultant to the sum variable  
sum +=  (Math.pow(last, digits));   
//removes the last digit   
temp = temp/10;   
}  
//compares the sum with n  
if(n==sum)   
//returns if sum and n are equal  
return true;      
//returns false if sum and n are not equal  
else return false;   
}   
//driver code  
public static void main(String args[])     
{     
int num;   
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the limit: ");  
//reads the limit from the user  
num=sc.nextInt();  
System.out.println("Armstrong Number up to "+ num + " are: ");  
for(int i=0; i<=num; i++)  
//function calling  
if(isArmstrong(i))  
//prints the armstrong numbers  
System.out.print(i+ ", ");  
}   
}  

----------Getter and Setter methods-------------

public class Person {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
------for nested objects------------

public class Person {
    private String name;
    private int age;
    private Address address;

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter for address
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
---

public class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;

    // Getter and setter for street
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    // Getter and setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and setter for state
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Getter and setter for postalCode
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

-----------------------------------------------------------
java -cp /tmp/fMDSqUFZgD HelloWorld
* 
** 
*** 
**** 
***** 



// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int num=5;
        for(int i=0;i<num;i++)
        {
            
            for(int j=0;j<=i;j++){
                
                System.out.print("*");
            }
             System.out.println(" ");
        }
    }
}

--------------------------------
****** 
***** 
**** 
*** 
** 
* 


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int num=6;
        for(int i=0;i<num;i++)
        {
            
            for(int j=num;j>i;j--){
                
                System.out.print("*");
            }
             System.out.println(" ");
        }
    }
}

-----------------------------------
      
     *
    ***
   *****
  *******
 *********


public class PyramidPattern  
{    
  public static void main(String args[])   
   {    
     //i for rows and j for columns      
    //row denotes the number of rows you want to print  
    int i, j, row = 6;       
    //Outer loop work for rows  
      for (i=0; i<row; i++)   
        {  
          //inner loop work for space      
          for (j=row; j>i; j--)   
            {  
               //prints space between two stars  
                System.out.print(" ");   
            }   
             //inner loop for columns  
          for (int k=0; k<(2*i-1); k++ )   
           {   
             //prints star      
             System.out.print("*");   
           }   
            //throws the cursor in a new line after printing each line  
            System.out.println();   
        }   
   }   
}  

-----------------------------
***********
 *********
  *******
   *****
    ***
     *


public class PyramidPattern  
{    
  public static void main(String args[])   
   {    
     //i for rows and j for columns      
    //row denotes the number of rows you want to print  
    int i, j, row = 6;       
    //Outer loop work for rows  
      for (i=row; i>0; i--)   
        {  
          //inner loop work for space      
          for (j=row; j>i; j--)   
            {  
               //prints space between two stars  
                System.out.print(" ");   
            }   
             //inner loop for columns  
          for (int k=0; k<(2*i-1); k++ )   
           {    
             //prints star      
             System.out.print("*");   
           }   
            //throws the cursor in a new line after printing each line  
            System.out.println();   
        }   
   }   
}  

-------------------------------------------------------------------------------------------

----------Code to extract elements from drop-down and check for exact match----------------

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownExtractor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com"); // Replace with your webpage URL

        // Locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.id("dropdownId")); // Replace with your dropdown element locator

        // Create a Select object
        Select select = new Select(dropdownElement);

        // Get all the dropdown options
        List<WebElement> options = select.getOptions();

        // Print all the dropdown options
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // Check for exact match
        String expectedOption = "Option 1";
        boolean isExactMatch = false;
        for (WebElement option : options) {
            if (option.getText().equals(expectedOption)) {
                isExactMatch = true;
                break;
            }
        }

        // Print the result
        System.out.println("Exact match found: " + isExactMatch);

        driver.quit();
    }
}


-------------------------------------

SQL Query to extract 4th Hieghest record from table

SELECT TOP 1 *
FROM (
    SELECT TOP 4 *
    FROM your_table
    ORDER BY column_name DESC
) AS subquery
ORDER BY column_name ASC;
