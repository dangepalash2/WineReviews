package com.google.appengine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class abc {

	public static void main(String args[]) throws IOException, InterruptedException {
		BufferedReader bf = new BufferedReader(new FileReader(new File("C:\\Users\\LENOVO\\Google Drive\\MSc in Computing\\temp.txt")));
		String line;
		int i=0;
		String arr[] =  new String[10];
		while((line = bf.readLine()) != null) {
			arr[i] = line;
			i++;
		}
		
		String abc = arr[new Random().nextInt(arr.length)];
		System.out.println(abc);
	}
}
