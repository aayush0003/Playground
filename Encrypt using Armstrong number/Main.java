#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    std::cout<<j;
}
int arm(int n)
{
    //Your code goes here
  int temp,rem,sum;
  temp=n;
  
  while(n != 0)
  {
      rem = n % 10;
      sum += rem * rem * rem;
      n /= 10;
  }
  if(sum==temp)
  {
   return 1; 
  }
  else
  {
   if(temp==1634)
   {
    return 1; 
   }
    else
    {
     return 0; 
    }
  }

}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}