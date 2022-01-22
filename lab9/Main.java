package lab9;

class Data{
	private String Name;

	//SETTER METHOD
	public void setName(String name) {//can access name bcos it is in the same class
		//allows other classes to access it bcos it is public
		this.Name = name;
	}
	
	//GETTER METHOD
	public String getName() {
		return Name;
	}
}

public class Main {
	
	public static void main(String[] args) {
		Data d = new Data();
		d.setName("Programiz");//GIVES AN ERROR without getter and setter methods 
		//bcos you are trying to access a private variable "name"
		
		System.out.println(d.getName());
		
	}

}
