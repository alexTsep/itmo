package com.Military;

import com.TShipBase;
import com.TShipType;
import com.TShipTypeName;

public class TMilitaryVessels extends TShipBase {

	public String GetAttackType()
	{
		return "Some kinda weapons onboard! ";
	}
	
	public TMilitaryVessels()
	{
		TransportType = new TShipTypeName("a military vessel", TShipType.MILITARY);
	}
}
