import java.util.* ;
import java.io.*; 
class Person {
	private String name;
	private int age;
	

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}

}

class Solution {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int age = scanner.nextInt();
		Person person = new Person();
		person.setAge(age);
		person.setName(name);
		System.out.println("The name of the person is "+person.getName() + " and the age is "+person.getAge()+".");
	}
}








		