## Beans:

The objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. These beans are created with the configuration metadata that you supply to the container. For example, in the form of XML <bean/> definitions.

Bean definition contains the information called configuration metadata, which is needed for the container to know the following:

- How to create a bean
- Bean's lifecycle details
- Bean's dependencies

All the above configuration metadata translates into a set of the following properties that make up each bean definition:

1 	
Class

This attribute is mandatory and specifies the bean class to be used to create the bean.

2 	
Name

This attribute specifies the bean identifier uniquely. In XMLbased configuration metadata, you use the id and/or name attributes to specify the bean identifier(s).

3 	
Scope

This attribute specifies the scope of the objects created from a particular bean definition and it will be discussed in bean scopes chapter.

4 	
constructor-arg

This is used to inject the dependencies and will be discussed in subsequent chapters.

5 	
properties

This is used to inject the dependencies and will be discussed in subsequent chapters.

6 	
autowiring mode

This is used to inject the dependencies and will be discussed in subsequent chapters.

7 	
lazy-initialization mode

A lazy-initialized bean tells the IoC container to create a bean instance when it is first requested, rather than at the startup.

8 	
initialization method

A callback to be called just after all necessary properties on the bean have been set by the container. It will be discussed in bean life cycle chapter.

9 	
destruction method

A callback to be used when the container containing the bean is destroyed. It will be discussed in bean life cycle chapter.

