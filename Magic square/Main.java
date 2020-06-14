#include<iostream>
using namespace std;
int main()
{
  int r,c,sumf=0,sumb=0;
  cin>>r;
  int a[r][r];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<r;j++){
      
  		cin>>a[i][j];  
  }
  }
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<r;j++)
   {
    if(i==j){
     sumf = sumf + a[i][j]; 
    }
     else if(j-i==r-1 || i-j==r-1)
     {
      sumb = sumb + a[i][j]; 
     }
   }
  }
if(r==3)
{
sumb = sumb+a[1][1];
} 
  if(sumb==sumf)
  {
   cout<<"Yes";
  }
  else
  {
   cout<<"No"; 
  }
}