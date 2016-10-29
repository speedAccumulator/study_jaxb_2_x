package z1f.study.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElementWrapper; 

import java.util.Set;

/**
 * This documentation will be copied as an XML Documentation Annotation for the ComplexType 'FooBar'.
 * Define it to augment usability/readability within the generated XSD.
 *
 * @author <a href="mailto:lj@jguru.se">Lennart J&ouml;relid</a>
 */
@XmlType(namespace = "http://some/namespace",
    propOrder = {"requiredElement", "aRequiredElementInAnotherNamespace",
            "optionalElement", "requiredAttribute", "optionalAttribute", "guildMemberships"})
@XmlAccessorType(XmlAccessType.FIELD)
public class FooBar {

/**
 * This documentation will be copied as an XML Documentation Annotation for the 'requiredElement'.
 * Define it to augment usability/readability within the generated XSD.
 */
@XmlElement(required = true, defaultValue = "requiredElementValue")
private String requiredElement;

@XmlElement(namespace = "http://another/namespace", required = true, defaultValue = "requiredElementValue")
private String aRequiredElementInAnotherNamespace;

/**
 * This documentation will be copied as an XML Documentation Annotation for the 'optionalElement'.
 * Define it to augment usability/readability within the generated XSD.
 */
@XmlElement(required = false)
private String optionalElement;

@XmlAttribute(required = true)
private String requiredAttribute;

@XmlAttribute(required = false)
private String optionalAttribute;

/**
 * The Guild Memberships of this FooBar. A nil value implies no GuildMemberships exist.
 */
@XmlElementWrapper(name = "guildMemberships", nillable = true, required = false)
@XmlElement(name = "guildMembership")
private Set<GuildMembership> guildMemberships;



    public String getRequiredElement() {
        return this.requiredElement;
    }
    public void setRequiredElement(final String requiredElement) {
        this.requiredElement = requiredElement;
    }
    
    public String getARequiredElementInAnotherNamespace() {
        return this.aRequiredElementInAnotherNamespace;
    }
    public void setARequiredElementInAnotherNamespace(final String aRequiredElementInAnotherNamespace) {
        this.aRequiredElementInAnotherNamespace = aRequiredElementInAnotherNamespace;
    }
    
    public String getOptionalAttribute() {
        return this.optionalAttribute;
    }
    public void setOptionalAttribute(final String optionalAttribute) {
        this.optionalAttribute = optionalAttribute;
    }
    
    public String getRequiredAttribute() {
        return this.requiredAttribute;
    }
    public void setRequiredAttribute(final String requiredAttribute) {
        this.requiredAttribute = requiredAttribute;
    }
    
    public String getOptionalElement() {
        return this.optionalElement;
    }
    public void setOptionalElement(final String optionalElement) {
        this.optionalElement = optionalElement;
    }




    public Set<GuildMembership> getGuildMemberships() {
        return this.guildMemberships;
    }
    public void setGuildMemberships(Set<GuildMembership> guildMemberships) {
        this.guildMemberships = guildMemberships;
    }

}