/*Function overloading
Multiple Functions with the same name but different parameters*/

//Overloading using parameters

//Here the function is having same name but different no. of parameters       

import java.util.*;
public class Main{
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
       return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,6));
    } 
}

//Overloading using datatype

//Here the function is having same name but different type of parameters

import java.util.*;
public class Main{
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
       return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(sum(3,5));
        System.out.println(sum(3.5f,7.6f));
    } 
}
