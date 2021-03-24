package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cse237.Quiz;
import cse237.QuizManager;

class QuizManagerTests {

	@Test
	void testAddQuizToManager() {
		QuizManager quizMasterUnderTest = new QuizManager();
		Quiz quizUnderTest = new Quiz("Sample Quiz");
		assertTrue(quizMasterUnderTest.getNumberOfQuizzes() == 0);
		quizMasterUnderTest.addQuiz(quizUnderTest);
		assertTrue(quizMasterUnderTest.getNumberOfQuizzes() == 1);
	}

}
