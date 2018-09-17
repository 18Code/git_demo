package com.chapter17;

import java.io.IOException;
import java.io.RandomAccessFile;

//17.22
public class FileEditor {
	RandomAccessFile file;
	
	//63--80---shasha
	//使用所提供的账号在文件中增加一条记录
		public void newRecord(int accountNumber,String firstName,String lastName,double balance)
		throws IllegalArgumentException,IOException{
			RandomAccessAccountRecord record  = getRecord(accountNumber);
			if(record.getAccount()!=0)
				throw new IllegalArgumentException("Account already exists");
			file.seek((accountNumber-1)*RandomAccessAccountRecord.SIZE);
			record  = new RandomAccessAccountRecord(accountNumber,firstName,lastName,balance);
			record.write(file);
		}//end method newRecord

}
