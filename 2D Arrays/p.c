#include <stdio.h>

#define MAX_PROCESSES 10
#define MAX_RESOURCES 10

void calculateNeed(int need[MAX_PROCESSES][MAX_RESOURCES], int max[MAX_PROCESSES][MAX_RESOURCES], int allocation[MAX_PROCESSES][MAX_RESOURCES], int n, int m)
{
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            need[i][j] = max[i][j] - allocation[i][j];
        }
    }
}

int isSafe(int available[MAX_RESOURCES], int max[MAX_PROCESSES][MAX_RESOURCES], int allocation[MAX_PROCESSES][MAX_RESOURCES], int need[MAX_PROCESSES][MAX_RESOURCES], int n, int m)
{
    int finish[MAX_PROCESSES] = {0};
    int work[MAX_RESOURCES];
    for (int i = 0; i < m; i++)
        work[i] = available[i];

    int count = 0;
    while (count < n) {
        int found = 0;
        for (int i = 0; i < n; i++) {
            if (finish[i] == 0) {
                int j;
                for (j = 0; j < m; j++) {
                    if (need[i][j] > work[j])
                        break;
                }
                if (j == m) {
                    for (int k = 0; k < m; k++)
                        work[k] += allocation[i][k];
                    finish[i] = 1;
                    found = 1;
                    count++;
                }
            }
        }
        if (found == 0)
            break;
    }

    return (count == n);
}

void requestResources(int available[MAX_RESOURCES], int max[MAX_PROCESSES][MAX_RESOURCES], int allocation[MAX_PROCESSES][MAX_RESOURCES], int need[MAX_PROCESSES][MAX_RESOURCES], int n, int m)
{
    int process;
    printf("Enter the process requesting resources (0-%d): ", n - 1);
    scanf("%d", &process);

    int request[MAX_RESOURCES];
    printf("Enter the resource request for process %d: ", process);
    for (int i = 0; i < m; i++)
        scanf("%d", &request[i]);

    for (int i = 0; i < m; i++) {
        if (request[i] > need[process][i]) {
            printf("Error: Requested resources exceed the maximum need.\n");
            return;
        }
        if (request[i] > available[i]) {
            printf("Error: Requested resources exceed the available resources.\n");
            return;
        }
    }

    for (int i = 0; i < m; i++) {
        available[i] -= request[i];
        allocation[process][i] += request[i];
        need[process][i] -= request[i];
    }

    if (isSafe(available, max, allocation, need, n, m))
        printf("Resource request granted. System is in a safe state.\n");
    else {
        printf("Resource request denied. System is in an unsafe state. Restoring state.\n");
        for (int i = 0; i < m; i++) {
            available[i] += request[i];
            allocation[process][i] -= request[i];
            need[process][i] += request[i];
        }
    }
}

int main()
{
    int n, m;
    int max[MAX_PROCESSES][MAX_RESOURCES];
    int allocation[MAX_PROCESSES][MAX_RESOURCES];
    int available[MAX_RESOURCES];
    int need[MAX_PROCESSES][MAX_RESOURCES];

    printf("Enter the number of processes: ");
    scanf("%d", &n);

    printf("Enter the number of resources: ");
    scanf("%d", &m);

    printf("Enter the maximum resources required by each process:\n");
    for (int i = 0; i < n; i++) {
        printf("Process %d: ", i);
        for (int j = 0; j < m; j++)
            scanf("%d", &max[i][j]);
    }

    printf("Enter the resources allocated to each process:\n");
    for (int i = 0; i < n; i++) {
        printf("Process %d: ", i);
        for (int j = 0; j < m; j++)
            scanf("%d", &allocation[i][j]);
    }

    printf("Enter the available resources:\n");
    for (int i = 0; i < m; i++)
        scanf("%d", &available[i]);

    calculateNeed(need, max, allocation, n, m);

    requestResources(available, max, allocation, need, n, m);

    return 0;
}
