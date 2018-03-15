How do you handle exception in JMS consumers and how to you recover?
IllegalStateException is thrown when a method is invoked at an inappropriate time or if the provider is not in an appropriate state for the requested operation. Let us consider, this exception must be thrown if Session.commit is called on a non-transacted session. 
It is also called when a domain inappropriate method is called, such as calling TopicSession.CreateQueueBrowser. 
InvalidClientIDException is thrown when a client attempts to set a connection's client ID to a value that is rejected by a provider. 
Other JMS exceptions include the following:

InvalidDestinationException
MessageEOFException
MessageFormatException
MessageNotWriteableException
JMSSecurityException
ResourceAllocationException
MessageNotReadableException
TransactionInProgressException
TransactionRolledBackException
InvalidSelectorException