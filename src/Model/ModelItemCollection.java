package Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by Кирилл on 01.11.2015.
 */

@XmlRootElement
public class ModelItemCollection<ModelItem1 extends ModelItem> {

    private ArrayList<ModelItem1> ModIt= new ArrayList<>();

    public ModelItemCollection(){}

    public void setModIt(ArrayList<ModelItem1> ModIt){
        this.ModIt = ModIt;
    }

    @XmlElement(name = "Model")
    public ArrayList<ModelItem1> getModIt(){
        return (ArrayList<ModelItem1>)ModIt.clone();
    }
}
