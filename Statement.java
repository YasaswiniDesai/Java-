//Break statement

//Code for Sample break 

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            if(i==3){
                break;
            }
        System.out.println(i);
        }
    System.out.println("I'm out of the loop");
    }
}

//Code for keep entering values till user enters multiple of 10

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter the random values");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}

//Continue Statement

//Sample code for continue statement

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i+" ");
        }
    }
}
