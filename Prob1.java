import java.util.Arrays;
import java.util.Scanner;

class Prob1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        int count=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        if(count>=m){
            System.out.println("yes");
        }
        else{
            System.out.println("False");
        }

    }
    }
