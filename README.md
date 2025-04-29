# Student Scores Analysis Program - README

## 📝 Program Description
This Java program helps teachers analyze exam scores for 10 students. It calculates important statistics like pass/fail rates, average score, and identifies high-performing students.

## 🧠 How It Works

### 1️⃣ Getting Scores
The program first asks the teacher to enter exam scores for 10 students one by one. It stores these scores in a list (called an "array" in programming).

### 2️⃣ Calculating Statistics
After collecting all scores, the program calculates:
- **Pass/Fail Count**: Counts how many students passed (score ≥ 50) and failed (score < 50)
- **High Achievers**: Counts students who scored above 75
- **Total Score**: Adds up all scores for calculating average
- **Lowest Score**: Finds the minimum score in the class

### 3️⃣ Displaying Results
Finally, the program shows a clear report with:
- Number of students who passed and failed
- The class average score
- The lowest score in the class
- How many students scored above 75

## 🖥️ How to Run the Program
1. Make sure you have Java installed on your computer
2. Copy the code into a file named `StudentScores.java`
3. Open Command Prompt/Terminal and navigate to the file location
4. Compile with: `javac StudentScores.java`
5. Run with: `java StudentScores`

## 📊 Example Usage
```
Enter exam scores for 10 students:
Enter score for student 1: 85
Enter score for student 2: 42
...
Enter score for student 10: 68

--- Exam Results ---
Students passed: 7
Students failed: 3
Average score: 65.4
Lowest score: 32
Students scored above 75: 2
```

## 💡 Key Programming Concepts Used
- **Arrays**: To store multiple scores (int[] scores)
- **Loops**: To repeat actions (for getting input and calculations)
- **Conditionals**: If-statements to make decisions (pass/fail checks)
- **Variables**: To store different types of data (int, double)
- **Input/Output**: Scanner for input, System.out for output
