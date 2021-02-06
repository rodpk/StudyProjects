#include <stdio.h>
void fibonacci(int n){
    int i;
    long long int a=0,b=1,prox;
    
    for(i=0;i<=n;i++){
        printf("%lld, ", a);
        prox = a + b;
        a = b;
        b = prox;
    }
}

long long int fibonacci2(long long int n) {
   if(n == 0){ return 0; }
   else if(n == 1) { return 1;}
   else {
      return (fibonacci2(n-1) + fibonacci2(n-2));
   }
}

int main() {
    int i, n, t1 = 0, t2 = 1;
    printf("Qtde de nums: ");
    //scanf("%d", &n);
    n=50;
    printf("Fibonacci - Iterativo: ");
    fibonacci(n);
    
    printf("\nFibonacci - Recursivo: ");
    for(i=0;i<=n;i++){
        printf("%lld, ", fibonacci2(i));
    }
    return 0;
}