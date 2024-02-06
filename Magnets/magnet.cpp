#include<iostream>
using namespace std;
int main(){
    int n;
    cin >> n;
    int size = n;
    int store[size];
    int groupNum = 1;

 
    if(n>=1 && n <=100000){
        for(int i = 1;i<=size;i++){
            cin >> store[i];
        }
        for(int j = 0; j <n; j++){
            if((store[j] == 10 && store[j+1] == 01) || (store[j] == 01 && store[j+1] == 10)){
                groupNum++;
            }
        }
        cout << groupNum;
    }
}