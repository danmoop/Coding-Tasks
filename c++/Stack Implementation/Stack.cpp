#include "Stack.h"

struct Node
{
	Node* next;
	int val;

	Node(int val)
	{
		this->val = val;
		this->next = nullptr;
	}
};

Node* first = nullptr;

void Stack::push(int i)
{
	if (first == nullptr)
	{
		first = new Node(i);
	}

	else
	{
		Node* newFirst = new Node(i);
		newFirst->next = first;
		first = newFirst;
	}
}

int Stack::pop()
{
	int i = first->val;
	first = first->next;
	
	return i;
}

bool Stack::isEmpty()
{
	return first == nullptr;
}