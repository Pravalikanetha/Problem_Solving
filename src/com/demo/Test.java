package com.demo;

import java.io.IOException;

import com.demo.service.Operation;

public class Test {

	public static void main(String[] args) {
		try {
			Operation op = (num1, num2) ->{
				if(num2 == 0) {
					throw new IOException("Can't divide with " + num1 + " by "+num2);
				}
				return num1+num2;
			};
			System.out.println(op.print(10, 0));
		}catch(Exception exception) {
			System.out.println(exception);
		}
	}
//	public static void main(String[] args) {
//		dostuff();
//		PrintWriter pw = null;
//		try {
//			pw = new PrintWriter("abc.txt");
//			pw.println("hello from abc.txt file");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		finally {
//			if(pw!=null) {
//				pw.close();
//			}
//		}
//		try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line); 
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//	}
//	
	public static void dostuff() {
		domorestuff();
		System.out.println(101);
	}
	public static void domorestuff() {
		System.out.println(10);
	}
	    
}

 














