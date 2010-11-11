import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AP1 {
	private static String arrStr(int[] x){
		String s = "[";
		int l = x.length;
		
		if(l > 0){
			s += x[0];
		}
		
		for(int i=1; i<l;i++){
			s += ", " + x[i];
		}
		
		s += "]";
		return s;
	}
	
	private static String listStr(List<?> x){
		String s = "[";
		int l = x.size();
		
		if(l > 0){
			s += x.get(0).toString();
		}
		
		for(int i=1; i<l;i++){
			s += ", " + x.get(i).toString();
		}
		
		s += "]";
		return s;
	}
	
	private static String arrStr(String[] x){
		String s = "[";
		int l = x.length;
		
		if(l > 0){
			s += x[0];
		}
		
		for(int i=1; i<l;i++){
			s += ", " + x[i];
		}
		
		s += "]";
		return s;
	}
	
	public static boolean scoresIncreasing(int[] scores) {
		  int l = scores.length;
		  for(int i=1;i<l;i++){
			  if(scores[i] < scores[i-1]){
				  return false;
			  }
		  }
		  return true;
	}
	
	public static void main1(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,3,4},
			new int[]{1,3,2},
			new int[]{1,1,4}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + scoresIncreasing(a));
		}
	}
	
	public static boolean scores100(int[] scores) {
		  int l = scores.length;
		  for(int i=0;i<=l-2;i++){
			  if((scores[i] == 100) && (scores[i+1] == 100)){
				  return true;
			  }
		  }
		  return false;
	}
	
	public static void main2(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,100,100},
			new int[]{1,100,99,100},
			new int[]{100,1,100,100}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + scores100(a));
		}
	}
	
	public static boolean scoresClump(int[] scores) {
		  int l = scores.length;
		  for(int i=0;i<=l-3;i++){
			  int a = scores[i];
			  int b = scores[i+1];
			  int c = scores[i+2];
			  int d1 = Math.abs(a-b);
			  int d2 = Math.abs(b-c);
			  int d3 = Math.abs(c-a);
			  if((d1 <= 2) && (d2 <= 2) && (d3 <= 2)){
				  return true;
			  }
			  
		  }
		  return false;
	}
	
	public static void main3(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{3,4,5},
			new int[]{3,4,6},
			new int[]{1,3,5,5}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + scoresClump(a));
		}
	}
	
	public static int average(int[] scores, int start, int end){
		int sum = 0;
		for(int i = start; i <= end ; i++){
			sum += scores[i];
		}
		return sum/(end-start+1);
	}
	
	public static int scoresAverage(int[] scores) {
		int l = scores.length;
		int mid = l/2;
		int avg1 = average(scores, 0, mid-1);
		int avg2 = average(scores, mid, l-1);
		return Math.max(avg1, avg2);
	}
	
	public static void main4(String[] args){
		Object[] inputs = new Object[]{
			new int[]{2,2,4,4},
			new int[]{4,4,4,2,2,2},
			new int[]{3,4,5,1,2,3}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + scoresAverage(a));
		}
	}
	
	public static int wordsCount(String[] words, int len) {
		int count = 0;
		for(String w: words){
			count += (w.length() == len) ? 1 : 0;
		}
		return count;
	}
	
	public static void main5(String[] args){
		Object[] inputs = new Object[]{
			new String[]{"a", "bb", "b", "ccc"},1,
			new String[]{"a", "bb", "b", "ccc"},3,
			new String[]{"a", "bb", "b", "ccc"},4
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			String[] a = (String[]) inputs[i];
			int b = (Integer) inputs[i+1];
			System.out.println(arrStr(a) + "," + b + " ~> " + wordsCount(a, b));
		}
	}
	
	public static String[] wordsFront(String[] words, int n) {
		return Arrays.copyOf(words, n);
	}
	
	public static void main6(String[] args){
		Object[] inputs = new Object[]{
			new String[]{"a", "b", "c", "d"},1,
			new String[]{"a", "b", "c", "d"},2,
			new String[]{"a", "b", "c", "d"},3
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			String[] a = (String[]) inputs[i];
			int b = (Integer) inputs[i+1];
			System.out.println(arrStr(a) + "," + b + " ~> " + arrStr(wordsFront(a, b)));
		}
	}
	
	public static List<String> wordsWithoutList(String[] words, int len) {
		List<String> fw = new ArrayList<String>();
		for(String w: words){
			if(w.length() == len){
				continue;
			}
			fw.add(w);
		}
		return fw;
	}
	
	public static void main7(String[] args){
		Object[] inputs = new Object[]{
			new String[]{"a", "bb", "b", "ccc"},1,
			new String[]{"a", "bb", "b", "ccc"},3,
			new String[]{"a", "bb", "b", "ccc"},4
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			String[] a = (String[]) inputs[i];
			int b = (Integer) inputs[i+1];
			System.out.println(arrStr(a) + "," + b + " ~> " + listStr(wordsWithoutList(a, b)));
		}
	}
	
	public static boolean hasOne(int n) {
		
		while(n != 0){
			int digit = n % 10;
			if(digit == 1){
				return true;
			}
			n /= 10;
		}
		return false;
	}
	
	public static void main8(String[] args){
		Object[] inputs = new Object[]{
			10,
			22,
			220
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int a = (Integer) inputs[i];
			System.out.println(a + " ~> " + hasOne(a));
		}
	}
	
	public static boolean dividesSelf(int n) {
		int t = n;
		while(n != 0){
			int digit = n % 10;
			if(digit == 0){
				return false;
			}
			if(t % digit != 0){
				return false;
			}
			n /= 10;
		}
		return true;
	}
	
	public static void main9(String[] args){
		Object[] inputs = new Object[]{
			128,
			12,
			120
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int a = (Integer) inputs[i];
			System.out.println(a + " ~> " + dividesSelf(a));
		}
	}
	
	public static int[] copyEvens(int[] nums, int count) {
		int c = 0;
		int l = nums.length;
		for(int i=0;i<l;i++){
			int a = nums[i];
			if(a % 2 == 0){
				nums[c++] = a;
			}
		}
		return Arrays.copyOf(nums, count);
	}	
	
	public static void main10(String[] args){
		Object[] inputs = new Object[]{
			new int[]{3, 2, 4, 5, 8}, 2,
			new int[]{3, 2, 4, 5, 8}, 3,
			new int[]{6, 1, 2, 4, 5, 8}, 3
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			int[] a = (int[]) inputs[i];
			int b = (Integer) inputs[i+1];
			System.out.println(arrStr(a) + ", " + b + " ~> " + arrStr(copyEvens(a, b)));
		}
	}
	
	public static boolean isEndy(int n){
		return (((n >= 0) && (n <= 10)) || ((n >= 90) && (n <= 100)));
	}
	
	public static int[] copyEndy(int[] nums, int count) {
		int c = 0;
		int l = nums.length;
		for(int i=0;i<l;i++){
			int a = nums[i];
			if(isEndy(a)){
				nums[c++] = a;
			}
		}
		return Arrays.copyOf(nums, count);
	}	
	
	public static void main11(String[] args){
		Object[] inputs = new Object[]{
			new int[]{9, 11, 90, 22, 6}, 2,
			new int[]{9, 11, 90, 22, 6}, 3,
			new int[]{12, 1, 1, 13, 0, 20}, 2
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			int[] a = (int[]) inputs[i];
			int b = (Integer) inputs[i+1];
			System.out.println(arrStr(a) + ", " + b + " ~> " + arrStr(copyEndy(a, b)));
		}
	}
	
	public static int matchUp(String[] a, String[] b) {
		int l = a.length;
		int c = 0;
		for(int i=0;i<l;i++){
			String s1 = a[i];
			String s2 = b[i];
			
			if(!s1.equals("") && !s2.equals("")){
				if(s1.charAt(0) == s2.charAt(0)){
					c++;
				}	
			}
		}
		return c;
	}	
	
	public static void main12(String[] args){
		Object[] inputs = new Object[]{
			new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"},
			new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"},
			new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			String[] a = (String[]) inputs[i];
			String[] b = (String[]) inputs[i+1];
			System.out.println(arrStr(a) + ", " + arrStr(b) + " ~> " + matchUp(a, b));
		}
	}
	
	public static int scoreUp(String[] key, String[] answers) {
		int l = key.length;
		int score = 0;
		for(int i=0;i<l;i++){
			String k = key[i];
			String a = answers[i];
			
			if(a.equals("?")){
				continue;
			}
			
			if(k.equals(a)){
				score += 4;
			}
			else{
				score -= 1;
			}
		}
		return score;
	}	
	
	public static void main13(String[] args){
		Object[] inputs = new Object[]{
			new String[]{"a", "a", "b", "b"}, new String[]{"a", "c", "b", "c"},
			new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "c"},
			new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "b"}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			String[] a = (String[]) inputs[i];
			String[] b = (String[]) inputs[i+1];
			System.out.println(arrStr(a) + ", " + arrStr(b) + " ~> " + scoreUp(a, b));
		}
	}
	
	public static String[] wordsWithout(String[] words, String target) {
		int ctr = 0;
		for(String w: words){
			if(w.equals(target)){
				continue;
			}
			words[ctr++] = w;
		}
		return Arrays.copyOf(words, ctr);
	}	
	
	public static void main14(String[] args){
		Object[] inputs = new Object[]{
			new String[]{"a", "b", "c", "a"}, "a",
			new String[]{"a", "b", "c", "a"}, "b",
			new String[]{"a", "b", "c", "a"}, "c"
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			String[] a = (String[]) inputs[i];
			String b = (String) inputs[i+1];
			System.out.println(arrStr(a) + ", " + b + " ~> " + arrStr(wordsWithout(a, b)));
		}
	}
	
	public static int maxSpecialScore(int[] scores){
		int max = 0;
		for(int s: scores){
			if(s % 10 != 0){
				continue;
			}
			max = Math.max(max, s);
		}
		return max;
	}
	
	public static int scoresSpecial(int[] a, int[] b) {
		return maxSpecialScore(a) + maxSpecialScore(b);
	}	
	
	public static void main15(String[] args){
		Object[] inputs = new Object[]{
			new int[]{12, 10, 4}, new int[]{2,20,30},
			new int[]{20,10,4}, new int[]{2,20,10},
			new int[]{12,11,4}, new int[]{2,20,31},
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			int[] a = (int[]) inputs[i];
			int[] b = (int[]) inputs[i+1];
			System.out.println(arrStr(a) + ", " + arrStr(b) + " ~> " + scoresSpecial(a, b));
		}
	}
	
	public static int userCompare(String aName, int aId, String bName, int bId) {
		int x = aName.compareTo(bName);
		if(x == 0){
			int y = new Integer(aId).compareTo(bId);
			if(y == 0){
				return 0;
			}
			else{
				return y/Math.abs(y);
			}
		}
		else{
			return x/Math.abs(x);
		}
		
	}	
	
	public static void main16(String[] args){
		Object[] inputs = new Object[]{
			"bb", 1, "zz", 2,
			"bb", 1, "aa", 2,
			"bb", 1, "bb", 1
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 4){	
			String a = (String)inputs[i];
			int b = (Integer)inputs[i+1];
			String c = (String)inputs[i+2];
			int d = (Integer)inputs[i+3];
			
			System.out.println(a + ", " + b + ", " + c + ", " + d + " ~> " + userCompare(a, b, c, d));
		}
	}
	
	public static String[] mergeTwo(String[] a, String[] b, int n) {
		String[] merged = new String[n];
		int ac = 0, bc = 0, mc=0;
		for(int i=0;i<n;i++){
			if(a[ac] == b[bc]){
				merged[mc++] = a[ac++];
				bc++;
			}
			else{
				merged[mc++] = (a[ac].compareTo(b[bc]) < 0) ? a[ac++] : b[bc++];
			}	
		}
		return merged;
	}	
	
	public static void main17(String[] args){
		Object[] inputs = new Object[]{
			new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3,
			new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3,
			new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 3){	
			String[] a = (String[])inputs[i];
			String[] b = (String[]) inputs[i+1];
			int c = (Integer) inputs[i+2];
			System.out.println(arrStr(a) + ", " + arrStr(b) + ", " + c + " ~> " + arrStr(mergeTwo(a, b, c)));
		}
	}
	
	public static int commonTwo(String[] a, String[] b) {
		int al = a.length;
		int bl = b.length;
		int c = 0;
		
		int ac = 0, bc = 0;
		String prevMatch = "";
		
		while((ac < al) && (bc < bl)){
			if(a[ac] == b[bc]){
				if(!prevMatch.equals(a[ac])){
					c++;
					prevMatch = a[ac];
				}
				
				ac++;
				bc++;
				
				continue;
			}
			
			if(a[ac].compareTo(b[bc]) < 0){
				while((ac < al) && (a[ac].compareTo(b[bc]) < 0)){
					ac ++;
				}
			}
			else{
				while((bc < bl) && (a[ac].compareTo(b[bc]) > 0)){
					bc ++;
				}
			}	
		}
		
		return c;
	}	
	
	public static void main(String[] args){
		Object[] inputs = new Object[]{
			new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"},
			new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"},
			new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"},
			new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			String[] a = (String[])inputs[i];
			String[] b = (String[]) inputs[i+1];
			System.out.println(arrStr(a) + ", " + arrStr(b) + " ~> " + commonTwo(a, b));
		}
	}
}
