/*
Created by: Aaron Jones
Description: This class will be the Active class. 

Methods that need to be implemented:
1) Getters and Setters
2) DVC and EVC
3) toString
4) equalsTo
5) compareTo

Variables that need to be implemented:
1) Hours Studied
2) Minutes Studied
3) Hours Required
4) Minutes Required

I'm iffy about adding these last two variables into
my program.

5) Hours Left
6) Hours Left

7) Name
*/

public class Active
{

	int hoursStudied,
	    minutesStudied,
	    hoursRequired,
	    minutesRequired;
 	String name;

	//DVC
	public Active()
	{
	   this.hoursStudied = 0;
	   this.minutesStudied = 0;
	   this.hoursRequired = 0;
	   this.minutesRequired = 0;
	   this.name = "Default Value";
	}
	
	//EVC
	public Active(int hS, int mS, int hR, int mR)
	{
	   this.hoursStudied = hS;
	   this.minutesStudied = mS;
	   this.hoursRequired = hR;
	   this.minutesRequired = mR;
	}

	//Getters and Setters
	public int getHoursStudied(int hS)
	{
	  return hS;
	}

	public void setHoursStudied(int hS)
	{
	  this.hoursStudied = hS;
	}

	public int getMinutesStudied(int mS)
	{
	  return mS;
	}

	public void setMinutesStudied(int mS)
	{
	  this.minutesStudied = mS;
	}

	public int getHoursRequired(int hR)
	{
	  return hR;
	}

	public void setHoursRequired(int hR)
	{
	  this.hoursRequired = hR;
	}

	public int getMinutesRequired(int mR)
	{
	  return mR;
	}

	public void setMinutesRequired(int mR)
	{
	  this.minutesRequired = mR;
	}

	public String getName(String name)
	{
	  return name;
	}

	public void setName(String name)
	{
	  this.name = name;
	}
	
	//toString method
	@Override
	public String toString()
	{
	  return "Name: " + name + "\n" + 
		 "Hours Required: " + hoursRequired + "\n" +
		 "Minutes Required: " + minutesRequired + "\n"
		+"Hours Studied: " + hoursStudied + "\n" + 
                 "Minutes Studied: " + minutesStudied;
	}

}//end class
