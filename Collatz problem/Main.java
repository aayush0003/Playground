#include<iostream>
using namespace std;
int main()
{
  int n,count=0,x,y;
  cin>>n;
  cout<<n<<endl;
  do{
    if(n==1)
    {
     break; 
    }
    else{
   if(n%2==0)
   {
    n=n/2;
     cout<<n<<endl;
     count+=1;
   }
    else
    {
     n=3*n+1;
      cout<<n<<endl;
      count+=1;
    }
    }
  }while(n!=1);
  cout<<count;
  
}