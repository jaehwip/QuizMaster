package cse237;

import java.util.Scanner;

public class Menu {
	
	private Scanner keyboardIn;
	private QuizManager quizManager;
	
	public Menu() {
		keyboardIn = new Scanner(System.in);
		this.quizManager = new QuizManager(); 
	}

	public static void main(String[] args) {
		
		Menu quizMasterMenu = new Menu();
		
		quizMasterMenu.runMenu();
	}

	private void runMenu() {
		this.displayMainMenu();
		
		int selectedOption = this.getUserInput();
		
		this.processMain(selectedOption);
	}

	private void processMain(int selectedOption) {
		if(selectedOption == 1) {
			this.displayTeacherMenu();
			
			int teacherOption = this.getUserInput();
			
			this.processTeacher(teacherOption);
		}
		else if(selectedOption == 2) {
			this.displayStudentMenu();
			
			int studentOption = this.getUserInput();
			
			this.processStudent(studentOption);
		}
	}

	private void processStudent(int studentOption) {
		if(studentOption == 1) {
			System.out.println("List of quizzes");
		}
		else if(studentOption == 2) {
			System.out.println("Taking a quiz");
		}
		else if(studentOption == 3) {
			System.out.println("Viewing quiz score");
		}
	}

	private void processTeacher(int teacherOption) {
		if(teacherOption == 1) {
			addNewQuiz();
		}
		else if(teacherOption == 2) {
			System.out.println("Viewing grades");
		}
		else if(teacherOption == 3) {
			System.out.println("Editing");
		}
	}

	private void addNewQuiz() {
		System.out.println("Please enter a name for the quiz");
		String quizName = keyboardIn.nextLine();
		Quiz quizToBeAdded = new Quiz(quizName);
		quizManager.addQuiz(quizToBeAdded);
	}

	private void displayStudentMenu() {
		System.out.println("1. See list of Quizzes");
		System.out.println("2. Take a Quiz");
		System.out.println("3. View your Quiz Score");
	}

	private void displayTeacherMenu() {
		System.out.println("1. Create a Quiz");
		System.out.println("2. View Quiz Grade");
		System.out.println("3. Edit Exiting QUiz");
	}

	private void displayMainMenu() {
		System.out.println("Welcome to QuizMaster.");
		System.out.println("Please select an option.");
		
		System.out.println("1. Teacher Menu");
		System.out.println("2. Student Menu");
	}
	
	private int getUserInput() {
		return keyboardIn.nextInt();
	}
	
}
