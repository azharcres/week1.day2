package week1.day2;

public class Changeoddindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="changeme";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if (i%2!=0) {
				ch[i]=Character.toUpperCase(ch[i]);
			}
			System.out.print(ch[i]);
		}

	}

}
