#include<iostream>
#include<vector>

using namespace std;
int main()
{
	int size=0;
	cin>>size;
	vector <int> arr(size,0);

	for(int i=0;i<arr.size();i++)
	{
		cin>>arr[i];
	}
	for(int i=0;i<arr.size();i++)
	{
		cout<<arr[i]<<" ";
	}



	return 0;
}
