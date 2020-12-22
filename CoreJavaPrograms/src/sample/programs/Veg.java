package sample.programs;

import java.util.ArrayList;
import java.util.List;

public class Veg {
	
	private int id;
	private String Name;
	private String type;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}

}

class MyVeg{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Veg> vegList = new ArrayList<Veg>();
		
		long count = vegList.stream().filter(v -> v.getType().equals("root")).count();

	}

}
