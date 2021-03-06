package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		
		//Here we create the instanes and manages the dependenices.
		//we want a framework to do that for us. Thats where spring comes.
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		
		System.out.println(binarySearch1);
		
		int result = binarySearch.binarysearch(new int[]{3,6,4},7);
		
		System.out.println(result);
	
	}
}
