Singleton Design Pattern:
Singleton Design Pattern is a type of creational design pattern as it provides the best way to create an object.
It involves creating a single class which is responsible to create an object, and making sure only single object get created.
This particular class provides a way to access the single object which can be accessed directly without the need to instantiate the object of the class.
We create a SingleObject class.
SingleObject class has its constructor as private and has a static instance of itself.
SingleObject class provides a static method to get its static instance to outside world.
They are used in logging, caches, thread pools, configuration settings, device driver objects.