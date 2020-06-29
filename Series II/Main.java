#include<iostream>
#include<cmath>
using namespace std;
int main(){
  int n,x=11;
  cin>>n;
  for(int i=0; i<n ; x=x+4 , i++){
    cout<<pow(x,2)<<" ";
  }
}