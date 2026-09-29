/*Class: CMSC203 CRN 21352
Program: Assignment 2
Instructor: Prof. Monshi
Summary of Description: The "Procedure" Class has fields related to a procedure's information 
(i.e. procedure name, date, charges, and practitioner name). It also has methods to check
if the procedure is expensive as well as to categorize the procedure based on its charge.
Due Date: 10/01/2026 
Integrity Pledge: I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
Student Name: Calvin Annulis*/

public class Procedure 
{
	
	private String procedureName;
	private String date;
	private String practitionerName;
	private double chargesForProcedure;
	
	public Procedure()
	{
		procedureName = "Physical Exam";
		date = "9/15/2025";
		practitionerName = "Dr. Wang";
		chargesForProcedure = 650.13;
	}
	
	public Procedure(String procedure, String date)
	{
		procedureName = procedure;
		this.date = date;
	}
	
	public Procedure(String procedure, String date, String pracName, double charForProc)
	{
		procedureName = procedure;
		this.date = date;
		practitionerName = pracName;
		chargesForProcedure = charForProc;
	}
	
	public String getProcedureName()
	{
		return procedureName;
	}
	
	public void setProcedureName(String procedure)
	{
		procedureName = procedure;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public String getPractitionerName()
	{
		return practitionerName;
	}
	
	public void setPractitionerName(String pracName)
	{
		this.practitionerName = pracName;
	}
	
	public double getChargesForProcedure()
	{
		return chargesForProcedure;
	}
	
	public void setChargesForProcedure(double charForProc)
	{
		chargesForProcedure = charForProc;
	}
	
	public String toString()
	{
		return String.format("%-18s%-15s%-20s%-14s%s", procedureName, date, practitionerName, 
				getFormattedCharge(), getChargeCategory());
	}
	
	public boolean isExpensiveProcedure()
	{
		boolean bool;
		if (chargesForProcedure >= 1000)
			bool = true;
		else
			bool = false;
		return bool;
	}
	
	public String getChargeCategory()
	{
		String chargeCategory;
		if (chargesForProcedure <= 500)
			chargeCategory = "Low";
		else if (chargesForProcedure < 1000)
			chargeCategory = "Medium";
		else
			chargeCategory = "High";
		return chargeCategory;
	}
	
	public String getFormattedCharge()
	{
		return String.format("$%,.2f", chargesForProcedure);
	}
}