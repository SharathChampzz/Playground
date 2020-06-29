#include<iostream>
using namespace std;
int main()
{
  int row , col;
  cin>>row>>col;
  int a[row][col] , b[row][col] , sum[row][col];
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
      cin>>a[i][j]; 
    }
  }
  
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
      cin>>b[i][j]; 
    }
  }
  
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
      sum[i][j] = a[i][j] + b[i][j];
      cout<<sum[i][j];
      if(j==col-1)
        cout<<endl;
      else
        cout<<" ";
    }
  }
  
}