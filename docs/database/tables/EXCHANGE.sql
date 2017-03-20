CREATE TABLE EXCHANGE(
    EX_ID                   NUMERIC(18) NOT NULL,
    NAME                    VARCHAR(20) NOT NULL,
    DESCRIPTION             VARCHAR(40) NOT NULL,
    COUNTRY                 VARCHAR(40) NOT NULL,
    REGION_CG_ID            NUMERIC(18) NOT NULL,
    TIMEZONE_UTC_DIFF       NUMERIC(18) NOT NULL,
    LAST_UPDATE_TM          NUMERIC(18) NOT NULL,

     CONSTRAINT IPK_EXCHANGE PRIMARY KEY (EX_ID)
) TABLESPACE GENERAL_INDEX;

ALTER TABLE SOURCE_CENTER_ENGINE ADD CONSTRAINT IFK_EXCHANGE FOREIGN KEY (EX_ID) REFERENCES CODE_GENERIC (CG_ID) MATCH FULL;
