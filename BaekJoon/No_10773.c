<<<<<<< HEAD
#include<stdio.h>

int count = 0;
int stack[100000];

void push(int n) {
	stack[count] = n;
	count++;
}

void pop() {
	count--;
	stack[count] = 0;
}

int main() {
	int input;
	int sum = 0;
	scanf("%d", &input);

	int data[100000];

	for (int i = 0; i < input; i++) {
		scanf("%d", &data[i]);
		if (data[i] == 0)
			pop();
		else
			push(data[i]);
	}

	for (int i = 0; i < count; i++) {
		sum += stack[i];
	}

	printf("%d", sum);

	return 0;
=======
#include<stdio.h>

int count = 0;
int stack[100000];

void push(int n) {
	stack[count] = n;
	count++;
}

void pop() {
	count--;
	stack[count] = 0;
}

int main() {
	int input;
	int sum = 0;
	scanf("%d", &input);

	int data[100000];

	for (int i = 0; i < input; i++) {
		scanf("%d", &data[i]);
		if (data[i] == 0)
			pop();
		else
			push(data[i]);
	}

	for (int i = 0; i < count; i++) {
		sum += stack[i];
	}

	printf("%d", sum);

	return 0;
>>>>>>> 72be617bd2adc8d016aaaaa7d0dd90e44614f33f
}