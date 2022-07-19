package LeetCode;

public class Single_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] nums= {4,1,2,1,2};
		int [] nums= {2,2,1};
		Check(nums);
	}
	public static void Check(int [] nums) {
		int count=0;
//		int n=0;
		for(int i=0;i<nums.length;i++) {
			boolean n=true;
			for(int j=1;j<nums.length-1;j++) {
				if(nums[i]==nums[j]) {
					n=false;	
				}
			}
			if(n) {
				System.out.println(nums[i]);
			}
		}
	}

}
