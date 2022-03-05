package org.bank;

public class AxisBank {
	
	public void deposit() {
		System.out.println("Updated deposited amount--Axis bank");
	}

	public static void main(String[] args) {
		//  Class     :AxisBank
	    // Methods :deposit()

	//     Description:
	 //    You have to override the method deposit in AxisBank.
		
		
          AxisBank axisbank=new AxisBank();
          axisbank.deposit();
          
          BankInfo bankinfo=new BankInfo();
          bankinfo.saving();
          bankinfo.fixed();
          
	}

}
