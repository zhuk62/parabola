package qqq;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int size = 0;
		System.out.println("Input number of elements");
		Scanner scanner = new Scanner(System.in);
		
		if(scanner.hasNextInt())
			size = scanner.nextInt();
		Integer []elements = new Integer[size+1];
		
		System.out.println("Input elements");
		for(int i = 0; i < elements.length-1; i++){
			System.out.println("Element "+ (i+1) +" - ");
			if(scanner.hasNextInt())
				elements[i] = scanner.nextInt();
			}
		
		
		MyCollection collection = new MyCollection(elements);
		Iterator iterD = collection.getDelite();
		
		System.out.println("Output");
		while(iterD.hasPrevious())
			System.out.println(iterD.previous());
		
		System.out.println("----------------------------------------");

		iterD.setPosition();
		while(iterD.hasNext()){
				if(iterD.getPos() == iterD.getPosition()){
				do{
					if(iterD.hasNext())
					//System.out.println((int)iterD.next(iterD.getNext(iterD.getPos())));
					iterD.update(iterD.next(iterD.getNext(iterD.getPos())), iterD.getPos());
				}while(iterD.hasNext());
			}
			System.out.println((int)iterD.next());
		
		
		}
	}

}
