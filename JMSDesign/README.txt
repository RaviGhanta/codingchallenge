How do you design an application with JMS messaging?
The following steps must be followed to design an application with JMS messaging.

Creating a JNDI InitialContext objec
Hashtable  en = new Hashtable();
en.put(Context.INITIAL_CONTEXT_FACTORY,
        "com.sun.jndi.fscontext.RefFSContextFactory");
env.put(Context.PROVIDER_URL, "file:///C:/imq_admin_objects");
Context  ctxt = new InitialContext(en);
Looking up a connection factory and a queue
 String  CF_LOOKUP_NAME = "MyConnectionFactory";
 ConnectionFactory  myFactory = (ConnectionFactory) ctxt.lookup
                                       (CF_LOOKUP_NAME);	```
Creating connection, or session
Connection
      myConnection = myFactory.createConnection("chivuk", "sound");
      myConnection.createSession(false, Session.AUTO_ACKNOWLEDGE);
      myConnection.start();
Creating a receiver, and then starting message delivery
TextMessage
   outMsg = mySession.createTextMessage("Hello, World!");
   MessageConsumer consumer = session.createConsumer(dest);
	MessageConsumer consumer = session.createConsumer(queue);
	MessageConsumer consumer = session.createConsumer(topic);
Receiving all text messages from the queue
Message ms = consumer.receive();
if (ms instanceof TextMessage) {
    TextMessage message = (TextMessage) ms;
    System.out.println("Reading message: " + message.getText());
} else {
    // Handle error
}
Closing the connection
connection.close();