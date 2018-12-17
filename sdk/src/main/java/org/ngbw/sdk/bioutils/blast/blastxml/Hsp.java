//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.03.27 at 09:51:27 AM PDT 
//


package org.ngbw.sdk.bioutils.blast.blastxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_num"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_bit-score"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_score"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_evalue"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_query-from"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_query-to"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_hit-from"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_hit-to"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_query-frame"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_hit-frame"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_identity"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_positive"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_align-len"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_qseq"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_hseq"/>
 *         &lt;element ref="{http://www.ngbw.org/conversion/impl/blastxml}Hsp_midline"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hspNum",
    "hspBitScore",
    "hspScore",
    "hspEvalue",
    "hspQueryFrom",
    "hspQueryTo",
    "hspHitFrom",
    "hspHitTo",
    "hspQueryFrame",
    "hspHitFrame",
    "hspIdentity",
    "hspPositive",
    "hspAlignLen",
    "hspQseq",
    "hspHseq",
    "hspMidline"
})
@XmlRootElement(name = "Hsp")
public class Hsp {

    @XmlElement(name = "Hsp_num", required = true)
    protected HspNum hspNum;
    @XmlElement(name = "Hsp_bit-score", required = true)
    protected HspBitScore hspBitScore;
    @XmlElement(name = "Hsp_score", required = true)
    protected HspScore hspScore;
    @XmlElement(name = "Hsp_evalue", required = true)
    protected HspEvalue hspEvalue;
    @XmlElement(name = "Hsp_query-from", required = true)
    protected HspQueryFrom hspQueryFrom;
    @XmlElement(name = "Hsp_query-to", required = true)
    protected HspQueryTo hspQueryTo;
    @XmlElement(name = "Hsp_hit-from", required = true)
    protected HspHitFrom hspHitFrom;
    @XmlElement(name = "Hsp_hit-to", required = true)
    protected HspHitTo hspHitTo;
    @XmlElement(name = "Hsp_query-frame", required = true)
    protected HspQueryFrame hspQueryFrame;
    @XmlElement(name = "Hsp_hit-frame", required = true)
    protected HspHitFrame hspHitFrame;
    @XmlElement(name = "Hsp_identity", required = true)
    protected HspIdentity hspIdentity;
    @XmlElement(name = "Hsp_positive", required = true)
    protected HspPositive hspPositive;
    @XmlElement(name = "Hsp_align-len", required = true)
    protected HspAlignLen hspAlignLen;
    @XmlElement(name = "Hsp_qseq", required = true)
    protected HspQseq hspQseq;
    @XmlElement(name = "Hsp_hseq", required = true)
    protected HspHseq hspHseq;
    @XmlElement(name = "Hsp_midline", required = true)
    protected HspMidline hspMidline;

    /**
     * Gets the value of the hspNum property.
     * 
     * @return
     *     possible object is
     *     {@link HspNum }
     *     
     */
    public HspNum getHspNum() {
        return hspNum;
    }

    /**
     * Sets the value of the hspNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspNum }
     *     
     */
    public void setHspNum(HspNum value) {
        this.hspNum = value;
    }

    /**
     * Gets the value of the hspBitScore property.
     * 
     * @return
     *     possible object is
     *     {@link HspBitScore }
     *     
     */
    public HspBitScore getHspBitScore() {
        return hspBitScore;
    }

    /**
     * Sets the value of the hspBitScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspBitScore }
     *     
     */
    public void setHspBitScore(HspBitScore value) {
        this.hspBitScore = value;
    }

    /**
     * Gets the value of the hspScore property.
     * 
     * @return
     *     possible object is
     *     {@link HspScore }
     *     
     */
    public HspScore getHspScore() {
        return hspScore;
    }

    /**
     * Sets the value of the hspScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspScore }
     *     
     */
    public void setHspScore(HspScore value) {
        this.hspScore = value;
    }

    /**
     * Gets the value of the hspEvalue property.
     * 
     * @return
     *     possible object is
     *     {@link HspEvalue }
     *     
     */
    public HspEvalue getHspEvalue() {
        return hspEvalue;
    }

    /**
     * Sets the value of the hspEvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspEvalue }
     *     
     */
    public void setHspEvalue(HspEvalue value) {
        this.hspEvalue = value;
    }

    /**
     * Gets the value of the hspQueryFrom property.
     * 
     * @return
     *     possible object is
     *     {@link HspQueryFrom }
     *     
     */
    public HspQueryFrom getHspQueryFrom() {
        return hspQueryFrom;
    }

