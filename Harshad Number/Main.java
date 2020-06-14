#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,x,temp;
  
  cin>>n;
  temp=n;
  while(n>0)
  {
   x=n%10; 
   sum=sum+x;
   n=n/10; 
  }
  
  if(temp%sum==0)
  {
   cout<<"Harshad Number"; 
  }
  else
  {
   cout<<"Not Harshad Number"; 
  }
}