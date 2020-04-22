@FXML
private TableView<STUDENT> TableView_STUDENT;

@FXML
private TableColumn<STUDENT, Integer> ID_Column_STD;

@FXML
private TableColumn<STUDENT, String> Name_Column_STD;

@FXML
private TableColumn<STUDENT, String> Major_Column_STD;

@FXML
private TableColumn<STUDENT, Double> Grade_Column_STD;


ID_Column_STD.setCellValueFactory(new PropertyValueFactory("id"));
Name_Column_STD.setCellValueFactory(new PropertyValueFactory"name"));
Major_Column_STD.setCellValueFactory(new PropertyValueFactory("major"));
Grade_Column_STD.setCellValueFactory(new PropertyValueFactory("grade"));