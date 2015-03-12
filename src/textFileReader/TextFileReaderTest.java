/*
 * nhgrif says:
 * This will get arrays and file IO all at once.
 * This website has .txt files of literary works in public domain:
 *   http://www.gutenberg.org/ebooks/search/%3Fsort_order%3Ddownloads
 *   
 * Create a program that takes a text file and does the following:
 *   1) Count the total number of words 
 *   2) generate a list of all unique words 
 *   3) For each word, create a list of every line it occurs on 
 *     (and how many times it occurs on that line) and calculate the total 
 *     frequency of that word (count/totalWordCount)
 *   
 * Make sure you got all the hardbits working, but then ideally, 
 * make your program let the user specify a text file to parse.
 * It's basically like making a concordance. 
 * 
 * And realistically, the program could probably be made to present the user with 
 * the list of .txt files directly from gutenburg.org have them select one, 
 * and download it over the Internet rather than requiring the file be local.
 */

package textFileReader;

import java.io.*;
import java.nio.*;
import java.util.Scanner;

// path: /Users/francisveilleux-gaboury/Documents/TextFiles/test.txt

public class TextFileReaderTest {
	public static void main(String[] args) {

	}
}