
import java.util.List;
import java.io.File;
import java.io.IOException;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;


public class BrowseXmlWithSax { 

	public static void main(String[] args) {
		System.out.println("starting...");
	    SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		    try {
		        SAXParser saxParser = saxParserFactory.newSAXParser();
		        MyHandler handler = new MyHandler();
		        saxParser.parse(new File("src/main/resources/Inpatient_Encounter_Discharged_to_Rehab_Location(C-CDA2.1).xml"), handler);
		        
		        //Get Employees list
		        ////List<Employee> empList = handler.getEmpList();
		        //print employee information
		        ////for(Employee emp : empList)
		        ////    System.out.println(emp);
		    } catch (ParserConfigurationException | SAXException | IOException e) {
		        e.printStackTrace();
		    }
		    System.out.println("....that's all folks!");		    
	}

	
	static class MyHandler extends DefaultHandler {

		String indent() {
			StringBuilder sb = new StringBuilder();
			for (int i=1; i<nest_level; i++) {
				sb.append("    ");
			}
			return sb.toString();
		}
		
		StringBuilder data = new StringBuilder();
		int nest_level =0;
	
		public void startDocument() 
				throws SAXException {
			
		}
		public void endDocument() 
				throws SAXException {
			
		}
		
		public void startElement(String uri, String localName, String qname, Attributes attributes)
				throws SAXException {
			data = new StringBuilder();
			nest_level++;
			//System.out.println(indent(nest_level) + " Start: uri:" + uri + " localName:" + localName + " qname:" + qname);
			System.out.println(indent() + qname);			
		}
		
		public void endElement(String uri, String localName, String qname)
				throws SAXException {
			//System.out.println(indent(nest_level) + " End: uri:" + uri + " localName:" + localName + " qname:" + qname);
			
			if (qname != "text" && data.length() > 0) {
				System.out.println(indent() + "    " + data.toString());
			}
			System.out.println(indent() + "/" + qname);						
			nest_level--;			
			data = new StringBuilder();
		}
		
		public void characters(char ch[], int start, int length)
		throws SAXException {
			data.append(new String(ch, start, length));
		}
	}
}


