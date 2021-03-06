//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.22 at 09:12:09 PM CST 
//


package org.suren.autotest.platform.schemas.autotest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fieldTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fieldTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="input"/>
 *     &lt;enumeration value="button"/>
 *     &lt;enumeration value="select"/>
 *     &lt;enumeration value="file_upload"/>
 *     &lt;enumeration value="check_box_group"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fieldTypeEnum")
@XmlEnum
public enum FieldTypeEnum {


    /**
     * 文本框、文本域等用于输入字符的元素
     * 
     */
    @XmlEnumValue("input")
    INPUT("input"),

    /**
     * 按钮类需要触发单击操作的元素
     * 
     */
    @XmlEnumValue("button")
    BUTTON("button"),

    /**
     * 下拉列表元素
     * 
     */
    @XmlEnumValue("select")
    SELECT("select"),

    /**
     * 点击了会触发文件上传的按钮
     * 
     */
    @XmlEnumValue("file_upload")
    FILE_UPLOAD("file_upload"),

    /**
     * 单（多）选按钮组所在的父（parent）元素
     * 
     */
    @XmlEnumValue("check_box_group")
    CHECK_BOX_GROUP("check_box_group");
    private final String value;

    FieldTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldTypeEnum fromValue(String v) {
        for (FieldTypeEnum c: FieldTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
