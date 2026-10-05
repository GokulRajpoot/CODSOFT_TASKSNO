package com.codsoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionBank {

	public static List<Question> getQuestions(int count) {
		List<Question> all = new ArrayList<>(List.of(
				new Question("Which language is used for Android development?",
						new String[] { "Python", "Java", "C++", "HTML" }, 'B'),
				new Question("Which keyword is used to create a class in Java?",
						new String[] { "function", "define", "class", "struct" }, 'C'),
				new Question("Which data type stores true or false?",
						new String[] { "int", "String", "char", "boolean" }, 'D'),
				new Question("Which method is the entry point of a Java program?",
						new String[] { "start()", "main()", "run()", "execute()" }, 'B'),
				new Question("Which symbol ends a Java statement?", 
						new String[] { ":", ".", ";", "," }, 'C'),
				new Question("Which keyword is used to inherit a class in Java?",
						new String[] { "extends", "implements", "inherits", "super" }, 'A'),
				new Question("Which collection does not allow duplicate elements?",
						new String[] { "ArrayList", "HashSet", "LinkedList", "Vector" }, 'B'),
				new Question("Which block always executes, whether or not an exception occurs?",
						new String[] { "try", "catch", "finally", "throw" }, 'C'),
				new Question("Which operator is used to compare two values for equality?",
						new String[] { "=", "==", "!=", ":=" }, 'B'),
				new Question("Which package contains the Scanner class?",
						new String[] { "java.io", "java.util", "java.lang", "java.net" }, 'B'),
				new Question("What is the size of an int in Java?",
						new String[] { "8 bits", "16 bits", "32 bits", "64 bits" }, 'C'),
				new Question("Which keyword prevents a class from being inherited?",
						new String[] { "static", "final", "abstract", "private" }, 'B'),
				new Question("Which collection stores data as key-value pairs?",
						new String[] { "ArrayList", "HashSet", "HashMap", "Stack" }, 'C'),
				new Question("What is the default value of an int instance variable?",
						new String[] { "null", "undefined", "1", "0" }, 'D'),
				new Question("Which keyword is used to create an object in Java?",
						new String[] { "new", "create", "object", "make" }, 'A'),
				new Question("Using the same method name with different parameters is called?",
						new String[] { "Overriding", "Overloading", "Encapsulation", "Abstraction" }, 'B'),
				new Question("Which access modifier restricts a member to its own class only?",
						new String[] { "public", "protected", "private", "default" }, 'C'),
				new Question("Which loop is guaranteed to run at least once?",
						new String[] { "do-while", "for", "while", "for-each" }, 'A'),
				new Question("Which keyword refers to the current object?",
						new String[] { "super", "this", "self", "current" }, 'B'),
				new Question("Which method converts a String to an int?",
						new String[] { "String.toInt()", "Int.parse()", "Integer.string()", "Integer.parseInt()" },
						'D')));

		Collections.shuffle(all);
		return new ArrayList<>(all.subList(0, Math.min(count, all.size())));
	}
}
