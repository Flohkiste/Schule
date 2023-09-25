package Arbeitsblatt_17;

import java.util.Scanner;

public class Aufgabe_4 {

	public static void main(String[] args) {
		boolean loopVariable = true;
		Scanner scanner = new Scanner(System.in);
		
		//Eingabe
		System.out.print("Anzahl der Schüler: ");
		int numberOfStudents = scanner.nextInt();
		System.out.println("");
		double allGrades[][] = new double[numberOfStudents][];
		
		for(int x = 0; x < numberOfStudents; x++) {
			System.out.print(x+1 + ". Schueler, wie viel Noten: ");
			int numberOfGrades = scanner.nextInt();
			double grades[] = new double[numberOfGrades];
			System.out.println("");
			for(int y = 0; y < numberOfGrades; y++) {
				System.out.print(y+1 + ". Note: ");
				grades[y] = scanner.nextDouble();
			}
			
			allGrades[x] = grades;
			
			System.out.println("");
		}
		
		
		double gradeAvarage;
		//Durchschnittsberechnung + Ausgabe
		for(int x = 0; x < allGrades.length; x++) {
			gradeAvarage = 0;
			for(int y = 0; y < allGrades[x].length; y++) {
				gradeAvarage += allGrades[x][y];
			}
			
			gradeAvarage = gradeAvarage / allGrades[x].length;
			
			
			System.out.println(x+1 + ". Schueler Durschnittsnote: " + gradeAvarage);
			
			
		}
		
		
		
	}

}
