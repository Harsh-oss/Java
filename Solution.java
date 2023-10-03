import java.util.*;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int ml = 0;
        int inti = 0;
        HashSet<Object> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hs.contains(s.charAt(i))) {
                hs.add(s.charAt(i));
                ml = Math.max(ml, hs.size());
            } else {
                hs.clear();
                i = inti;
                inti++;
            }
        }
        return ml;
    }

    public static Object lengthOfLongestSubstring2(String s) {
        int max = 0;
        HashSet<Object> hs = new HashSet<Object>();
        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(s.substring(i, i + 1))) {
                max = 0;
                hs.clear();
            } else {
                max++;
                hs.add(s.charAt(i));
            }

        }
        return hs;
    }


    public static int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

    public static int rti(String s) {
        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

    public static String longestPalindrome(String s) {
        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        System.out.println(rev);
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (rev.charAt(i) == s.charAt(i)) {
                s2 = s2 + rev.charAt(i);
            } else {
                return s.substring(0, 1);
            }
        }

        return s2;
    }

    public static boolean isPalindrome(int x) {
        int copy = x;
        if (x < 0)
            return false;
        else {
            int temp = 0;
            while (copy != 0) {
                int rem = copy % 10;
                temp = temp * 10 + rem;
                copy = copy / 10;
            }
            System.out.println(temp);
            System.out.println(x);
            return x == temp;
        }
    }

    public static int minOperations(int[] nums, int x) {
        int sum = 0;
        for (int i : nums) sum += i;
        if (nums[0] > x && nums[nums.length - 1] > x || x > sum) {
            return -1;
        }
        Queue<Integer> q = new PriorityQueue<Integer>();

        int fromlast = 0;
        int forlast = x;
        int last = nums.length - 1;

        while (forlast > 0) {
            forlast = forlast - nums[last];
            fromlast++;
            last--;
            if (forlast == 0) {
                q.add(fromlast);
            }
        }


        int fromfirst = 0;
        int forfirst = x;
        int first = 0;
        while (forfirst > 0) {
            forfirst = forfirst - nums[first];
            fromfirst++;
            first++;
            if (forfirst == 0) {
                q.add(fromfirst);
            }
        }


        int fromboth = 0;
        int forboth = x;
        int bothfirst = 0;
        int bothlast = nums.length - 1;
        while (forboth > 0) {
            forboth = forboth - nums[bothlast];
            bothlast--;
            fromboth++;
            if (forboth == 0) {
                q.add(fromboth);
            }
            forboth = forboth - nums[bothfirst];
            bothfirst++;
            fromboth++;
            if (forboth == 0) {
                q.add(fromboth);
            }
        }

        int result = q.peek();
        System.out.println(q);
        return result;
//        return -1;
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int len = n1 + n2;
        int[] newn = new int[len];
        System.arraycopy(nums1, 0, newn, 0, n1);
        System.arraycopy(nums2, 0, newn, n1, n2);
        Arrays.sort(newn);
        double result = 0;
        if (newn.length % 2 == 1) {
            result = newn[newn.length / 2];
        } else {
            int middle = newn.length / 2;

            int add = newn[middle] + newn[middle - 1];
            result = (double) add / 2;
        }
        return result;
    }

