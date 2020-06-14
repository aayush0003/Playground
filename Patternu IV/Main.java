#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n,i,j,k,l;
  cin>>n;
  for(i =1;i<=n;i++)
  {
  	if(i%2 != 0)
    {
    	for(j=1;j<n;j++)
        {
        	cout<<i;
        }cout<<i+1<<endl;
    }
    else
    {cout<<i+1;
    	for(k=1;k<n;k++)
        {
        	cout<<i;
        }cout<<endl;
    }
  }
  
    return 0;
}