package com.luv2code.springdemo.annotations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class StandarFortuneService implements FortuneService {

	private String fileName = "C:/Users/marco/eclipse-workspace/spring-demo-one/src-demo-annotations/fortune-data.txt";
	//private String fileName = "fortune-data.txt";
	private List<String> theFortunes;
	
	private Random myRandom = new Random();
	
	public StandarFortuneService() {
		System.out.println(">> StandarFortuneService: inside default constructor");
	}
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(theFortunes.size());
		
		String myFortune = theFortunes.get(index);
		
		return myFortune;
	}
	
	@PostConstruct
	private void loadTheFortunesFile() {
		
		System.out.println(">> StandarFortuneService: inside method loadTheFortunesFile");

		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		// initialize array list
		theFortunes = new ArrayList<String>();
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
