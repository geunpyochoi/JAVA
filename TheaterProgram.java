package kmu.oop.practice.lab4.theater;

import kmu.oop.practice.lab4.common.*;
import kmu.oop.practice.lab4.theater.*;

public class TheaterProgram {
	public TheaterType type;
	public String program;
	boolean sold[][];
	int admissionFee[];
//	static DoubleFor df;
	static Common df;

	public TheaterProgram()
	{

	}

	// Test2: set up 3 variables with incoming arguments, and then, construct
	// 2-dimensional variable(sold[][]) followed by initializing as 'false'.
	public TheaterProgram(TheaterType type, String program, int admissionFee[])
	{

		// set up type, program, admissionfee
		this.type = type;
		this.program = program;
		this.admissionFee = admissionFee;
		// set up sold[][] by allocating memory space and initialing the value by 'false'
		this.sold = new boolean[3][];
		this.sold[0] = new boolean[10];
		this.sold[1] = new boolean[30];
		this.sold[2] = new boolean[60];
		}
	
	static public void setDoubleFor(Common df)
	{
		TheaterProgram.df = df;
	}
	
	public int vacantSeat() {
		int sum=0;
		
		for(int i=0; i < sold.length; i++)
			for(int j=0; j < sold[i].length; j++)
				if(!sold[i][j])
					sum ++;
		
		return sum;		
	}

	public int changeLevel(String level)
	{
		int res=-1;
		
		switch(level)
		{
			case "Royal":
				res=0;
				break;
			case "Premium":
				res=1;
				break;
			case "Economy":
				res=2;
				break;
			default:
		}
		
		return res;
	}

	// Test3: mark the seat sold out with 'true'
	public boolean sell(String level, int position)
	{
		// mark sold[][] at the proper seat location
		sold[changeLevel(level)][position-1] = true;
		return true;
	}
	
	public String seatStatus(String level, int position)
	{
		String res;
		if(sold[changeLevel(level)][position-1]) res="Sold";
		
		else res="Vacant";
		
		return res;
	}
	
	// Test4: compute the total income yielded by selling tickets
	public int income() {
		int sum=0;
		// compute total income by selling tickets
		for (int i=0; i<3; i = i+1) {
			for (int j=0; j<sold[i].length; j = j+1) {
				if (sold[i][j]) {
					if (i == 0)
						sum = sum + admissionFee[i];
					if (i == 1)
						sum = sum + admissionFee[i];
					if (i == 2)
						sum = sum + admissionFee[i];
				}
	
			}
		}
		return sum;
	}
	
}

