#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n],sum=0;
  for(int i=0;i<n;i++)
  {
   cin>>a[i]; 
  }
  for(int j=0;j<n;j++)
  {
   if(a[0]>=a[j])
   {
    cout<<"1"<<endl;
     a[0]=a[j];
     
   }
    else if(a[j]==21)
    {
      cout<<"1";
    }
    else{
     sum=sum+2;
      cout<<sum<<endl;
     
    }
  }
}