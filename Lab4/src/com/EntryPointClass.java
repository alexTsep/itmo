package com;

import com.Civil.TCruiseLiner;
import com.Military.TCruiser;

public class EntryPointClass {
	public static TShipBase Fleet[];

	public static void main(String[] args)
	{
		int I;
		
		Fleet = new TShipBase[10];
		
		Fleet[9] = new TCruiseLiner();
		Fleet[8] = new TCruiser();
		
		for (I = (Fleet.length - 1); I >= 0; I--)
		{
			if (Fleet[I] != null)
			{
				System.out.println (Fleet[I].toString());
			}
		}
	}
}
