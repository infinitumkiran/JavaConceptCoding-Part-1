import java.util.*;
class m
{
 void mergesort(int a[],int l,int h)
 {
  if(l<h)
  {
   int m=(l+h)/2;
   mergesort(a,l,m);
   mergesort(a,m+1,h);
   merge(a,l,m,h); 
  }
 }
  void merge(int a[],int l,int m,int h)
 {
  int n1=m-l+1;
  int n2=h-m;
  int L[]=new int[n1];
  int R[]=new int[n2];
  int i,j,k;
  for(i=0;i<n1;i++)
   L[i]=a[l+i];
  for(j=0;j<n2;j++)
   R[j]=a[m+j+1];
  i=0;
  j=0;
  k=l;
  while(i<n1&&j<n2)
 {
  if(L[i]<=R[j])
  {
   a[k]=L[i];
   i++;
  }
  
  else
  {
   a[k]=R[j];
   j++;
  }
  k++;
 } 
 while(i<n1)
 {
  a[k]=L[i];
  i++;
  k++;
 }
 while(j<n2)
 {
 a[k]=R[j];
  j++;
  k++;
  }
 }

 public static void main(String args[])
 {
  m obj1=new m();
  Scanner obj=new Scanner(System.in);
  int n=obj.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
  {
    a[i]=obj.nextInt();
  }
  int max=n-1,min=0;
  obj1.mergesort(a,min,max);
  System.out.println("Sorted array is");
  for(int j=0;j<a.length;j++)
    System.out.println(a[j]+" ");
 }
}