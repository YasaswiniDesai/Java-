## Code for factorial of n

```java
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
```
### Output :
![image](https://github.com/YasaswiniDesai/Java-/assets/92711164/f2b86a02-da71-4b95-ac70-e671491b725c)

## Code for factorial of n using recursion

```java
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
```
### Output :
![image](https://github.com/YasaswiniDesai/Java-/assets/92711164/cc98a6b5-1bea-4ba4-94b5-f3d822f9c2d1)

## Calculate the binomialcoefficient 

```java
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
```
### Output :
![image](https://github.com/YasaswiniDesai/Java-/assets/92711164/c3d351aa-202c-4c23-88e3-956b24db6ffd)
![image](https://github.com/YasaswiniDesai/Java-/assets/92711164/d93cb88c-5856-49ec-b551-5efcbe2367af)


## Binary to Decimal Code  

```java
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
```
### Output :
![image](https://github.com/YasaswiniDesai/Java-/assets/92711164/518038bf-254f-4e2b-ae3c-5206a4f8c256)

## Decimal to Binary Code 

```java
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
```
### Output :
![image](https://github.com/YasaswiniDesai/Java-/assets/92711164/1eaf9f93-6860-4a03-be22-d96ae7489a3f)

## Checking the Palindrome

```java
import java.util.*;
public class Main {
    public static int palindrome(int n) {
        int m=0;
        while(n>0){
        int r=n%10;
        m=m*10+r;
        n=n/10;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse=palindrome(n);
        if(reverse==n){
          System.out.println("Yes, it is palindrome");   
        }
        else{
            System.out.println("No, it is not palindrome"); 
        }
    }
}
```
### Output :
![image](https://github.com/YasaswiniDesai/Java-/assets/92711164/d4ca00a1-b5db-47a6-9a78-d7a9dab7b115)
![image](https://github.com/YasaswiniDesai/Java-/assets/92711164/b680b1aa-7e92-47e5-90b3-9e8adb07931c)


## Total sum of a Digit (for example 567 then sum is 5+6+7=18)
```java
import java.util.*;
public class Solution {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input an integer: "); 
        int digits=sc.nextInt();
        System.out.println("The sum is "+sumDigits(digits));
    }
    public static int sumDigits(int n) {
        int sumOfDigits=0;
        while(n>0) {
            int lastDigit=n%10;
            sumOfDigits+=lastDigit;
            n/=10;
        }
        return sumOfDigits;
    }
}
```
### Output :
![image](https://github.com/YasaswiniDesai/Java-/assets/92711164/5cf95e2b-637d-4ec8-a0e6-23c53978bac7)

