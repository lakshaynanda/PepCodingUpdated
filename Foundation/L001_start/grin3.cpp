#include<iostream>
using namespace std;
int main()
{
    int n=36;
    //cin>>n;
    for(int j=3;j<=n;j++)
    {
        bool flag=true;
        for(int i=2;i*i<=n;i++)
        {
            if(j%i==0)
            {
                flag=false;
                break;
            }
        }
        if(flag)
        {
            cout<<j<<endl;
        }
    }


	return 0;
}

