package model.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * The class allowing to read and write in files
 */
public class RWFile {

	/**
	 * The method to write in a file
	 * @param file the file where to write
	 * @param script the script to write
	 */
	public static void write(String file, String script) {
		
		PrintWriter pw;
		BufferedWriter bw;
		FileWriter fw;

		try {

			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter (bw);
			pw.write(script);
			pw.close();

		} catch (IOException e) {

		}

	}

	/**
	 * The method to read from a file
	 * @param file the file where to read
	 * @return the read string
	 */
	public static String read(File file) {
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			
		} catch (FileNotFoundException e) {

		}
		String ret = "";
		
		try {
			
			while (sc.hasNextLine()) {
				ret += sc.nextLine()+"\n";
			}
			
		} catch (NullPointerException ex) {

		}
		sc.close();
		return ret;
	}
}