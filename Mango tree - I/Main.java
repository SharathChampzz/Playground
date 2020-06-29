#include<iostream>
using namespace std;
int main()
{
 int row,col,plant;
  cin>>row>>col>>plant;
  int plantcol = plant % col;
  
  if(plantcol == 0 || plantcol == 1)
    cout<<"Yes";
  else if(plant <= col)
    cout<<"Yes";
  else
    cout<<"No";
}