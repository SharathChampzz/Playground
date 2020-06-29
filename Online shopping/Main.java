#include<iostream>
using namespace std;
int main()
{
  float amt , disc , ship , total;
  float discamount=0;
  int price[3];
  for(int i=0;i<3;i++){
    cin>>amt>>disc>>ship;
    //cout<<amt<<" "<<disc<<" "<<ship<<endl;
    discamount = ((float)disc/100)*amt;
    //cout<<"Discount Amount : "<<discamount<<endl;
    total = amt - discamount + ship;
    //cout<<total<<endl;
    price[i] = total;
  }
  for(int i=0;i<3;i++){
    if(i==0)
      cout<<"In Flipkart Rs."<<price[0]<<endl;
    else if(i==1)
      cout<<"In Snapdeal Rs."<<price[1]<<endl;
    else if(i==2)
      cout<<"In Amazon Rs."<<price[2]<<endl;
  }
  
  if(price[0]<=price[1] && price[0]<=price[2])
    cout<<"He will prefer Flipkart";
  else if(price[1]<=price[0] && price[1]<=price[2])
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
    
}