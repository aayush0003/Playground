#include<iostream>
using namespace std;
int main()
{
 int r,c,sum;
  cin>>r>>c;
  int a[r][c],b[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
   cin>>a[i][j]; 
  }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
   cin>>b[i][j]; 
  }
  }
  for(int k=0;k<r;k++)
  {
   for(int z=0;z<c;z++)
   {
    sum = a[k][z]+b[k][z];
     cout<<sum<<" ";
   }  
    cout<<endl;
   }
}