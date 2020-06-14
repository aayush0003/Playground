#include<iostream>
using namespace std;
struct Employee
{
  char name[50];
  int id;
  int age;
  char designation[40];
  float salary;
};
int main()
{
  //Type your code here.
  Employee E;
  cout<<"Enter name:"<<"\n";
  cin>>E.name;
  cout<<"Enter ID:"<<"\n";
  cin>>E.id;
  cout<<"Enter age:"<<"\n";
  cin>>E.age;
  cout<<"Enter designation:"<<"\n";
  cin>>E.designation;
  cout<<"Enter Salary:"<<"\n";
  cin>>E.salary;
  cout<<"Employee Details"<<"\n";
  cout<<"Name of the Employee : "<<E.name<<"\n";
  cout<<"ID of the Employee : "<<E.id<<"\n";
  cout<<"Age of the Employee : "<<E.age<<"\n";
  cout<<"Designation of the Employee : "<<E.designation<<"\n";
  cout<<"Salary of the Employee : "<<E.salary<<"\n";
}