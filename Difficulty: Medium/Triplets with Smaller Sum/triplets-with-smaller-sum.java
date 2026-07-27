class Solution {
    int countTriplets(int target, int arr[]) {
        Arrays.sort(arr);
        int n = arr.length,count = 0;
        for(int i=0;i<n-2;i++){
            int j = i+1,k = n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum>=target) k--;
                else{
                    count+=k-j;
                    j++;
                }
            }
        }
        return count;
    }
}