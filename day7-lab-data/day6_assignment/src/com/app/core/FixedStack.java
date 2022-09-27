package com.app.core;

public class FixedStack implements Stack {
	// state =instnace vars(non static data members)
	protected int topOfStack;// protected members are directly inherited in sub class
	protected Customer[] customers;

	// add arg-less ctor to init top n create empty array : to hold cust details
	public FixedStack() {
		topOfStack = -1;
		customers = new Customer[STACK_SIZE];
	}

	@Override
	public void push(Customer c) {
		if (topOfStack < STACK_SIZE - 1) {
			// enough space : store the ref in the array
			customers[++topOfStack] = c;
			return;
		}
		System.out.println("Stack overflow!!!!!!!!!!!!!!!!!");
	}

	@Override
	public Customer pop() {
		if (topOfStack == -1) {
			System.out.println("Stack underflow!!!!!!!!!!!");
			 return null;
		} else
			return customers[topOfStack--];
	}

}
