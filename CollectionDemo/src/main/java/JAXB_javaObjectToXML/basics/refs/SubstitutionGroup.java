package JAXB_javaObjectToXML.basics.refs;

/*XML Schema allows a XML document author to use XML element names that were not
 *  statically specified in the content model of a schema using substitution groups.
 *  
 *  Schema derived code provides support for substitution groups using an element property,
 *   (section 5.5.5, "Element Property" of JAXB 2.0 specification). An element property
 *    method signature is of the form:
     public void setTerm(JAXBElement);
     public JAXBElement getTerm();
 
	An element factory method annotated witXmlElementDecl is used to create a JAXBElement 
	instance, containing an XML element name. The presence of @XmlElementRef annotation on 
	an element property indicates that the element name from JAXBElement instance be used 
	instead of deriving an XML element name from the JavaBean property name.
*/

public class SubstitutionGroup {

}
