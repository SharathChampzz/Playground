#include<iostream>
using namespace std;
int fib(int n){
  int ans;
  int a=0 , b = 1;
  for(int i=3;i<=n;i++){
    ans = a + b;
    a = b;
    b = ans;
  }
  return ans;
}
int main()
{
  int n;
  cin>>n;
  int res = fib(n);
  cout<<"The term "<<n<<" in the fibonacci series is "<<res;
}