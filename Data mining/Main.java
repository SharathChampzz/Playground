#include<iostream>
using namespace std;
int main()
{
  int n , osum = 0 , esum = 0 ,digit;
  cin>>n;
  while(true){
    digit = n % 10;
    //cout<<"Digit : "<<digit<<endl;
    n = (int) n /10;
    if(digit%2 == 0)
      esum += digit;
    else
      osum += digit;
    //cout<<"Odd Sum = "<<osum<<"  Even Sum = "<<esum<<endl;
    if(n == 0)
      break;
  }
  
  if(osum == esum)
    cout<<"Yes";
  else
    cout<<"No";
}