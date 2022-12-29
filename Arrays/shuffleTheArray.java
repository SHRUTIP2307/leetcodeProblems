/* Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn],
Return the array in the form [x1,y1,x2,y2,...,xn,yn]. */

class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int num = 2*n;
        int temp = 0;
        int flag = 0;
        int arr[] = new int[num];
        for(int i = 1; i<num; i=i+2,temp++) //filling odd places with y values
        {
                int j = n+temp;
                arr[i] = nums[j];
        }
        for(int k = 0; k<num; k=k+2,flag++)//filling even places with x values
        {
            arr[k] = nums[flag]; 
        }
    return arr;    
    }
}