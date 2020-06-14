#include<iostream>
using namespace std;
int main()
{
   int e,t,num;
   cin>>e>>t;
  int n=e+t;
  num=n;
  int sum=0;
  for(int i=1;i<n;i++)
  {
    if(n%i==0)
    {
      sum=sum+i;
    }
  } 
  if(num==sum)
  {
    cout<<"They can read the message";
  }
  else
  {
    cout<<"They can't read the message";
  }  
}  