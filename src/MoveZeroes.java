
/**
 * 	Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

	For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

	Note:
	You must do this in-place without making a copy of the array.
	Minimize the total number of operations.
 * 	@author 文超
 *  @date 2015-11-09
 *
 */
//一开始我理解成了把0移到最后，然后将其他元素排序
//然而并不需要排序
public class MoveZeroes {
    public void moveZeroesMethod(int[] nums) {
    	/*int length = nums.length;
    	int zeroCount = 0;
    	int firstZeroIndex = 0;
    	boolean indexFlag = true;
    	
    	//先计算数组中0的个数
    	for(int k=0;k<length;k++){
    		if(nums[k]==0)
    			zeroCount++;
    	}
    	
    	//如果没有零，就不排序了
		if (zeroCount == 0) {

		} else {
			//先对数组进行排序
	    	//Arrays.sort(nums);
	    	//计算排序后数组中第一个0出现的位置
	    	for(int k=0;k<length;k++){
	    		if(nums[k]==0){
	    			if(indexFlag){
	    				firstZeroIndex = k;
	    				indexFlag = false;
	    			}	
	    		}
	    	}
	    	//将非零数字移到前面
			for (int p = firstZeroIndex; p < length - zeroCount; p++) {
					nums[p] = nums[p + zeroCount];
			
			}
			//将零补到最后
			for(int p=length-zeroCount;p<length;p++){
				nums[p] = 0;
			}
		}
    	System.out.println(zeroCount);
    	for(int p=0;p<nums.length;p++){
    		System.out.print(nums[p]+" ");
    	}
    	System.out.println();
    	System.out.println(firstZeroIndex);*/
    	/*************************理解错题意华丽丽的分界线******************************************/
    	int notZeroCount = 0;
    	//把非零元素往前移
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]!=0){
    			nums[notZeroCount]=nums[i];
    			notZeroCount++;
    		}
    	}
    	//把零补全
    	for(int j=notZeroCount;j<nums.length;j++){
    		nums[j] = 0;
    	}
    }
    
    public static void main(String[] args){
    	int[] nums = {1,3,12,0,-1,0};
    	MoveZeroes mz = new MoveZeroes();
    	mz.moveZeroesMethod(nums);
    }
}
