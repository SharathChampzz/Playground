#include<iostream>
using namespace std;
int main()
{
  int n,crt;
  float point;
  while(true){
    cin>>n;
    if(n%2!=0){ //odd num
      //cout<<"Odd Number Found!!\n";
      crt++;
      point += 1;
    }
    else if(n<0){ // negative
      //cout<<"Negative Number Found!!\n";
      point = point - 1;
    }
    else if(n%2 == 0){ // even number
      //cout<<"Even Number Found!!\n";
    	point = point - 0.5;
    }
    
    //cout<<point<<endl;
    if(crt == 3 || n<0)
      break;
    
  }
  cout<<point;
}