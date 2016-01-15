SELECT CompanyName, OrderDate, ProductName, Country
FROM Customers
INNER JOIN Orders
ON Orders.CustomerID = Customers.CustomerID
INNER JOIN Order_Details
ON Order_Details.OrderID = Orders.OrderID
INNER JOIN Products
ON Products.ProductID = Order_Details.ProductID
WHERE Country = 'USA';