What is JIT Compiler?

The Just In Time Compiler (JIT) concept and more generally adaptive optimization is well known concept in many languages besides Java (.Net, Lua, JRuby).

In order to explain what is JIT Compiler ,start with a definition of compiler concept. According to wikipedia compiler is "a computer program that transforms the source language into another computer language (the target language)".

You all know  static java compiler (javac) that compiles human readable .java files to a byte code that can be interpreted by JVM - .class files. Then what does JIT compile? The answer will given a moment later after explanation of what is "Just in Time".

According to most researches, 80% of execution time is spent in executing 20% of code. That would be great if there was a way to determine those 20% of code and to optimize them. That's exactly what JIT does - during runtime it gathers statistics, finds the "hot" code compiles it from JVM interpreted bytecode (that is stored in .class files) to a native code that is executed directly by Operating System and heavily optimizes it.  Smallest compilation unit is single method. Compilation and statistics gathering is done in parallel to program execution by special threads. During statistics gathering the compiler makes assumption about code function and as the time passes tries to prove or to disprove them. If the assumption is  dis-proven the code is deoptimized and recompiled again.  

The name "Hotspot" of Sun (Oracle) JVM is chosen because of the ability of this Virtual Machine to find "hot" spots in code.

What optimizations does JIT?
Let's look closely at more optimizations done by JIT.

    Inline methods - instead of calling method on an instance of the object it copies the method to caller code. The hot methods should be located as close to the caller as possible to prevent any overhead. 
    Eliminate locks if monitor is not reachable from other threads
    Replace interface with direct method calls for method implemented only once to eliminate calling of virtual functions overhead
    Join adjacent synchronized blocks on the same object
    Eliminate dead code
    Drop memory write for non-volatile variables
    Remove prechecking NullPointerException and IndexOutOfBoundsException 
    

When the Java VM invokes a Java method, it uses an invoker method as specified in the method block of the loaded class object. The Java VM has several invoker methods, for example, a different invoker is used if the method is synchronized or if it is a native method.The JIT compiler uses its own invoker. Sun production releases check the method access bit for value ACC_MACHINE_COMPILED to notify the interpreter that the code for this method has already been compiled and stored in the loaded class. JIT compiler compiles the method block into native code for this method and stores that in the code block for that method. Once the code has been compiled the ACC_MACHINE_COMPILED bit, which is used on the Sun platform, is set.
