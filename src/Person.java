
public class Person {
	private String name;
	private int alter;
	public String geburtsort;
	
	void geburtstag(){
		alter++;
		System.out.print("Gratuliere " + name + " zum " + alter + ". Geburtstag");		
	}
	
	void setName(String n){
		name = n;
	}
	
	String getName(){
		return name;
	}
	
	void setAlter(int n){
		alter = n;
	}
	
	int getAlter(){
		return alter;
	}
}
