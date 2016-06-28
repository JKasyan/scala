package scala.xml.java.dom;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.*;
import scala.xml.java.Note;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 29.05.16.
 * @author evgen
 */
public class Main {

    private static String getValue(Element element, String name) {
        NodeList nList = element.getElementsByTagName(name);
        Element e = (Element) nList.item(0);
        Text text = (Text) e.getFirstChild();
        return text.getNodeValue();
    }

    public static void main(String[] args) throws Exception {
        Document document;
        DOMParser domParser = new DOMParser();
        List<Note> notes = new ArrayList<Note>();
        domParser.parse("resources/notepad.xml");
        document = domParser.getDocument();
        Element root = document.getDocumentElement();
        NodeList nodeList = root.getElementsByTagName("note");
        Element element;
        for (int i = 0; i < nodeList.getLength(); i++) {
            element = (Element) nodeList.item(i);
            Note note = new Note();
            Node log = element.getAttributes().item(0);
            note.setLogin(log.getNodeValue());
            note.setName(getValue(element, "name"));
            note.setTelephone(getValue(element, "tel"));
            note.setUrl(new URL(getValue(element, "url")));
            Element e = (Element) element.getElementsByTagName("address").item(0);
            note.getAddress().setCity(getValue(e, "city"));
            note.getAddress().setCountry(getValue(e, "country"));
            note.getAddress().setStreet(getValue(e, "street"));
            notes.add(note);
        }

        System.out.println(notes);
    }
}
