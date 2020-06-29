#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s;
  cin>>s;
  for(int i=0;i<s.size();i++){
    //cout<<s[i];
    if(s[i]>=65 && s[i]<=90 || s[i]>=97 && s[i]<=122)
      cout<<s[i];
    /*
    if(s[i]!='$' || s[i]!='#' || s[i]!='&' || s[i]!='$' || s[i]!='$' || )
      cout<<s[i];
    */
  }
}