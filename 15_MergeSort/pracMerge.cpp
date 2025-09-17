#include<bits/stdc++.h>
using namespace std;
vector<int>merge(vector<int>&first,vector<int>&second){
    vector<int>result;
    int i=0,j=0;
    while(i< first.size() && j< second.size()){
        if(first[i]<=second[j]){
            result.push_back(first[i]);
            i++;
        }else{
            result.push_back(second[j]);
            j++;
        }
    }
    while(i< first.size()){
            result.push_back(first[i]);
            i++;
    }
        while(j< second.size()){
            result.push_back(second[j]);
            j++;
    }

    return result;
}
vector<int>mergeSort(vector<int>&vec){
    if(vec.size()<=1)return vec;
    int mid=vec.size()/2;
    vector<int>left(vec.begin(),vec.begin()+mid);
    vector<int>right(vec.begin()+mid,vec.end());
    left=mergeSort(left);
    right=mergeSort(right);
    return merge(left,right);
}
int main()
{
    vector<int>vec{12,2,23,44,121,1};
    vector<int>ans=mergeSort(vec);
     for(int i=0;i<ans.size();i++){
        cout<<ans[i]<<" ";
     }
    return 0;
}