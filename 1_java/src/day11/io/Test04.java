package day11.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		String filename = "c://lib/Ben.mp3";
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		int count = 0;
		int read = 0;

		try {
			fis = new FileInputStream(filename);
			fos = new FileOutputStream("c://lib/copy.mp3", false);
					//true일 경우 같은 내용이 붙여짐
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			
			System.out.println("파일 복사 시작");
			while ((read = bis.read()) != -1) {
				bos.write(read);
				count++;
			}
			bos.flush();
			//buffer를 쓸 때는 flush를 하지않아면 파일에 기록이 안될 수 도 있다.
			System.out.println("IO 횟수 : " + count);
			System.out.println(" ***  파일 복사 완료  *** ");

		} catch (FileNotFoundException e) {
			System.out.println("복사할 파일을 준비해 주세요.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(bis != null) bis.close();
				if(bos != null) bos.close();
				
				if (fis != null) fis.close();
				if (fos != null) fos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Main end");
	}

}
