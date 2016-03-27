import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class QuizCard{
	private JTextArea answer;
	private JTextArea question;
	public static void main(String[] args){
		QuizCard quizcard = new QuizCard();
		quizcard.getQuestion();
		quizcard.getAnswer();
	}

	void getQuestion(){
		return question;
	}
	void getAnswer(){
		return answer;
	}



}