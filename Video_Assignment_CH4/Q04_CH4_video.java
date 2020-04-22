PreparedStatement stmt=con.prepareStatement("insert into student values(id,name,major,grade)");
stmt.setInt(1,101);
stmt.setString(2,"Motaz");
stmt.setString(3,"CoumputerSicnece");
stmt.setDouble(4,73.6);