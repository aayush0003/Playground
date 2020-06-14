#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p1,d1,s1,p2,d2,s2,p3,d3,s3,flipkart,amazon,snapdeal;
  cin>>p1>>d1>>s1>>p2>>d2>>s2>>p3>>d3>>s3;
  flipkart = p1 - p1*d1/100 + s1;
  snapdeal = p2 - p2*d2/100 + s2;
  amazon = p3 - p3*d3/100 + s3;
  cout<<"In Flipkart Rs."<<flipkart;
  cout<<"\n"<<"In Snapdeal Rs."<<snapdeal;
  cout<<"\n"<<"In Amazon Rs."<<amazon;
  if( flipkart <= amazon && flipkart <= snapdeal)
    cout<<"\n"<<"He will prefer Flipkart";
  else if( flipkart >= amazon && amazon <= snapdeal)
    cout<<"\n"<<"He will prefer Amazon";
  else
    cout<<"\n"<<"He will prefer Snapdeal";
  
  
}