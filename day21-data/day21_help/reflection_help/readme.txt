Why ?

Java Reflection provides ability to inspect and modify the runtime behavior of application.

What is Java reflection ?
Java API for (java.lang.Class<?> , java.lang.reflect)
1. Inspecting classes,interfaces,fields, methods w/o knowing their names at compile time 
2. Instantiating new objects
3. Invoking private methods and get/set field values .
4. Dynamic method invocation

Usage 
 It's  of little use in normal programming but it's the backbone for most of the Java, J2EE frameworks,IDEs,debuggers. 

Examples 

1. JUnit uses reflection to parse @Test annotation to get the test methods and then invoke it.
2. Spring  Framework uses it for dependency injection
3. Web servers use it  to forward the request to correct module by parsing their web.xml files and request URI.
4. Eclipse auto completion of method names
5. Struts
6. Hibernate .....

They all use java reflection because all these frameworks have no knowledge and access of user defined classes, interfaces, their methods etc.

Drawbacks

1. Poor Performance  Since java reflection resolve the types dynamically, it involves processing like scanning the classpath to find the class to load, causing slow performance.
2.
Security Restrictions  Reflection requires runtime permissions that might not be available for system running under security manager. This can cause you application to fail at runtime because of security manager.
3. Security Issues  Using reflection we can access part of code that we are not supposed to access, for example we can access private fields of a class and change its value. This can be a serious security threat and cause your application to behave abnormally.
4. High Maintenance  Reflection code is hard to understand and debug, also any issues with the code cant be found at compile time because the classes might not be available, making it less flexible and hard to maintain.


Entry Point for all reflection -- java.lang.Class<?> -- represents loaded class information in method area.

Important : 
JVM instantiates an immutable instance of java.lang.Class , per every loaded class in method area , which provides methods to examine the runtime properties of the object and create new objects, invoke its method and get/set object fields.

How to get access to loaded class(java.lang.Class) ?
1.Through static variable class
eg : Emp.class ---loaded class info --Class<Emp>
eg : Student.class => Class<Student>
2.Using getClass() method of Object
public final Class<?> getClass()
3.Method of java.lang.Class
public static Class<?> forName(String fullyQualifiedName) throws ClassNotFoundException
code eg : TestReflection.java


For primitive types and arrays, we can use static variable class. Wrapper classes provide another static variable TYPE to get the class.

eg :
// Get Class using reflection
Class<?> c = MyClass.class;
c = new MyClass(5).getClass();
try {
	// below method is used most of the times in frameworks like JUnit
	//Spring dependency injection, Tomcat web container
	//Eclipse auto completion of method names, hibernate, Struts2 etc.
	//because MyClass is not available at compile time
	concreteClass = Class.forName("com.app.core.MyClass");
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}
System.out.println(concreteClass.getCanonicalName()); 
//for primitive types, wrapper classes and arrays
Class<?> booleanClass = boolean.class;
System.out.println(booleanClass.getCanonicalName()); // prints boolean

Class<?> cDouble = Double.TYPE;
System.out.println(cDouble.getCanonicalName()); // prints double

Class<?> cDoubleArray = Class.forName("[D");
System.out.println(cDoubleArray.getCanonicalName()); //prints double[]

Class<?> twoDStringArray = String[][].class;
System.out.println(twoDStringArray.getCanonicalName()); // prints java.lang.String[][]
-----------------------
Important Methods of java.lang.Class , for inspection
code eg : Reflection1.java
1. To find fully qualified class name
public String getName()

1.5 To find if its class or interface 
public boolean isInterface()

2. To find class modifiers 
public int getModifiers();


2.1 java.lang.reflect.Modifier class API
public static boolean isPublic(int m)
public static  boolean isAbstract(int m)
puiblic static  boolean isFinal(int m)

3. To find super class 
public Class<? super T> getSuperclass()

Returns the Class representing the superclass of the entity. 
For Object class, an interface, a primitive type, or void, ---rets null.
For an array class --Object class 

4. To find interfaces 
public Class<?>[] getInterfaces()

Determines the interfaces implemented by the class 

5. To get accessible fields
public Field[] getFields() throws SecurityException

Returns an array containing Field objects reflecting all the accessible public fields of the class or interface .

6. To get all fields , including private fields
public Field[] getDeclaredFields() throws SecurityException

Returns an array of Field objects reflecting all the fields(public, protected, default and private fields, but NO  inherited fields. ) 

7. To get all accessible constructors of the class
public Constructor<?>[] getConstructors() throws SecurityException

Returns an array containing Constructor objects reflecting all the public constructors of the class

7.1 To find out constr args
java.lang.reflect.Constructor class API

public Class<?>[] getParameterTypes()

Returns an array of Class objects that represent the formal parameter types, in declaration order. 


8. To get all visible methods of the class
public Method[] getMethods() throws SecurityException
                    
Returns an array containing Method objects reflecting all the visible methods(including inherited methods) of the class/interface.

Method class API
8.1 public String getName() --rets method name
8.2 public Class<?> getReturnType() -- rets a class representing Method's ret type.
8.3 public Class<?>[] getParameterTypes()
Returns an array of Class objects that represent the formal parameter types, in declaration order

9. To get all (including private but not inherited) methods of the class.

public Method[] getDeclaredMethods() throws SecurityException
& then use similar API of Method class as mentioned above.

Class inspection part ends here......

1. How to create an instance of the class using default constr?
Class API
public T newInstance() throws InstantiationException


2. How to create an instance of the class using parameterized constr?
2.1 Get the required constr.
Class API
public Constructor<T> getConstructor(Class<?>... parameterTypes) throws NoSuchMethodException, SecurityException

2.2 Constructor class API
public T newInstance(Object... initargs) throws InstantiationException

3. How to invoke private method of the class dynamically ?
3.1 Get desired method object
Class API
public Method getDeclaredMethod(String name,Class<?>... parameterTypes) throws NoSuchMethodException,SecurityException
3.2 Method class API
public void setAccessible(boolean flag)throws SecurityException

3.3 Invoke the method dynamically
API of Method class
public Object invoke(Object invocationObj,Object... methodArgs)throws IllegalAccessException,IllegalArgumentException, InvocationTargetException
Meaning --
Invokes the underlying method represented by this Method object, on the specified object with the specified parameters. 
For static methods --1st arg can be null(its ignored anyway!)
                        
                                
              
                                    
                              




                     
                            












 
 

