import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Algorithm No.1 
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 * @author Grace
 * @date 2015-07-03 21:25
 *
 */
public class ContainsDuplicate {
	//效率太低.Time Limit Exceeded
//    public boolean containsDuplicate(int[] nums) {
//    	for(int i=0;i<nums.length;i++){
//    		for(int j=0;j<nums.length;j++){
//    			if(nums[i]==nums[j]&&i!=j)
//    				return true;
//    		}
//    	}
//		return false;  
//    }
	
	//Accept
    public boolean containsDuplicate(int[] nums) {
    	Map m = new HashMap();
    	for(int i:nums){
    		m.put(i, i);
    	}
    	return m.size()<nums.length?true:false;
    }
    
    public static void main(String args[]){
    	ContainsDuplicate cd = new ContainsDuplicate();
    	int[] nums = {1,2,3,4};
    	System.out.println(cd.containsDuplicate(nums));
    }
}
