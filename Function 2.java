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
