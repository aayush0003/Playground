#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float a,b,c,d,time;
  int age;
  cin>>age>>time;
  a = 10.15;
  b = 13.30;
  c = 18.00;
  d = 22.00;
  if(age>=13)
    if(time == b || time == c)
    	cout<<"$5.00";
    else 
        cout<<"$8.00";
  else
    if(time == b || time == c)
    cout<<"$2.00";
  else 
    cout<<"$4.00";
  
}