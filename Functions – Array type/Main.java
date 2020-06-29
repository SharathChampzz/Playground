#include<iostream>
using namespace std;
int main()
{
  int n;
  cout<<"Enter the number of elements in the array\nEnter the elements in the array\n";
  cin>>n;
  int a[n];
  int odd = 0, even = 0 ;
  for(int i=0;i<n;i++){
    cin>>a[i];
    if(a[i]%2 == 0)
      even++;
    else
      odd++;
  }
 // cout<<"Even = "<<even<<endl;
  //cout<<"Odd = "<<odd<<endl;
  if(even !=0 && odd==0)
    cout<<"The array is Even";
  else if(even ==0 && odd!=0)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}