//Sanjana Kasarla

public class Passenger implements Comparable<Passenger>{

	String lastName;
	String firstName;
	String flightCity;
	String flightTime;
	int hourDif;
	int minDif;

	public Passenger(String firstName, String lastName, String flightCity, String flightTime)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.flightCity = flightCity;
		this.flightTime = flightTime;

	}

	public String getLastName()
	{
		return lastName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String flightCity()
	{
		return flightCity;
	}
	public String flightTime()
	{
		return flightTime;
	}

	public String etdCalc()
	{
		return firstName;
	}

	public int compareTo(Passenger other)
	{
		return hourDif;
		
	}

	public String toString(){
		return lastName+", "+firstName+" - "+flightCity+" - "+flightTime+" - "+etdCalc();
	}

}