package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cse237.Question;
import cse237.Quiz;

class QuizTests {

	@Test
	void test() {
		Quiz quizUnderTest = new Quiz("Sample Quiz");
		Question questionUnderTest = new Question("What is 1 + 1?", "2");
		assertTrue(quizUnderTest.getNumberOfQuestions() == 0);
		quizUnderTest.addQuestion(questionUnderTest);
		assertTrue(quizUnderTest.getNumberOfQuestions() == 1);
		
	}

}
