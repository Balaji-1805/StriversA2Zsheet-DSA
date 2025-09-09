public class BetterSolution {

 public static int maxSubarraySumLength(int[] arr,int target)
    {
        int n=arr.length;
        int maxLen=0;
        for(int start=0;start<n;start++)
        {
            int sum=0;
            for(int end=start;end<n;end++)
            {
                sum+=arr[end];
                if(sum==target)
                {
                    maxLen=Math.max(end-start+1,maxLen);
                }
            }
       }
       return maxLen;
    }
    public static void main(String[] args) {
       int arr[]={2,-2,2,2};
       int target=2;
       System.out.println("Max Length of sub array sum:");
      int maxLen=maxSubarraySumLength(arr,target);
      System.out.println(maxLen);
    }
}



// Time Complexity:O(n^2)
// Space Complexity:O(1)
