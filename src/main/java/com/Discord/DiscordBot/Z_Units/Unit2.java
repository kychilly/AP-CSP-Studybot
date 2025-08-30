package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit2Questions;

public class Unit2 {

    public static int numUnit2Questions;

    public static void initializeUnit2Questions() {

        unit2Questions.add(new Question(
                "Which of the following is an example of structured data?",
                "A paragraph of text", "A JSON object", "An image", "A video",
                "B", 2, 1000, "easy"));

        unit2Questions.add(new Question(
                "What does CSV stand for?",
                "Comma Separated Values", "Computer Stored Variables", "Constant String Value", "Code Syntax Version",
                "A", 2, 1001, "easy"));

        unit2Questions.add(new Question(
                "Which data type would be best for storing a person's age?",
                "String", "Integer", "Boolean", "Float",
                "B", 2, 1002, "easy"));

        unit2Questions.add(new Question(
                "What is a common use for metadata?",
                "To store the actual content of files", "To describe information about data", "To encrypt data", "To delete unused files",
                "B", 2, 1003, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of unstructured data?",
                "A spreadsheet", "A database table", "A paragraph of text", "A JSON object",
                "C", 2, 1004, "easy"));

        unit2Questions.add(new Question(
                "What is the purpose of data validation?",
                "To improve the quality and accuracy of data", "To compress data", "To delete duplicates", "To encrypt sensitive information",
                "A", 2, 1005, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is NOT a characteristic of big data?",
                "Volume", "Variety", "Velocity", "Vacuum",
                "D", 2, 1006, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is a Boolean data type example?",
                "true", "42", "'Hello'", "3.14",
                "A", 2, 1007, "easy"));

        unit2Questions.add(new Question(
                "What is the main advantage of storing data in a database over a spreadsheet?",
                "Databases automatically generate reports", "Databases can handle much larger amounts of data efficiently", "Databases always use less memory", "Databases don’t require coding",
                "B", 2, 1008, "medium"));

        unit2Questions.add(new Question(
                "Which type of data would you likely store in an array?",
                "Multiple items of the same type", "Different types of unrelated items", "Encrypted text", "Images only",
                "A", 2, 1009, "easy"));

        unit2Questions.add(new Question(
                "Which data type is best for storing monetary amounts with decimal values?",
                "Integer", "String", "Float/Double", "Boolean",
                "C", 2, 1010, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is a valid JSON representation of a person?",
                "{name: 'Alice', age: 30}", "{'name': 'Alice', 'age': 30}", "{\"name\": \"Alice\", \"age\": 30}", "{name = 'Alice', age = 30}",
                "C", 2, 1011, "medium"));

        unit2Questions.add(new Question(
                "What does the term 'data integrity' refer to?",
                "Keeping data accurate and consistent", "Making data public", "Hiding data in code", "Compressing data",
                "A", 2, 1012, "medium"));

        unit2Questions.add(new Question(
                "Which of these is an example of qualitative data?",
                "Number of students in a class", "Favorite color of students", "Height of students", "Test scores",
                "B", 2, 1013, "easy"));

        unit2Questions.add(new Question(
                "What is the difference between a list and a set in data structures?",
                "Lists are ordered and allow duplicates; sets are unordered and do not allow duplicates", "Lists do not allow duplicates; sets do", "Lists are faster than sets", "Sets are always smaller than lists",
                "A", 2, 1014, "medium"));

        unit2Questions.add(new Question(
                "Which type of data visualization is best for showing parts of a whole?",
                "Line graph", "Bar chart", "Pie chart", "Scatter plot",
                "C", 2, 1015, "easy"));

        unit2Questions.add(new Question(
                "If you wanted to analyze trends over time, which data visualization would you likely use?",
                "Pie chart", "Line graph", "Histogram", "Word cloud",
                "B", 2, 1016, "easy"));

        unit2Questions.add(new Question(
                "Which of the following is true about data compression?",
                "It increases the size of files", "It reduces file size while retaining information", "It changes file content randomly", "It removes metadata",
                "B", 2, 1017, "medium"));

        unit2Questions.add(new Question(
                "Which of these best describes structured data?",
                "Data stored in a consistent format such as rows and columns", "Data that cannot be organized easily", "Data stored only in images", "Data stored as audio files",
                "A", 2, 1018, "easy"));

        unit2Questions.add(new Question(
                "Which of the following is a real-world example of quantitative data?",
                "Customer reviews", "Temperature readings", "Movie genre", "Customer preferences",
                "B", 2, 1019, "easy"));

        unit2Questions.add(new Question(
                "Which of the following best describes a key in a database?",
                "A unique identifier for a record", "A way to encrypt data", "A tool for sorting data", "A type of data visualization",
                "A", 2, 1020, "medium"));

        unit2Questions.add(new Question(
                "Which of these is an example of a primary key?",
                "Student ID", "Student's favorite color", "Student's address", "Student's hobby",
                "A", 2, 1021, "easy"));

        unit2Questions.add(new Question(
                "Which file type is commonly used for structured tabular data?",
                ".txt", ".csv", ".jpg", ".mp3",
                "B", 2, 1022, "easy"));

        unit2Questions.add(new Question(
                "Which of the following best defines a record in a database?",
                "A single piece of data", "A row in a table representing a single entity", "A column in a table", "A set of tables",
                "B", 2, 1023, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of quantitative data that could be measured?",
                "Favorite color", "Temperature in Celsius", "Brand preference", "Type of car",
                "B", 2, 1024, "easy"));

        unit2Questions.add(new Question(
                "Which of these is true about Boolean values?",
                "They can store any number", "They represent true/false states", "They are used to store strings", "They are used for large datasets",
                "B", 2, 1025, "easy"));

        unit2Questions.add(new Question(
                "Why is consistency important in data collection?",
                "To ensure accurate analysis and comparisons", "To store more data", "To compress data", "To avoid metadata",
                "A", 2, 1026, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of data redundancy?",
                "Storing the same data in multiple places unnecessarily", "Using structured data", "Storing encrypted data", "Cleaning datasets",
                "A", 2, 1027, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is true about arrays in programming?",
                "They can store multiple items of the same type", "They can only store strings", "They automatically sort data", "They cannot store numbers",
                "A", 2, 1028, "easy"));

        unit2Questions.add(new Question(
                "Which type of data visualization is best for showing frequency distribution?",
                "Pie chart", "Histogram", "Scatter plot", "Line graph",
                "B", 2, 1029, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of an identifier in a dataset?",
                "Email address used to uniquely identify a user", "User’s favorite movie", "Number of friends", "Account balance",
                "A", 2, 1030, "medium"));

        unit2Questions.add(new Question(
                "What is a common advantage of using JSON over CSV?",
                "It can store hierarchical/ nested data", "It is always smaller in size", "It cannot be parsed by code", "It does not require formatting",
                "A", 2, 1031, "medium"));

        unit2Questions.add(new Question(
                "Which of these best defines qualitative data?",
                "Data that describes qualities or characteristics", "Data that represents numbers", "Data used for calculations", "Data stored in arrays",
                "A", 2, 1032, "easy"));

        unit2Questions.add(new Question(
                "Which of the following is true about unstructured data?",
                "It is organized in rows and columns", "It lacks a predefined structure", "It is always numeric", "It cannot be stored digitally",
                "B", 2, 1033, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is true about structured vs. unstructured data?",
                "Structured data is easier to analyze than unstructured data", "Unstructured data is always smaller", "Structured data cannot be stored in databases", "Unstructured data is always numeric",
                "A", 2, 1034, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of time-series data?",
                "Daily temperature readings over a month", "List of favorite movies", "Customer names", "Book genres",
                "A", 2, 1035, "easy"));

        unit2Questions.add(new Question(
                "Which of the following is an example of derived data?",
                "Calculating the average score from individual test scores", "Storing a student’s name", "Storing a raw temperature reading", "Recording the current time",
                "A", 2, 1036, "medium"));

        unit2Questions.add(new Question(
                "What is the primary purpose of a data dictionary?",
                "To define the structure, types, and relationships of data", "To store backups", "To visualize data", "To delete duplicate records",
                "A", 2, 1037, "medium"));

        unit2Questions.add(new Question(
                "Which of these is true about data types in programming?",
                "They define the kind of values a variable can store", "They are only used in Java", "They automatically encrypt data", "They compress datasets",
                "A", 2, 1038, "easy"));

        unit2Questions.add(new Question(
                "Which of the following best describes normalization in databases?",
                "Organizing data to reduce redundancy and improve integrity", "Deleting all old records", "Encrypting the database", "Sorting tables alphabetically",
                "A", 2, 1039, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes a foreign key in a database?",
                "A field that uniquely identifies a record in another table", "A key used to encrypt data", "A field used to store passwords", "A key used to compress data",
                "A", 2, 1040, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is true about relational databases?",
                "They store data in tables with rows and columns", "They only store text data", "They cannot handle large datasets", "They automatically generate images",
                "A", 2, 1041, "easy"));

        unit2Questions.add(new Question(
                "Which of these best describes a tuple in database terminology?",
                "A row in a table representing a single record", "A column in a table", "A key used for encryption", "A type of data visualization",
                "A", 2, 1042, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of categorical data?",
                "Student grades (A, B, C)", "Temperature readings", "Height measurements", "Monthly income",
                "A", 2, 1043, "easy"));

        unit2Questions.add(new Question(
                "Which of the following is a best practice for storing sensitive data?",
                "Encrypting the data", "Storing it in plain text", "Compressing without encryption", "Converting it to CSV",
                "A", 2, 1044, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is true about a database schema?",
                "It defines the structure of tables, fields, and relationships", "It stores actual data", "It is always visualized as a pie chart", "It compresses data automatically",
                "A", 2, 1045, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes a key-value pair in a dictionary or map?",
                "A way to associate a unique key with a specific value", "A way to sort data alphabetically", "A type of data compression", "A Boolean value",
                "A", 2, 1046, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is a benefit of using data abstraction?",
                "It hides unnecessary details and allows focus on relevant information", "It deletes redundant data automatically", "It converts all data to numbers", "It encrypts all sensitive data",
                "A", 2, 1047, "medium"));

        unit2Questions.add(new Question(
                "Which of these is true about hierarchical data structures?",
                "They organize data in a tree-like structure", "They store all data in a single row", "They cannot have nested relationships", "They are always unstructured",
                "A", 2, 1048, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is true about storing dates and times in a database?",
                "They can be used for time-based analysis and trends", "They cannot be analyzed", "They must always be stored as strings", "They are automatically encrypted",
                "A", 2, 1049, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of derived data?",
                "Calculating total sales from individual transactions", "Customer names", "Customer phone numbers", "Transaction IDs",
                "A", 2, 1050, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes a dataset?",
                "A collection of related data organized for analysis", "A single number", "A visualization tool", "A programming language",
                "A", 2, 1051, "easy"));

        unit2Questions.add(new Question(
                "Which of these is an example of data provenance?",
                "Recording the source and history of data", "Encrypting data", "Compressing data", "Deleting duplicate records",
                "A", 2, 1052, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is true about a Boolean field in a database?",
                "It can only store true or false values", "It can store any number", "It stores text", "It stores images",
                "A", 2, 1053, "easy"));

        unit2Questions.add(new Question(
                "Which of the following is true about a histogram?",
                "It shows frequency distribution of numerical data", "It shows relationships between two categorical variables", "It shows a part-to-whole relationship", "It stores data in a table",
                "A", 2, 1054, "medium"));

        unit2Questions.add(new Question(
                "Which of these best describes a data pipeline?",
                "A sequence of processes that collects, processes, and stores data", "A method for encrypting files", "A way to visualize data", "A type of database",
                "A", 2, 1055, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of machine-readable data?",
                "A JSON file", "A handwritten note", "A printed book", "A scanned photograph",
                "A", 2, 1056, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is true about semi-structured data?",
                "It contains some organizational structure but does not fit neatly into a table", "It is always numeric", "It cannot be stored digitally", "It is fully unorganized",
                "A", 2, 1057, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is a primary goal of data cleaning?",
                "To remove errors and inconsistencies", "To generate visualizations", "To encrypt data", "To compress data",
                "A", 2, 1058, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of real-time data?",
                "Stock prices updating every second", "Monthly sales totals", "Customer favorite colors", "Book genres",
                "A", 2, 1059, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes a key-value store?",
                "A database that maps unique keys to values for fast lookup", "A table where all values are identical", "A type of visualization", "A spreadsheet format",
                "A", 2, 1060, "medium"));

        unit2Questions.add(new Question(
                "Which of these is an advantage of using a database index?",
                "Faster data retrieval", "Smaller file size", "Automatic encryption", "Data compression",
                "A", 2, 1061, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes a primary advantage of structured data?",
                "It can be easily queried and analyzed", "It always uses less storage", "It never requires cleaning", "It is always encrypted",
                "A", 2, 1062, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is true about normalization in databases?",
                "It reduces redundancy and improves consistency", "It encrypts data automatically", "It visualizes data", "It sorts data alphabetically",
                "A", 2, 1063, "medium"));

        unit2Questions.add(new Question(
                "Which of these is an example of streaming data?",
                "Live sensor readings from a weather station", "A monthly sales report", "A CSV file saved on a computer", "An annual survey",
                "A", 2, 1064, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes data aggregation?",
                "Combining data from multiple sources for analysis", "Encrypting data", "Deleting duplicate data", "Visualizing data trends",
                "A", 2, 1065, "medium"));

        unit2Questions.add(new Question(
                "Which of these is an example of categorical numeric data?",
                "Zip codes", "Height in centimeters", "Temperature readings", "Monthly income",
                "A", 2, 1066, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of an anomaly in a dataset?",
                "A temperature reading of 150°C in a city known for mild climate", "Average heights in a class", "Monthly revenue totals", "Favorite colors of students",
                "A", 2, 1067, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes data provenance?",
                "Tracking the origin and history of data", "Encrypting data to protect privacy", "Compressing files for storage", "Cleaning datasets",
                "A", 2, 1068, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is true about relational databases?",
                "Tables can be linked using primary and foreign keys", "They cannot store numeric data", "They are always unstructured", "They store data as JSON only",
                "A", 2, 1069, "medium"));

        unit2Questions.add(new Question(
                "Which of these is an example of hierarchical data?",
                "A company organizational chart", "A flat list of names", "A CSV of sales numbers", "A database table with no relationships",
                "A", 2, 1070, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes real-time analytics?",
                "Analyzing data as it is generated or received", "Analyzing data once a month", "Storing data without analyzing", "Compressing data for later use",
                "A", 2, 1071, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is a characteristic of semi-structured data?",
                "It contains tags or markers to separate elements but does not fit a strict table format", "It is fully numeric", "It is always unorganized", "It cannot be stored digitally",
                "A", 2, 1072, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of cleaning data?",
                "Removing duplicate entries from a dataset", "Encrypting files", "Generating graphs", "Saving a file as CSV",
                "A", 2, 1073, "medium"));

        unit2Questions.add(new Question(
                "Which of these best describes structured data in a spreadsheet?",
                "Rows represent records and columns represent attributes", "Data is randomly placed without order", "Only numeric values are allowed", "Only text values are allowed",
                "A", 2, 1074, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is true about metadata?",
                "It provides information about other data", "It stores large numeric datasets", "It compresses files", "It encrypts data automatically",
                "A", 2, 1075, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes a data mart?",
                "A smaller, specialized subset of a data warehouse", "A visualization tool", "A type of spreadsheet", "A compressed file format",
                "A", 2, 1076, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is true about data abstraction?",
                "It allows users to interact with data without needing to know its detailed structure", "It deletes unnecessary files", "It compresses datasets", "It encrypts data",
                "A", 2, 1077, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes an attribute in a dataset?",
                "A column in a table representing a characteristic of the data", "A row in a table", "A type of database key", "A visualization type",
                "A", 2, 1078, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is true about deduplication?",
                "It removes duplicate records from a dataset", "It encrypts sensitive data", "It visualizes trends", "It compresses images",
                "A", 2, 1079, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes a data warehouse?",
                "A central repository for large amounts of structured and semi-structured data", "A single table in a spreadsheet", "A real-time streaming system", "A visualization tool",
                "A", 2, 1080, "medium"));

        unit2Questions.add(new Question(
                "Which of these is true about data lakes?",
                "They store raw, unstructured, or semi-structured data for analysis", "They are used to compress data", "They can only store numeric data", "They automatically clean data",
                "A", 2, 1081, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of operational data?",
                "Current sales transactions in a store", "Historical climate records", "Archived research surveys", "Annual budget summaries",
                "A", 2, 1082, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes a surrogate key?",
                "A system-generated unique identifier used in a database", "A column storing encrypted data", "A key used to compress tables", "A foreign key linking tables",
                "A", 2, 1083, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes schema-on-read?",
                "The data’s structure is applied when it is read, not when stored", "The data is always encrypted", "The data is automatically normalized", "The data is stored in CSV format only",
                "A", 2, 1084, "medium"));

        unit2Questions.add(new Question(
                "Which of these best describes schema-on-write?",
                "The data must conform to a predefined structure before being stored", "Data is compressed automatically", "Data is always encrypted", "Data is visualized before storage",
                "A", 2, 1085, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is true about time-stamped data?",
                "It includes the date and/or time the data was recorded", "It cannot be numeric", "It is always encrypted", "It cannot be analyzed",
                "A", 2, 1086, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes ETL in data processing?",
                "Extract, Transform, Load: a process for moving and preparing data for analysis", "Encrypt, Transfer, Log: a security protocol", "Evaluate, Test, Launch: a software method", "Extract, Transfer, Lock: a backup procedure",
                "A", 2, 1087, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of batch data processing?",
                "Processing payroll at the end of each month", "Updating sensor data every second", "Streaming social media posts in real time", "Continuous stock price tracking",
                "A", 2, 1088, "medium"));

        unit2Questions.add(new Question(
                "Which of these best describes unstructured text data?",
                "Data such as emails, articles, or social media posts without a predefined format", "Data in a CSV table", "A database with rows and columns", "Numeric sensor readings",
                "A", 2, 1089, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of machine-generated data?",
                "Data collected from sensors, logs, or automated systems", "Customer feedback forms", "Survey responses", "Interview transcripts",
                "A", 2, 1090, "medium"));

        unit2Questions.add(new Question(
                "Which of these is true about relational vs non-relational databases?",
                "Relational databases use structured tables, non-relational can store unstructured or semi-structured data", "Non-relational databases are always smaller", "Relational databases cannot handle numbers", "Non-relational databases cannot be queried",
                "A", 2, 1091, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes OLAP?",
                "Online Analytical Processing: analyzing multidimensional data for insights", "A type of encryption for data warehouses", "A file compression method", "A tool for real-time streaming data",
                "A", 2, 1092, "medium"));

        unit2Questions.add(new Question(
                "Which of these is true about big data velocity?",
                "It refers to the speed at which data is generated and processed", "It refers to the storage size of data", "It refers to the number of data sources", "It refers to the accuracy of data",
                "A", 2, 1093, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is true about big data variety?",
                "It refers to the different types and formats of data", "It refers to data compression techniques", "It refers to how fast data is generated", "It refers to the cost of data storage",
                "A", 2, 1094, "medium"));

        unit2Questions.add(new Question(
                "Which of these best describes data partitioning?",
                "Dividing a dataset into smaller, manageable pieces for processing", "Encrypting data", "Visualizing trends", "Merging datasets",
                "A", 2, 1095, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is an example of structured log data?",
                "Server logs with timestamps, IP addresses, and event types in a consistent format", "Handwritten notes", "Scanned images", "Audio recordings",
                "A", 2, 1096, "medium"));

        unit2Questions.add(new Question(
                "Which of these is true about streaming analytics?",
                "It allows real-time processing and insights from continuous data", "It only works with CSV files", "It encrypts data automatically", "It only stores historical data",
                "A", 2, 1097, "medium"));

        unit2Questions.add(new Question(
                "Which of the following best describes master data management (MDM)?",
                "A process for ensuring consistency and quality of core business data across systems", "A visualization technique", "A file compression method", "A method to encrypt user data",
                "A", 2, 1098, "medium"));

        unit2Questions.add(new Question(
                "Which of these best describes unstructured multimedia data?",
                "Audio, video, and images without a predefined data model", "Data in a table", "Numeric sensor readings", "Survey results stored in CSV",
                "A", 2, 1099, "medium"));


        numUnit2Questions = unit2Questions.size();
        System.out.printf("There are %d questions in unit 2%n", numUnit2Questions);
    }



}
