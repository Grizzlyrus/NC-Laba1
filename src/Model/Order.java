package Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

/**
 * Created by Кирилл on 27.10.2015.
 */

@XmlType( propOrder = {"customernum","tariffnum","date","sum"})
@XmlRootElement(name = "Order")
public class Order extends ModelItem {

    private int customernum;
    private int tariffnum;
    private Date date;
    private double sum;

    public Order(){}

    @XmlElement(name = "Customer number")
    private void setCustomernum(int customernum){
        this.customernum = customernum;
    }

    @XmlElement(name = "Tariff number")
    public void setTariffnum(int tariffnum){
        this.tariffnum = tariffnum;;
    }

    @XmlElement(name = "Order date") // нужно сделать обертку (т.к. не примитивный тип)
    public void setDate(Date date){
        this.date = date;
    }

    @XmlElement(name = "Order sum")
    public void setSum(double sum){
        this.sum = sum;
    }

    public int getCustomernum(){
        return customernum;
    }

    public int getTariffnum(){
        return tariffnum;
    }

    public Date getDate(){
        return date;
    }

    public double getSum(){
        return sum;
    }

}
