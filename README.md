🎲 Dice Game in Java
A simple command-line Dice Game built in Java where the player rolls a dice until they roll a 1. The game ends when the player rolls a 1, and the final score is displayed.

📜 Game Rules
The game prompts the player to enter 10 to roll the dice.

If the player enters anything other than 10, they are prompted again.

A random number between 1 and 6 is generated to simulate the dice roll.

If the player rolls a 1, the game ends and displays the final score.

Any number other than 1 adds to the player's total score.

✅ The dice roll generates numbers between 1 to 6 (inclusive), simulating a real six-faced die.

📂 Project Structure
DiceGame/
│
├── src/
│   └── com/
│       └── DiceGame.java
├── README.md


🚀 How to Run
Clone the repository:
git clone https://github.com/your-username/DiceGame.git
cd DiceGame

---

#1.Compile the Java file:
javac src/com/DiceGame.java
---

#2.Run the program:
java -cp src com.DiceGame

---
📸 Example Gameplay
Enter 10 to Roll the Dice: > 10
Dice value: 6

Enter 10 to Roll the Dice: > 10
Dice value: 2

Enter 10 to Roll the Dice: > 10
Dice value: 1
You are out of the Game
Final Score: 8

---
🛠️ Technologies Used
Java
IntelliJ IDEA / VSCode / Command Line
Random class for dice simulation
Scanner for user input
---
📌 Notes
Dice value is generated using Random.nextInt(6) + 1, giving values from 1 to 6.

The user must always input 10 to roll, else input is ignored.

