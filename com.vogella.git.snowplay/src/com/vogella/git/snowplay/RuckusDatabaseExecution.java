package com.vogella.git.snowplay;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class RuckusDatabaseExecution {
	
	List<RuckusDatabase> rdbObjects= new ArrayList<RuckusDatabase>();
	
	public void executeCommand() {
		String command="ruckus -b emputahconsumer d";
		try {
			Process process=Runtime.getRuntime().exec(command);
			BufferedReader reader=new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			
			
			while((line=reader.readLine())!=null && (!(line.startsWith("database")) && !(line.startsWith("--")))) {
				//System.out.println(line);
				String[] tokens=line.split(" ");
				
				for(int i=0;i<tokens.length;i++) {
					RuckusDatabase rdb=new RuckusDatabase();
					if(i==0) {
						rdb.setDatabase(tokens[i]);
					} else if(i==1) {
						rdb.setStatus(tokens[i]);
					} else if(i==2) {
						rdb.setVersion(tokens[i]);
					} else if(i==3) {
						rdb.setSizeInGb(Float.parseFloat(tokens[i]));
					} else if(i==4) {
						rdb.setCatalog(tokens[i]);
					} else if(i==5) {
						rdb.setSizeInGb(Float.parseFloat(tokens[i]));
					} else if(i==6) {
						rdb.setTse(Boolean.parseBoolean(tokens[i]));
					} else if(i==7) {
						rdb.setStarted(tokens[i]);
					} else if(i==8) {
						rdb.setPrimary(Boolean.parseBoolean(tokens[i]));
					} else if(i==9) {
						rdb.setUsage(tokens[i]);
					} else if(i==10) {
						rdb.setReadOnly(Boolean.parseBoolean(tokens[i]));
					} else if(i==11) {
						rdb.setCxn(Integer.parseInt(tokens[i]));
					} else if(i==12) {
						rdb.setQps(Integer.parseInt(tokens[i]));
					} else if(i==13) {
						rdb.setRssInMb(Integer.parseInt(tokens[i]));
					} else if(i==14) {
						rdb.setBuffInMb(Float.parseFloat(tokens[i]));
					} else if(i==15) {
						rdb.setCapacity(tokens[i]);
					} else if(i==16) {
						rdb.setBinlogFormat(tokens[i]);
					}
					rdbObjects.add(rdb);
					this.printDatabaseVersion(rdbObjects);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printDatabaseVersion(List<RuckusDatabase> rdbObjs) {
		Iterator<RuckusDatabase> listIterator=rdbObjs.iterator();
		
		while(listIterator.hasNext()) {
			RuckusDatabase rdbOb=listIterator.next();
			System.out.println(rdbOb.getVersion());
		}
	}
}
