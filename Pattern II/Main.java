#include<iostream>
using namespace std;
int main(){
  int n,x=1;
  int temp;
  cin>>n;
  for(int i=1;i<=n;i++){
    if(i%2 !=0){
    for(int j=1;j<=i;j++){
      cout<<x;
      x++;
      if(j!=i)
        cout<<"*";   
    }
    cout<<endl;
    }
    else{
      temp = x;
      x += i-1;
      for(int j=1;j<=i;j++){
      cout<<x;
      x--;
      if(j!=i)
        cout<<"*";   
    }
    cout<<endl;
      x = temp + i;
    }
  }
  
}