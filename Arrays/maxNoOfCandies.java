/* There are n kids with candies. You are given an integer array candies, 
where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, 
denoting the number of extra candies that you have. Return a boolean array result of length n, 
where result[i] is true if, after giving the ith kid all the extraCandies, 
they will have the greatest number of candies among all the kids, or false otherwise. */

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int n = candies.length;
        boolean flag = false;
        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if((candies[i]+extraCandies) >= candies[j])
                {
                    flag = true;
                    //result.add(true);
                }
                else
                {
                    flag = false;
                    break;
                    //result.add(false);
                }
                
            }
            if(flag == true)
                result.add(true);
            else
                result.add(false);
            
        }
        return result;
        
    }