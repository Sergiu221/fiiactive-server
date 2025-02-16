CREATE TABLE persons
(
    cnp         VARCHAR(13) PRIMARY KEY,
    serie       VARCHAR(2),
    number      INTEGER,
    first_name  VARCHAR(20),
    last_name   VARCHAR(20),
    address     VARCHAR(100),
    place_birth VARCHAR(100),
    date_birth  DATE
);
