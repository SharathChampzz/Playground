#include<iostream>
#include<cmath>
using namespace std;
int main(){
  int n;
  cin>>n;
  float a = 0.5;
  
  for(int i=0;i<n;i++){
    cout<<a<<" ";
    a += pow(3 , i); 
  }
  
}