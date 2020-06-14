#include<iostream>
using namespace std;
int main()
{
  int n,rem,sum_even=0,sum_odd=0;
  cin>>n;
  while(n>0){
   rem=n%10;
    if(rem%2==0)
    {
     sum_even+=rem; 
    }
    else
    {
     sum_odd+=rem; 
    }
    n=n/10;
  }
  if(sum_even==sum_odd)
  {
   cout<<"Yes"; 
  }
  else
  {
   cout<<"No"; 
  }
}