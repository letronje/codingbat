
public class Logic2 {
	public static boolean makeBricks(int small, int big, int goal) {
		int bigreq = goal / 5;
		if(big >= bigreq){
			if(small >= goal%5){
				return true;
			}
		}
		else{
			int r = goal - big*5;
			if(small >= r){
				return true;
			}
		}
		
		
		int r = goal - small;
		if(r%5 == 0){
			int nb = r/5;
			if(big >= nb){
				return true;
			}
		}
		
		return false;
	}

	public static void main1(String[] args) {
		Object[] inputs = new Object[]{
			3, 1, 8,
			3, 1, 9, 
			3, 2, 10,
			3, 2, 9
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 3){	
			int s = (Integer) inputs[i];
			int b = (Integer) inputs[i+1];
			int g = (Integer) inputs[i+2];
			System.out.println(s + "," + b + "," + g + " ~> " + makeBricks(s, b, g));
		}
	}
	
	public static int loneSum(int a, int b, int c) {
		  if(a == b && b == c){
			  return 0;
		  }
		  if(a == b){
			  return c;
		  }
		  if(b == c){
			  return a;
		  }
		  if(a == c){
			  return b;
		  }
		  return a + b + c;
	}

	public static void main2(String[] args) {
		Object[] inputs = new Object[]{
			1,2,3,
			3,2,3,
			3,3,3
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 3){	
			int a = (Integer) inputs[i];
			int b = (Integer) inputs[i+1];
			int c = (Integer) inputs[i+2];
			System.out.println(a + "," + b + "," + c + " ~> " + loneSum(a, b, c));
		}
	}
	
	public static int luckySum(int a, int b, int c) {
		  if(a == 13){
			  return 0;
		  }
		  if(b == 13){
			  return a;
		  }
		  if(c == 13){
			  return a + b;
		  }
		  return a + b + c;
	}
	
	public static void main3(String[] args) {
		Object[] inputs = new Object[]{
			1,2,3,
			1,2,13,
			1,13,3
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 3){	
			int a = (Integer) inputs[i];
			int b = (Integer) inputs[i+1];
			int c = (Integer) inputs[i+2];
			System.out.println(a + "," + b + "," + c + " ~> " + luckySum(a, b, c));
		}
	}
	
	public static int fixTeen(int a){
		return (a >= 13 && a <= 19 && a!= 15 && a!= 16) ? 0 : a;
	}
	
	public static int noTeenSum(int a, int b, int c){
		return fixTeen(a) + fixTeen(b) + fixTeen(c);
		
	}
	
	public static void main4(String[] args) {
		Object[] inputs = new Object[]{
			1,2,3,
			2,13,1,
			2,1,14
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 3){	
			int a = (Integer) inputs[i];
			int b = (Integer) inputs[i+1];
			int c = (Integer) inputs[i+2];
			System.out.println(a + "," + b + "," + c + " ~> " + noTeenSum(a, b, c));
		}
	}
	
	public static int round10(int num) {
		int x = num%10;
		if(x >= 5){
			return num + 10-(x);
		}
		else{
			return num - x;
		}
		
	}
	public static int roundSum(int a, int b, int c){
		return round10(a) + round10(b) + round10(c);
	}

	
	public static void main5(String[] args) {
		Object[] inputs = new Object[]{
			16,17,18,
			12,13,14,
			6,4,4
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 3){	
			int a = (Integer) inputs[i];
			int b = (Integer) inputs[i+1];
			int c = (Integer) inputs[i+2];
			System.out.println(a + "," + b + "," + c + " ~> " + roundSum(a, b, c));
		}
	}
	
	public static boolean closeFar(int a, int b, int c) {
		  if((Math.abs(b-a) < 2) && (Math.abs(c-a) >= 2) && (Math.abs(c-b) >= 2)){
			  return true;
		  }
		  if((Math.abs(c-a) < 2) && (Math.abs(b-c) >= 2) && (Math.abs(b-a) >= 2)){
			  return true;
		  }
		  return false;
	}
	
	public static void main6(String[] args) {
		Object[] inputs = new Object[]{
			1,2,10,
			1,2,3,
			4,1,3
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 3){	
			int a = (Integer) inputs[i];
			int b = (Integer) inputs[i+1];
			int c = (Integer) inputs[i+2];
			System.out.println(a + "," + b + "," + c + " ~> " + closeFar(a, b, c));
		}
	}
	
	public static int blackjack(int a, int b) {
		if(21-a >= 0){
			if(21-b >= 0){
				return a > b ? a : b;
			}
			else{
				return a;
			}
		}
		else{
			if(21-b >= 0){
				return b;
			}
			else{
				return 0;
			}
		}
		
	}
	
	public static void main7(String[] args) {
		Object[] inputs = new Object[]{
			19, 21,
			21, 19, 
			19, 22
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 2){	
			int a = (Integer) inputs[i];
			int b = (Integer) inputs[i+1];
			System.out.println(a + "," + b + " ~> " + blackjack(a, b));
		}
	}
	
	public static boolean evenlySpaced(int a, int b, int c) {
		int min = a <= b ? a : b;
		min = min <= c ? min : c;
		  
		int max = a >= b ? a : b;
		max = max >= c ? max : c;
		 
		int middle = 0;
		
		if(a == min){
			middle = (c == max) ? b : c;
		}
		else if(b == min){
			middle = (c == max) ? a : c;
		}
		else{
			middle = (b == max) ? a : b;
		}
		return Math.abs(min-middle) == Math.abs(max-middle);
		  
	}

	public static void main8(String[] args) {
		Object[] inputs = new Object[]{
			2,4,6,
			4,6,2, 
			4,6,3
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 3){	
			int a = (Integer) inputs[i];
			int b = (Integer) inputs[i+1];
			int c = (Integer) inputs[i+2];
			System.out.println(a + "," + b + "," + c + " ~> " + evenlySpaced(a, b, c));
		}
	}
	
	public static int makeChocolate(int small, int big, int goal) {
		if(goal == big*5){
			return 0;
		}
		
		int nbr = goal/5;
		int nba = big;
		 
		int r = goal - ((nba >= nbr) ? nbr : big)*5;
		
		return (small >= r) ? r : -1;
	}

	public static void main(String[] args) {
		Object[] inputs = new Object[]{
			4,1,9,
			4,1,10,
			4,1,7,
			6,2,7
		};
		
		int l = inputs.length;
		for(int i = 0; i < l; i += 3){	
			int a = (Integer) inputs[i];
			int b = (Integer) inputs[i+1];
			int c = (Integer) inputs[i+2];
			System.out.println(a + "," + b + "," + c + " ~> " + makeChocolate(a, b, c));
		}
	}
}
