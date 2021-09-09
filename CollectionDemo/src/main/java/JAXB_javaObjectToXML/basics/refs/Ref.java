package JAXB_javaObjectToXML.basics.refs;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

/*@XmlElementRef:  this is basically run time binding */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Ref {

	@XmlElementRef
	List<Book> books;

	Ref() {
	}

}

abstract class Book {

}

@XmlRootElement(name = "fiction")
class Fiction extends Book {
	int id;
	String name;
	String isbn;
	String author;

	Fiction() {
	}

	public Fiction(int id, String name, String isbn, String author) {
		super();
		this.id = id;
		this.name = name;
		this.isbn = isbn;
		this.author = author;

	}
}

@XmlRootElement(name = "horror")
class Horror extends Book {
	int id;
	String name;
	String isbn;
	String author;

	Horror() {
	}

	public Horror(int id, String name, String isbn, String author) {
		super();
		this.id = id;
		this.name = name;
		this.isbn = isbn;
		this.author = author;

	}
}