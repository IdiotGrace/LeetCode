/**
 * Given an array and a value, remove all instances of that value in place and return the new length.

   The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * @author 文超
 * @date 2015-11-09
 *
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
    	int noRepeatCount = 0;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]!=val){
    			nums[noRepeatCount] = nums[i];
    			noRepeatCount++;
    		}
    	}
		return noRepeatCount;
        
    }
    
    public static void main(String[] args){
    	RemoveElement re = new RemoveElement();
    	int[] nums={1,4,5,6,7,1};
    	System.out.println(re.removeElement(nums, 1));
    	
    }
}
