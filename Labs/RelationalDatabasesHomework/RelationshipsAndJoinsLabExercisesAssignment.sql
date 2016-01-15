SELECT LastName, FirstName, TerritoryDescription
FROM Employees
INNER JOIN EmployeeTerritories
ON Employees.EmployeeID = EmployeeTerritories.EmployeeID
INNER JOIN Territories
ON EmployeeTerritories.TerritoryID = Territories.TerritoryID;