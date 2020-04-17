import java.util.*;
class boring
{
	public static void main(String args[])
	{
		int n;
		System.out.println("enter limit");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=obj.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		for(int j=i+1;j<n;j++)
		{
		if(a[i]>a[j])
		{
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		}
		}
		for(int i=0;i<n;i++)
		{
		System.out.println(a[i]);
		}

	}
}