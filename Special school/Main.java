#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main()
{
  string s,j;
  cin>>s>>j;
  reverse(s.begin(), s.end());
  if(s == j)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  
  
}