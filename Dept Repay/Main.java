#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float i,a,d,f;
  cin>>p>>r>>t;
  i = (p*r*t)/100;
  a = p + i;
  d = i*0.02;
  f = a - d;  
  cout<<i<<endl<<a<<endl<<d<<endl<<f;
}