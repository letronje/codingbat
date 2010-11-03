import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class String2 {

	public static String parenBit(String str) {
		int l = str.length();
		
		boolean openParen = (str.charAt(0) == '(');
		boolean closeParen = (str.charAt(l-1) == ')');
		
		int start = 0;
		int end = l-1;
		
		if(openParen){
			if(closeParen){
				return str;
			}
		}
		else{
			if(closeParen){
				start=1;
				end=l;
			}
			else{
				start = 1;
				end = l-1;
			}
		}
		return parenBit(str.substring(start, end));
	}
	
	public static void main1(String[] args) {
		String[] strs = new String[]{ "xyz(abc)123", "x(hello)", "(xy)1"};
		for(String str: strs){
			System.out.println(str + " ~> " + parenBit(str));
		}
	}

	public static String doubleChar(String str) {
		int l = str.length();
		String acc = "";
		for(int i=0;i<l;i++){
			String s = String.valueOf(str.charAt(i));
			acc += s + s;
		}
		return acc;
	}

	
	public static void main2(String[] args) {
		String[] strs = new String[]{ "The", "AAAAbbbb", "HHii--TThheerree"};
		for(String str: strs){
			System.out.println(str + " ~> " + doubleChar(str));
		}
	}
	
	public static int countCode(String str) {
		Matcher m = Pattern.compile("co[A-Za-z]e").matcher(str);
		int count = 0;
		while(m.find()){
			count ++;
		}
		return count;
	}
	
	public static void main3(String[] args) {
		String[] strs = new String[]{ "aaacodebbb", "codexxcode", "cozexxcope"};
		for(String str: strs){
			System.out.println(str + " ~> " + countCode(str));
		}
	}
	
	
	public static boolean endOther(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		return s1.endsWith(s2) || s2.endsWith(s1);
	}
	
	public static void main4(String[] args) {
		Object[] pairs = new Object[]{
			new String[]{ "Hiabc", "abc" },
			new String[]{ "AbC", "HiaBc" },
			new String[]{ "abc", "abXabc" }
		};
		
		for(Object pair: pairs){
			String[] p = (String[]) pair;
			String s1 = p[0];
			String s2 = p[1];
			System.out.println(s1 + " " + s2 + " ~> " + endOther(s1, s2));
		}
	}
	
	
	public static int countHi(String s) {
		int start = 0;
		int count = 0;
		while(true){
			int pos = s.indexOf("hi", start);
			if(pos == -1){
				break;
			}
			count ++;
			start = pos+2; 
		}
		return count;
	}
	
	public static void main5(String[] args) {
		String[] strs = new String[]{ "abc hi ho", "ABChi hi" , "hihi"};
		
		for(String s: strs){
			System.out.println(s + " ~> " + countHi(s));
		}
	}
	
	public static int countOccurences(String s, String ss){
		int start = 0;
		int count = 0;
		while(true){
			int pos = s.indexOf(ss, start);
			if(pos == -1){
				break;
			}
			count ++;
			start = pos+2; 
		}
		return count;
	}
	
	public static boolean catDog(String s) {
		return countOccurences(s, "cat") == countOccurences(s, "dog");
	}
	
	public static void main6(String[] args) {
		String[] strs = new String[]{ "catdog", "catcat", "1cat1cadodog"};
		
		for(String s: strs){
			System.out.println(s + " ~> " + catDog(s));
		}
	}
	
	public static boolean xyzThere(String s) {
		int start = 0;
		boolean found = false;
		int l = s.length();
		do{
			int pos = s.indexOf("xyz", start);
			if(pos == -1){
				break;
			}
			else{
				if(pos == 0){
					found = true;
					break;
				}
				else{
					found = found || (s.charAt(pos-1) != '.');
					start = pos + 1;
				}
			}
		}
		while(start < l);
		return found;
	}
	
	public static void main7(String[] args) {
		String[] strs = new String[]{ "abcxyz", "abc.xyz", "xyz.abc"};
		
		for(String s: strs){
			System.out.println(s + " ~> " + xyzThere(s));
		}
	}
	
	public static boolean bobThere(String s) {
		Matcher m = Pattern.compile("b[A-Za-z0-9]b").matcher(s);
		while(m.find()){
			return true;
		}
		return false;
	}
	
	public static void main8(String[] args) {
		String[] strs = new String[]{ "abcbob", "b9b", "bac"};
		
		for(String s: strs){
			System.out.println(s + " ~> " + bobThere(s));
		}
	}
	
	public static boolean xyBalance(String str) {
		int l = str.length();
		int start = l-1;
		do{
			int pos = str.lastIndexOf('x', start);
			if(pos == -1){
				break;
			}
			else if(pos == l-1){
				return false;
			}
			else{
				if(str.indexOf('y', pos+1) != -1){
					start -= 1;
				}
				else{
					return false;
				}
			}
		}
		while(start >= 0);
		return true;
	}
	
	public static void main9(String[] args) {
		String[] strs = new String[]{ "aaxbby", "aaxbb", "yaaxbb"};
		
		for(String s: strs){
			System.out.println(s + " ~> " + xyBalance(s));
		}
	}
	
	public static String mixString(String a, String b) {
		int l1 = a.length();
		int l2 = b.length();
		
		String largeStr = l1 > l2 ? a : b;
		int smallerStrLen = l1 < l2 ? l1 : l2;
		
		String mixed = "";
		for(int i=0;i<smallerStrLen;i++){
			mixed += String.valueOf(a.charAt(i)) + String.valueOf(b.charAt(i));
		}
		return mixed + largeStr.substring(smallerStrLen);
	}
	
	public static void main10(String[] args) {
		String[] strs = new String[]{
			"abc", "xyz", 
			"Hi", "There",
			"xxxx", "There"
		};
		
		int l = strs.length;
		for(int i = 0; i < l;i+=2){
			String s1 = strs[i];
			String s2 = strs[i+1];
			System.out.println(s1 + "," + s2 + " ~> " + mixString(s1, s2));
		}
	}
	
	public static String strRepeat(String str, int n){
		String rstr = "";
		while(n-- > 0){
			rstr += str;
		}
		return rstr;
	}
	
	public static String repeatEnd(String str, int n ) {
		int l = str.length();
		return strRepeat(str.substring(l-n), n);
	}
	
	public static void main11(String[] args) {
		Object[] strs = new Object[]{
			"Hello", 3, 
			"Hello", 2,
			"Hello",1
		};
		
		int l = strs.length;
		for(int i = 0; i < l;i+=2){
			String s = (String)strs[i];
			int n = (Integer)strs[i+1];
			System.out.println(s + "," + n + " ~> " + repeatEnd(s, n));
		}
	}
	
	public static String repeatFirst(String str, int n ) {
		String s = "";
		int l = s.length();
		for(int i=n;i>=1;i--){
			s += str.substring(0, i);
		}
		return s;
	}
	
	public static void main12(String[] args) {
		Object[] strs = new Object[]{
			"Chocolate", 4, 
			"Chocolate", 3,
			"Ice Cream", 2
		};
		
		int l = strs.length;
		for(int i = 0; i < l;i+=2){
			String s = (String)strs[i];
			int n = (Integer)strs[i+1];
			System.out.println(s + "," + n + " ~> " + repeatFirst(s, n));
		}
	}
	
	public static String repeatSeparator(String word, String sep, int count) {
		if(count == 0){
			return "";
		}
		String s = word + "";
		while(--count > 0){
			s += sep + word;
		}
		return s;
	}
	
	public static void main13(String[] args) {
		Object[] strs = new Object[]{
			"Word", "X", 3,
			"This", "And", 2,
			"This", "And", 1
		};
		
		int l = strs.length;
		for(int i = 0; i < l; i += 3){
			String w = (String)strs[i];
			String s = (String)strs[i+1];
			int c = (Integer) strs[i+2];
			System.out.println(w + "," + s + "," + c + " ~> " + repeatSeparator(w, s, c));
		}
	}
	
	public static boolean prefixAgain(String str, int n){
		return str.indexOf(str.substring(0, n), 1) != -1;
	}
	
	public static void main14(String[] args) {
		Object[] strs = new Object[]{
			"abXYabc", 1,
			"abXYabc", 2,
			"abXYabc", 3
		};
		
		int l = strs.length;
		for(int i = 0; i < l; i += 2){
			String s = (String)strs[i];
			int n = (Integer) strs[i+1];
			System.out.println(s + "," + n + " ~> " + prefixAgain(s, n));
		}
	}
	
	public static boolean xyzMiddle(String str) {
		int l = str.length();
		int s = (int)l/2 - 1;
		int pos = str.indexOf("xyz", s-1);
		if(pos == -1){
			return false;
		}
		
		int ncl = pos;
		int ncr = l-(ncl+3);
		return ((int)Math.abs(ncr-ncl) <= 1);
	}
	
	public static void main15(String[] args) {
		Object[] strs = new Object[]{
			"AAxyzBB",
			"AxyzBB",
			"AxyzBBB"
		};
		
		int l = strs.length;
		for(int i = 0; i < l; i += 1){
			String s = (String)strs[i];
			System.out.println(s + " ~> " + xyzMiddle(s));
		}
	}
	
	public static String getSandwich(String str) {
		String bs = "bread";
		int bl = bs.length();
		
		int s = str.indexOf(bs);
		 if(s == -1){
			 return "";
		 }
		 
		 int e = str.lastIndexOf(bs);
		 if(e <= s){
			 return "";
		 }
		 
		 return str.substring(s+bl, e);
	}

	public static void main16(String[] args) {
		Object[] strs = new Object[]{
			"breadjambread",
			"xxbreadjambreadyy",
			"xxbreadyy"
		};
		
		int l = strs.length;
		for(int i = 0; i < l; i += 1){
			String s = (String)strs[i];
			System.out.println(s + " ~> " + getSandwich(s));
		}
	}
	
	public static boolean sameStarChar(String str) {
		int start = 0;
		int l = str.length();
		do{
			int pos = str.indexOf('*', start);
			if(pos == -1){
				break;
			}
			else if(pos == 0){
				start = pos + 1;
				continue;
			}
			else if(pos == l-1){
				break;
			}
			else{
				if(str.charAt(pos-1) == str.charAt(pos + 1)){
					start = pos + 2;
				}
				else{
					return false;
				}
			}
		}
		while(start < l);
		return true;
	}
	
	public static void main17(String[] args) {
		Object[] strs = new Object[]{
			"xy*yzz",
			"xy*zzz",
			"*xa*az"
		};
		
		int l = strs.length;
		for(int i = 0; i < l; i += 1){	
			String s = (String)strs[i];
			System.out.println(s + " ~> " + sameStarChar(s));
		}
	}
	
	public static String zipZap(String str) {
		  String s = "";
		  int start = 0;
		  int l = str.length();
		  do{
			  int pos = str.indexOf('z', start);
			  if(pos == -1){
				  s += str.substring(start);
				  break;
			  }
			  else if(pos < l-2){
				  s += str.substring(start, pos);
				  if(str.charAt(pos+2) == 'p'){
					  s += "zp";
					  start = pos + 3;
				  }
				  else{
					  s += "z";
					  start = pos + 1;
				  }
			  }
			  else{
				  s += str.substring(pos);
				  break;
			  }
		  }
		  while(start < l);
		  return s;
	}


	public static void main18(String[] args) {
		Object[] strs = new Object[]{
			"zipXzap",
			"zopzop",
			"zzzopzop"
		};
		
		int l = strs.length;
		for(int i = 0; i < l; i += 1){	
			String s = (String)strs[i];
			System.out.println(s + " ~> " + zipZap(s));
		}
	}
	
	public static String starOut(String str) {
		String s = "";
	  	int start = 0;
	  	int l = str.length();
	  	if(str.equals("*")){
	  		return "";
	  	}
	  	do{
	  		int pos = str.indexOf('*', start);
	  		//System.out.println(pos);
	  		if(pos != -1){
	  			if(pos == l-1){
	  				s += str.substring(start, pos-1);
	  				break;
	  			}
	  			
	  			int j = pos;
	  			while(str.charAt(j+1) == '*'){
	  				j++;
	  			}
	  			if(j == 0){
	  				start = 2;
	  				continue;
	  			}
	  			
		  		s += str.substring(start, pos-1);
		  		start = j+2;
	  			
	  		}
	  		else{
	  			s += str.substring(start);
	  			break;
	  		}
	  	}
	  	while(start < l);
	  	return s;
	}

	public static void main19(String[] args) {
		Object[] strs = new Object[]{
			"ab*cd",
			"ab**cd",
			"sm*eilly"
		};
		
		int l = strs.length;
		for(int i = 0; i < l; i += 1){	
			String s = (String)strs[i];
			System.out.println(s + " ~> " + starOut(s));
		}
	}
	
	public static String plusOut(String str, String word) {
		String s = "";
	  	int start = 0;
	  	int l = str.length();
	  	int wl = word.length();
	  	do{
	  		int pos = str.indexOf(word, start);
	  		//System.out.println(pos);
	  		if(pos != -1){
	  			s += strRepeat("+", pos-start) + word; 
	  			start = pos + wl;
	  		}
	  		else{
	  			s += strRepeat("+", l-start);
	  			break;
	  		}
	  	}
	  	while(start < l);
	  	return s;
	}

	public static void main20(String[] args) {
		Object[] strs = new Object[]{
			"12xy34", "xy",
			"12xy34", "1",
			"12xy34xyabcxy", "xy"
		};
		
		int l = strs.length;
		for(int i = 0; i < l; i += 1){	
			String s = (String)strs[i];
			String w = (String) strs[i+1];
			System.out.println(s + " ~> " + plusOut(s, w));
		}
	}
	
	public static String wordEnds(String str, String word) {
		String s = "";
	  	int start = 0;
	  	int l = str.length();
	  	int wl = word.length();
	  	do{
	  		int pos = str.indexOf(word, start);
	  		if(pos != -1){
	  			if(pos >= 1){
	  				s += String.valueOf(str.charAt(pos-1));
	  			}
	  			if(pos+wl <= l-1){
	  				s += String.valueOf(str.charAt(pos+wl));
	  			}
	  			start = pos + wl;
	  		}
	  		else{
	  			break;
	  		}
	  	}
	  	while(start < l);
	  	return s;
	}
	
	public static void main(String[] args) {
		Object[] strs = new Object[]{
			"abcXY123XYijk", "XY",
			"XY123XY", "XY",
			"XY1XY", "XY",
			"abc1xyz1i1j", "1"
		};
		
		int l = strs.length;
		for(int i = 0; i < l; i += 2){	
			String s = (String)strs[i];
			String w = (String) strs[i+1];
			System.out.println(s + " ~> " + wordEnds(s, w));
		}
	}
}