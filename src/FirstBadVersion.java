/**
 * You are a product manager and currently leading a team to develop a new product. 
 * Unfortunately, the latest version of your product fails the quality check. 
 * Since each version is developed based on the previous version, 
 * all the versions after a bad version are also bad.
 * 
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, 
 * which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which will return whether version is bad. 
 * Implement a function to find the first bad version. 
 * You should minimize the number of calls to the API.
 * 
 * @author 文超
 * @date 2015-11-11
 *
 */
public class FirstBadVersion {
	
	private int[] versionNum = {0,0,0,0,1,1,1};
	public boolean isBadVersion(int n){
		return versionNum[n-1]==1?true:false;
	}
	//这是一个超时的版本，哎呦喂
/*    public int firstBadVersion(int n) {
        int start = 1;
        int middle = 1;
        int end = n;
        while(start<=end){
        	middle = (start+end)/2;
        	if(isBadVersion(middle))
        		end = middle-1;
        	else
        		start = middle+1;
        }
        return end+1;
    }*/
    //和上面那个一样的，反正还超时
/*    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left<=right){
        	int mid = (left+right)/2;
        	if(isBadVersion(mid))
        		right = mid-1;
        	else
        		left = mid+1;
        }
        return left;
    }*/
	//终于Accepted了
	public int firstBadVersion(int n){
		if(n==1)
			return 1;
		int left = 1;
		int right = n;
		while(left<right){
			int mid = left + (right-left)/2;
			if(isBadVersion(mid)){
				right = mid;
			}else{
				left = mid+1;
			}
		}
		return right;
	}
    
    public static void main(String[] args){
    	FirstBadVersion testFBV = new FirstBadVersion();
    	System.out.println(testFBV.firstBadVersion(testFBV.versionNum.length));
    }
}
