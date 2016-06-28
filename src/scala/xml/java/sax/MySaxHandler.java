package scala.xml.java.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import scala.xml.java.Note;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;


/**
 * Created on 28.05.16.
 *
 * @author evgen
 */
public class MySaxHandler extends DefaultHandler implements ConstNote {

    List<Note> notes = new ArrayList<Note>();
    Note curr = new Note();
    int current = -1;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start document");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End document");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        if (qName.equals("note")) {
            curr = new Note();
            curr.setLogin(attributes.getValue(0));
        }
        if (qName.equals("name")) current = NAME;
        else if (qName.equals("tel")) current = TEL;
        else if (qName.equals("url")) current = URL;
        else if (qName.equals("street")) current = STREET;
        else if (qName.equals("city")) current = CITY;
        else if (qName.equals("country")) current = COUNTRY;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("note")) notes.add(curr);
    }

    public void characters(char[] chars, int start, int length) {
        String s = new String(chars, start, length);
        try {
            switch (current) {
                case NAME: {
                    if (curr.getName() == null)
                        curr.setName(s);
                }
                break;
                case TEL: {
                    if (curr.getTelephone() == null)
                        curr.setTelephone(s);
                }
                break;
                case STREET: {
                    if (curr.getAddress().getStreet() == null)
                        curr.getAddress().setStreet(s);
                }
                break;
                case CITY: {
                    if (curr.getAddress().getCity() == null)
                        curr.getAddress().setCity(s);
                }
                break;
                case COUNTRY: {
                    if (curr.getAddress().getCountry() == null)
                        curr.getAddress().setCountry(s);
                }
                break;
                case URL:
                    curr.setUrl(new URL(s));
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: " + s);
        }
    }

    public List<Note> getNotes() {
        return notes;
    }
}
