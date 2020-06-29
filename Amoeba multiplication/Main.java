#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int mon;
  cin>>mon;
  int a = 0 , b = 1 , ans;
  for(int i=3;i<=mon;i++){
    ans = a + b;
    a = b;
    b = ans;
    //cout<<ans<<" ";
  }
  cout<<ans;
}