-- Session 3: Joins & Basic Queries

-- Use Case 1: Highest Confirmed Cases using INNER JOIN
SELECT c.Country, cc.Date, cc.Confirmed_Cases
FROM covid_cases cc
INNER JOIN countries c ON cc.Country = c.Country_Name
WHERE cc.Date = '2021-05-01'
ORDER BY cc.Confirmed_Cases DESC
LIMIT 1;

-- Use Case 2: Join COVID Deaths and Vaccination Data
CREATE TABLE covid_deaths (
    Country VARCHAR(100),
    Date DATE,
    Total_Deaths INT
);

CREATE TABLE covid_vaccines (
    Country VARCHAR(100),
    Date DATE,
    Vaccination_Status VARCHAR(50)
);

SELECT d.Country, d.Date, d.Total_Deaths, v.Vaccination_Status
FROM covid_deaths d
LEFT JOIN covid_vaccines v
    ON d.Country = v.Country AND d.Date = v.Date;

-- Use Case 3: Analyze Deaths by Continent
CREATE TABLE continents (
    Country VARCHAR(100) PRIMARY KEY,
    Continent VARCHAR(100)
);

SELECT co.Continent, SUM(cc.Deaths) AS Total_Deaths
FROM covid_cases cc
INNER JOIN continents co ON cc.Country = co.Country
GROUP BY co.Continent;

-- Use Case 4: Average New Deaths Per Day
SELECT Date, AVG(Deaths) AS Avg_Deaths
FROM covid_cases
GROUP BY Date
ORDER BY Date;

-- Use Case 5: Countries with Highest Infection Rates
SELECT c.Country_Name, cc.Confirmed_Cases, c.Population,
       (cc.Confirmed_Cases / c.Population) * 100 AS Infection_Rate
FROM covid_cases cc
INNER JOIN countries c ON cc.Country = c.Country_Name
ORDER BY Infection_Rate DESC;
