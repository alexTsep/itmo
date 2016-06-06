package com.Civil;

public class TCruiseLiner extends TCivilVessels {
	public String GetAttackType()
	{
		return "I am a cruise liner. I carry civil passengers during cruises. " + super.GetAttackType();
	}
}
