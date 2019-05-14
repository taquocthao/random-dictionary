package com.tathao.randomtext;

import java.util.List;

public interface RandomDictionary {

	public List<String> readFile(String pathname);
	
	public String showDictionary(List<String> listDictionary, int second);
	
}
