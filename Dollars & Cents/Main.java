#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int dol = a + c;
  int cent = b + d;
  dol += (int) cent/100;
  cent = cent%100;
  cout<<dol<<endl;
  cout<<cent<<endl;
}