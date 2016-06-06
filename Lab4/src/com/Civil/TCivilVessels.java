package com.Civil;

import com.TShipBase;
import com.TShipType;
import com.TShipTypeName;

public class TCivilVessels extends TShipBase {
	public String GetAttackType()
	{
		return "I have no weaponry onboard.";
	}

	TCivilVessels()
	{
		TransportType = new TShipTypeName("a civil vessel", TShipType.CIVIL);
	}
}