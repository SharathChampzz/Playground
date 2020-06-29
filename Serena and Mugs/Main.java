#include<iostream>
using namespace std;
int main()
{
  int n,v;
  cin>>n>>v;
  int a[n], sum = 0;
  for(int i=0;i<n;i++){
    cin>>a[i];
    sum += a[i];
}
  if(sum<=v)
    cout<<"YES";
  else
    cout<<"NO";
  
}