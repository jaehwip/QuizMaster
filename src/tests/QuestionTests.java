package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cse237.Question;

class QuestionTests {

	@Test
	void testQuestionAnswerCorrect() {
		Question q = new Question("What is 1 + 1?", "2");
		boolean correct = q.checkAnswer("2");
		assertTrue(correct);
	}

	@Test
	void testQuestionAnswerIncorrect() {
		Question q = new Question("What is 1 + 1?", "2");
		boolean incorrect = q.checkAnswer("3");
		assertFalse(incorrect);
	}
}
