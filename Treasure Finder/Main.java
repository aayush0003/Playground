#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,gcd,i;
  cin>>a>>b>>c;
  if(( a>b && a<c) ||(a<b && a>c))
    cout<<"The treasure is in box which has number "<<a;
  else if((b>a && b<c) || (b<a &&  b>c))
    cout<<"The treasure is in box which has number "<<b;
  else
    cout<<"The treasure is in box which has number "<<c;
  for(i=1;i<=a && i<=b && i<=c;i++)
  {
  	if(a%i == 0  && b%i == 0 & c%i == 0)
      gcd = i;
  }
  cout<<"\nThe code to open the box is "<<gcd;
}