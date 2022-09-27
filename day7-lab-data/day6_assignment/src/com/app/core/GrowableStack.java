package com.app.core;

public class GrowableStack extends FixedStack {
	// inherited data memebers : top , Customer[]
	@Override
	public void push(Customer c) {
		if (topOfStack == customers.length - 1) {
			System.out.println("creating new array....");
			// curnt stack(array is full)
			// create NEW array with double the size
			Customer[] tmp = new Customer[customers.length * 2];
			// copy customer refs from old --> new array
			// API of System class
			/*
			 * public static void arraycopy​(Object src, int srcPos, Object dest, int
			 * destPos, int length)
			 */
			System.arraycopy(customers, 0, tmp, 0, customers.length);
			// re assign old array ref to new array obj
			customers = tmp;
		}
		customers[++topOfStack] = c;

	}

}
