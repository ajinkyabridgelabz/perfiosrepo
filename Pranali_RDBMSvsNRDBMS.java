class Pranali_RDBMSvsNRDBMS {
    public static void main(String[] args) {

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



    }
}