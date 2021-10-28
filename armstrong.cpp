#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int countFreq(long long int arr[], int n, int k)
{   int cnt=0,s=0,ans=0;
    unordered_map<int, int> mp;
    for (int i = 0; i < n; i++)
        mp[arr[i]]++;
    for (auto x : mp)
       { 
        if(x.second>k)
        {cnt++;}
        else
        {s+=x.second;}
        }
        if(s%2==0)
        {ans=cnt+(s/k);}
        else
        {ans=cnt+(s/k)+1;}
        return s;
        
}

int main()
{
    long long int t,n,k,a[100001],res;
    cin>>t;
    for (int i=0;i<t;i++)
    {   
        cin>>n>>k;
        for(int j=0;j<n;j++)
        {
            cin>>a[j];
        }
        res=countFreq(a, n, k);
        cout<<res<<endl;
    }
return 0;
}