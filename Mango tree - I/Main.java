#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,t;
  cin>>r>>c>>t;
  if((t)%5 ==0 || t<=c )
    cout<<"Yes";
  else if((t+c-1)%5 == 0)
    cout<<"Yes";
  else
    cout<<"No";
  
}