#include<iostream>
using namespace std;
int main(){
  int n,num = 1 , dash = 0;
    cin>>n;
  int temp = n;
  int rev;
  
  int count = n;
  rev = n*n+1;
  for(int i=1;i<=n;i++){
    for(int k=1;k<=dash;k++){
      cout<<"-";
    }
    dash += 2;
    for(int j=1;j<=n+1-i;j++){
      cout<<num<<"*";
      num++;
  }
    temp = rev;
    //cout<<endl<<"Temp = "<<temp<<endl;
    for(int j=1;j<=n+1-i;j++){
      cout<<rev;
      if(j != n+1-i)
        cout<<"*";
      rev++;
  }    
    rev = temp - count + 1;
    count--;
    cout<<endl;
    }  
    
     return 0;
  }

 
  