    /**
     * Sets the value of the hspQueryFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspQueryFrom }
     *     
     */
    public void setHspQueryFrom(HspQueryFrom value) {
        this.hspQueryFrom = value;
    }

    /**
     * Gets the value of the hspQueryTo property.
     * 
     * @return
     *     possible object is
     *     {@link HspQueryTo }
     *     
     */
    public HspQueryTo getHspQueryTo() {
        return hspQueryTo;
    }

    /**
     * Sets the value of the hspQueryTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspQueryTo }
     *     
     */
    public void setHspQueryTo(HspQueryTo value) {
        this.hspQueryTo = value;
    }

    /**
     * Gets the value of the hspHitFrom property.
     * 
     * @return
     *     possible object is
     *     {@link HspHitFrom }
     *     
     */
    public HspHitFrom getHspHitFrom() {
        return hspHitFrom;
    }

    /**
     * Sets the value of the hspHitFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspHitFrom }
     *     
     */
    public void setHspHitFrom(HspHitFrom value) {
        this.hspHitFrom = value;
    }

    /**
     * Gets the value of the hspHitTo property.
     * 
     * @return
     *     possible object is
     *     {@link HspHitTo }
     *     
     */
    public HspHitTo getHspHitTo() {
        return hspHitTo;
    }

    /**
     * Sets the value of the hspHitTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspHitTo }
     *     
     */
    public void setHspHitTo(HspHitTo value) {
        this.hspHitTo = value;
    }

    /**
     * Gets the value of the hspQueryFrame property.
     * 
     * @return
     *     possible object is
     *     {@link HspQueryFrame }
     *     
     */
    public HspQueryFrame getHspQueryFrame() {
        return hspQueryFrame;
    }

    /**
     * Sets the value of the hspQueryFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspQueryFrame }
     *     
     */
    public void setHspQueryFrame(HspQueryFrame value) {
        this.hspQueryFrame = value;
    }

    /**
     * Gets the value of the hspHitFrame property.
     * 
     * @return
     *     possible object is
     *     {@link HspHitFrame }
     *     
     */
    public HspHitFrame getHspHitFrame() {
        return hspHitFrame;
    }

    /**
     * Sets the value of the hspHitFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspHitFrame }
     *     
     */
    public void setHspHitFrame(HspHitFrame value) {
        this.hspHitFrame = value;
    }

    /**
     * Gets the value of the hspIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link HspIdentity }
     *     
     */
    public HspIdentity getHspIdentity() {
        return hspIdentity;
    }

    /**
     * Sets the value of the hspIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspIdentity }
     *     
     */
    public void setHspIdentity(HspIdentity value) {
        this.hspIdentity = value;
    }

    /**
     * Gets the value of the hspPositive property.
     * 
     * @return
     *     possible object is
     *     {@link HspPositive }
     *     
     */
    public HspPositive getHspPositive() {
        return hspPositive;
    }

    /**
     * Sets the value of the hspPositive property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspPositive }
     *     
     */
    public void setHspPositive(HspPositive value) {
        this.hspPositive = value;
    }

    /**
     * Gets the value of the hspAlignLen property.
     * 
     * @return
     *     possible object is
     *     {@link HspAlignLen }
     *     
     */
    public HspAlignLen getHspAlignLen() {
        return hspAlignLen;
    }

    /**
     * Sets the value of the hspAlignLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspAlignLen }
     *     
     */
    public void setHspAlignLen(HspAlignLen value) {
        this.hspAlignLen = value;
    }

    /**
     * Gets the value of the hspQseq property.
     * 
     * @return
     *     possible object is
     *     {@link HspQseq }
     *     
     */
    public HspQseq getHspQseq() {
        return hspQseq;
    }

    /**
     * Sets the value of the hspQseq property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspQseq }
     *     
     */
    public void setHspQseq(HspQseq value) {
        this.hspQseq = value;
    }

    /**
     * Gets the value of the hspHseq property.
     * 
     * @return
     *     possible object is
     *     {@link HspHseq }
     *     
     */
    public HspHseq getHspHseq() {
        return hspHseq;
    }

    /**
     * Sets the value of the hspHseq property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspHseq }
     *     
     */
    public void setHspHseq(HspHseq value) {
        this.hspHseq = value;
    }

    /**
     * Gets the value of the hspMidline property.
     * 
     * @return
     *     possible object is
     *     {@link HspMidline }
     *     
     */
    public HspMidline getHspMidline() {
        return hspMidline;
    }

    /**
     * Sets the value of the hspMidline property.
     * 
     * @param value
     *     allowed object is
     *     {@link HspMidline }
     *     
     */
    public void setHspMidline(HspMidline value) {
        this.hspMidline = value;
    }

}
