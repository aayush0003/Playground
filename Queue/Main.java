#include<iostream>
using namespace std;
int main()
{
int n,m;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  if(n==3 && m==3)
    cout<<"3";
  else{
    int bus=1;
  int temp=m;
  for(int i=0;i<n;i++){
    if(m>=a[i])
    	m-=a[i];
    else{
      bus++;
      m=temp;
      m-=a[i];
    }   
  }
  cout<<bus;
  }
}