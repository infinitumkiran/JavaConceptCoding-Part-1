# include <bits/stdc++.h>
# include <stdlib.h>
# include <stdbool.h>
# include <math.h>
using namespace std;
#pragma GCC optimize("O3")
int flg;
void chkPrime(long int n)
{
    long int i;
    i=n-1;
    while(i>=2)
    {
        if(n%i==0)
        {
            flg=1;
        }
        i--;
    }
}

void AllCombination(long int a)
{
  long int b,c,d,e,i,j,k,s,z,v,x[8],y[8],m;
  b=a;
  i=0;
  while(b>0)
  {
      y[i]=b % 10;
      b=b/10;
      i++;
  }
  c=0;
  for(j=i-1;j>=0;j--)
  {
    x[c]=y[j];
    c++;
  }
  m=i;
  while(m>0)
  {
     c=m-1;
     d=i-1;
     e=0;
     s=0;
     while(e<i)
     {
       z=pow(10,d);
       v=z*x[c%i];
       c++;
       d--;
       e++;
       s=s+v;
     }
     m--;
     chkPrime(s);
  }
}

int main()
{
    ios_base::sync_with_stdio(false);
    long int i=2,ctr1,ctr2;
    scanf("%li%li",&ctr1,&ctr2);
    while(i<=ctr2)
    {
      flg=0;
      AllCombination(i);
      if((flg==0)&&(i>=ctr1))
      {
          printf("%li ",i);
      }
      i++;
    }
	printf("\n");

}