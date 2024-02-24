package package1;

public class palindrome {

	public static void main(String[] args) {
       int num=565;
       int rev=0;
       int rem;
       int orig;
       
       orig=num;
       for(;num!=0; num/=10)
       {
    	   rem=num%10;
    	   rev=rev*10+ rem;
      }
       
       if(orig==rev)
       {
    	   System.out.println("no is palindrome");
       }
       else
       {
    	   System.out.println("not a apalindrome no");
       }
       
       
	}

}
