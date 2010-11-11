import java.util.Arrays;


public class Array2 {
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
	
	public static int countEvens(int[] nums) {
		  int numEvens = 0;
		  for(int num: nums){
			  if(num % 2 == 0){
				  numEvens += 1;
			  }
		  }
		  return numEvens;
	}
	
	public static void main1(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{2, 1, 2, 3, 4},
			new int[]{2, 2, 0},
			new int[]{1, 3, 5}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + countEvens(a));
		}
	}
	
	public static int bigDiff(int[] nums) {
		  int max = Integer.MIN_VALUE;
		  int min = Integer.MAX_VALUE;
		  
		  for(int num: nums){
			  max = Math.max(max, num);
			  min = Math.min(min, num);
		  }
		  
		  return max-min;
	}
	
	public static void main2(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{10, 3, 5, 6},
			new int[]{7, 2, 10, 9},
			new int[]{2, 10, 7, 2}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + bigDiff(a));
		}
	}
	
	public static int centeredAverage(int[] nums) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		  
		for(int num: nums){
			max = Math.max(max, num);
			min = Math.min(min, num);
			sum += num;
		}
		sum -= (max + min);
		return sum/(nums.length-2);
	}
	
	public static void main3(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,2,3,4,100},
			new int[]{1,1,5,5,10,8,7},
			new int[]{-10,-4,-2,-4,-2,0}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + centeredAverage(a));
		}
	}

	public static int sum13(int[] nums) {
		int sum = 0;
		int l = nums.length;
		
		for(int i=0;i<l;i++){
			int num = nums[i];
			if(num == 13 || (i > 0 && nums[i-1] == 13)){
				continue;
			}
			sum += num;
		}
		
		return sum;
	}
	
	public static void main4(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,2,2,1},
			new int[]{1,1},
			new int[]{1,2,2,1,13}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + sum13(a));
		}
	}
	
	public static int sum67(int[] nums) {
		int sum = 0;
		int l = nums.length;
		boolean ignore = false;
		for(int i=0;i<l;i++){
			int num = nums[i];
			if(num == 6){
				ignore = true;
			}
			else if(ignore && (num == 7)){
				ignore = false;
				continue;
			}
			
			if(ignore){
				continue;
			}
			
			sum += num;
		}
		
		return sum;
	}
	
	public static void main5(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,2,2},
			new int[]{1,2,2,6,99,99,7},
			new int[]{1,1,6,7,2}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + sum67(a));
		}
	}
	
	public static boolean has22(int[] nums) {
		int l = nums.length;
		for(int i=0;i<l-1;i++){
			if((nums[i]== 2) && nums[i+1] == 2){
				return true;
			}
		}
		return false;
	}
	
	public static void main6(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,2,2},
			new int[]{1,2,1,2},
			new int[]{2,1,2}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + has22(a));
		}
	}
	
	public static boolean lucky13(int[] nums) {
		for(int num: nums){
			if((num == 3) || (num == 1)){
				return false;
			}
		}
		return true;
	}
	
	public static void main7(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{0,2,4},
			new int[]{1,2,3},
			new int[]{1,2,4}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + lucky13(a));
		}
	}
	
	public static boolean sum28(int[] nums) {
		int sum = 0;
		for(int num: nums){
			if(num != 2){
				continue;
			}
			sum += num;
			if(sum > 8){
				return false;
			}
		}
		
		return (sum == 8);
	}
	
	public static void main8(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{2,3,2,2,4,2},
			new int[]{2,3,2,2,4,2,2},
			new int[]{1,2,3,4}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + sum28(a));
		}
	}
	
	public static boolean more14(int[] nums) {
		int n1 = 0;
		int n4 = 0;
		for(int num: nums){
			n1 += (num == 1) ? 1 : 0;
			n4 += (num == 4) ? 1 : 0;
		}
		
		return n1 > n4;
	}
	
	public static void main9(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,4,1},
			new int[]{1,4,1,4},
			new int[]{1,1}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + more14(a));
		}
	}
	
	public static boolean only14(int[] nums) {
		for(int num: nums){
			if(num != 1 && num != 4){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main10(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,4,1, 4},
			new int[]{1,4,2,4},
			new int[]{1,1}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + only14(a));
		}
	}
	
	public static boolean no14(int[] nums) {
		boolean no1s = true;
		boolean no4s = true;
		for(int num: nums){
			if(num == 1){
				no1s = false;
			}
			else if(num == 4){
				no4s = false;
			}
		}
		
		return no1s || no4s;
	}
	
	public static void main11(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,2,3},
			new int[]{1,2,3,4},
			new int[]{2,3,4}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + no14(a));
		}
	}
	
	public static boolean isEverywhere(int[] nums, int val) {
		int l = nums.length;
		for(int i=0;i<l-1;i++){
			if((nums[i] != val) && (nums[i+1] != val)){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main12(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,2,1,3}, 1, 
			new int[]{1,2,1,3}, 2,
			new int[]{1,2,1,3,4}, 1 
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			int[] a = (int[]) inputs[i];
			int b = (Integer)inputs[i+1];
			System.out.println(arrStr(a) + "," + b + " ~> " + isEverywhere(a, b));
		}
	}
	
	public static boolean either24(int[] nums) {
		int l = nums.length;
		boolean found22 = false;
		boolean found44 = false;
		for(int i=0;i<l-1;i++){
			if((nums[i] == 2) && (nums[i+1] == 2)){
				found22 = true;
				if(found44){
					return false;
				}
			}
			else if((nums[i] == 4) && (nums[i+1] == 4)){
				found44 = true;
				if(found22){
					return false;
				}
			}
		}
		
		return found22 ^ found44;
	}
	
	public static void main13(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,2,2},
			new int[]{4,4,1},
			new int[]{4,4,1,2,2}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) +  " ~> " + either24(a));
		}
	}
	
	public static int matchUp(int[] nums1, int[] nums2) {
		int l = nums1.length;
		int cnt = 0;
		for(int i=0;i<l;i++){
			int n1 = nums1[i];
			int n2 = nums2[i];
			cnt += (n1 != n2 && Math.abs(n1-n2) <= 2) ? 1 : 0;
		}
		
		return cnt;
	}
	
	public static void main14(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,2,3},new int[]{2,3,10}, 
			new int[]{1,2,3},new int[]{2,3,5},
			new int[]{1,2,3},new int[]{2,3,3}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			int[] a = (int[]) inputs[i];
			int[] b = (int[]) inputs[i+1];
			System.out.println(arrStr(a) +  ", " + arrStr(b) + " ~> " + matchUp(a, b));
		}
	}
	
	public static boolean has77(int[] nums) {
		int l = nums.length;
		for(int i=0;i<l-2;i++){
			int a = nums[i];
			int b = nums[i+1];
			int c = nums[i+2];
			if(a*b == 49){
				return true;
			}
			else if(b*c == 49){
				return true;
			}
			else if(c*a == 49){
				return true;
			}
		}
		
		if(l > 1){
			if(nums[l-2] * nums[l-1] == 49){
				return true;
			}
		}
		return false;
	}
	
	public static void main15(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,7,7},
			new int[]{1,7,1,7},
			new int[]{1,7,1,1,7}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + has77(a));
		}
	}
	
	public static boolean has12(int[] nums) {
		boolean found1 = false;
		for(int n: nums){
			if(n == 1){
				found1 = true;
			}
			else if(n == 2){
				if(found1){
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main16(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,3,2},
			new int[]{3,1,2},
			new int[]{3,1,4,5,2}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + has12(a));
		}
	}
	
	public static boolean modThree(int[] nums) {
		int l = nums.length;
		for(int i=0;i<l-2;i++){
			int a = nums[i];
			int b = nums[i+1];
			int c = nums[i+2];
			if((a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0)){
				return true;
			}
			else if((a % 2 == 1) && (b % 2 == 1) && (c % 2 == 1)){
				return true;
			}
		}
		return false;
	}
	
	public static void main17(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{2,1,3,5},
			new int[]{2,1,2,5},
			new int[]{2,4,2,5}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + modThree(a));
		}
	}
	
	public static boolean haveThree(int[] nums) {
		int l = nums.length;
		int count = 0;
		for(int i=0;i<l-1;i++){
			int a = nums[i];
			int b = nums[i+1];
			if((a == 3) && (b == 3)){
				return false;
			}
			count += (a == 3) ? 1 : 0;
		}
		if(l > 0){
			count += (nums[l-1] == 3) ? 1 : 0;
		}
		
		return (count == 3);
	}
	
	public static void main18(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{3,1,3,1,3},
			new int[]{3,1,3,3},
			new int[]{3,4,3,3,4}
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + haveThree(a));
		}
	}
	
	public static boolean twoTwo(int[] nums) {
		int l = nums.length;
		if(l == 0){
			return true;
		}
		else if((l == 1) && (nums[0] == 2)){
			return false;
		}
		
		for(int i=1;i<=l-2;i++){
			if(nums[i] != 2){
				continue;
			}
						
			if((nums[i-1] != 2) && (nums[i+1] != 2 )){
				return false;
			}
		}
		
		if(nums[0] == 2 && nums[1] != 2){
			return false;
		}
		else if((nums[l-1] == 2) && (nums[l-2] != 2)){
			return false;
		}
		
		return true;
		
	}
	
	public static void main19(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{4,2,2,3},
			new int[]{2,2,4},
			new int[]{2,2,4,2}
		};
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + twoTwo(a));
		}
		
	}
	
	public static boolean sameEnds(int[] nums, int len) {
		if(len == 0){
			return true;
		}
		
		int l = nums.length;
		for(int i = 0; i < len; i++){
			if(nums[i] != nums[(l-1)-(len-i-1)]){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main20(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{5, 6, 45, 99, 13, 5, 6},1,
			new int[]{5, 6, 45, 99, 13, 5, 6},2,
			new int[]{5, 6, 45, 99, 13, 5, 6},3
		};
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			int[] a = (int[]) inputs[i];
			int b = (Integer) inputs[i+1];
			System.out.println(arrStr(a) + "," + b + " ~> " + sameEnds(a, b));
		}
		
	}
	
	public static boolean tripleUp(int[] nums) {
		int l = nums.length;
		for(int i=0;i<l-2;i++){
			int a = nums[i];
			int b = nums[i+1];
			int c = nums[i+2];
			if((c == b + 1) && (b == a+1)){
				return true;
			}
		}
		return false;
	}
	
	public static void main21(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1, 4, 5, 6, 2},
			new int[]{1,2,3},
			new int[]{1,2,4}
		};
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + tripleUp(a));
		}
		
	}
	
	public static int[] shiftLeft(int[] nums) {
		int l = nums.length;
		if(l == 0){
			return nums;
		}
		int first = nums[0];
		for(int i=0;i<=l-2;i++){
			nums[i]=nums[i+1];
		}
		nums[l-1] = first;
		return nums;
	}
	
	public static void main22(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{6,2,5,3},
			new int[]{1,2},
			new int[]{1}
		};
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + arrStr(shiftLeft(a)));
		}
		
	}
	
	public static int[] tenRun(int[] nums) {
		int l = nums.length;
		int mult10 = -1;
		for(int i=0;i<l;i++){
			int a = nums[i];
			if(a % 10 == 0){
				mult10 = a;
			}
			else{
				if(mult10 != -1){
					nums[i] = mult10;
				}
			}
		}
		return nums;
	}
	
	public static void main23(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{2, 10, 3, 4, 20, 5},
			new int[]{10, 1, 20, 2},
			new int[]{10, 1, 9, 20}
		};
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + arrStr(tenRun(a)));
		}
		
	}
	
	public static int[] pre4(int[] nums) {
		int l = nums.length;
		int ctr = 0;
		for(int i=0;i<l;i++){
			int a = nums[i];
			if(a != 4){
				ctr++;
			}
			else{
				break;
			}
		}
		return Arrays.copyOf(nums, ctr);
	}
	
	public static void main24(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,2,4,1},
			new int[]{3,1,4},
			new int[]{1,4,4}
		};
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + arrStr(pre4(a)));
		}
		
	}
	
	public static int[] post4(int[] nums) {
		int l = nums.length;
		int ctr = l-1;
		for(int i=l-1;i>=0;i--){
			int a = nums[i];
			if(a == 4){
				ctr = i;
				break;
			}
		}
		return Arrays.copyOfRange(nums, ctr+1, l);
	}
	
	public static void main25(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{2,4,1,2},
			new int[]{4,1,4,2},
			new int[]{4,4,1,2,3}
		};
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + arrStr(post4(a)));
		}
		
	}
	
	public static int[] notAlone(int[] nums, int val) {
		int l = nums.length;
		for(int i=1;i<=l-2;i++){
			int b = nums[i];
			
			if(val == b){
				int a = nums[i-1];
				int c = nums[i+1];
				if((a != b) && (b != c)){
					nums[i] = Math.max(a, c);
				}
			}
		}
		return nums;
	}
	
	public static void main26(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,2,3},2,
			new int[]{1, 2, 3, 2, 5, 2},2,
			new int[]{3,4},3
		};
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			int[] a = (int[]) inputs[i];
			int b = (Integer)inputs[i+1];
			System.out.println(arrStr(a) + " ~> " + arrStr(notAlone(a, b)));
		}
		
	}
	
	public static int[] zeroFront(int[] nums) {
		/*int l = nums.length;
		int[] zf = new int[l];
		int ctr = l-1;
		for(int i =l-1;i>=0;i--){
			int a = nums[i];
			if(a != 0){
				zf[ctr--]=a;
			}
		}
		for(int i=ctr;i>=0;i--){
			zf[ctr] = 0;
		}
		return zf;*/
		
		int l = nums.length;
		int ctr = 0;
		for(int i=0;i<=l-1;i++){
			if(nums[i] == 0){
				int temp = nums[ctr];
				nums[ctr] = nums[i];
				nums[i] = temp;
				ctr ++ ;
			}
		}
		
		return nums;
	}
	
	public static void main27(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,0,0,1},
			new int[]{0,1,1,0,1},
			new int[]{1,0}
		};
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + arrStr(zeroFront(a)));
		}
		
	}
	
	public static int[] withoutTen(int[] nums) {
		int l = nums.length;
		int ctr = 0;
		for(int i=0;i<=l-1;i++){
			int a = nums[i];
			if(a != 10){
				nums[ctr++] = a;
			}
		}
		for(int i=ctr;i<=l-1;i++){
			nums[i] = 0;
		}
		return nums;
	}
	
	public static void main28(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1,10,10,2},
			new int[]{10,2,10},
			new int[]{1,99,10}
		};
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + arrStr(withoutTen(a)));
		}
		
	}
	
	public static int[] zeroMax(int[] nums) {
		int l = nums.length;
		int largestOdd = Integer.MIN_VALUE;
		for(int i=l-1;i>=0;i--){
			int n = nums[i];
			if(n == 0){
				if(largestOdd != Integer.MIN_VALUE){
					nums[i] = largestOdd;	
				}
			}
			else{
				if(n % 2 == 1){
					largestOdd = Math.max(n, largestOdd);
				}
				 
			}
		}
		return nums;
	}
	
	public static void main29(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{0,5,0,3},
			new int[]{0,4,0,3},
			new int[]{0,1,0}
		};
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + arrStr(zeroMax(a)));
		}
		
	}
	
	public static int[] evenOdd(int[] nums) {
		int l = nums.length;
		int ctr = 0;
		for(int i=0;i<=l-1;i++){
			if(nums[i] % 2 == 0){
				int temp = nums[i];
				nums[i] = nums[ctr];
				nums[ctr] = temp;
				ctr += 1;
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		Object[] inputs = new Object[]{
			new int[]{1, 0, 1, 0, 0, 1, 1},
			new int[]{3,3,2},
			new int[]{2,2,2}
		};
		int l = inputs.length;
		for(int i = 0; i < l; i += 1){	
			int[] a = (int[]) inputs[i];
			System.out.println(arrStr(a) + " ~> " + arrStr(evenOdd(a)));
		}
		
	}
}
