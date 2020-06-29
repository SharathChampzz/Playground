#include<iostream>
using namespace std;
int main()
{
  int circ , sq;
  cin>>circ>>sq;
  if(2*circ <= sq)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
}