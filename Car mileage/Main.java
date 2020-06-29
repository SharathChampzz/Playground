#include<iostream>
using namespace std;
int main()
{
  float mile;
  int litre, dist;
  cin>>mile>>litre>>dist;
  if(mile * litre >= dist)
    cout<<"Can reach";
   else
     cout<<"Cannot reach";
  
}