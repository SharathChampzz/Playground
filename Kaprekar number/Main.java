#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  cin>>n;
   int sq = pow(n ,2);
  int temp;
  //cout<<sq<<endl;
  int digit , sum = 0;
  while(true){
    digit = sq % 10;
    sum += digit;
    //cout<<sum<<endl;
    sq = (int) sq/10;
    if(sq == 0)
      break;
  }
  //cout<<sum<<endl;
  while(true){
    digit = n % 10;
    temp += digit;
    n = (int) n/10;
    if(n == 0)
      break;
  }
  //cout<<temp<<endl;
  if(temp == sum)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}