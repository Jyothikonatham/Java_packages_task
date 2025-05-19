package com.school.app;
import com.school.management.School;
import com.school.staff.Principal;
public class SchoolApp{
	public static void main(String[] args){

	School sch = new School();
	sch.setName("PACE");
	sch.setLocation("Ongole");
	

	
	Principal pri = new Principal();
	pri.setPrincipalName("Ramaiah");
	pri.setExperienceYears(4);
	sch.showSchoolInfo();
	System.out.println();
	pri.showPrincipalInfo();
	
}
}
	