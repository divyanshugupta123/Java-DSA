package practice;

public class pott2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,2,2};
		System.out.println(findDuplicate(arr));
		
	}
	public static int findDuplicate(int[] nums) {
		
        for(int i = 0;i<nums.length;i++) {
        	int ele = nums[i];
        	for(int j = i+1;j<nums.length;j++) {
        		if(ele == nums[j]) {
        			return ele;
        		}
        	}
        	
        }
        return -1;
    }

}
