#include<bits/stdc++.h>
using namespace std;
int main()
{
 long n,d;
 cin>>n;
 int count=0;
while(n!=00)
{
	d=n%10;
	if(d!=0)
	{
	count++;
	n=n/10;
	cout<<n<<" ";
   }
}
cout<<count;
  return 0;
}
