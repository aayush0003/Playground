#include<iostream>
using namespace std;
int main()
{
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n+1];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++){
   cin>>a[i]; 
  }
  cout<<"Enter the location where you wish to insert an element"<<endl;
  int l;
  cin>>l;
  
  if(l<n){
    cout<<"Enter the value to insert"<<endl;
  int v;
  cin>>v;
  cout<<"Array after insertion is"<<endl;
for(int i=n+1; i>=l; i--)
	{
		a[i]=a[i-1];
	}
	a[l-1]=v;
  for(int k=0;k<=n;k++)
  {
   cout<<a[k]<<endl; 
  }
  }
  else{
   cout<<"Invalid Input"; 
  }
}

