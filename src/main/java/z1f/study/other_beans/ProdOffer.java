package z1f.study.other_beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElementWrapper; 

@XmlType(namespace = "http://some/namespace",propOrder = {"prodOfferId", "prodOfferName"})
@XmlAccessorType(XmlAccessType.FIELD)
public class ProdOffer { 
	
	@XmlElement(required = true, defaultValue = "prodOfferId")
	int prodOfferId; 
	@XmlElement(namespace = "http://another/namespace", required = false, defaultValue = "prodOfferName")
	String prodOfferName; 
	
	
    public int getProdOfferId() {  
        return prodOfferId;  
    }  
    public void setProdOfferId(int prodOfferId) {  
        this.prodOfferId = prodOfferId;  
    } 
    
    public String getProdOfferName() {  
        return prodOfferName;  
    }  
    public void setProdOfferName(String prodOfferName) {  
        this.prodOfferName = prodOfferName;  
    }
	
}