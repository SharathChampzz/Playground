#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int x = 6;
  for(int i=1;i<=n;x = x + 5*i ,++i)
    cout<<x<<" ";
}