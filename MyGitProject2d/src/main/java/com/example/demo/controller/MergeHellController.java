
package com.example.demo.controller;

import java.util.Random;
public class MergeHellController {
	public static void main(String[] args) {
		//kadaiA();
		kadaiB();
	}

	static void kadaiB() {
		 Random rand = new Random();
		    int x = rand.nextInt(100)+1;
		    System.out.println(x+"が出ました");
	}
}