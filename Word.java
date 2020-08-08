//Sanjana Kasarla

public class Word implements Comparable<Word>{

	String word;

	public Word(String word)
	{
		this.word = word;

	}

	public String toString()
	{
		return word;

	}

	public int compareTo (Word otherWord)//needed for Priority Queue
	{
		return word.toString().compareTo(otherWord.toString())*-1;
	}

}