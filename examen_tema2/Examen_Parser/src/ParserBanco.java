
public class ParserBanco {

	public static void main(String[] args) {
		Parser parser=new Parser();
		parser.parseFicheroXml("qwert.xml");
		parser.parseDocument();
		parser.print();
	}

}
