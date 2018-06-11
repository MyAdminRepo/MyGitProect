package com;

public class Simpledemo {

	public static void main(String[] args) {

		int i,j,k;
		int p=5;
	
			for(i=1;i<=5;i++) 
			{
				for (k = p-1; k >= i; k--) 
				{
				System.out.print(" ");
				}
			
				for(j=1;j<=i;j++)
				{
				System.out.print(" * ");
				}
				
				System.out.print("");		
			}
			
			for(i=p-1;i>=1;i--)
			{
				for(k=p-1;k>=i;k--)
				{
					System.out.print("  ");
				}
				
				for(j=i;j>=1;j--)
				{
					System.out.print(" * ");
				}
				System.out.print("");	
								
			}
	}

}//class.

/*for(j=1;j<=9;j++)
k=false;
{
	if((j<=6-i) && (j<=4+i) && k) {
		System.out.print("*");
		k=false;
		System.out.println("flag"+k);
	}
	else {
		k=true;
		System.out.print(" //");
		
		//System.out.println("true"+k);
	}//else
}//inner for*/