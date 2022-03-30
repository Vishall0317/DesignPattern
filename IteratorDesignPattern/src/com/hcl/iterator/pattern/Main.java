package com.hcl.iterator.pattern;

public class Main {

	public static void main(String[] args) {

		MyCollection collection = new MyCollection();

		MyIterator iterator = collection.getMyIterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

	}
}