import java.util.Scanner;

public class P3IndexedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        sc.close();
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==tar){
                    System.out.println((i+1)+" "+(j+1));
                    ans=1;
                    break;
                }
            }
            if(ans==1){
                break;
            }
        }
        if(ans==0){
            System.out.println("-1");
        }
    }
}
