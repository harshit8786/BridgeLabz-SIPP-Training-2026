-- ============================================
-- Challenge 1: Create COVID Database Schema (DDL)
-- ============================================

-- Task A: Create and select the database
CREATE DATABASE covid_db;
USE covid_db;

-- Task B: Create the covid_cases table
CREATE TABLE covid_cases (
    id INT AUTO_INCREMENT PRIMARY KEY,
    state VARCHAR(100),
    date DATE,
    time TIME,
    recoveries INT,
    deaths INT,
    confirmed_cases INT
);


-- ============================================
-- Challenge 2: Insert Initial COVID Data (DML)
-- ============================================

INSERT INTO covid_cases (state, date, time, recoveries, deaths, confirmed_cases)
VALUES ('India', '2020-03-15', '10:00:00', 50, 2, 100);


-- ============================================
-- Challenge 3: Update Case Information (DML)
-- ============================================

UPDATE covid_cases
SET confirmed_cases = 120
WHERE state = 'India' AND date = '2020-03-15';


-- ============================================
-- Challenge 4: Delete Incorrect Records (DML)
-- ============================================

DELETE FROM covid_cases
WHERE state = 'IN';


-- ============================================
-- Challenge 5: Alter Table (DDL)
-- ============================================

ALTER TABLE covid_cases
ADD vaccination_rate FLOAT;
