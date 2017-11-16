public class LeeCode_2 extends AbstractSolution {
    public static String title = "Add Two Numbers";
    public static String description =
            "You are given two non-empty linked lists representing two non-negative integers. "+sc
                +"The digits are stored in reverse order and each of their nodes contain a single digit. "+sc
                +"Add the two numbers and return it as a linked list."+sc
                +"You may assume the two numbers do not contain any leading zero, except the number 0 itself."+sc
                +"Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)"+sc
                +"Output: 7 -> 0 -> 8";
    public static String 中文描述 ="给定一个整数数组、返回两个想加能等于目标值的元素的下标;" +sc+
            "注意：一个元素不能用两次";
    public String getDescription(){
        return description;
    }
    public static void main(String[] args) {

        new LeeCode_2().QuestionDescribe();
        //new LeeCode_1().new Solution().twoSum(new int[]{3,2,4},6);
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
   /* class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        }
    }*/
}

