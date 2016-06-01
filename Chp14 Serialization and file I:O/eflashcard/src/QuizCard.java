import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class QuizCard{
	private String question;
	private String answer;

	public QuizCard(String q,String a){
		question = q;
		answer = a;
	}
	
	String getQuestion(){
		return question;
	}

	String getAnswer(){
		return answer;
	}		
}