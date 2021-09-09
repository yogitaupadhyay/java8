package JAXB_javaObjectToXML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	String name;
	int id;
	int age;
	Department depart;
	public String getName() {
		return name;
	}
	
	 Employee(String name, int id, int age, Department depart) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.depart = depart;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public Employee() {
		super();
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Department getDepart() {
		return depart;
	}
	public void setDepart(Department depart) {
		this.depart = depart;
	}

}
