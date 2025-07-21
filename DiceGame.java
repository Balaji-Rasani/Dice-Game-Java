package com;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//init score
		int score=0;
		//take while-->runs until condition false
		while(true) {
		System.out.println("Enter 10 to Roll the Dice: ");
		int number=sc.nextInt();
		if(number!=10) {//check if input not 10
			System.out.println("Invalid Input!!please  Enter 10  to roll the Dice :");
			continue;
		}
		int output;
		//Take Random()
		Random rand = new Random();
		System.out.println("Dice value: "+(output=rand.nextInt(6)+1));//Dice value: from 1 - 6
		
		if(output==1) {	
			System.out.println("You are out of the Game");
			System.out.println("Final Score: "+score);
			break;
		}else {
			//update the score with previous dice values
			score+=output;
		}  }  }  }
