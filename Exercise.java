//import java.util.*;

//   Enter 3 numbers from the user & make a function to print their average.

// public class Exercise {
//     static int Average(int num1,int num2,int num3){
//         return num1+num2+num3/3;
//     }
//     public static void main(String[] args) {
//         System.out.print("Enter first number:");
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         System.out.print("Enter second number:");
//         int num2 = sc.nextInt();
//         System.out.print("Enter third number:");
//         int num3 = sc.nextInt();
//         System.out.print("The Average of " +num1+","+num2+" and "+num3+" is "+Average(num1,num2,num3));
//     }
// }








//  Write a function to print the sum of all odd numbers from 1 to n.
/**
 * Exercise
 */

// public class Exercise {
//     static int SumAllOdd(int n1){
//         int j=0;
//         for (int i=1;i<n1;i++){
//             if(i%2!=0){
//                 System.out.println("odd numer is "+i);
//                 j=j+i;
//             }
//         }
//         return j;
//     }
//     public static void main(String[] args) {
//         System.out.print("Enter a random number:");
//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         System.out.println("The sum of all odd number from 1 to "+n1+" is "+SumAllOdd(n1));
//     }
// }







//   Write a function which takes in 2 numbers and returns the greater of those two.
/**
 * Exercise
 */
// public class Exercise {
//     static int GreaterNumber(int n1, int n2){
//         int Gn=0;
//         if(n1<n2){
//             Gn=n2;
//         }
//         else {
//             Gn=n1;
//         }
//         return Gn;
//     }
//     public static void main(String[] args) {
//         System.out.print("Enter first number:");
//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         System.out.print("Enter second number:");
//         int n2 = sc.nextInt();
//         System.out.println("The greater is "+GreaterNumber(n1,n2));
//     }
// }






//   Write a function that takes in the radius as input and returns the circumference of a circle.
/**
 * Exercise
 */
// public class Exercise {
//     static float CircleCircum(float radius){
//         return (float) (2*3.14*radius);
//     }
//     public static void main(String[] args) {
//         System.out.print("Enter a radius of circle:");
//         Scanner sc = new Scanner(System.in);
//         float radius =sc.nextFloat();
//         System.out.println("The Circuumference of the circle is "+CircleCircum(radius));
//     }
// }








//   Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
/**
 * Exercise
 */
// public class Exercise {
//     static void CheckAge(int age){
//         if (age>=18){
//             System.out.println("your are Eligiable of vote");
//         }
//         else {
//             System.out.println("your are not Eligiable");
//         }
//     }
//     public static void main(String[] args) {
//         System.out.print("Enter your age ");
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         CheckAge(age);
//     }
// }





// Write an infinite loop using do while condition.
/**
 * Exercise
 */
// public class Exercise {
//     public static void main(String[] args) {
//         int i=1;
//         do{
//             System.out.println("Hello word");
//             i++;
//         }while(i>0);
//     }
// }






 // Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered
/**
 * Exercise
 */
// public class Exercise {
//     public static void main(String[] args) {
//         float num;
//         int positive=0,
//             negative=0,
//             zero=0;
//         char check;
//         do{
//             System.out.print("Enter a number:");
//             Scanner sc = new Scanner(System.in);
//             num = sc.nextFloat();
//             if(num>0){
//                 positive++;
//             }
//             else if (num<0){
//                 negative++;
//             }
//             else{
//                 zero++;
//             }
//             System.out.println("Do you want do continue y/n");
//             check = sc.next().charAt(0);
//         }while(check=='y');  
//         System.out.println("positive number "+positive);   
//         System.out.println("negitive number "+negative);
//         System.out.println("zero number "+zero);
//     }
// }







//  Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥𝑛
// without function 
/**
 * Exercise
 */
// public class Exercise {
//     public static void main(String[] args) {
//         int power=1;
//        System.out.print("Enter the number:");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.print("Enter a number that will give you the value of "+x+"^n like:");
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//         power=power*x;
//        }
//        System.out.println(x+"^"+n+" is "+power);
//     }
// }








//  Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥𝑛
// with function 
/**
 * Exercise
 */
// public class Exercise {
//     static int Power(int x, int n){
//         int j=1;
//         for(int i=1;i<=n;i++){
//             j=j*x;
//         }
//         return j;
//     }
//     public static void main(String[] args) {
//         System.out.print("Enter the number:");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.print("Enter a number that will give you the value of "+x+"^n like:");
//        int n = sc.nextInt();
//        System.out.println(x+"^"+n+" is "+Power(x,n));
//     }
// }









//  Write a function that calculates the Greatest Common Divisor of 2 numbers.
/**
 * Exercise
 */
// public class Exercise {
//     static int gcdof(int num1,int num2){
//         int gcd=1;
//         for(int i =1;i<=num1&&i<=num2;i++){
//             if(num1%i==0 && num2%i==0){
//                 gcd=i;
//             }
//         }
//         return gcd;
//     }
//     public static void main(String[] args) {
//        System.out.println("Enter two number:");
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         System.out.println("GCD of "+ num1+" and "+ num2+" is "+gcdof(num1,num2));
//     }
// }








// Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 .....
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
/**
 * Exercise
 */
// public class Exercise {
//     public static void main(String[] args) {
//         int n1=0,n2=1,n3;
//         System.out.print("Enter a number to end fibonacci series:");  
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.print(n1+" "+n2);
//         for(int i=2;i<=n;i++){
//             n3=n1+n2;
//             System.out.print(" "+n3);
//             n1=n2;
//             n2=n3;
//         }
//     }
// }