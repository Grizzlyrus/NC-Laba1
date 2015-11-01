package Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Кирилл on 27.10.2015.
 */

@XmlType( propOrder = {"phonenum","adress"})
public class Customer extends ModelItem{
    int phonenum;
    String adress;

    public Customer(){}

    @XmlElement(name = "Phone number")
    public void setPhonenum(int phonenum){
        this.phonenum = phonenum;
    }

    @XmlElement(name = "Adress")
    public void setAdress(String adress){
        this.adress = adress;
    }

    public int getPhonenum(){
        return phonenum;
    }

    public String getAdress(){
        return adress;
    }


}
