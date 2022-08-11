package samplepackage;

public class PalindromeCheck {
	public static void main(String[] args) { int r,sum=0,temp;    
	  int n=34343;//It is the number variable to be checked for palindrome  
	  
	  temp=n;    
	  while(n>0){    
	   r=n%10;  //getting remainder  34343%10 = 3 ->r=3--3434%10->
	   sum=(sum*10)+r;    // 0*10 +r=3
	   n=n/10;    // 3434
	  }    
	  if(temp==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
	}  
	} 


