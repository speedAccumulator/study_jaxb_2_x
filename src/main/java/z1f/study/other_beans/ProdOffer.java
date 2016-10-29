package z1f.study.other_beans;


@XmlType(namespace = "http://some/namespace",propOrder = {"prodOfferId", "getProdOfferName"})
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
        this.id = prodOfferId;  
    } 
    
    public String getProdOfferName() {  
        return prodOfferName;  
    }  
    public void setProdOfferName(String prodOfferName) {  
        this.prodOfferName = prodOfferName;  
    }
	
}