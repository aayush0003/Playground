#include<iostream>
using namespace std;
int main()
{
 int a;
  cin>>a;
  for(int i=0;i<=7;i++)
  {
    if(i==0|| i==7)
    {
     cout<<a<<endl;
    }
    else if(i==3||i==4)
   {
    cout<<a+3<<a+3<<a+3<<a+3<<endl;
   }
    
    else if(i==1|| i==6)
    {
     cout<<a+1<<a+1<<endl;
    }
    else if(i==2 || i==5)
    {
     cout<<a+2<<a+2<<a+2<<endl;
    }
  }
}