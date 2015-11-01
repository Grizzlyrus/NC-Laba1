package Model;


/**
 * Created by Кирилл on 27.10.2015.
 */

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType( propOrder = {"number","name"})
public abstract class ModelItem {
    private int number;
    private String name;

    public ModelItem(){}

    @XmlElement(name = "Number")
    public void setNumber(int number){
        this.number = number;
    }

//    @XmlAttribute( name = "Name", required = false )
    @XmlElement(name = "Name")
    public void setName(String name){
        this.name = name;
    }

    public int getNumber(){
        return number;
    }

    public String getName(){
        return  name;
    }
}
