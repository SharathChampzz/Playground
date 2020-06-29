#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int sum = 0 , count = 0;
  int temp;
  while(sum < n){
    cin>>temp;
    sum += temp;
    count++;
  }
  cout<<"The number of turns is "<<count;
}