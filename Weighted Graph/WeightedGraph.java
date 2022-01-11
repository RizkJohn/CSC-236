package lab7_2;

import java.io.*;
import java.util.*;

import lab7_1.Graph;

public class WeightedGraph extends Graph{
	protected double [][] weights;
	protected double [] smallestWeight;
	
	public WeightedGraph() {
		super();
		weights = new double [maxSize][maxSize];
		smallestWeight = new double[maxSize];
	}
	
	public WeightedGraph(int size) {
		super(size);
		weights = new double[maxSize][maxSize];
		smallestWeight = new double[maxSize];
	}
	
	public void createWeightedGraph() {
		Scanner input = new Scanner(System.in);
		
		int index;
		int vertex;
		int adjacentVertex;
		int edge;
		
		String fileName;
		
		if(gSize != 0) {
			clearGraph();
		}
		
		Scanner infile = null;
		
		try {
			System.out.print("Enter input file name: ");
			fileName = input.nextLine();
			System.out.println();
			infile = new Scanner(new FileReader(fileName));
		} catch (FileNotFoundException fnfe){
			System.out.println(fnfe.toString());
			System.exit(0);
		}
		
		gSize = infile.nextInt();
		
	}
	
	public void shortestPath(int vertex) {
		for(int i = 0; i < gSize; i++) {
			smallestWeight[i] = weights[vertex][i];
		}
			
		boolean[]weightFound = new boolean[maxSize];
			
		for(int i = 0; i < gSize; i++) {
			weightFound[i] = false;
		}
			
		weightFound[vertex] = true;
		smallestWeight[vertex] = 0;
			
		for(int i = 0; i < gSize; i++) {
			double minWeight = Integer.MAX_VALUE;
			int v = 0;
				
			for(int j = 0; j < gSize; j++) {
				if(!weightFound[j]) {
					if(smallestWeight[j] < minWeight) {
						v = j;
						minWeight = smallestWeight[v];
					}
				}
			}
			
			weightFound[v] = true;
			
			for(int j = 0; j < gSize; j++) {
				if(!weightFound[j]) {
					if(minWeight + weights[v][j] < smallestWeight[j]) {
						smallestWeight[j] = minWeight + weights[v][j];
					}
				}
			}
			
		}
	}
	
	public void printShortestDistance(int vertex) {
		System.out.println("Source Vertex: " + vertex);
		System.out.println("Shortest Distance from Source to each Vertex");
		System.out.println("Vertex Shortest_Distance");
		
		for(int j = 0; j < gSize; j++) {
			System.out.print(" " + j + " \t\t");
			System.out.printf("%.2f \n", smallestWeight[j]);
		}
		
		System.out.println();
		
	}	
}










