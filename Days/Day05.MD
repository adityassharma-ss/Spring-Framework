## Checkout more here:
https://www.tutorialspoint.com/spring/spring_bean_scopes.htm

## Spring - Bean Scopes

When defining a <bean> you have the option of declaring a scope for that bean. For example, to force Spring to produce a new bean instance each time one is needed, you should declare the bean's scope attribute to be prototype. Similarly, if you want Spring to return the same bean instance each time one is needed, you should declare the bean's scope attribute to be singleton.
  
The Spring Framework supports the following five scopes, three of which are available only if you use a web-aware ApplicationContext.
  
- Singleton
This scopes the bean definition to a single instance per Spring IoC container (default).
  
- Prototype
This scopes a single bean definition to have any number of object instances.

- Request
This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.
  
- Session
This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
  
- Global-session
This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
  
### The singleton scope

If a scope is set to singleton, the Spring IoC container creates exactly one instance of the object defined by that bean definition. This single instance is stored in a cache of such singleton beans, and all subsequent requests and references for that named bean return the cached object.
  
### The prototype scope

If the scope is set to prototype, the Spring IoC container creates a new bean instance of the object every time a request for that specific bean is made. As a rule, use the prototype scope for all state-full beans and the singleton scope for stateless beans.
  
  
