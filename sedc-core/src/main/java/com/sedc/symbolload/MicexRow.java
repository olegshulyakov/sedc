package com.sedc.symbolload;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "row")
@Data
public class MicexRow {

    @XmlAttribute(name = "SECID")
    protected String secid;
    @XmlAttribute(name = "BOARDID")
    protected String boardid;
    @XmlAttribute(name = "SHORTNAME")
    protected String shortname;
    @XmlAttribute(name = "PREVPRICE")
    protected String prevprice;
    @XmlAttribute(name = "LOTSIZE")
    protected Integer lotsize;
    @XmlAttribute(name = "FACEVALUE")
    protected Float facevalue;
    @XmlAttribute(name = "STATUS")
    protected String status;
    @XmlAttribute(name = "BOARDNAME")
    protected String boardname;
    @XmlAttribute(name = "DECIMALS")
    protected Byte decimals;
    @XmlAttribute(name = "SECNAME")
    protected String secname;
    @XmlAttribute(name = "REMARKS")
    protected String remarks;
    @XmlAttribute(name = "MARKETCODE")
    protected String marketcode;
    @XmlAttribute(name = "INSTRID")
    protected String instrid;
    @XmlAttribute(name = "SECTORID")
    protected String sectorid;
    @XmlAttribute(name = "MINSTEP")
    protected Float minstep;
    @XmlAttribute(name = "PREVWAPRICE")
    protected String prevwaprice;
    @XmlAttribute(name = "FACEUNIT")
    protected String faceunit;
    @XmlAttribute(name = "PREVDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prevdate;
    @XmlAttribute(name = "ISSUESIZE")
    protected Long issuesize;
    @XmlAttribute(name = "ISIN")
    protected String isin;
    @XmlAttribute(name = "LATNAME")
    protected String latname;
    @XmlAttribute(name = "REGNUMBER")
    protected String regnumber;
    @XmlAttribute(name = "PREVLEGALCLOSEPRICE")
    protected String prevlegalcloseprice;
    @XmlAttribute(name = "PREVADMITTEDQUOTE")
    protected String prevadmittedquote;
    @XmlAttribute(name = "CURRENCYID")
    protected String currencyid;
    @XmlAttribute(name = "SECTYPE")
    protected String sectype;
    @XmlAttribute(name = "LISTLEVEL")
    protected Byte listlevel;
    @XmlAttribute(name = "BID")
    protected String bid;
    @XmlAttribute(name = "BIDDEPTH")
    protected String biddepth;
    @XmlAttribute(name = "OFFER")
    protected String offer;
    @XmlAttribute(name = "OFFERDEPTH")
    protected String offerdepth;
    @XmlAttribute(name = "SPREAD")
    protected Byte spread;
    @XmlAttribute(name = "BIDDEPTHT")
    protected String biddeptht;
    @XmlAttribute(name = "OFFERDEPTHT")
    protected String offerdeptht;
    @XmlAttribute(name = "OPEN")
    protected String open;
    @XmlAttribute(name = "LOW")
    protected String low;
    @XmlAttribute(name = "HIGH")
    protected String high;
    @XmlAttribute(name = "LAST")
    protected String last;
    @XmlAttribute(name = "LASTCHANGE")
    protected Float lastchange;
    @XmlAttribute(name = "LASTCHANGEPRCNT")
    protected Float lastchangeprcnt;
    @XmlAttribute(name = "QTY")
    protected Short qty;
    @XmlAttribute(name = "VALUE")
    protected Float value;
    @XmlAttribute(name = "VALUE_USD")
    protected Float valueusd;
    @XmlAttribute(name = "WAPRICE")
    protected String waprice;
    @XmlAttribute(name = "LASTCNGTOLASTWAPRICE")
    protected Float lastcngtolastwaprice;
    @XmlAttribute(name = "WAPTOPREVWAPRICEPRCNT")
    protected Float waptoprevwapriceprcnt;
    @XmlAttribute(name = "WAPTOPREVWAPRICE")
    protected Float waptoprevwaprice;
    @XmlAttribute(name = "CLOSEPRICE")
    protected String closeprice;
    @XmlAttribute(name = "MARKETPRICETODAY")
    protected String marketpricetoday;
    @XmlAttribute(name = "MARKETPRICE")
    protected String marketprice;
    @XmlAttribute(name = "LASTTOPREVPRICE")
    protected Float lasttoprevprice;
    @XmlAttribute(name = "NUMTRADES")
    protected Integer numtrades;
    @XmlAttribute(name = "VOLTODAY")
    protected Long voltoday;
    @XmlAttribute(name = "VALTODAY")
    protected Long valtoday;
    @XmlAttribute(name = "VALTODAY_USD")
    protected Integer valtodayusd;
    @XmlAttribute(name = "ETFSETTLEPRICE")
    protected String etfsettleprice;
    @XmlAttribute(name = "TRADINGSTATUS")
    protected String tradingstatus;
    @XmlAttribute(name = "UPDATETIME")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar updatetime;
    @XmlAttribute(name = "ADMITTEDQUOTE")
    protected String admittedquote;
    @XmlAttribute(name = "LASTBID")
    protected String lastbid;
    @XmlAttribute(name = "LASTOFFER")
    protected String lastoffer;
    @XmlAttribute(name = "LCLOSEPRICE")
    protected String lcloseprice;
    @XmlAttribute(name = "LCURRENTPRICE")
    protected String lcurrentprice;
    @XmlAttribute(name = "MARKETPRICE2")
    protected String marketprice2;
    @XmlAttribute(name = "NUMBIDS")
    protected String numbids;
    @XmlAttribute(name = "NUMOFFERS")
    protected String numoffers;
    @XmlAttribute(name = "CHANGE")
    protected String change;
    @XmlAttribute(name = "TIME")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlAttribute(name = "HIGHBID")
    protected String highbid;
    @XmlAttribute(name = "LOWOFFER")
    protected String lowoffer;
    @XmlAttribute(name = "PRICEMINUSPREVWAPRICE")
    protected String priceminusprevwaprice;
    @XmlAttribute(name = "OPENPERIODPRICE")
    protected String openperiodprice;
    @XmlAttribute(name = "SYSTIME")
    protected String systime;
    @XmlAttribute(name = "CLOSINGAUCTIONPRICE")
    protected String closingauctionprice;
    @XmlAttribute(name = "CLOSINGAUCTIONVOLUME")
    protected String closingauctionvolume;
    @XmlAttribute(name = "ISSUECAPITALIZATION")
    protected String issuecapitalization;
    @XmlAttribute(name = "ISSUECAPITALIZATION_UPDATETIME")
    protected String issuecapitalizationupdatetime;
    @XmlAttribute(name = "ETFSETTLECURRENCY")
    protected String etfsettlecurrency;
    @XmlAttribute(name = "VALTODAY_RUR")
    protected Long valtodayrur;
    @XmlAttribute(name = "version")
    protected Short version;
    @XmlAttribute(name = "seqnum")
    protected Integer seqnum;

}
