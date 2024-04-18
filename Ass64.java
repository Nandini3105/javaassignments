package assignjava;
//Write a program to demonstrate encapsulation
class a
{
	private String username;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
public class Ass64 {
public static void main(String[] args) {
	a obj=new a();
	obj.setUsername("aswatha");
	System.out.println(obj.getUsername());
	obj.setId(123);
	System.out.println(obj.getId());
}
}
