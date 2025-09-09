public class BruteForce {
    public static int maxSubarraySumLength(int[] arr,int target)
    {
        int n=arr.length;
        int maxLen=0;
        int sum=0;
        for(int i=0;i<n;i++)
       {
        for(int end=i;end<n;end++)
        {
            sum=0;
            for(int start=i;start<=end;start++)
            {
                sum+=arr[start];
                if(sum==target)
                {
                    maxLen=Math.max((end-start+1),maxLen);
                }
            }
        }
       }
       return maxLen;
    }
    public static void main(String[] args) {
       int arr[]={2,3,5};
       int target=5;
       System.out.println("Max Length of sub array sum:");
      int maxLen=maxSubarraySumLength(arr, target);
      System.out.println(maxLen);
        
    }
}


// Time Complexity:O(n^3)
// Space Complexity:O(1)
