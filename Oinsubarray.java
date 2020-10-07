import java.util.Scanner;

public class Oinsubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int i, j, k;
        int n;
        System.out.println("Enter the size");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the array elements");


        for (i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            int sum = 0;
            for (j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum == 0) {

                    for (k = i; k <= j; k++)
                        System.out.print(arr[k]+" ");

                }

                System.out.print("\n");
            }
        }
    }}

