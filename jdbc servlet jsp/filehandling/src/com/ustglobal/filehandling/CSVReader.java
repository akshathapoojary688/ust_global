package com.ustglobal.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {

	public static void main(String[] args) {

		try(FileReader in = new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in);){
			while(reader.ready()) {
				//System.out.println(reader.readLine()); or
				String line = reader.readLine();
				//System.out.println(line); or
				String[] words = line.split(",");
				
				System.out.println("id is "+words[0]);
				System.out.println("name is "+words[1]);
				System.out.println("salary is "+words[2]);
				System.out.println("gender is "+words[3]);
				System.out.println("**************************");
				
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();

		}
	}

}
