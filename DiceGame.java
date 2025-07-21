package com;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0; // Initialize score

        System.out.println("🎲 Welcome to the Dice Game!");
        System.out.println("👉 Enter 10 to roll the dice. Rolling a 1 ends the game.");

        while (true) {
            System.out.print("Enter 10 to Roll the Dice: ");
            int number = sc.nextInt();

            if (number != 10) {
                System.out.println("❌ Invalid Input! Please enter 10 to roll the dice.");
                continue;
            }

            Random rand = new Random();
            int diceValue = rand.nextInt(6) + 1; // Generates value from 1 to 6
            System.out.println("🎲 Dice value: " + diceValue);

            if (diceValue == 1) {
                System.out.println("💀 You rolled a 1. Game Over!");
                System.out.println("🏁 Final Score: " + score);
                break;
            } else {
                score += diceValue;
                System.out.println("✅ Current Score: " + score);
            }
        }

        sc.close();
    }
}
