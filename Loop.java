//Sample function code to print

import java.util.*;
public class Main{
    public static void print(){
        System.out.println("Hello world");
    }
    public static void main(String[] args) {
        print(); 
    }
}


//Code for sum without parameters

import java.util.*;
public class Main{
    public static void Calsum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("the sum is : "+sum);
    }
    
    public static void main(String[] args) {
     Calsum(); 
    }
}

//Code for sum with parameters

import java.util.*;
public class Main{
    public static void Calsum(int a,int b){
        int sum=a+b;
        System.out.println("the sum is : "+sum);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
     Calsum(a,b);  
    }
}

//Code for sum using return type of 'int'   

import java.util.*;
public class Main{
    public static int Calsum(int a,int b){
        int sum=a+b;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum=Calsum(a,b);
        System.out.println("the sum is : "+sum);
    }
}

//Code for multiply a and b

import java.util.*;
public class Main{
    public static int prod(int a,int b){
        int Mul=a*b;
        return Mul;
    }
    
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int prod=prod(a,b);
        System.out.println("a * b = "+prod);
        prod=prod(10,20);
        System.out.println("a * b = "+prod);
    }
}


//Code for swapping numbers

import java.util.*;
public class Main{
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = "+a); 
        System.out.println("b = "+b);
    }
    
    public static void main(String[] args) {
        int a=10;
        int b=5;
        swap(a,b);
    }
}

//Call by value

//Sample code for call by value

import java.util.*;
public class Main{
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    
    public static void main(String[] args) {
        int a=10;
        int b=5;
        swap(a,b);
        System.out.println("a = "+a); 
        System.out.println("b = "+b);
    }
}
