//Sanjana Kasarla
import java.awt.*;
import java.awt.event.*;
import java.io.*;	
import javax.swing.*;
import java.lang.*;
import java.math.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class ReadWord
{
	String[] words;
	Queue<Word> queue=new LinkedList<Word>();
	PriorityQueue<Word> priorityQ = new PriorityQueue<Word>();

	public ReadWord(){

		File name = new File("largeText.txt");

		try
		{
			BufferedReader input = new BufferedReader(new FileReader(name));

			String text;
			while( (text=input.readLine())!= null)
			{
				words=text.split(" ");
				for(String s: words){
					queue.add(new Word(s));
					priorityQ.add(new Word(s));

				}

			}
		}
		catch (IOException io)
		{
			System.err.println("File does not exist");
		}


		String temp;
		while(!queue.isEmpty())
		{
			temp = String.format("%-20s%s", queue.poll(),priorityQ.poll());
			System.out.println(temp);
		}
	}


	public static void main(String[] args){
		ReadWord app=new ReadWord();
	}
}