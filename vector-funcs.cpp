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
    v1.shrink_to_fit();  //as the capacity grows and allocates space in memory when you add elements, when you delete element you should shrink back so capacity reduces    
    v1.push_back(9); //appends 9
    v1.pop_back();   //removes the last element
    v1.insert(v1.begin() + 1, 76);  //inserts 76 to the first index. To insert or delete, you need the .begin() ponter to the first element.
    v1.erase(v1.begin() + 2);   //deletes the second index
    
    //to iterate can use
    for(int i = 0; i < v1.size(); i++)
        cout << v1[i];
    //or
    for(auto itr = v1.begin(); itr != v1.end(); itr++)
        cout << *(itr);
 
    
    
     return 0;
}
