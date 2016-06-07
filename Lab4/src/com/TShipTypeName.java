package com;

public class TShipTypeName {
	public String Name;
	public TShipType Index;
	
	public TShipTypeName (String NewName, TShipType NewIndex)
	{
		try
		{
			if (NewName.length() <= 0)
			{
				throw new IllegalArgumentException ("Illegal Name field format. Must be non-empty.");
			}
			else if	(((NewName.charAt(0) < 'A') || (NewName.charAt(0) > 'Z')) &&
				((NewName.charAt(0) < 'a') || (NewName.charAt(0) > 'z')))
			{
				throw new IllegalArgumentException ("Illegal Name field format. Must start with characters from 'A' to 'Z' or from 'a' to 'z'.");
			}
			else
			{
				Name = NewName;
				Index = NewIndex;
			}
		}
		catch (IllegalArgumentException E)
		{
			System.out.println(E.getMessage());
		}
	}
	
	public String toString()
	{
		return Name;
	}
}