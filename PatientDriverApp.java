/*Class: CMSC203 CRN 21352
Program: Assignment 2
Instructor: Prof. Monshi
Summary of Description: The "PatientDriverApp" Class prompts the patient (user) to enter their information.
The program then uses functions of the patient class to create a patient. Patient information is then
displayed. Additionally, there are procedures assigned to the patient automatically in the program. The
procedure class is used to read procedure information and a summary of these procedures at the end
of the program is also displayed.
Due Date: 10/01/2026 
Integrity Pledge: I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
Student Name: Calvin Annulis*/

import java.util.Scanner;

public class PatientDriverApp {
	
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		Patient patient = inputPatient(userInput);
		userInput.close();
		System.out.println("");
		
		System.out.println("Patient Information");
		System.out.println("-------------------");
		displayPatient(patient);
		
		
		Procedure procedure1 = createProcedure1();
		Procedure procedure2 = createProcedure2();
		Procedure procedure3 = createProcedure3();
		displayProcedureTable(procedure1, procedure2, procedure3);
		System.out.println("");
		
		displaySummary(procedure1, procedure2, procedure3);
		System.out.println("The program was developed by a Student: Calvin Annulis 09/29/2026");
	}
	
	public static Patient inputPatient(Scanner input)
	{
		Patient patient = new Patient();
		input = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		patient.setFirstName(input.next());
		System.out.print("Enter middle name: ");
		patient.setMiddleName(input.next());
		System.out.print("Enter last name: ");
		patient.setLastName(input.next());
		input.nextLine();
		System.out.print("Enter street address: ");
		patient.setStreetAddress(input.nextLine());
		System.out.print("Enter city: ");
		patient.setCity(input.nextLine());
		System.out.print("Enter state: ");
		patient.setState(input.next());
		
		while (patient.hasSameCityState(patient.getCity(), patient.getState()))
		{
			System.out.print("The city and state are the same.\nPlease enter the correct state:");
			patient.setState(input.next());
		}
		System.out.print("Enter zip: ");
		patient.setZipCode(input.nextInt());
		input.nextLine();
		System.out.print("Enter phone number (###-###-####): ");
		patient.setPhoneNumber(input.nextLine());
		System.out.print("Enter emergency contact name: ");
		patient.setEmergencyContact(input.nextLine());
		System.out.print("Enter emergency contact phone (###-###-####): ");
		patient.setEmergencyContactNumber(input.nextLine());
		
		input.close();
		
		return patient;
	}
	
	public static Procedure createProcedure1()
	{
		Procedure procedure = new Procedure();
		
		return procedure;
	}
	
	public static Procedure createProcedure2()
	{
		Procedure procedure = new Procedure("X-Ray", "6/15/2025");
		procedure.setPractitionerName("Dr. Vangard");
		procedure.setChargesForProcedure(1120.15);
		
		return procedure;
	}
	
	public static Procedure createProcedure3()
	{
		Procedure procedure = new Procedure("Blood Test", "03/27/2026", "Dr. Manhard", 250.72);
		
		return procedure;
	}
	
	public static void displayPatient(Patient patient)
	{
		System.out.println(patient);
		System.out.println(patient.getContactSummary());
	}
	
	public static void displayProcedure(Procedure procedure)
	{
		System.out.println(procedure);
	}
	
	public static void displayProcedureTable(Procedure p1, Procedure p2, Procedure p3)
	{
		System.out.println("Procedure         Date           Practitioner        Charge        Category");
		System.out.println("---------------------------------------------------------------------------");
		displayProcedure(p1);
		displayProcedure(p2);
		displayProcedure(p3);	
	}
	
	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3)
	{
		double total = p1.getChargesForProcedure() + p2.getChargesForProcedure() 
		+ p3.getChargesForProcedure();
		return total;
	}
	
	public static double calculateAverageCharge(Procedure p1, Procedure p2, Procedure p3)
	{
		double average = calculateTotalCharges(p1, p2, p3)/3;
		return average;
	}
	
	public static Procedure findHighestChargeProcedure(Procedure p1, Procedure p2, Procedure p3)
	{
		double p1Charge = p1.getChargesForProcedure();
		double p2Charge = p2.getChargesForProcedure();
		double p3Charge = p3.getChargesForProcedure();
		Procedure highestChargeProcedure;
		
		if (p1Charge >= p2Charge && p1Charge >= p3Charge)
			highestChargeProcedure = p1;
		else if (p2Charge >= p1Charge && p2Charge >= p3Charge)
			highestChargeProcedure = p2;
		else
			highestChargeProcedure = p3;
			
		return highestChargeProcedure;
	}
	
	public static int countExpensiveProcedures(Procedure p1, Procedure p2, Procedure p3)
	{
		int totalExpensiveProcedures = 0;
		
		if (p1.isExpensiveProcedure())
			totalExpensiveProcedures += 1;
		if (p2.isExpensiveProcedure())
			totalExpensiveProcedures += 1;
		if (p3.isExpensiveProcedure())
			totalExpensiveProcedures += 1;
			
		return totalExpensiveProcedures;
	}
	
	public static void displaySummary(Procedure p1, Procedure p2, Procedure p3)
	{
		System.out.printf("Total Charges: $%,.2f\n", calculateTotalCharges(p1, p2, p3));
		System.out.printf("Average Charge: $%,.2f\n", calculateAverageCharge(p1, p2, p3));
		System.out.println("Highest Charge Procedure: " + 
		findHighestChargeProcedure(p1, p2, p3).getProcedureName());
		System.out.println("Number of Expensive Procedures: " + 
		countExpensiveProcedures(p1, p2, p3) + "\n");
	}
}

