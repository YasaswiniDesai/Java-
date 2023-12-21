//Conditional Statements

//if else
//If else code for a number to be + or - 

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0){
            System.out.println(n+" is positive");
        }
        else{
          System.out.println(n+" is negative");  
        }
    }
}

//else if
//Else if code for tax calculating
 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income=sc.nextInt();
        float tax;
        if(income<500000){
            tax=0;
        }
        else if(income>=500000 && income<1000000){
            tax=(float)(income*0.2);
        }
        else{
            tax=(float)(income*0.3);
        }
        System.out.println(tax);
    }
}

//Else if code for largest of 3

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b&&a>=c){
            System.out.println(a+" is the largest");
        }
        else if(b>=c){
            System.out.println(b+" is the largest");
        }
        else{
            System.out.println(c+" is the largest");
        }
    }
}

//Ternary Operator
//Code for checking a number is even or odd

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n=sc.nextInt();
        String type;
        type=(n%2==0)?"even":"odd";
        System.out.println(type);
    }
}

//Switch
//Sample switch code

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=2;
        switch(n){
            case 1 :System.out.println("one");
                    break;
            case 2 :System.out.println("two");
                    break;
            case 3 :System.out.println("three");
                    break;
            default :System.out.println("no num");
        }
    }
}

//Calculator using switch

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();
         System.out.println("enter operator:");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':System.out.println(a+b);
                    break;
            case '-' :System.out.println(a-b);
                    break;
            case '*' :System.out.println(a*b);
                    break;
            case '/' :System.out.println(a/b);
                    break;
            case '%' :System.out.println(a%b);
                    break;
                    
            default :System.out.println("wrong operator");
        }
    }
}

