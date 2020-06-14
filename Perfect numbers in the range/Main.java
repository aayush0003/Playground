#include<iostream>
using namespace std;
int main()
{
  int a,b,i,j;
  cin>>a>>b;
  int sum=0;
  for(i=a;i<b;i++)
  {
    for(j=1;j<i;j++)
    {
      if(i%j==0)
      {
        sum=sum+j;
      }
    }
    if(sum==i)
    {
      cout<<i<<" ";
    }
    sum=0;
  } 
}  