package JAXB_javaObjectToXML.basics.jaxb_Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;

@javax.xml.bind.annotation.XmlAccessorType(XmlAccessType.FIELD)
//Every non static, non transient field in a JAXB-bound class will be automatically bound to XML, 
//unless annotated by XmlTransient.


@XmlRootElement(name = "Books")
 class Book {

	Book() {
		// this is must
	}

	public Book(int id, String name, String isbn, String author) {
		super();
		this.id = id;
		this.name = name;
		this.isbn = isbn;
		this.author = author;
	}

	int id;
	String name;

	String isbn;
	String author;

}
