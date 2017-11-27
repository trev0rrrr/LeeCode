package trev0r.LeeCode;

import java.util.Arrays;

public class LeeCode_2 extends AbstractSolution {
    public static String title = "Add Two Numbers";
    public static String description =
            "You are given two non-empty linked lists representing two non-negative integers. "+sc
                +"The digits are stored in reverse order and each of their nodes contain a single digit. "+sc
                +"Add the two numbers and return it as a linked list."+sc
                +"You may assume the two numbers do not contain any leading zero, except the number 0 itself."+sc
                +"Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)"+sc
                +"Output: 7 -> 0 -> 8";
    public static String 中文描述 ="给定两个非负整数链表,兩個数字以倒序存储在各个链表结点。" +sc+
            "將這兩個數字相加,以鏈錶形式返回(這兩個數字不以零開頭、除了零本身)";

    public static void main(String[] args) {
    	LeeCode_2 cur=new LeeCode_2();
    	/*ListNode l1_3=cur.new ListNode(3);l1_3.next=null;
    	ListNode l1_2=cur.new ListNode(4);l1_2.next=l1_3;
    	ListNode l1=cur.new ListNode(2);l1.next=l1_2;//2-4-3  342
    	
    	ListNode l2_3=cur.new ListNode(4);l2_3.next=null;
    	ListNode l2_2=cur.new ListNode(6);l2_2.next=l2_3;
    	ListNode l2=cur.new ListNode(5);l2.next=l2_2;//5-6-4  465      求和 807  7-0-8
*/
        //cur.new Solution().addTwoNumbers(l1, l2);
        Solution solution=cur.new Solution();
        new LeeCode_2().new Solution().addTwoNumbers(solution.createListNode("1"), solution.createListNode("99"));
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
    public class ListNode {
    	int val;
    	ListNode next;
    	ListNode(int x) { val = x; }
    	public String toString(){
			return Integer.toString(this.val);};
    }
    /* 
     * 用parseInt 需要考虑超过MAX_INT的情况    会抛出NumberFormatException
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {        	
        	int[] arr=new int[1];
        	for(int i=0;null!=l1||null!=l2;i++,l1=l1==null ? null : l1.next,l2=l2==null ? null : l2.next){
        		arr = Arrays.copyOf(arr, i+1); 
        		arr[i]=(null==l1 ? 0 :l1.val) + (null==l2 ? 0 : l2.val);
        	}
			return createListNode(arr,false);
        }
        
        public ListNode createListNode(int[] arr,boolean flag){
        	if(arr.length==0&&flag==false)
        		return null;
        	else if (arr.length==0&&flag==true){
        		return new ListNode(1);
        	}
        	else {
        		ListNode node=null ;
        		int[] arr2=Arrays.copyOfRange(arr, 1, arr.length);
				if(flag){ //来自上一次计算的 进位
					if(arr[0]+1>=10){ //进位后 又溢出   传参进位
						node=new ListNode(arr[0]+1-10);  //进位-10
						node.next=createListNode(arr2,true);
					}
					else{ //进位后不溢出  直接加1
						node= new ListNode(arr[0]+1);  //不进位置原值+上一次进位1
						node.next=createListNode(arr2,false);
					}
				}
				else{//来自上一次计算的 进位    不需要进位
					if(arr[0]>=10){
						node= new ListNode(arr[0]-10);//进位  arr[i]-10
						node.next=createListNode(arr2,true);
					}
					else{
						node= new ListNode(arr[0]); //不进位置原值
						node.next=createListNode(arr2,false);
					}
				}
        		return node;
        	}
        }// method end
        
        
        
        
        /*
         * 测试用方法
         * 根据原值生成ListNode
         * 如原值81 生成 1->8 ->null
         */
        public ListNode createListNode(String s){
        	if(s.length()==0||s==null)
        		return null;
        	else {
        		ListNode node=new ListNode(Integer.parseInt(s.charAt(s.length()-1)+""));
        		System.out.println(node);
        		node.next=createListNode(s.substring(0, s.length()-1));
        		return node;
        	}
        		
        	
        }
        
    }
}

