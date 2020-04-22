int id = Integer.parseInt(ID_Field.getText());

String sq = "DELETE FROM table_name Where sID = "+id+";";

this.statement.executeUpdate(sq);