//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.20 at 08:57:45 AM CST 
//


package org.suren.autotest.platform.schemas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pageFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pageFieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locators" type="{http://surenpi.com}pageFieldLocators" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://surenpi.com}pageFieldLocatorAttrGroup"/>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="data" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://surenpi.com}fieldTypeEnum" default="input" />
 *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="strategy" type="{http://surenpi.com}strategyEnum" default="priority" />
 *       &lt;attribute name="paramPrefix" type="{http://www.w3.org/2001/XMLSchema}string" default="param" />
 *       &lt;attribute name="timeout" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageFieldType", propOrder = {
    "locators"
})
public class PageFieldType {

    protected PageFieldLocators locators;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "data")
    protected String data;
    @XmlAttribute(name = "type")
    protected FieldTypeEnum type;
    @XmlAttribute(name = "action")
    protected String action;
    @XmlAttribute(name = "strategy")
    protected StrategyEnum strategy;
    @XmlAttribute(name = "paramPrefix")
    protected String paramPrefix;
    @XmlAttribute(name = "timeout")
    protected BigInteger timeout;
    @XmlAttribute(name = "byId")
    protected String byId;
    @XmlAttribute(name = "byCss")
    protected String byCss;
    @XmlAttribute(name = "byName")
    protected String byName;
    @XmlAttribute(name = "byXpath")
    protected String byXpath;
    @XmlAttribute(name = "byLinkText")
    protected String byLinkText;
    @XmlAttribute(name = "byPartialLinkText")
    protected String byPartialLinkText;
    @XmlAttribute(name = "byTagName")
    protected String byTagName;

    /**
     * Gets the value of the locators property.
     * 
     * @return
     *     possible object is
     *     {@link PageFieldLocators }
     *     
     */
    public PageFieldLocators getLocators() {
        return locators;
    }

    /**
     * Sets the value of the locators property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageFieldLocators }
     *     
     */
    public void setLocators(PageFieldLocators value) {
        this.locators = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FieldTypeEnum }
     *     
     */
    public FieldTypeEnum getType() {
        if (type == null) {
            return FieldTypeEnum.INPUT;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldTypeEnum }
     *     
     */
    public void setType(FieldTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the strategy property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyEnum }
     *     
     */
    public StrategyEnum getStrategy() {
        if (strategy == null) {
            return StrategyEnum.PRIORITY;
        } else {
            return strategy;
        }
    }

    /**
     * Sets the value of the strategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyEnum }
     *     
     */
    public void setStrategy(StrategyEnum value) {
        this.strategy = value;
    }

    /**
     * Gets the value of the paramPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamPrefix() {
        if (paramPrefix == null) {
            return "param";
        } else {
            return paramPrefix;
        }
    }

    /**
     * Sets the value of the paramPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamPrefix(String value) {
        this.paramPrefix = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeout() {
        if (timeout == null) {
            return new BigInteger("0");
        } else {
            return timeout;
        }
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeout(BigInteger value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the byId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getById() {
        return byId;
    }

    /**
     * Sets the value of the byId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setById(String value) {
        this.byId = value;
    }

    /**
     * Gets the value of the byCss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByCss() {
        return byCss;
    }

    /**
     * Sets the value of the byCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByCss(String value) {
        this.byCss = value;
    }

    /**
     * Gets the value of the byName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByName() {
        return byName;
    }

    /**
     * Sets the value of the byName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByName(String value) {
        this.byName = value;
    }

    /**
     * Gets the value of the byXpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByXpath() {
        return byXpath;
    }

    /**
     * Sets the value of the byXpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByXpath(String value) {
        this.byXpath = value;
    }

    /**
     * Gets the value of the byLinkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByLinkText() {
        return byLinkText;
    }

    /**
     * Sets the value of the byLinkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByLinkText(String value) {
        this.byLinkText = value;
    }

    /**
     * Gets the value of the byPartialLinkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByPartialLinkText() {
        return byPartialLinkText;
    }

    /**
     * Sets the value of the byPartialLinkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByPartialLinkText(String value) {
        this.byPartialLinkText = value;
    }

    /**
     * Gets the value of the byTagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByTagName() {
        return byTagName;
    }

    /**
     * Sets the value of the byTagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByTagName(String value) {
        this.byTagName = value;
    }

}