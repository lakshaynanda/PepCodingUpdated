#include<iostream>
using namespace std;

int main()
{
    cout<<"Fibo till?"<<endl;
    int n;
    cin>>n;
    int a=0;
    int b=1;
    for(int i=0;i<n;i++)
    {
        cout<<a<<" ";
        int sum=a+b;
        a=b;
        b=sum;

    }

    return 0;
}
