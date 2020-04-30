import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class NotesII
{

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		ArrayList<Integer> x = new ArrayList<Integer>();
		//constructs an ArrayList object containing Integer objects
		//initially, the list is empty 
		
		x.add(5);
		x.add(10);
		x.add(15);
		x.add(20);
		
		//We can change an existing item in the ArrayList using .set()
		//x.set(index, element)
		x.set(3, 100);
		
		//We can remove existing elements by index
		x.remove(1);
		
		//We can remove exisitng elements by Object value
		x.remove((Integer)15);
		
		x.add(40);
		
		//System.out.println(x.size());
		for(int i = 0; i < x.size(); i++){
			System.out.println(x.get(i));
		}
		
		System.out.println(Execute.sum(x));
		
		System.out.println(x);
		
		Execute.swap(x, 0, 2);
		
		System.out.println(x);
		
		System.out.println(Execute.getFirstPosition(x, 100));
		
		//ArrayLists containing ArrayLists
		ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> arrayInt1 = new ArrayList<Integer>();
		arrayInt1.add(100);
		arrayInt1.add(200);
		arrayInt1.add(300);
		
		ArrayList<Integer> arrayInt2 = new ArrayList<Integer>();
		arrayInt2.add(-100);
		arrayInt2.add(-200);
		
		listOfLists.add(arrayInt1);
		listOfLists.add(arrayInt2);
		
		//Prints all ints in the listOfLists
		for(int i = 0; i < listOfLists.size(); i++){
			ArrayList<Integer> inList = listOfLists.get(i);
			for(int j =0; j < inList.size(); j++){
				System.out.println(inList.get(j));
			}
		}
		
		//File Handling 
		
		//If the file does not exist, a FileNotFoundException is thrown
		Scanner inFile = new Scanner(new File("file.txt"));
		
		//get all lines in the file and print them one-by-one
	/*	while(inFile.hasNextLine()){
			String line = inFile.nextLine();
			System.out.println(line);
		}*/
		
		//get all words in the file and print them one-by-one
		//assuming words are separated by the white space character(s)
		while(inFile.hasNext()){
			String word = inFile.next();
			System.out.println(word);
		}
		
		
		
		String s;
		Scanner File2 = null;
		try{
			File2 = new Scanner(new File("file2.txt"));
		} catch(FileNotFoundException e){
			System.out.println(e);
		}
		
		String [] stringArray;
		
		//Get the entire line one-at-a-time
		while(File2.hasNextLine()){
			s = File2.nextLine();
			stringArray = s.split(";");
			for(int i = 0; i < stringArray.length; i++){
				System.out.println(stringArray[i]);
			}
		}
		
		PrintWriter out = null;
		try{
			out = new PrintWriter("output.txt");
			out.println("First Line!");
		} catch (FileNotFoundException e){
			//Non existent path, write access denied,...
			System.out.println(e.toString());
		} finally {
			if(out != null){
				out.close();
			}
		}
		
		/*
		 * %d - decimal integer (or just integer)
		 * %f - floating point
		 * %e - floating point in exponential notation
		 * %c - Characters
		 * %s - Strings 
		 * %b - Boolean
		 */
		
		String month = "November";
		int day = 9;
		int year = 2015;
		boolean b = true;
		System.out.format("It is %b that today is the %dth of %s in the year %d.", b, day, month, year);
		
		System.out.println("");
		
		String first = "Emmanuel";
		String last = "Reyes";
		System.out.format("Hello my name is %-10s %5s.", first, last);
		
		//Append to a File 
		//Another object, FileWriter, provides more functionality than PrintWriter,
		//including the ability to append to an existing file 
		
		FileWriter writing = null;
		try{
			writing = new FileWriter("output", true);
			writing.write("Hello!");
		} catch(FileNotFoundException e){
			//Non existent path, write access denied...
			System.out.println(e.toString());
		} catch (IOException e){
			e.printStackTrace();
		} finally{
			if(writing != null){
				out.close();
			}
		}
	}


}
