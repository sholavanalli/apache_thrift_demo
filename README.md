# Apache thrift demo  

## Server 

Install thrift to compile .thrift files. On mac OS use "brew install thrift".  
 
To compile .thrift files run "thrift --gen java -out src/main/java src/thrift/QueryRemote.thrift" under thrift_server.  
  
Do "gradle uploadArchives" to create a JAR artifact and deploy to local maven cache.

Run App.java to start the server.

## Client 

Run QueryClient.java in the client to interact with the server.

