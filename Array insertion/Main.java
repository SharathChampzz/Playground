#include<iostream>
using namespace std;
int main(){
  cout<<"Enter the number of elements in the array\n";
  cout<<"Enter the elements in the array\n";
  cout<<"Enter the location where you wish to insert an element\n";
  

  int n;
  cin>>n;
  int a[n+1];
  for(int i=0;i<n;i++)
    cin>>a[i];
  
  int loc , no ;
  cin>>loc>>no;
  //cout<<"\nLocation = "<<loc<<endl;
  //cout<<"Number = "<<no<<endl;
  if(loc>no){
    cout<<"Invalid Input";
    exit(0);
  }
  cout<<"Enter the value to insert\n";
  cout<<"Array after insertion is\n";
 
  for(int i=n-1;i>=loc-1;i--)
    a[i+1] = a[i];
 

  a[loc-1] = no;
  //cout<<"Moved final Array : \n";
  for(int i=0;i<=n;i++)
    cout<<a[i]<<endl;
}