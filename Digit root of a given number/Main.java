#include<iostream>
using namespace std;
int sum(int num)
{ int tot =0,temp;
 if(num<10)
   return num;
 else
   while(num>0)
   { tot+=num%10;
   num = num/10;}
 num = tot;
 return sum(num);
}
int main()
{
	int n;
  cin>>n;
  cout<<sum(n);
}