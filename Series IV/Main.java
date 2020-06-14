#include<iostream>
using namespace std;
int main()
{
  int a,x=2;
  cin>>a;
  for(int i=0;i<a;i++)
  {
   if(i==0)
   {
    cout<<"0 "; 
   }
    else if(i==1)
    {
     cout<<"2 "; 
    }
    else if(i>1 && i<4)
    {
     x=x+6; 
      cout<<x<<" ";
    }
    else if(i>3 && i<6)
    {
     x=x+10; 
      cout<<x<<" ";
    }
    else if(i>5 && i<8)
    {
     x=x+14;
      cout<<x<<" ";
    }
    else if(i>7 && i<10)
    {
     x=x+18;
      cout<<x<<" ";
    }
  }
}