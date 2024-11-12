#include <iostream>

using namespace std;

int main() {
    char c;
    char16_t c16 = u'与';
    char32_t c32 = U'与';
    cout << sizeof(c) <<  c << endl;
    cout << sizeof(c16) << c16 << endl;
    cout << sizeof(c32) <<  c32 << endl;
    return 0;
 }