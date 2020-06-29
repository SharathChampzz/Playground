#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  cin>>num;
  int last = num % 10;
  int first = num / 1000;
  int sum = first + last;
  cout<<sum;
}