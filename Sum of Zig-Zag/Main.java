#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c];
  int row[r],col[c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
   		cin>>a[i][j]; 
  	}
  }
  int sum=0,sum1=0,sum2=0;
  for(int i=0;i<r;i++)
  {
    
    for(int j=0;j<c;j++)
    {
   		if(i==0)
        {
         sum = sum + a[i][j]; 
        }
      else if(i==c-1)
      {
       sum1 = sum1 + a[i][j]; 
      }
      else if(i==1)
      {
       if(j==1)
       {
        sum2 = sum2 + a[i][j]; 
       }
      }
      
    }     
  	}
    int x;
    x = sum + sum1+sum2;
  cout<<"Sum of Zig-Zag pattern is "<<x;
    

}