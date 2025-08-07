Tea Shop Record Management Console Application

This project is a simple console-based application built using Java to manage tea shop details.This application demonstrates how Java can be used to build a basic data management system using object-oriented and collection-based approaches.he system allows users to input tea shop details, store them, and view all stored data using a structured, menu-driven approach. It utilizes Java Collections Framework — particularly List, Map, and for-each loops — to manage dynamic records efficiently.

🎯 Key Features:
Insert Tea Shop Details
Accepts input in a comma-separated format including:

Tea Shop Name

Owner Name

Servants Count

Product 1

Product 2

Save and Display using for-each loop
Uses a for-each loop to:

Store each value in a Map<String, String> using fieldNames as keys.

Print each key-value pair for user confirmation.

Add the Map to a List<Map<String, String>> to keep track of all shops.

Display All Tea Shops
Iterates through the list of maps and prints the stored details of all tea shops in a formatted manner.

Exit Option
Ends the program cleanly.

🛠️ Technical Concepts Used:
Scanner
For user input from the console.

String Arrays
To store field names and split input values.

ArrayList
Dynamic list to hold multiple tea shop records.

LinkedHashMap
Maintains insertion order for field names and values.

for-each loop
Used to loop through arrays and collections elegantly.

Validation
Ensures users input all required fields to prevent runtime errors (like IndexOutOfBoundsException).

🔄 Program Flow:
Display Menu (Options 1 to 4).

User selects:

1: Enters comma-separated tea shop details.

2: Saves input as a map and adds it to the list.

3: Displays all saved tea shop records.

4: Exits the application.

Steps 1 & 2 are repeated for each new tea shop.

Option 3 displays all shops added so far.

Validation Logic:
Checks if input contains all required fields before storing.

Prevents null or incomplete input from being saved.

Ensures graceful error messages instead of crashes.

📌 Sample Input Format:
mathematica
Copy
Edit
Chai Point,Raj,4,Ginger Tea,Masala Chai
Use Case:
This application can be used as a foundational system for:

Small business inventory records

Learning data storage using Java collections

Practicing input handling, validation, and object-oriented design
