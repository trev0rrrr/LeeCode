package trev0r.LeeCode;
public class LeeCode_1 extends AbstractSolution {
    public static String title = "Two Sum";
    public static String description = "Given an array of integers, " + sc +
            "return indices of the two numbers such that they add up to a specific target."+sc
            +"You may assume that each input would have exactly one solution, " + sc +
            "and you may not use the same element twice.";
    public static String 中文描述 ="给定一个整数数组、返回两个相加能等于目标值的元素的下标;" +sc+
            "注意：一个元素不能用两次";


    public static void main(String[] args) {

        //new LeeCode_1().QuestionDescribe();
        int[] arr= new int[]{3,2,4};
        int target=6;
        System.out.print("arr: ");
        for (int i :arr){
        	System.out.print(i);
        	System.out.print(' ');
        }
        System.out.println("\t target: "+target);
        new LeeCode_1().new Solution().twoSum(new int[]{3,2,4},6);
    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {
        	for(int i=0;i<nums.length-1;i++){
        		for(int j=i+1;j<nums.length;i++){
        			 if(nums[i]+nums[j]==target){
                         System.out.println("["+i+","+j+"]");
                     	return new int[]{i,j};
                     }
                     else
                         j+=1;
        		}
        		
        	}
            return null;
        }
    }
}

