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
  
  for(int i=0;i<r;i++)
  {
    
    int greater = a[i][0];
    for(int j=0;j<c;j++)
    {
   		if(a[i][j]>greater)
        {
         greater = a[i][j]; 
        }
  	}
    cout<<greater<<endl;
  
    
}
}