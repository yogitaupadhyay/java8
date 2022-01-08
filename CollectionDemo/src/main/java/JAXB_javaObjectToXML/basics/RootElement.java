package JAXB_javaObjectToXML.basics;


import java.io.PrintWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import javax.xml.bind.annotation.XmlRootElement;

public class RootElement {

//	@XmlRootElement
	@XmlRootElement(name = "newBook")
	static class Book {
		// @XmlRootElement this will set root element of xml with name same as class
		// i.e. Book
		// @XmlRootElement(name = "newBook"): this will set root element of xml with
		// name given i.e. newBook
		Book() {
		}

	}

	public static void main(String[] args) {

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			Book book = new RootElement.Book();
//			jaxbMarshaller.marshal(book, new File(
//					"D:\\MyWorkingDir\\Java8\\CollectionDemo\\src\\main\\java\\JAXB_javaObjectToXML\\basics\\Demo.xml"));
			jaxbMarshaller.marshal(book, new PrintWriter(System.out));

		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
			e.printStackTrace();
		}

	}

}
