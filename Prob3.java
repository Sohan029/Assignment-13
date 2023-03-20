// import java.util.Arrays;
import java.util.Scanner;

public class P2WaterCon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        // int len = n-1;
        
        int left=0,right=n-1;
        int max=0;
        while(left<right){
            max=Math.max(max,Math.min(arr[left],arr[right])*(right-left));
            if(left>right) right--;
            else left++;
        }
        System.out.println(max);
    }
}
