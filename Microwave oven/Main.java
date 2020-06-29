#include<iostream>
using namespace std;
int main()
{
  int items;
  float time;
  cin>>items>>time;
  if(items>3)
    cout<<"Number of items is more";
  else if(items == 2)
    cout<<(0.5*time)+time;
  else if(items == 3)
    cout<<2*time;
}