class Pranali_RDBMSvsNRDBMS {
    public static void main(String[] args) {
s
        System.out.println("1.Data Structure:");

System.out.println("RDBMS: RDBMS stores data in structured tables with rows and columns. It uses a predefined schema to define the data structure.");
System.out.println("NRDBMS: NRDBMS stores data in various formats, including documents, key-value pairs, graphs, or wide-column stores. It does not require a fixed schema, allowing for more flexible data modeling.");


System.out.println("2.Scalability:");

System.out.println("RDBMS: RDBMS systems are typically scaled vertically by adding more processing power, memory, or storage to a single server. They may have limitations in handling large amounts of data and high traffic loads.");
System.out.println("NRDBMS: NRDBMS systems are designed for horizontal scalability. You can distribute data across multiple servers or nodes, making them suitable for handling large-scale and high-traffic applications.");

System.out.println("3.Data Consistency:");

System.out.println("RDBMS: RDBMS systems prioritize data consistency, using ACID (Atomicity, Consistency, Isolation, Durability) transactions to ensure that data remains in a consistent state even in the face of failures.");
System.out.println("NRDBMS: NRDBMS systems often prioritize availability and partition tolerance over strict consistency. They use BASE (Basically Available, Soft state, Eventually consistent) principles, which may allow for temporary inconsistencies in distributed systems.");

System.out.println("4.Query Language:");

System.out.println("RDBMS: RDBMS systems use SQL (Structured Query Language) for querying and manipulating data. SQL is a powerful language for complex queries and joins.");
System.out.println("NRDBMS: NRDBMS systems use various query languages or APIs, depending on the database type. These may include JSON-based queries, key-based access, or specialized query languages for graph databases.");

System.out.println("5.Use Cases:");

System.out.println("RDBMS: RDBMS is well-suited for applications with structured data, complex relationships, and strict data integrity requirements. Common in traditional business applications, finance, and e-commerce.");
System.out.println("NRDBMS: NRDBMS is a better choice for applications with rapidly changing data models, unstructured or semi-structured data, and the need for horizontal scalability. Common in big data, real-time analytics, and content management systems.");

System.out.println(" MySQL (an RDBMS) Vs MongoDB (a NoSQL database):");

System.out.println(" Data Model:"
                "MySQL: Uses a structured, tabular data model with tables, rows, and columns.
                "MongoDB: Uses a document-oriented data model where data is stored in JSON-like documents.");
System.out.println(" Schema:
                "MySQL: Requires a predefined schema with fixed data types and relationships between tables.
                "MongoDB: Has a flexible schema, allowing for varying data structures within the same collection (similar to a table).");
System.out.println(" Query Language:
                "MySQL: Utilizes SQL, which is powerful for complex querying and joins.
                "MongoDB: Uses a query language specific to JSON-like documents, which is suitable for simple queries and document manipulation.");
System.out.println(" Scaling:
                "MySQL: Scales vertically, typically by adding more CPU, memory, or storage to a single server.
                "MongoDB: Scales horizontally by adding more servers or nodes to a cluster, making it well-suited for distributed, high-volume workloads.");
System.out.println(" Use Cases:
                "MySQL: Commonly used for applications with structured data and complex relationships, such as e-commerce systems, content management systems, and financial applications.
                "MongoDB: Well-suited for applications with rapidly evolving data, unstructured or semi-structured data, real-time analytics, and large-scale content management systems.");

    }
}