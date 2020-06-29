#include<iostream>
using namespace std;
int main()
{
  int n , sum;
  int temp;
  cin>>n;
  temp = n;
  while(true){
    sum += (n%10);
    //cout<<sum<<endl;
    n = (int)n/10;
    if(n == 0 )
      break;
    
  }
  //cout<<temp<<'/'<<sum<<'=='<<temp%sum<<endl;
  if(temp%sum == 0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}