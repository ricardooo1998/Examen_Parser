import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Parser {
	private Document dom = null;
	private ArrayList<Acciones> ac = null;

	public Parser() {
		ac = new ArrayList<Acciones>();
	}
	
	public void parseFicheroXml(String fichero) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			dom = db.parse(fichero);
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (SAXException se) {
			se.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}
	
	public void parseDocument() {
		Element docEle = dom.getDocumentElement();

		NodeList nl = docEle.getElementsByTagName("acciones");
		if (nl != null && nl.getLength() > 0) {
			for (int i = 0; i < nl.getLength(); i++) {

				Element el = (Element) nl.item(i);
				Acciones acciones = getAcciones(el);
				ac.add(acciones);
			}
		}
	}
	
	

	private Acciones getAcciones(Element el) {
		String nombreBanco = getTextValue(el,"nombre");
		String compras = getTextValue(el, "compras");
		String ventas = getTextValue(el, "ventas");
		String comprasCantidad="";
		String comprasPrecio="";
		String ventasCantidad="";
		String ventasPrecio="";
		
		NodeList nl=el.getElementsByTagName("compra");
		if (nl != null && nl.getLength() > 0) {
			for (int i = 0; i < nl.getLength(); i++) {
				Element el1 = (Element) nl.item(i);
				comprasCantidad=el.getAttribute("cantidad");
				comprasPrecio=el.getAttribute("precio");
			}
		}
	
		NodeList nl1=el.getElementsByTagName("venta");
		if (nl != null && nl1.getLength() > 0) {
			for (int i = 0; i < nl.getLength(); i++) {
				Element el1 = (Element) nl.item(i);
				ventasCantidad=el.getAttribute("cantidad");
				ventasPrecio=el.getAttribute("precio");
			}
		}
		
		Acciones a = new Acciones (nombreBanco, compras, ventas, comprasCantidad, comprasPrecio, ventasCantidad, ventasPrecio);
		return a;
	}
	
	private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if(nl != null && nl.getLength() > 0) {
			Element el = (Element)nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}		
		return textVal;
	}
	
	public void print(){

		Iterator it = ac.iterator();
		while(it.hasNext()) {
			Acciones a=(Acciones) it.next();
			System.out.println(a.toString());
		}
	}
	

}
