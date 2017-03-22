CREATE TABLE SYMBOL (
    SYM_ID              NUMERIC(18) NOT NULL,
    NAME                VARCHAR(20) NOT NULL,
    DESCRIPTION         VARCHAR(40) NOT NULL,
    MASTER_SYM_ID       NUMERIC(18),
    EX_ID               NUMERIC(18) NOT NULL,
    LAST_UPDATE_TM      TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),

    CONSTRAINT IPK_SYMBOL PRIMARY KEY (SYM_ID) DEFAULT nextval('S_SYMBOL_PK')

) TABLESPACE GENERAL_INDEX;


ALTER TABLE SYMBOL ADD CONSTRAINT IFK_SYMBOL FOREIGN KEY (MASTER_SYM_ID) REFERENCES SYMBOL (SYM_ID) MATCH FULL;
ALTER TABLE SYMBOL ADD CONSTRAINT IFK_EXCHANGE FOREIGN KEY (EX_ID) REFERENCES EXCHANGE (EX_ID) MATCH FULL;
