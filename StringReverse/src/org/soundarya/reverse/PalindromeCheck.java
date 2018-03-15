package org.soundarya.reverse;

public class PalindromeCheck {
	 public static void main(String[] args){
		 String str = "Soundarya";
		 char[] charstr = str.toCharArray();
		 StringBuilder sb = new StringBuilder();
		 for(int i=0;i<charstr.length;i++) {
			 sb.append(charstr[charstr.length-i-1]);
		 }
		 System.out.println(sb.toString());
		 if(str.equals(sb.toString())) {
			 System.out.println("this is a palindrome");
		 }
		 else{
			 System.out.println("this is not a palindrome");
		 }
	 }
}