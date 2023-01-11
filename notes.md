# Getting Started with Spring

Dan Vega - danvega.dev
DaShaun Carter - dashaun.com
springofficehours.io
GitHub resources - https://github.com/CodeMash-2023-Spring-Workshop

### Spring
> [spring.io](https://spring.io)
- Spring Initizlizr - start.spring.io - this can create a project with your specs

#### IoC - Inversion of Control
- We no longer manage the instances of classes, let the framework do it
- **Dependency Injection** - In our classes, Spring will inject existing instance of classes that we need, we don't have to instanciate them ourselves. Helpful when we only need a single instance of a class.

#### Application
- Container for all components (beans) that the application would use.
- "beans" - an instance of a java class
- need to tell spring which "beans" we want to control for us
  - annotate a class with `@Component`
  - this places that class in the context, and we can ask that context for an instance of ti

#### Actuators
- 

#### MVC
- Model - the thing
- View - how do we display the view
- Controller - how do we handle that thing

#### Spring data
- layer on top of different datastore
- a number of modules that can handle numerous databases
- spring data jpa uses an ORM