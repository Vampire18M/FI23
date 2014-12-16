
public class Person {
	private String name;
	public int alter;
	public String geburtsort;
	
	void geburtstag(){
		alter++;
		System.out.print("Gratuliere " + name + " zum " + alter + ". Geburtstag");		
	}
	
	void setName(String n){
		name = n;
	}
}
