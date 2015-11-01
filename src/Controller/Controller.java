package Controller;

import Model.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by Кирилл on 27.10.2015.
 */
public class Controller {
//    private String[] orderHead = {"Order num.","Customer num.","Tariff num.","Date","Cost"};
//    private String[] customerHead = {"Customer num.","Customer name", "Phone num.", "Adress"};
//    private String[] tariffHead = {"Tariff num.","Tariff name","Speed","Cost"};




public void writeobject(String filename,ModelItemCollection models){
    try {
        File file = new File(filename);

        JAXBContext jaxbContext = JAXBContext.newInstance(ModelItemCollection.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(models, file);
        jaxbMarshaller.marshal(models, System.out);

    } catch (JAXBException e) {
        e.printStackTrace();
    }
}

}
