#include<iostream>
using namespace std;
int func(int n,int *a)
{
  int count1=0,count2=0,y;
 for(int j=0;j<n;j++)
 {
  if(a[j]%2==0)
  {
   count1+=1; 
  }
   else
   {
    count2+=1; 
   }
 }
  if(count1>0 && count2>0)
  {
   cout<<"The array is Mixed"; 
  }
  else if(count1>0 && count2==0)
  {
   cout<<"The array is Even";
  }
  else if(count1==0 && count2>0)
  {
   cout<<"The array is Odd";
  }
}
int main()
{
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  {
   cin>>a[i]; 
  }
  func(n,a);
  
  
}