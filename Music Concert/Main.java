#include<iostream>
using namespace std;
#include<cstdlib>
int main(){
  int n;
  cin>>n;
  int *ptr = (int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
   cin>>*(ptr+i); 
  }
  int countf=0,countm=0;
  for(int j=0;j<n;j++)
  {
   if(*(ptr+j)%2==0)
   {
    countf+=1; 
   }
    else{
     countm+=1; 
    }
  }
  cout<<countm<<endl;
  cout<<countf;
}