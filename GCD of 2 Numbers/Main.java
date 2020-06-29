#include<iostream>
using namespace std;
int gcd(int a, int b){
  int less , hcf;
  if(a < b)
    less = a;
  else
    less = b;
  for(int i=1;i<=less;i++){
    if(a%i==0 && b%i==0)
      hcf = i;
  }
  return hcf; 
}

int main()
{
  int a,b;
  cin>>a>>b;
  int res = gcd(a,b);
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<res;
}