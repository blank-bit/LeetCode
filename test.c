/*********************************************
 @Author       : Mr.Wang
 @Date         : 2021-03-30 19:33:49
 @FilePath     : /test.c
 @Description  : message
*********************************************/
#include <stdio.h>
#include <string.h>

int numTrees(int n)
{
    int G[n + 1];
    memset(G, 0, sizeof(G));
    G[0] = G[1] = 1;
    for (int i = 2; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
            G[i] += G[j - 1] * G[i - j];
    }

    return G[n];
}

int main()
{
    int t;

    t = numTrees(3);

    return 0;
}
