#include <iostream>
using namespace std;

// Time Complexity : O(root(n))

bool isPrime(int n) {
  if(n < 2) return false;
  for(int i = 2; i <= sqrt(n); ++i) {
    if(n % i == 0) return false;
  }
  return true;
}

int main() {
  int n; cin >> n;
  if(checkPrime(n)) 
    cout << "Is Prime\n";
  else
    cout << "Not Prime\n";
  return 0;
}
