//Code for factorial of n

import java.util.*;
public class Main{
    public static int fact(int n){
        int f=1;
        for(int i=1; i<=n;i++){
            f=f*i;
        }
        return f;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("factorial of " + n + " is "+ fact(n));
    }
}

//Code for factorial of n using recursion

import java.util.*;
public class Main{
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("factorial of " + n + " is "+ fact(n));
    }
}

//Calculate the binomialcoefficient 

import java.util.*;
public class Main{
    public static int fact(int n){
         int f=1;
        for(int i=1; i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binomialcoefficient(int n,int r){
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        int bc=a/(b*c);
        return bc;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(binomialcoefficient(n,r));
    } 
}

//Binary to Decimal Code  

import java.util.*;
import java.lang.Math;
public class Main {
    public static void binary(int n) {
        int decimal=0;
        int i=0;
        while(n>0){
            int r=n%10;
            decimal=decimal+(r*(int)Math.pow(2,i));
            i++;
            n=n/10;
        }
        System.out.print("The decimal Value is\n"+decimal);
    }
    public static void main(String[] args){
       System.out.println("Enter the Binary Value :");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        binary(n);
    }
}

//Decimal to Binary Code  

import java.util.*;
import java.lang.Math;
public class Main {
    public static void decimal(int n) {
        int binary=0;
        int i=0;
        while(n>0){
            int r=n%2;
            binary=binary+r*(int)Math.pow(10,i);
            i++;
            n=n/2;
        }
        System.out.println(binary);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
           System.out.println("The Binary Value From 1 to 10 is :");
           for(int i=1;i<=10;i++){
           decimal(i);
           }
    }
}
