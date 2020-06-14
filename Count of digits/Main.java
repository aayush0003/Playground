#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int c=0;
  if(n==0)
  {
    cout<<1;
  }
  else
  {  
  while(n>0)
  {
    n=n/10;
    c++;
  } 
  cout<<c;
  }  
}