# JBDC

- JBDC stands for "Java Database Connectivity".

- JDBC (Java Database Connectivity) is a Java API that allows Java applications to interact with databases.

- It provides a standard interface for connecting to databases, executing SQL queries, and retrieving results.

- JDBC is part of the Java Standard Edition platform and is widely used for database connectivity in Java applications.

## Architecture of JDBC

The architecture of JDBC consists of several components:

1. Driver Manager and Driver :
   Driver Manager is a class that manages a list of database drivers. It is responsible for establishing a connection to the database by selecting the appropriate driver based on the URL provided.

   DrDriver is a .jar file containing implementation classes of JDBC interfaces.
   Vendors provide the driver `.jar` . Driver converts normal Java calls into database-specific protocol.

2. Connection :
   Connection is an interface that represents a connection to a specific database. It provides methods for creating statements, managing transactions, and closing the connection.

3. Statement :
   Statement is an interface that represents a SQL statement to be executed against the database. It provides methods for executing SQL queries and updates.
4. PreparedStatement :
   PreparedStatement is a subinterface of Statement that represents a precompiled SQL statement. It allows you to set parameters dynamically and execute the statement multiple times with different parameter values.

5. ResultSet :
   ResultSet is an interface that represents the result of a SQL query. It provides methods for navigating through the results and retrieving data.

## How to create a connection to a database using JDBC

To connect a java application to a database using JDBC, you need to follow these steps:

1. Load the driver class.

   ```java
   Class.forName("com.mysql.cj.jdbc.Driver");
   ```

2. Create connection using DriverManager.

   ```java
   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
   ```

3. Use the connection to fire quries.
   - statement for static queries.

     ```java
       Statement stmt = conn.createStatement();
       ResultSet rs = stmt.executeQuery("SELECT * FROM users");
     ```

   - prepared statement for dynamic queries.

     ```java
         PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE id = ?");
         pstmt.setInt(1, 1);
         ResultSet rs = pstmt.executeQuery();
     ```

4. Process the results using ResultSet.

   ```java
   resultSet rs = stmt.executeQuery("SELECT * FROM users");
   while (rs.next()) {
       int id = rs.getInt("id");
       String name = rs.getString("name");
       System.out.println("ID: " + id + ", Name: " + name);
   }
   ```

5. Close the connection.

   ```java
   conn.close();
   ```

## Important Methods in JDBC api

1. DriverManager
   - `getConnection(String url, String user, String password)` -> returns a Connection object that represents a connection to the database.

2. Connection
   - `createStatement()` -> returns a Statement object for sending SQL statements to the database.
   - `prepareStatement(String sql)` -> returns a PreparedStatement object for sending parameterized SQL statements to the database.

3. Statement
   - `executeQuery(String sql)` -> returns a ResultSet object that contains the data produced by the given query; never null.

   - `execute(String sql)` -> returns boolean T/F .

   - `executeUpdate(String sql)` -> returns an int indicating the number of rows affected by the execution of the SQL statement.

4. PreparedStatement
   - executeQuery() -> returns a ResultSet object that contains the data produced by the given query; never null.
   - executeUp
