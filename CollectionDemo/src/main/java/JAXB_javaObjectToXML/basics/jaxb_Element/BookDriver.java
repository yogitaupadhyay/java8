package JAXB_javaObjectToXML.basics.jaxb_Element;

import java.io.PrintWriter;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BookDriver {

	public static void main(String[] args) {
		try {

			Book book = new Book(1, "goblet of the fire", "dbihfewrifh", "jk rowling");
			JAXBElement<Book> books = new JAXBElement<Book>(new QName("mybooks"), Book.class, book);
			JAXB.marshal(books, new PrintWriter(System.out));

		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
			e.printStackTrace();
		}
	}
}
