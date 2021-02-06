package com.inputoutputexercise;

import java.io.File;

public class FilenameFromDirectory {

	public static void main(String[] args) {
		String[] fileName;
		File f= new File("E:\\React\\my-app");
		fileName = f.list();
		for (String name: fileName) {
			System.out.println(name);
		}

	}

}
