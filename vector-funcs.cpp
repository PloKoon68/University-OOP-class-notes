#include <iostream>
#include <stdio.h>

#include <vector>

using namespace std;



int main()
{
    vector<int> v1 = { 1,2,3 };
    
    v1.back();    //3
    v1.front();   //1
    v1.size();    //3
    v1.capacity(); //returns 1 2 4 8 16 ...  as it contains the size 
    v1.push_back(9); //appends 9
    v1.pop_back();   //removes the last element
    
    
    
     return 0;
}
