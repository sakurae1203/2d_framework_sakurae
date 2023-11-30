package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
	}

		static void kadaiA() {
			for(int a=1;a<=10;a++) {
				System.out.println("現在"+a+"回目のループです");
			}
		}


	static void kadaiB() {
		 Random rand = new Random();
		    int x = rand.nextInt(100);
		    System.out.println(x+"が出ました");
	}
}