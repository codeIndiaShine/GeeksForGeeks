package com.datastructure.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NIOStreaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Stream<Path> stream = Files.list(Paths.get("E:\\Comp-Shikhar\\Data\\db_scripts"))) {
		    stream.map(String::valueOf)
		        .filter(path -> path.endsWith(".docx"))
		        .forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (BufferedReader reader = Files.newBufferedReader(Paths.get("E:\\Comp-Shikhar\\Data\\db_scripts\\MachineLearningForRecruitment.docx"))) {
		    reader.lines().map(String::toLowerCase).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
