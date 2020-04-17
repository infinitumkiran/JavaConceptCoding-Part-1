import java.util.*;
class ashbox
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int mid=n/2+1;
		int y=3*(n/2)+1;
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=y;j++)
		{
		if(i==1)
		{
		if(j>=1&&j<n)
		 System.out.print("#");
		else if(j==n)
		 System.out.print("#");
		else if(j==y)
		{
		 System.out.print(" ");
		 System.out.println();
		}
		}
		else if(i>1&&i<mid)
		{
		if(j==1)
		System.out.print("#");
		else if(j==n)
		 System.out.print("#");
		else if(j==y)
		{
		 System.out.print(" ");
		 System.out.println();
		}
		else
		 System.out.print(" ");
		}
		else if(i==mid)
		{
		if(j==1)
		System.out.print("#");
		else if(j>=mid&&j<y)
		System.out.print("#");
		else if(j==y)
		{
		 System.out.print("#");
		 System.out.println();
		}
		else
		 System.out.print(" ");
		}
		else if(i>mid&&i<n)
		{
		if(j==1)
		System.out.print("#");
		else if(j==mid)
		System.out.print("#");
		else if(j==n)
		 System.out.print("#");
		else if(j==y)
		{
		 System.out.print("#");
		 System.out.println();
		}
		else
		 System.out.print(" ");
		}
		else if(i==n)
		{
		if(j>=1&&j<=n)
		System.out.print("#");
		else if(j==n)
		 System.out.print("#");
		else if(j==y)
		{
		 System.out.print("#");
		 System.out.println();
		}
		else
		 System.out.print(" ");
		}
		}
		}
		for(int k=1;k<=n/2;k++)
		{
		for(int q=1;q<=y;q++)
		{
		if(k>=1&&k<n/2)
		{
		if(q==mid)
		System.out.print("#");
		else if(q==y)
		{
		 System.out.print("#");
		 System.out.println();
		}
		else
		 System.out.print(" ");
		}
		else if(k==n/2)
		{
		if(q>=mid&&q<y)
		System.out.print("#");
		else if(q==n)
		 System.out.print("#");
		else if(q==y)
		{
		 System.out.print("#");
		 System.out.println();
		}
		else
		 System.out.print(" ");
		}
		}
		}		
		
	}
}