package qqq;

import java.util.Scanner;


public class MyCollection {
	private Object []elem;
	
	MyCollection(Object []elem){
		this.elem = elem;
	}
	
		
	public class Delite implements Iterator{
		private int cur = 0;
		private int position = 0;
		private int cur2 = elem.length-2;
		Object []elems = new Integer[elem.length-1];
		{System.out.println("Size"+ elems.length);}
		
		public void update(Object ob, int pos){
			if(pos != elems.length-1){
			elems[pos] = ob;
			System.out.println(elems[pos]);
			}
		}
		
		@Override
		public boolean hasPrevious() {
			return cur2 >= 0;
		}

		@Override
		public Object previous() {
			return elem[cur2--];
		}

		@Override
		public boolean hasNext() {
			return cur < elem.length - 2;
		}

		@Override
		public Object next() {
			return elem[cur++];
		}
		
		public int getPosition(){
			return position;
		}

		@Override
		public void setPosition() {
			System.out.println("Input element to delite: ");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt())
				position = sc.nextInt()-1;
		}
		
		@Override
		public int getPos() {
			return cur;
		}

		@Override
		public Object next(int cur1) {
			this.cur = cur1;
			return elem[cur];
		}

		@Override
		public int getNext(int c) {
			
			return c+1;
		}

	}
	
	public Iterator getDelite(){
		return new Delite();
	}
	
}
