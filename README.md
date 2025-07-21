🎲 Dice Game in Java ...
---
A simple command-line Dice Game built in Java where 
---
the player rolls a dice until they roll a 1. 
The game ends when the player rolls a 1, 
and the final score is displayed.
---

📜 Game Rules
---
🔢 The game prompts the player to enter 10 to roll the dice.

❌ If the player enters anything other than 10, they are prompted again.

🎲 A random number between 1 and 6 is generated to simulate the dice roll.

💀 If the player rolls a 1, the game ends and displays the final score.

➕ Any number other than 1 is added to the player's total score.

✅ The dice roll generates numbers between 1 to 6 (inclusive), simulating a real six-faced die.
---

📂 Project Structure
DiceGame/
│
├── src/
│   └── com/
│       └── DiceGame.java
├── README.md
---
🚀 How to Run
1. Clone the repository
git clone https://github.com/your-username/DiceGame.git
cd DiceGame
---
3. Compile the Java file
javac src/com/DiceGame.java
---
5. Run the program
java -cp src com.DiceGame
---
📸 Example Gameplay
---
🎲 Welcome to the Dice Game!
👉 Enter 10 to roll the dice. Rolling a 1 ends the game.

Enter 10 to Roll the Dice: 10
🎲 Dice value: 6
✅ Current Score: 6

Enter 10 to Roll the Dice: 10
🎲 Dice value: 2
✅ Current Score: 8

Enter 10 to Roll the Dice: 10
🎲 Dice value: 1
💀 You rolled a 1. Game Over!
🏁 Final Score: 8


---
🛠️ Technologies & Concepts Used
🧠 Java Programming

🔁 Loops (while loop)

🔀 Conditionals (if, else)

🎲 Random Number Generation (Random.nextInt(6) + 1)

📥 User Input using Scanner
🖥️ IDEs: IntelliJ IDEA / VS Code / Command Line / Eclipse
---

📌 Notes
Dice rolls are generated using:

rand.nextInt(6) + 1; // values 1 to 6
The game stops when the player rolls a 1.

Only the number 10 is accepted to trigger a roll.



