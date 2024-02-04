## Creating and taking input and showing output

```java
import java.util.*;
public class Array{
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size value :");
        int n=sc.nextInt();
        int marks[] = new int[50];
        System.out.println("Enter the values :");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("The array values are:");
        for(int i=0;i<n;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
```
![image](https://github.com/YasaswiniDesai/Java-/assets/92711164/963e2083-ced1-4743-be3c-5bd3b3351554)

## Updating the array values by 1 

```java
import java.util.*;
public class App {
    public static void Update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size value :");
        int n=sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter the array values :");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        Update(marks);
        System.out.println("The updated Array values are:");
        for(int i=0;i<n;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
```

## Linear Search

```java
import java.util.*;
public class App {
    public static int Linearsearch(int marks[],int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size value :");
        int n=sc.nextInt();
        int marks[] = new int[n];
        int key=10;
        System.out.println("enter the array values :");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        int index=Linearsearch(marks,key);
        if(index !=-1){
            System.out.println("Key Found at index " + index);
        }
        else{
            System.out.println("Key not Found");
        }
    }
}
```

## Linear Search in String Version

```java
import java.util.*;
public class App {
    public static int Linearsearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size value: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String menu[] = new String[n];
        String key = "Dosa";
        System.out.println("Enter the array values:");
        for (int i = 0; i < n; i++) {
            menu[i] = sc.nextLine();
        }
        int index = Linearsearch(menu, key);
        if (index != -1) {
            System.out.println("Key Found at index " + index);
        } else {
            System.out.println("Key not Found");
        }
    }
}
```

## Largest of Array numbers 

```java
import java.util.*;
public class App{
    public static int Largestarray(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
              max =arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       System.out.print("Size :");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the array values :");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       int largest= Largestarray(arr);
       System.out.println("The Largest of the Array is :"+ largest);
    }
}
```

## Smallest and Largest of Array numbers 

```java
import java.util.*;
public class App{
    public static int Largestarray(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
              max =arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The Smallest of the Array is :"+min);
        return max;
    }
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       System.out.print("Size :");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the array values :");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       int largest= Largestarray(arr);
       System.out.println("The Largest of the Array is :"+ largest);
    }
}
```

## Binary Search

```java
import java.util.*;
public class App{
    public static int BinarySearch(int arr[],int key){
        Arrays.sort(arr);
        System.out.println("The sorted array is :");
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
        int low=0,high=arr.length -1;
          while(low<=high){
          int mid=(low+high)/2;
           if(arr[mid]==key){
            return mid;
           }
           if(arr[mid]>key){
            high=mid-1;
           }else{
            low=mid+1;
           }
          }
    return -1;
    }
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       System.out.print("Size :");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the array values in :");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
        System.out.println("Enter the key");
       int key=sc.nextInt();
       int result= BinarySearch(arr,key);
       if(result!=0){
       System.out.println("Found the Key at index "+result);
       }else{
       System.out.println("Key not Found");
       }
    }
}
```

## Reverse the array without using any external array

```java
import java.util.*;
public class App{
    public static void ReverseArray(int arr[]){
       int first=0,last=arr.length-1;
       while(first<last){
        int temp=arr[last];
        arr[last]=arr[first];
        arr[first]=temp;
        first++;
        last--;
       }
    }
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       System.out.print("Size :");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the array values in :");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       ReverseArray(arr);
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
    }
}
```

## Print Pairs from Array 

```java
import java.util.*;
public class App{
    public static void Printpairs(int arr[]){
       for(int i=0;i<arr.length;i++){
        int pair=arr[i];
        for(int j=i+1;j<arr.length;j++){
            System.out.print("("+pair+","+arr[j]+") ");
        }
          System.out.println();
       }
    } 
    public static void main(String args[]){
     int array[]={2,4,6,8,10};
    Printpairs(array);
}
}
```

## Print Subarray of Array

```java
import java.util.*;
public class App{
    public static void Subarray(int arr[]){
       for(int i=0;i<arr.length;i++){
        int sub=arr[i];
        for(int j=i;j<arr.length;j++){
           for(int k=i;k<=j;k++){
            System.out.print(arr[k]+" ");
           }
           System.out.println();
        }
          System.out.println();
       }
    }
    public static void main(String args[]){
     int array[]={2,4,6,8,10};
    Subarray(array);
}
}
```
