#include <iostream>
using namespace std;
int main() {
    int n , no = 1;
  cin>>n;
  for(int i=1;i<=n;i++){
    if(i%2 != 0){  // odd line
      for(int j=1;j<=n-1;j++){
        cout<<no;        
      }
      no++;
      cout<<no<<endl;
    }
    else{
      cout<<no+1;
      for(int j=1;j<=n-1;j++){
        cout<<no;        
      }
      no++;
      cout<<endl;
    }
    
  }
    return 0;
}