-- Session 2: Keys, Constraints & Data Integrity

-- Use Case 1: Composite Primary Key
DROP TABLE IF EXISTS covid_cases;

CREATE TABLE covid_cases (
    Country VARCHAR(100),
    Date DATE,
    Confirmed_Cases INT,
    Deaths INT,
    Recoveries INT,
    Last_Updated TIMESTAMP,
    PRIMARY KEY (Country, Date)
);

-- Use Case 2: Foreign Key Relationship
CREATE TABLE countries (
    Country_Code VARCHAR(10) PRIMARY KEY,
    Country_Name VARCHAR(100) NOT NULL UNIQUE,
    Region VARCHAR(100),
    Population BIGINT
);

ALTER TABLE covid_cases
ADD CONSTRAINT fk_country
FOREIGN KEY (Country) REFERENCES countries(Country_Name);

-- Use Case 3: NOT NULL and CHECK Constraints
ALTER TABLE covid_cases MODIFY COLUMN Country VARCHAR(100) NOT NULL;
ALTER TABLE covid_cases MODIFY COLUMN Date DATE NOT NULL;
ALTER TABLE covid_cases MODIFY COLUMN Confirmed_Cases INT NOT NULL;

ALTER TABLE covid_cases
ADD CONSTRAINT chk_deaths_le_confirmed
CHECK (Deaths <= Confirmed_Cases);

-- Use Case 4: Default Values
ALTER TABLE covid_cases
ALTER COLUMN Recoveries SET DEFAULT 0;

ALTER TABLE covid_cases
ALTER COLUMN Last_Updated SET DEFAULT CURRENT_TIMESTAMP;

-- Use Case 5: Unique Constraint on Country + Date
CREATE TABLE covid_cases_alt (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Country VARCHAR(100) NOT NULL,
    Date DATE NOT NULL,
    Confirmed_Cases INT NOT NULL,
    Deaths INT,
    Recoveries INT DEFAULT 0,
    Last_Updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT uq_country_date UNIQUE (Country, Date)
);

-- Sample Data
INSERT INTO countries (Country_Code, Country_Name, Region, Population)
VALUES ('IN', 'India', 'Asia', 1400000000);

INSERT INTO countries (Country_Code, Country_Name, Region, Population)
VALUES ('US', 'United States', 'North America', 331000000);

INSERT INTO covid_cases (Country, Date, Confirmed_Cases, Deaths)
VALUES ('India', '2021-05-01', 500, 10);

INSERT INTO covid_cases (Country, Date, Confirmed_Cases, Deaths)
VALUES ('United States', '2021-05-01', 1000, 20);

SELECT * FROM covid_cases;
SELECT * FROM countries;
