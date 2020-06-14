#include<iostream>
using namespace std;
int main()
{
  int r,c,greater;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    cin>>a[i][j]; 
   }
  }
  for(int i=0;i<c;i++)
  {int greater=0;
   for(int j=0;j<r;j++)
   {
     
    if(a[j][i]>greater)
    {
     greater=a[j][i]; 
    }
     
   }
    cout<<greater<<endl;
  }
  
}