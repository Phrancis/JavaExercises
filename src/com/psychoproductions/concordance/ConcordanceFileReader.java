package com.psychoproductions.concordance;
import java.io.*;

public class ConcordanceFileReader {
	private FileReader input;
	private BufferedReader reader;
	
	public ConcordanceFileReader(FileReader input) {
		this.input = input;
		this.reader = new BufferedReader(input);
	}
	
}
