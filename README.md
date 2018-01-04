# Overview
-----------------------------------------------------------------------------------------------------------------------------------
Demonstrate your knowledge of Web API usage, basic I/O operations using Java, and connecting to and consuming API endpoints.

[Using the the following JSON feed:](http://jsonplaceholder.typicode.com/posts)

Create a command line application to read the above JSON feed using HTTP. Please perform the following tasks:

## Setup
- Clone this repo
- [Install Maven](https://maven.apache.org/index.html) if it is not already installed on your local machine. 

## Application
- Tally the number of unique user Ids in the JSON.
- Modify the 4th JSON array item and change the title and body of the object to "CriticalMass". 
- Return an CMResponse object to the main Java class which includes the user count and the modified JSON.
- Write a file to the file system, with the modified JSON, called criticalmass.json.
- The program must pass the pre-written JUnit test which can be run using "mvn test".
- Create a branch with the following naming convention "yourname-cm-test" and push to the repo

## Requirements
- Use Java 1.6/1.7/1.8+
- All dependencies should be publicly available or properly included with the project and referenced within the POM
- Be creative, have fun and may the force be with you

