Properties of Strings:
In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
Once string object is created its data or state can't be changed but a new string object is created
A Java String is an object of the class java.lang.
Java platform provides the String class to create and manipulate strings.
The '+' operator is overloaded to concatenate two String operands.
There are two ways to construct a string object: By string literal and By new keyword
by string literal
String s = "HelloWorld!";
Each time we create a string literal, the JVM checks the string constant pool first. 
If the string already exists in the pool, a reference to the pooled instance is returned. 
If string doesn't exist in the pool, a new string instance is created and placed in the pool.
String s2="HelloWorld!";
String s3="HelloWorld!";//will not create new instance  
new keyword:
String s=new String("HelloWorld");//creates two objects and one reference variable  
JVM will create a new string object in normal(non pool) heap memory and the literal "HelloWorld" will be placed in the string constant pool. 
The variable s will refer to the object in heap(non pool).
Java String class provides a lot of methods to perform operations on string such as:
compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.
