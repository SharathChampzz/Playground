#include<iostream>
using namespace std;
int main()
{
 int a,b;
  cin>>a>>b;
  int less;
  if(a<b)
    less = a;
  else
    less = b;
  if(less % 2 == 0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}