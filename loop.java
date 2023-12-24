//While loop

//Code for printing 10 times

import java.util.*;
public class loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        while(num<10){
            System.out.println("Hello world");
            num=num+1;
        }
    }
}

//Code for printing 1 to10

import java.util.*;
public class loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        while(num<10){
            num=num+1;
            System.out.print(num+" ");
        }
    }
}

//Code for sum of n natural number using loop

import java.util.*;
public class loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int i=1;
        System.out.println("enter n: ");
        int n=sc.nextInt();
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.print(sum);
    }
}

//Reversing number using while loop

import java.util.*;
public class loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r,rev=0;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("the reverse number is "+rev);
    }
}


//For loop

//Code for printing 1 to n

import java.util.*;
public class loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}

//Code for printing pattern using Nested loop 

import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              System.out.print("* ");  
            }
            System.out.println();
        }
    }
}

//Code for reversing number using for loop

import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r,rev=0;
        for(int i=n;i>0;i=i/10){
            r=i%10;
            rev=rev*10+r;
        }
        System.out.println("the reverse number is "+rev);
    }
}

//do while loop

//Code to print 10 times

import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        do{
            System.out.println("Hello world");
            n++;
        }while(n<10);
    }
}
