import java.util.Scanner;
public class Solution {
// @AmanEleven
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n = 0;
       n=sc.nextInt();
        int array[] = new int[n];

        for (i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        sc.close();
        for (i=n-1;i>=0;i--)
        {
            System.out.print(array[i]+" ");
        }
    }
}



//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
