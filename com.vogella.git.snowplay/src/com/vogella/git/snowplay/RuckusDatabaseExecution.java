package com.vogella.git.snowplay;

import java.io.IOException;
import java.io.*;

public class RuckusDatabaseExecution {
	
	public void executeCommand() {
		String command="ruckus -b emputahconsumer d";
		try {
			Process process=Runtime.getRuntime().exec(command);
			BufferedReader reader=new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
