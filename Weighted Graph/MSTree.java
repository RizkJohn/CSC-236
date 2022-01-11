package lab7_2;

import java.io.*;
import java.util.*;

import lab7_1.Graph;

public class MSTree extends Graph{
	protected int source;
	protected double [][] weights;
	protected int [] edges;
	protected double [] edgeWeights;
	
	public MSTree() {
		super();
		weights = new double [maxSize][maxSize];
		edges = new int[maxSize];
		edgeWeights = new double [maxSize];
	}
	
	public MSTree(int size) {
		super(size);
		weights = new double [maxSize][maxSize];
		edges = new int[maxSize];
		edgeWeights = new double[maxSize];
	}
	
	public void createSpanningGraph() {
		Scanner input = new Scanner(System.in);
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
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.toString());
			System.exit(0);
		}
		
		gSize = infile.nextInt();
		
		for(int i = 0; i < gSize; i++) {
			int vertex = infile.nextInt();
			int adjacentVertex = infile.nextInt();
			
			while(adjacentVertex != -999) {
				graph[vertex].toString();
				adjacentVertex = infile.nextInt();
			}
		}
		
		for(int i = 0; i < gSize; i++) {
			for(int j =0; j < gSize; j++) {
				weights[i][j] = Integer.MAX_VALUE;
			}
			
			double weight;
			
			while(infile.hasNext()) {
				int vertex = infile.nextInt();
				int adjacentVertex = infile.nextInt();
				
				while (adjacentVertex != -999) {
					weight = infile.nextInt();
					weights[vertex][adjacentVertex] = weight;
					adjacentVertex = infile.nextInt();
				}
			}
		}
	}
	
	public void minimalSpanning(int sVertex) {
		source = sVertex;
		boolean[] mstv = new boolean[maxSize];
		
		for(int j = 0; j < gSize; j++) {
			mstv[j] = false;
			edges[j] = source;
			edgeWeights[j] = weights[source][j];
		}
		
		mstv[source] = true;
		edgeWeights[source] = 0;
		
		for(int i = 0; i < gSize-1; i++) {
			double minWeight = Integer.MAX_VALUE;
			int startVertex = 0;
			int endVertex = 0;
			
			for(int j = 0; j < gSize; j++) {
				if(mstv[j]) {
					for(int k = 0; k < gSize; k++) {
						if(!mstv[k] && weights[j][k] < minWeight) {
							endVertex = k;
							startVertex = j;
							minWeight = weights[j][k];
						}
					}
				}
			}
			
			mstv[endVertex] = true;
			edges[endVertex] = startVertex;
			edgeWeights[endVertex] = minWeight;
		}
	}
	
	public void printTreeAndWeight() {
		double treeWeight = 0;
		System.out.println("Source Vertex: " + source);
		System.out.println("Edges Weight");
		
		for(int j = 0; j < gSize; j++) {
			if(edges[j] != j) {
				treeWeight = treeWeight + edgeWeights[j];
				System.out.print("(" + edges[j] + " " + j + ") ");
				System.out.printf("%.2f \n", edgeWeights[j]);
			}
		}
		
		System.out.println();
		System.out.print("Minimal Spanning Tree Weight: ");
		System.out.printf("%.2f \n", treeWeight);
	}

}









