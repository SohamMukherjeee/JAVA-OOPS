#include<bits/stdc++.h>
using namespace std;
int main(){
    vector<int>v{23,1,4,5,0,7};
    bool swapped;
    for(int i=0;i<v.size()-1;i++){
        swapped=false;
        for(int j=0;j<v.size()-1-i;j++){
            if(v[j]>v[j+1]){
                swap(v[j],v[j+1]);
                 swapped = true;

            }
        }
        if(swapped==false){
            break;
        }
    }
    for(auto x:v){
        cout<<x<<" ";
    }
}
// i,j
//1,3,5,2,4
// 1,3,2,4,5
// 
//