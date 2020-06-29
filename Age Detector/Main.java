#include<iostream>
using namespace std;
int main()
{
  int birth,current,age;
  cin>>birth>>current;
  if(current<birth)
    current += 100;
   age = current - birth;
  cout<<age;
    
}