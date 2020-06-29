#include<iostream>
using namespace std;

int sumof(int n){
  int digit , sum = 0;
  while(n != 0){
  digit = n%10;
  n = (int) n/10;
    sum += digit;
}
  return sum;
}
int main(){
  int num;
  cin>>num;
  int res;
  while(true){
    res = sumof(num);
    if((int)res/10 == 0)
      break;
     else
       num = res;
  }
  cout<<res;
  return 0;
}