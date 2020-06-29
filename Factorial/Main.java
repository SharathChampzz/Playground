#include<iostream>
using namespace std;

int fact(int n){
 int ans; 
  if(n>1){
   ans = n * fact(n-1); 
  }
  else{
   return n; 
  }
  return ans;
}
int main()
{
  int n;
  cin>>n;
  int f = fact(n);
  cout<<"The factorial of "<<n<<" is "<<f;
}