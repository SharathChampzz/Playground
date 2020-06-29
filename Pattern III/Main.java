#include<iostream>
using namespace std;
int main(){
  int n,x=1;
  int temp;
  cin>>n;
  for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
      cout<<x;
      if(j!=i)
        cout<<"*";   
    }
    cout<<endl;
    x++;   
  }
  x--;
  for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
      cout<<x;
      if(j!=i)
        cout<<"*";   
    }
    cout<<endl;
    x--;  
    
  }
  
}