package org.soundarya.randomizer;

import java.util.concurrent.ConcurrentLinkedQueue;

public class PrimeRandomizer {
	public static void main(String args[]){
		ConcurrentLinkedQueue<Integer> inputqueue = new ConcurrentLinkedQueue<Integer>();
		ConcurrentLinkedQueue<Output> outputqueue = new ConcurrentLinkedQueue<Output>();
		System.out.println("The main program has started");
		Thread randomizer= new Thread( new Randomizer(inputqueue, outputqueue));
		Thread prime= new Thread(new Prime(inputqueue,outputqueue));
		randomizer.start();
		prime.start();
	}

}
