package JAXB_javaObjectToXML.basics;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;

public class Elements {

	/*
	 * @XmlElement(name="title"): Maps a JavaBean property to an XML element derived
	 * from property name. 
	 * 
	 * @XmlAttribute: Maps a JavaBean property to an XML
	 * attribute.Prevents the mapping of a JavaBean property/type to XML
	 * representation.
	 * 
	 * @XmlTransient: When placed on a class, it indicates that the
	 * class shouldn’t be mapped to XML by itself. Properties on such class will be
	 * mapped to XML along with its derived classes as if the class is inlined.
	 * @XmlTransient is mutually exclusive with all other JAXB defined annotations.
	 * 
	 * @XmlElementWrapper Generates a wrapper element around XML representation.
	 * This is primarily intended to be used to produce a wrapper XML element around
	 * collections. So, it must be used with collection property.
	 * 
	 * 
	 */
	@XmlRootElement(name = "Harry potter series")
	static class Book {

//		@XmlTransient
		@XmlAttribute
		int id;

		@XmlElement(name = "title")
		String name;

		String isbn;

		@XmlElement
		String author;

		@XmlList
		List<String> goodPoints;

		@XmlElementWrapper(name = "bad points list")
		@XmlElement
		List<String> badPoints;

		Book() {
		}

		public Book(int id, String name, String isbn, String author, List<String> badPoints, List<String> goodPoints) {
			super();
			this.id = id;
			this.name = name;
			this.isbn = isbn;
			this.author = author;
			this.goodPoints = goodPoints;
			this.badPoints = badPoints;
		}

	}

	public static void main(String[] args) {
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			List<String> good = new ArrayList<String>();
			good.add("interesting");
			good.add("magic");

			List<String> bad = new ArrayList<String>();
			bad.add("not interesting");
			bad.add("no magic");
			Book book = new Elements.Book(1, "goblet of the fire", "dbihfewrifh", "jk rowling", bad, good);

			jaxbMarshaller.marshal(book, new PrintWriter(System.out));

		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
			e.printStackTrace();
		}
	}

}
