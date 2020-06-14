#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int tballs,truns,sruns,bballs,a,b;
  float curr,trr,overfin,tovers;
  cin>>tballs>>truns>>sruns>>bballs;
  tovers = tballs/6;
  a = bballs/6;
  b = bballs%6;
  
  overfin = float(a) + float(b)/10;
  curr = sruns/overfin;
  trr = truns/tovers;
  cout<<tovers;
  cout<<"\n"<<fixed<<setprecision(1)<<overfin;
  cout<<"\n"<<fixed<<setprecision(1)<<curr;
  cout<<"\n"<<fixed<<setprecision(1)<<trr;
  if (curr>= trr)
    cout<<"\n"<<"Eligible to Win";
  else
    cout<<"\n"<<"Not Eligible to Win";
}