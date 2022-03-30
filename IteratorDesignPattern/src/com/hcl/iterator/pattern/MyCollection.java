package com.hcl.iterator.pattern;

public class MyCollection implements Container {

	public String names[] = { "Arun", "Kiran", "Prasad", "Mohan", "Rohan" };

	@Override
	public MyIterator getMyIterator() {
		return new MyCollectionIterator();
	}

	private class MyCollectionIterator implements MyIterator {

		int index;
		
		@Override
		public boolean hasNext() {
		
			if(index<names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			
			if(this.hasNext()) {
				
				return names[index++];
			}
			
			return null;
		}

	}

}
