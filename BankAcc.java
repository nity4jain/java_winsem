package winsem;

public class BankAcc 
{
  long account_number;
  String account_holder;
  long aadhar_id;
  long phone_no;
  double bank_balance;
  double current_loan_amount;
  
  BankAcc(long account_number,String account_holder,long aadhar_id,long phone_no,double bank_balance,double current_loan_amount)
  {
	  this.account_number = account_number;
	  this.account_holder = account_holder;
	  this.aadhar_id = aadhar_id;
	  this.phone_no = phone_no;
	  this.bank_balance = bank_balance;
	  this.current_loan_amount = current_loan_amount;
  }
  
  void display_balance()
  {
	  System.out.println("The account number is "+account_number);
	  System.out.println("The account holder name is "+account_holder);
	  System.out.println("The aadahr id is "+aadhar_id);
	  System.out.println("phone number "+phone_no);
	  System.out.println("The bank balance is "+bank_balance);
	  System.out.println("Current loan amount is "+current_loan_amount);
  }
  
  double deposit()
  {
	 return 0.0;
  }
}
