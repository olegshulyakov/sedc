CREATE TABLE STAGE_YAHOO_FXRATE (
     SYX_ID       NUMERIC(18) NOT NULL,
     HASH         NUMERIC(18) NOT NULL,
     ID           NUMERIC(18) NOT NULL,
     NAME         VARCHAR(20) NOT NULL,
     RATE         NUMERIC(18) NOT NULL,
     DATE         DATETIME NOT NULL,
     TIME         DATETIME NOT NULL,
     ASK          NUMERIC(18) NOT NULL,
     BID          NUMERIC(18) NOT NULL,
     SYM_ID       NUMERIC(18) NOT NULL,

     CONSTRAINT IPK_STAGE_YAHOO_FXRATE PRIMARY KEY (SYX_ID) DEFAULT nextval('S_STAGE_YAHOO_FXRATE_PK')
) TABLESPACE GENERAL_INDEX;
ALTER TABLE STAGE_YAHOO_FXRATE ADD CONSTRAINT IFK_SYMBOL FOREIGN KEY (SYM_ID) REFERENCES SYMBOL (SYM_ID) MATCH FULL;
