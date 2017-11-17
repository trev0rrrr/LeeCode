package trev0r.LeeCode;


import java.util.HashSet;
import java.util.Set;

public class LeeCode_3 extends AbstractSolution {
    public static String title = "Longest Substring Without Repeating Characters";
    public static String description =
            "Given a string, find the length of the longest substring without repeating characters. "+sc
                +"Examples: "+sc
                +"Given \"abcabcbb\", the answer is \"abc\", which the length is 3."+sc
                +"Given \"bbbbb\", the answer is \"b\", with the length of 1."+sc
                +"Given \"pwwkew\", the answer is \"wke\", with the length of 3. Note that the answer must be a substring, \"pwke\" is a subsequence and not a substring.\n" +
					"\n";
    public static String 中文描述 ="给定一个字符串,找到不含重复字母的最长子串." ;

    public static void main(String[] args) {
        System.out.println(new LeeCode_3().new Solution().lengthOfLongestSubstring("cdd"));
    }

    class Solution {
		public  int lengthOfLongestSubstring(String s) {
			int i = 0, j = 0, max = 0;
			Set<Character> set = new HashSet<>();

			while (j < s.length()) {
				if (!set.contains(s.charAt(j))) {//不含重复元素 直接添加计数
					set.add(s.charAt(j++));
					max = Math.max(max, set.size());
				} else {// 拥有重复元素、从头删除、直至该重复元素被删除。即重新计数
					set.remove(s.charAt(i++));
				}
			}

			return max;
		}
	}
}

