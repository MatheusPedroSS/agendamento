CREATE TABLE CLIENT (
    id NUMERIC(11) IDENTITY(1, 1),
    name VARCHAR(255) NOT NULL,
    CONSTRAINT client_pk PRIMARY KEY (id)
)
GO