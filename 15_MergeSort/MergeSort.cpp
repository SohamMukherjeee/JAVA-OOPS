#include<bits/stdc++.h>
using namespace std;
vector<int>  merge(vector<int>&left,vector<int>&right){
    vector<int> result;
    int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
        if (left[i] <= right[j]) {
            result.push_back(left[i]);
            i++;
        } else {
            result.push_back(right[j]);
            j++;
        }
    }
    while (i < left.size()) {
        result.push_back(left[i]);
        i++;
    }
        while (j < right.size()) {
        result.push_back(right[j]);
        j++;
    }
     return result;


}
vector<int> mergeSort(vector<int>&arr){
    if (arr.size() <= 1) return arr;  // base case
    int mid = arr.size() / 2;
    vector<int> left(arr.begin(), arr.begin() + mid);
    vector<int> right(arr.begin() + mid, arr.end());    
    left = mergeSort(left);
    right = mergeSort(right);

    return merge(left, right);

}
int main()
{
     vector<int>arr={38,27,43,3,9,82,10};
     int n=arr.size();
     vector<int>ans=mergeSort(arr);
     
        for(int i=0;i<n;i++){
            cout<<ans[i]<<" ";
        }
    return 0;
}