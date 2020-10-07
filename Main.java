

import java.util.Scanner;

public class Main {
    static int i,c=0;

    static void merging(int arr1[],int arr2[],int m,int n,int mergeArrays[] ){
        for(i=0;i<(m+n);i++){
            if(i<m&&i<n)
              mergeArrays[i]=arr1[i];
            else if(i>=m)
                mergeArrays[i]=arr2[(i-m)];


        }
        for(i=0;i<(m+n);i++){
        System.out.print(mergeArrays[i]);
    }}
    public static void main(String[] args) {
        int n,m,arr1[],arr2[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        System.out.println("Enter the size of the second array");
        m=sc.nextInt();
        arr1=new int[m];
        arr2=new int[n];
        System.out.println("Enter the first array elements");
        for(i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the second one");
        for(i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int mergeArrays[]=new int[(m+n)];
        merging(arr1,arr2,m,n,mergeArrays);


	// write your code here
    }
}
