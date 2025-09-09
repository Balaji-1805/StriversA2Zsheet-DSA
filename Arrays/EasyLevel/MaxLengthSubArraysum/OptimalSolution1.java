import java.util.HashMap;

public class OptimalSolution1 {

 public static int maxSubarraySumLength(int[] arr,int target)
    {
        int n=arr.length;
        int maxLen=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        // int arr[]={2,3,-1,2,3,1,-1}
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
            int val=sum-target;
            if(map.containsKey(val))
            {
                maxLen=Math.max(maxLen,i-map.get(val));
            }
        }
       return maxLen;
    }
    public static void main(String[] args) {
       int arr[]={2,0,0,4,1,1,1,1};
       int target=5;
       System.out.println("Max Length of sub array sum:");
      int maxLen=maxSubarraySumLength(arr,target);
      System.out.println(maxLen);
    }
}



// Time Complexity:O(n^2)or O(n log n)
// Space Complexity:O(1)
