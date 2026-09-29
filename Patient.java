/*Class: CMSC203 CRN 21352
Program: Assignment 2
Instructor: Prof. Monshi
Summary of Description: The "Patient" Class has fields related to a person's information 
(i.e. first name, middle name, phone number, etc.). It also checks the validity of
phone numbers provided and has other methods related to checking the patient's information
Due Date: 10/01/2026 
Integrity Pledge: I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
Student Name: Calvin Annulis*/

public class Patient 
{

	private String firstName;
	private String middleName;
	private String lastName;
	
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	
	private String phoneNumber;
	
	private String emergencyContact;
	private String emergencyContactNumber;
	
	public Patient() 
	{
			
	}
	
	public Patient(String first, String middle, String last)
	{
		firstName = first;
		middleName = middle;
		lastName = last;
	}
	
	public Patient(String first, String middle, String last, String street, String city,
			String state, int zip, String phoneNumber, String emergencyContact, 
			String emergencyContactNumber)
	{
		firstName = first;
		middleName = middle;
		lastName = last;
		
		streetAddress = street;
		this.city = city;
		this.state = state;
		zipCode = zip;
		
		this.phoneNumber = phoneNumber;
		
		this.emergencyContact = emergencyContact;
		this.emergencyContactNumber = emergencyContactNumber;		
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String first)
	{
		firstName = first;
	}
	
	public String getMiddleName()
	{
		return middleName;
	}
	
	public void setMiddleName(String middle)
	{
		middleName = middle;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String last)
	{
		lastName = last;
	}
	
	public String getStreetAddress()
	{
		return streetAddress;
	}
	
	public void setStreetAddress(String street)
	{
		streetAddress = street;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public int getZipCode()
	{
		return zipCode;
	}
	
	public void setZipCode(int zip)
	{
		zipCode = zip;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmergencyContact()
	{
		return emergencyContact;
	}
	
	public void setEmergencyContact(String emergencyContact)
	{
		this.emergencyContact = emergencyContact;
	}
	
	public String getEmergencyContactNumber()
	{
		return emergencyContactNumber;
	}
	
	public void setEmergencyContactNumber(String emergencyContactNumber)
	{
		this.emergencyContactNumber = emergencyContactNumber;
	}
	
	public String buildFullName()
	{
		return firstName  + " " + middleName + " " + lastName;
	}
	
	public String buildAddress()
	{
		return streetAddress + " " + city + " " + state + " " + zipCode;
	}
	
	public String buildEmergencyContact() 
	{
		return emergencyContact + " " + emergencyContactNumber;
	}
	
	public String toString()
	{
		return "Name: " + buildFullName() + "\nAddress: " + buildAddress();
	}
	
	public boolean isValidPhoneNumber()
	{
		boolean bool;
		if (phoneNumber.length() == 12 && phoneNumber.charAt(3) == '-' && phoneNumber.charAt(7) == '-' )
			bool = true;
		else
			bool = false;
		return bool;
	}
	
	public boolean isValidEmergencyPhoneNumber()
	{
		boolean bool;
		if (emergencyContactNumber.length() == 12 && emergencyContactNumber.charAt(3) == '-' && emergencyContactNumber.charAt(7) == '-' )
			bool = true;
		else
			bool = false;
		return bool;
	}
	
	public String getLastFirstMiddle()
	{
		return lastName + ", " + firstName + " " + middleName;
	}
	
	public boolean hasSameCityState(String city, String state)
	{
		boolean bool;
		if (city.equalsIgnoreCase(state))
			bool = true;
		else
			bool = false;
		return bool;
			
	}
	
	public void updateAddress(String street, String city, String state, int zip)
	{
		streetAddress = street;
		this.city = city;
		this.state = state;
		zipCode = zip;
	}
	
	public String getContactSummary()
	{
		return "Phone Number: " + phoneNumber + "\nEmergencyContact: " + buildEmergencyContact() + 
				"\nPhone Valid: " + isValidPhoneNumber() + "\nEmergency Phone Valid: " + 
				isValidEmergencyPhoneNumber() + "\n";
	}
}


