package kmu.oop.practice.lab4.theater;

import kmu.oop.practice.lab4.common.*;
import kmu.oop.practice.lab4.theater.*;

public class ReservedProgram extends TheaterProgram {
	boolean reserved[][];
	
	// Test5: set up 3 variables with incoming arguments, and then, construct
	// 2-dimensional variables(sold[][] and reserved[][]) followed by initializing as 'false'.
	public ReservedProgram(TheaterType type, String program, int admissionFee[])
	{

		// set up type, program, admissionfee, and sold[][] by calling constructor 
		//   TheaterProgram(TheaterType type, String program, int admissionFee[]).
		this.type = type;
		this.program = program;
		this.admissionFee = admissionFee;
		this.sold = new boolean[3][];
		this.sold[0] = new boolean[10];
		this.sold[1] = new boolean[30];
		this.sold[2] = new boolean[60];
		this.reserved = new boolean[3][];
		this.reserved[0] = new boolean[10];
		this.reserved[1] = new boolean[30];
		this.reserved[2] = new boolean[60];
		

		// set up reserved[][] by allocating memory space and initialing the value by 'false'

	}
	
	// Test6: mark the seat reserved out with 'true'
	public boolean reserve(String level, int position)
	{
		// mark reserved[][] at the proper seat location
		reserved[changeLevel(level)][position-1] = true;
		return true;
	}
	
	// Test7: compute the total # of vacant seats that are neither sold nor reserved.
	public int vacantSeat() {
		int sum=0;
		
		// count up the # of vacant seats that are neither sold nor reserved.
		
		for(int i=0; i < 3; i++)
			for(int j=0; j < sold[i].length; j++)
				if(!(sold[i][j] || reserved[i][j]))
					sum ++;
		
		return sum;		
	}

	public String seatStatus(String level, int position)
	{
		String res;
		
		if(sold[changeLevel(level)][position-1]) res="Sold";
		else if(reserved[changeLevel(level)][position-1]) res="Reserved";
		else res="Vacant";
		
		return res;
	}
	
	// Test8: compute the total expected income yielded by selling or reserving tickets
	public int expectedIncome() {
		int sum=0;
		
        // compute total expected income by selling or reserving tickets
		for (int i=0; i<3; i = i+1) {
			for (int j=0; j<sold[i].length; j = j+1) {
				if (sold[i][j] || reserved[i][j]) {
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
