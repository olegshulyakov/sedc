CREATE TABLE SYMBOL (
         SYM_ID             NUMERIC(18) NOT NULL,
         NAME               VARCHAR(20) NOT NULL,
         DESCRIPTION        VARCHAR(20) NOT NULL,
         MASTER_SYM_ID      NUMERIC(18) NOT NULL,
         EX_ID              NUMERIC(18) NOT NULL,
         LAST_UPDATE_TM     DATETIME NOT NULL,

         CONSTRAINT IPK_SYMBOL PRIMARY KEY (SC_ID) DEFAULT nextval('S_SYMBOL_PK')

) TABLESPACE GENERAL_INDEX;
