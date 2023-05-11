package XMLprase;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class XMLDemo1 {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();

        Document document = reader.read(new File("C:\\Users\\lu\\IdeaProjesPRO\\Other\\src\\xml\\student.xml"));
        Element rootElement = document.getRootElement();
        //List elements = rootElement.elements();
        List<Element> studentElements = rootElement.elements("student");

        ArrayList<Student> list = new ArrayList<>();

        //System.out.println(elements.size());
        for (Element studentElement : studentElements) {
            Attribute attribute = studentElement.attribute("id");
            String id = attribute.getValue();
            Element nameElement = studentElement.element("name");
            String name = nameElement.getText();
            Element ageElement = studentElement.element("age");
            String age = ageElement.getText();

            /*System.out.println(id);
            System.out.println(name);
            System.out.println(age);*/

            Student s = new Student(id,name,Integer.parseInt(age));
            list.add(s);
            for (Student student : list) {
                System.out.println(student);
            }
        }
        //System.out.println();
    }
}
