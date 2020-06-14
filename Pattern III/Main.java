#include<iostream>
using namespace std;
int main()
{
	int n,i,j,k,l;
  cin>>n;
  for(i = 1;i<=n;i++)
  {
  	for(j=1;j<i;j++)
    {
    	cout<<i<<"*";
    }
    cout<<i<<endl;
  }
  for(k = n;k>0;k--)
  {
  	for(l = k;l>1;l--)
    {
      cout<<k<<"*";
  }
    cout<<k<<endl;
  
}}