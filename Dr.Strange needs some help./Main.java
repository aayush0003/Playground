#include<iostream>
#include<math.h>
using namespace std;
int pow(int,int,int);
int main()
{
int n,m,req;
cin>>n>>m>>req;
pow(n,m,req);
  return 0;
}
int pow(int a,int b,int temp)
{
	int res;
    res = pow(a,b);
    if (res>=temp)
      cout<<"Doctor, you can proceed with your experiment.";
    else
      cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
}