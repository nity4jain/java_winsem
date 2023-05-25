package winsem;

import java.util.*;
public class loanAccount extends BankAcc
{
	double deposit;
	Scanner sc = new Scanner (System.in);
  loanAccount(long account_number,String account_holder,long aadhar_id,long phone_no,double bank_balance,double current_loan_amount)
  {
	  super( account_number,account_holder,aadhar_id,phone_no, bank_balance,current_loan_amount);
  }
  
  double deposit()
  {
	  System.out.println("Enter the amount to be deposited");
	  deposit = sc.nextDouble();
	  bank_balance +=deposit;
	  current_loan_amount -= deposit;
	  return current_loan_amount;
  }
}
