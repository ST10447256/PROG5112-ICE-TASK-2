/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Lesedi
 */
public class StudentScores {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Create an array to store 10 student scores
        int[] scores = new int[10];
        
        System.out.println("Enter exam scores for 10 students:");
        
        // Get scores from user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter score for student " + (i+1) + ": ");
            scores[i] = input.nextInt();
        }
        
        // Initialize counters
        int passed = 0;
        int failed = 0;
        int above75 = 0;
        int total = 0;
        int lowest = scores[0]; // Start with first student's score
        
        // Calculate all the required information
        for (int i = 0; i < 10; i++) {
            // Check if student passed or failed
            if (scores[i] >= 50) {
                passed++;
            } else {
                failed++;
            }
            
            // Check if score is above 75
            if (scores[i] > 75) {
                above75++;
            }
            
            // Add to total for average calculation
            total += scores[i];
            
            // Check for lowest score
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        
        // Calculate average
        double average = (double)total / 10;
        
        // Display results
        System.out.println("\n--- Exam Results ---");
        System.out.println("Students passed: " + passed);
        System.out.println("Students failed: " + failed);
        System.out.println("Average score: " + average);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Students scored above 75: " + above75);
        
        // Close the scanner
        input.close();
    }
    
}
