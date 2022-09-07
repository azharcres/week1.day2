package week1.day2;

public class RemoveDup 
{

	public static void main(String[] args) 
	{
		String str ="We learn java basics as part of java sessions in java week1";
		int count =0;
		String[] ipt=str.split(" ");
	
		for (int i=0;i<ipt.length;i++) 
		{
			for (int j=0;j<ipt.length;j++) 
			{
				if (ipt[i].equals(ipt[j]))
				{
					count++;
					
				}
			
		}
		if (count>1) 
		{
			str=str.replace(ipt[i],"");
		}
		count=0;
		}
		System.out.println(str);
	}
	
}

	
