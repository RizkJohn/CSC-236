package lab7_1;

import java.io.*;
import java.util.*;

public class Graph{
	protected int maxSize;
	protected int gSize;
	protected UnorderedLinkedList[] graph;
	
	public Graph() {
		maxSize = 100;
		gSize = 0;
		graph = new UnorderedLinkedList[maxSize];
		
		for(int i = 0; i < maxSize; i++) {
			graph[i] = new UnorderedLinkedList<Integer>();
		}
	}
	
	public Graph(int size) {
		maxSize = size;
		gSize = 0;
		graph = new UnorderedLinkedList[maxSize];
		
		for(int i = 0; i < maxSize; i++) {
			graph[i] = new UnorderedLinkedList<Integer>();
		}
	}
	
	public boolean isEmpty() {
		return (gSize == 0);
	}
	
	public void createGraph() {
		Scanner input = new Scanner(System.in);
		
		String fileName;
		
		if(gSize != 0) {
			clearGraph();
		}
		
		Scanner infile = null;
		
		try {
			System.out.println("Enter input file name: ");
			fileName = input.nextLine();
			System.out.println();
			
			infile = new Scanner(new FileReader(fileName));
		} catch(FileNotFoundException fnfe) {
			System.out.println(fnfe.toString());
			System.exit(0);
		}
		
		gSize = infile.nextInt();
		
		for(int i = 0; i < gSize; i++) {
			int vertex = infile.nextInt();
			String name = infile.next();
			int adjacentVertex = infile.nextInt();
			
			while(adjacentVertex != -999) {
				graph[vertex].insertLast(adjacentVertex);
				adjacentVertex = infile.nextInt();
			}
		}
	}
	
	public void clearGraph() {
		for(int i = 0; i < gSize; i++) {
			graph[i] = null;
		}
		
		gSize = 0;
	}
	
	public void printGraph() {
		for(int i = 0; i < gSize; i++) {
			System.out.print(i + " ");
			graph[i].print();
			System.out.println();
		}
		
		System.out.println();
	}
		
}




















