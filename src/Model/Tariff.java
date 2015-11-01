package Model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Кирилл on 27.10.2015.
 */

@XmlType( propOrder = {"speed","cost"})
@XmlRootElement(name = "Tariff")
public class Tariff extends ModelItem {
    double speed;
    double cost;

    public Tariff(){}

    @XmlElement(name = "Speed")
    public void setSpeed(double speed){
        this.speed = speed;
    }

    @XmlElement(name = "Cost")
    public void setCost(double cost){
        this.cost = cost;
    }

    public double getSpeed(){
        return speed;
    }

    public double getCost(){
        return cost;
    }
}
