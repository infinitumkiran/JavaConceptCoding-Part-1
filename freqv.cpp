#include <bits/stdc++.h>
using namespace std;   
int main()
{
  int t;
  cin>>t;
  while(t--)
  {
    int n;
    cin>>n;
    long a[n],b[n];
    for(int i=0;i<n;i++)
    {
      cin>>a[i];
      b[i]=0;
    }
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<n;j++)
    {
      if(a[i]==a[j])
        b[j]++;
    }
    }
    for(int k=0;k<n-1;k++)
    {
      for(int l=k+1;l<n;l++)
      {
        if(a[k]>a[l])
        {
          long temp=a[k];
          a[k]=a[l];
          a[l]=temp;
          temp=b[k];
          b[k]=b[l];
          b[l]=temp;
        }
      }
    }
    for(int m=0;m<n;m++)
    {
      if((a[m])!=(a[m+1]))
        cout<<b[m]<<" ";
    }
    
  }
    return 0;
}

