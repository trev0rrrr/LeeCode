public class LeeCode_1 extends AbstractSolution {
    public static String title = "Two Sum";
    public static String description = "Given an array of integers, " + sc +
            "return indices of the two numbers such that they add up to a specific target."+sc
            +"You may assume that each input would have exactly one solution, " + sc +
            "and you may not use the same element twice.";
    public static String 中文描述 ="给定一个整数数组、返回两个想加能等于目标值的元素的下标;" +sc+
            "注意：一个元素不能用两次";
    public String getDescription(){
        return description;
    }
    public static void main(String[] args) {

        new LeeCode_1().QuestionDescribe();
        new LeeCode_1().new Solution().twoSum(new int[]{3,2,4},6);
    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int i=0,j=1;
            while(i<nums.length-1){
                j=i+1;
                while(j<nums.length){
                    if(nums[i]+nums[j]==target)
                        return new int[]{i,j};
                    else
                        j+=1;
                }
                i+=1;
            }
            return null;
        }
    }
}

