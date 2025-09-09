import java.util.HashMap;

public class AdvanceOptimal {
    public static int maxSubarraySumLength(int[] arr,int target)
    {
        int n=arr.length;
        int start=0,end=0;
        int sum=0;
        int maxLen=0;
        // int arr[]={2,3,-1,1,1,1,1,1}
        while(end<n && start<n)
        {
            sum+=arr[start];
            if(sum==target)
            {
                maxLen=Math.max(maxLen,start-end+1);
            }
            else if(sum>target)
            {
                sum-=arr[end];
                if(sum==target)
                {
                    maxLen=Math.max(maxLen,start-end+1);
                }
                end++;
            }
            start++;
            
            
        }
       return maxLen;
    }
    public static void main(String[] args) {
       int arr[]={2, -1, 2, 3};
       int target=4;
       System.out.println("Max Length of sub array sum:");
      int maxLen=maxSubarraySumLength(arr,target);
      System.out.println(maxLen);
    }
}
