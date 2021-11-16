package com.streamoperations;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

// Parallel Stream utilizes all cores of your CPU, it is much faster
public class B_ParallelStreamDemo {
	
	public static void main(String[] args) throws IOException {
		// Create a File object
		File fileName = new File("C://Users//divya//Documents//SQL_COOKBOOK.txt");

		// Create a Stream of String type
		// Using the lines() method to read one line at a time
		// from the text file
		//Stream<String> text = Files.lines(fileName.toPath());

		// Use StreamObject.parallel() to create parallel streams
		// Use forEach() to print the lines on the console
//	  	text.parallel().forEach(t -> {
//	  		//System.out.println(t);
//	  		System.out.println(Thread.currentThread().getName());
//	  		
//	  	});

		// Close the Stream
	//	text.close();
		
		  List<String> text = Files.readAllLines(fileName.toPath());
          //System.out.println(text);
	     //    Using parallelStream() to create parallel streams
	        text.parallelStream().forEach( t -> {
	        	System.out.println(t);
	        	System.out.println(Thread.currentThread().getName());
	        });
	}
}
