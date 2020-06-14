#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int item;
  float t,total;
  cin>>item>>t;
  switch (item)
{
    case 1:cout<<t;
        break;
    case 2:
        total = t + (t*50)/100;
        cout<<fixed<<setprecision(2)<<total;
        break;
    case 3:
      cout<<fixed<<setprecision(2)<<2*t;
      break;
        
    default: cout<<"Number of items is more";
}
}