package com.tathao.randomtext;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomDictionaryImplement implements RandomDictionary {

	public List<String> readFile(String pathname) {
		
		File file = new File(pathname);
		
		List<String> list = new ArrayList<String>();
		
		try {
			
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNextLine()) {
				String dictionary = scanner.nextLine();
				list.add(dictionary);
//				System.out.println(dictionary);
			}
			
			scanner.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}

	public String showDictionary(List<String> listDictionary, int second) {
		
//		final int bound = listDictionary.size();
		int lengthList = listDictionary.size();
		Random random = new Random();
		
		try {			
			while(lengthList > 0) {			
				int index = random.nextInt(lengthList);
				System.out.println(listDictionary.get(index));
				//remove element in list, avoid duplication
				listDictionary.remove(index);
				Thread.sleep(second*1000);
				lengthList--;
			}
					
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}
