# recursive-function

수열 귀납적 정의로 a의 첫번째항이 정의되면 그 다음 항이 정의되는 규칙인 재귀 함수에 흥미가 생겨 이를 프로그램으로 만들어 보려 한다.

재귀 함수의 정의: 함수 안에 자신의 함수를 다시 호출하는 함수

이를 프로그램으로 만들기위해 재귀 알고리즘이라는 것을 쓸 것읻.

 재귀 알고리즘: 문제를 해결하기 위해 재귀 함수를 사용하는 알고리즘

 함수 안에서 자신의 함수를 다시 호출하여 반복이 된다.

-------

 1. 합

    a _{n} =a _{n-1} +n

    식을 세우면 이렇게 되고 코드에서는 sum 함수를 세워 해결한다.

    ```java
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }
    ```
    만약 sum(5)라고 하면
    
    sum(5) = 5 + sum(5-1)
    
    sum(4) = 4 + sum(3)

    sum(3) = 3 + sum(2)

    sum(2) = 2 + sum(1)

    sum(1) = 1

    이런식으로 재귀함수 풀이가 된다.

2. 팩토리얼

    a _{n} =n*a _{n-1}
   
    식을 세우면 이렇게 되고 코드에서는 factorial 함수를 세워 해결한다.

    ```java
    public static int factorial(int n) {
        if (n == 0) { 
            return 1;
        } else { 
            return n * factorial(n - 1);
        }
    }
    ```
   만약 factorial(5)라고 하면

   factorial(5) = 5 * factorial(5-1)

   factorial(4) = 4 * factorial(3)

   factorial(3) = 3 * factorial(2)

   factorial(2) = 2 * factorial(1)

   factorial(1) = 1 * factorial(0)

   factorial(0) = 1

   이런식으로 재귀함수 풀이가 된다.

3. 거듭제곱

    power(a,n)=a ^{n} =a*power(a,n-1)
   
    식을 세우면 이렇게 되고 코드에서는 power 함수를 세워 해결한다.

    ```java
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }else {
            return base * power(base, exponent - 1);
        }
    }
    ```
   만약 power(2,5)라고 하면

   power(2,5) = 2^5 = 2 * power(2,5-1)

   power(2,4) = 2 * power(2,3)

   power(2,3) = 2 * power(2,2)

   power(2,2) = 2 * power(2,1)

   power(2,1) = 2 * power(2,0)

   power(2,0) = 1

   이런식으로 재귀함수 풀이가 된다.

4. 피보나치 수열

    F(n)=F(n-1)+F(n-2)
   
    식을 세우면 이렇게 되고 코드에서는 power 함수를 세워 해결한다.

    ```java
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    ```
   만약 fib(5)라고 하면

   fib(5) = fib(4) + fib(3)

   fib(4) = fib(3) + fib(2)

   fib(3) = fib(2) + fib(1)

   fib(2) = fib(1) + fib(0)

   fib(1) = 1

   fib(0) = 0

   이런식으로 재귀함수 풀이가 된다.

하지만, 이 피보나치 수열 풀이는 중복된 계산도 하고 있어 비효율적이다. 그래서 이러한 경우에는 dp(동적계획법)을 이용한다.

동적계획법: 큰 문제를 작은 문제들로 나누어 중복되는 것이 있으면 처음에 저장해두고 그 다음에 너오면 저장된 것을 사용하여 중복 계산을 막는 알고리즘

5. 동적계획법을 활용한 피보나치 수열

    F(n)=F(n-1)+F(n-2)
   
    식을 세우면 이렇게 되고 코드에서는 power 함수를 세워 해결한다.

    ```java
    static int[] dp = new int[100];

    public static int dp_fib(int n) {
        if (dp[n] != 0) {
            return dp[n];
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            dp[n] = dp_fib(n - 1) + dp_fib(n - 2);
            return dp[n];
        }
    }
    ```
   풀이는 동적계획법 안쓴 피보나치 수열이랑 똑같으나 중복계산을 막아 프로그램 속도가 빠르다.

------

느낀점:
