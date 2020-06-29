#include<iostream>
using namespace std;
int main()
{
  int age;
  int timing;
  cin>>age>>timing;
  //cout<<"TIming : "<<timing<<endl;
  if(timing == 13){
    //cout<<"Matinee";
    if(age>13)
      cout<<"$5.00";
    else
      cout<<"$2.00";
  }
  else{
    if(age>13)
      cout<<"$8.00";
    else
      cout<<"$4.00";
  }
}