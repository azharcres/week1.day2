package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="hello";
		String rev="";
		
				for (int j=text.length()-1;j>=0;j--)
			{
					rev=rev+text.charAt(j);
					
			}
					if (text.equals(rev))
					{
						System.out.println("palindrome");
					}
					else
					{
						
					System.out.println("No Palindrome");
				
				}
			
		}
		
		

}
