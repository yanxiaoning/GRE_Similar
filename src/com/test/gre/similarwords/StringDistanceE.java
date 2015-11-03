package com.test.gre.similarwords;

public class StringDistanceE implements Comparable<StringDistanceE>{
	private String word;
	private int distance;
	
	public StringDistanceE(String word, int distance) {
		this.word = word;
		this.distance = distance;
	}

	public String getWord() {
		return word;
	}

	@Override
	public int compareTo(StringDistanceE o) {
		if(this.distance > o.distance)
		    return 1;		
		else if(this.distance < o.distance)
			return -1;
		else return 0;
		
	}
	

}
