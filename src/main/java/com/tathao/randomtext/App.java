package com.tathao.randomtext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	RandomDictionaryImplement randomDictionary = new RandomDictionaryImplement();
    	
    	List<String> listDictionary = randomDictionary.readFile("dictionary.data");
   	
        System.out.println("-------Welcome to test dictionary exam!-------");
        
        randomDictionary.showDictionary(listDictionary, 1);
        
    }
}
