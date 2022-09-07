package week1.day2;

public class ReverEven {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] spltest=test.split(" ");
		for(int i=0;i<spltest.length;i++) 
		{
			if(i%2==0) 
			{	
				System.out.print(spltest[i]);
				System.out.print(" ");
				
			}
			else
			{
				char[] splword=spltest[i].toCharArray();
				for(int j=splword.length-1;j>=0;j--) 
				{
					System.out.print(splword[j]);
				}
				System.out.print(" ");
			}
			
		}
		
	}
}
