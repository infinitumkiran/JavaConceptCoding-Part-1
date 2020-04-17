import java.util.*;
class Merge
{
	
	void mergesort(int ar[],int low,int high)
	{
	if(low<high)
	{
	int mid=(low+high)/2;
	mergesort(ar,low,mid);
	mergesort(ar,mid+1,high);
	merge(ar,low,mid,high);
	}

	}
	void merge(int a[],int l,int m,int h)
	{
	int s1=m-l+1;

	int s2=h-m;	 
	
	int a1[]=new int[s1];
	int a2[]=new int[s2];
	
	for(int i=0;i<s1;i++)
	  a1[i]=a[l+i];
	for(int j=0;j<s2;j++)
	  a2[j]=a[m+1+j];

	int i=0,j=0;
	int k=l;
	
	while(i<s1&&j<s2)
	{
	 if(a1[i]<=a2[j])
	{
	a[k]=a1[i];
	i++;
	}
	else
	{
	a[k]=a2[j];
	j++;
	}
	k++;
	}
	while(i<s1)
	{
	a[k]=a1[i];
	i++;
	k++;
	}
	while(j<s2)
	{
	a[k]=a2[j];
	j++;
	k++;
	}
	
	} 
	public static void main(String args[])
	{
	  int min,max,n;
	  Scanner s=new Scanner(System.in);
	Merge obj=new Merge();  
	System.out.print("Enter limit:");
	  n=s.nextInt();
	int a[]=new int[n];
	  System.out.println("Enter array elements:");
	for(int i=0;i<n;i++)
	  {
		a[i]=s.nextInt();
	   }
	min=0;
	max=n-1;
	obj.mergesort(a,min,max);
	System.out.println("merge sorted order is");
	obj.printarr(a,n);
	}
	public static void printarr(int arr[],int x)
	{
 	
	for(int p=0;p<arr.length;p++)
	{
	System.out.print(arr[p]+" ");
	}
	System.out.println();
	}
}