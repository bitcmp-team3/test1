package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String pathname="D:/java_data/1234.txt";
		File txtFile = new File(pathname);
		if(txtFile.exists()) {
			System.out.println("파일존재");
			if(txtFile.isFile()){
				System.out.println("파일입니다.");
				FileReader fileReader = null;
				BufferedReader reader = null;
				try {
					fileReader = new FileReader(txtFile);
					reader = new BufferedReader(fileReader);
					
					
					int data=-1;
					while((data = fileReader.read())!=-1) {
						System.out.print((char)data);
					}
					
					String dataStr=null;
					while((dataStr=reader.readLine()) !=null) {
						System.out.println(reader.readLine());	
					}
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					if(reader!=null) {
						reader.close();
					}
					if(fileReader!=null) {
						fileReader.close();
					}
				}
			} else {
				System.out.println("디렉토리입니다.");
			}
		} else {
			System.out.println("파일존재 X");
		}
		
	}

}
