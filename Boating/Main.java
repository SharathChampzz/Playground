#include<iostream>
using namespace std;
int main()
{
 int stable , adult ,child;
  cin>>stable>>adult>>child;
  if(stable>(adult*75 + child*30))
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}