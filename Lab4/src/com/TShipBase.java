package com;

import com.TShipTypeName;

public class TShipBase {
	
	public TShipTypeName TransportType;
	
	public String GetAttackType()
	{
		return "Seems like I have no weaponry onboard.";
	}
	
	public String GetTransportType()
	{
		return TransportType.toString();
	}
	
	public String toString()
	{
		return "My type is " + GetTransportType() + ". " + GetAttackType();
	}
}