//    public static boolean isSubsequence(String s, String t) {
//
//        int i = 0;int j=0; int len = t.length()-1;int len2 = s.length();
//        if(s.isEmpty())
//            return true;
//        }
//        while(i<=len){
//            if(t.charAt(i)==s.charAt(j))
//                j++;
//            i++;
//            if(len2 ==  j)
//                return true;
//
//        }
//        return false;
//    }


    public static int longestStrChain(String[] words) {
        String[] W = words;
        Arrays.sort(W, (a, b) -> a.length() - b.length());
        int len = W.length;
        HashMap<String, Integer> dp = new HashMap<>();
        int max_chain = 0;
        for (int j = 0; j < len; j++) {
            dp.put(W[j], 1);

            for (int i = 0; i < W[j].length(); i++) {
                String prev_word = W[j].substring(0, i) + W[j].substring(i + 1);
                if (dp.containsKey(prev_word)) {
                    dp.put(W[j], Math.max(dp.get(W[j]), dp.get(prev_word) + 1));
                }

            }
            max_chain = Math.max(max_chain, dp.get(W[j]));


        }
        return max_chain;
    }


    public static String decodeAtIndex(String s, int k) {

        int n = 0;
        String newS = "";
        String str = "";
        String rs = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                str = str + s.charAt(i);
                str = "";
            } else if (Character.isDigit(s.charAt(i))) {
                int num = Integer.parseInt(String.valueOf(s.charAt(i)));
                for (int j = 0; j < num; j++) {
                    newS = newS + str;
                }
            }

        }
        System.out.println(newS);
        return String.valueOf(newS.charAt(k));
    }

    public static boolean isMonotonic(int[] nums) {
//        Example 1:
//
//        Input: nums = [1,2,2,3]
//        Output: true
//        Example 2:
//
//        Input: nums = [6,5,4,4]
//        Output: true
//        Example 3:
//
//        Input: nums = [1,3,2]
//        Output: false
        if (nums[0] < nums[nums.length - 1]) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean find132pattern(int[] nums) {
//        Input: nums = [-1,3,2,0]
//        Output: true
//        Explanation: There are three 132 patterns in the sequence:
//        [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0]. and {3,5,0,3,4}

        for (int i = 0; i < nums.length - 2; i++) {
            while (nums[i] == nums[i + 1]) {
                i++;
            }
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j; k < nums.length; k++) {
                    if ((nums[i] < nums[k]) && (nums[k] < nums[j])) {
                        return true;
                    }

                }

            }
        }
        return false;
    }

    public static String reverseWords(String s) {
//        Input: s = "Let's take LeetCode contest"
//        Output: "s'teL ekat edoCteeL tsetnoc"
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb1.append(s.charAt(i));
            if (s.charAt(i) == ' ') {
                sb1.deleteCharAt(sb1.length() - 1);
                sb.append(sb1.reverse());
                sb1.delete(0, sb1.length());
                sb.append(" ");
            }
        }
        sb.append(sb1.reverse());
        return sb.toString();
    }

    public static boolean winnerOfGame(String colors) {
//        Input: colors = "AAABABB"
//        Output: true
        int a = 0;
        int b = 0;
        if (!colors.contains("AAA")) {
            return false;
        }
        for (int i = 1; i < colors.length() - 1; i++) {
            if ((colors.charAt(i) == colors.charAt(i - 1)) && (colors.charAt(i) == colors.charAt(i + 1))) {
                {
                    if (colors.charAt(i) == 'A') {
                        a++;
                    } else
                        b++;
                }
            }
        }
        return a > b;
    }

    public static int numIdenticalPairs(int[] nums) {
        //Input: nums = [1,2,3,1,1,3]
// Output: 4
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(nums[i]==nums[j] && i<j){
                    count++;
                }
            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3}));
//        System.out.println(winnerOfGame("BBBAAAABB"));
//        String a = "AAABBBB";
//        System.out.println(a.substring(4, a.length() - 1));
//        System.out.println(reverseWords("Let's take LeetCode contest"));
//        System.out.println(find132pattern(new int[]{3,1,4,2}));
//        System.out.println(isMonotonic(new int[]{6,5,4,4}));
//        System.out.println(decodeAtIndex("leet2code3",10));
//        System.out.println(longestStrChain(new String[]{"xbc","pcxbcf","xb","cxbc","pcxbc"}));
//        System.out.println(isSubsequence("abc","ahbgdc"));
//        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,5}));
//        System.out.println(minOperations(new int[]{5207,5594,477,6938,8010,7606,2356,6349,3970,751,5997,6114,9903,3859,6900,7722,2378,1996,8902,228,4461,90,7321,7893,4879,9987,1146,8177,1073,7254,5088,402,4266,6443,3084,1403,5357,2565,3470,3639,9468,8932,3119,5839,8008,2712,2735,825,4236,3703,2711,530,9630,1521,2174,5027,4833,3483,445,8300,3194,8784,279,3097,1491,9864,4992,6164,2043,5364,9192,9649,9944,7230,7224,585,3722,5628,4833,8379,3967,5649,2554,5828,4331,3547,7847,5433,3394,4968,9983,3540,9224,6216,9665,8070,31,3555,4198,2626,9553,9724,4503,1951,9980,3975,6025,8928,2952,911,3674,6620,3745,6548,4985,5206,5777,1908,6029,2322,2626,2188,5639},565610));
//        System.out.println(isPalindrome(121));
//        System.out.println(longestPalindrome("ac"));
//        System.out.println(lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(lengthOfLongestSubstring2("pwwkew"));
//        System.out.println("HARSH".substring(3, 4));
//        System.out.println(rti("MCMXCIV"));
    }
}
