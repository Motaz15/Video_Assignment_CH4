

String query = "Select * FROM employee "; 

ResultSet rr =  stat.executeQuery(query)

while (rr.next()) { 
		
	int update = " NEW PHONE NUMPER " ;
	int p_number = rr.getDouble("S_Phone"); 
	rr.updateDouble("S_Phone", update); 
	rr.updateRow(); 
}

rr.moveToInsertRow();
 
rr.updateInt("Student_ID", ID);

rr.updateString("Student_Name", Name); 

rr.updateInt("Student_Grade", Grade); 

rr.updateInt("S_Phone", Phone); 
rr.insertRow();
