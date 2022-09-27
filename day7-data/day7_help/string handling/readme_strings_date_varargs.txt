String class API
Important String class constructors
1.String(byte[] bytes) --- byte[] ----> String converter

2.String(char[] chars)   --- char[] ---> String converter

3.String (byte[] bytes,int offset,int len)  ---byte[] ----> String converter from the specified offset , specified len no of bytes will be converted.
eg . String s=new String(bytes,3,4);   --- String will contain bytes[3]----bytes[6]

4. String(char[] ch,int offset,int len)

5. String(String s)

String class methods --- to go through
charAt,compareTo,contains,copyValueOf,format,valueOf,getBytes,toCharArray,toLowerCase,indexOf,lastIndexOf,split,replace,startsWith,endsWith,length,intern


1.
boolean equals(Object o) ---- ret true iff 2 strings are having same contents (case sensitive)

About equals()
super class def. --- java.lang.Object
public boolean equals(Object o)
Rets true iff both refs(this & o) are equal i.e referring to the same object.

Sub-class developers MUST override equals for content-wise(depending on Object's state) comparison.



2. concat,charAt,indexOf,lastIndexOf,toUpperCase,toLowerCase,format,split

printf & Formatter class
Refer to java.util.Formatter class for formatting conversion details.

Imp ---

Formatting details
%c -- character
%b -- boolean
%h -- hex value of hashcode of obj ref.
%s -- string
%d -- int
%f,%g -- float/double
%x -- hex value
%n -- line separator
%tD  -- Date 
%tT  -- Time
%tc  -- Time stamp(date & Time)
%td-%1$tb-%1$tY -- can be applied to GC or Date. 

Date/Time Handling in Java

API
1. java.util.Date--- represents system date , till the msec precision
Constructor
1.Date() --- creates Date class instance representing system date, current date.(till ms precision)
2.Date(long msec) --- creates Date class instance representing date for msec elapsed after epoch(=1st Jan 1970)
eg : Date d1=new Date(100);
Methods --toString,before,after,equals,compareTo
---------------------
For parsing(string-->Date) & formatting (Date --> String)
1. Create an instance of java.text.SimpleDateFormat (extends DateFormat)
Constr : SimpleDateFormat(String pattern)
pre defined pattern
y --year
MM -- month in digit(1-12)
MMM -- month in abbrevation(Jan,Feb...)
MMMM ---complete month name
d -day

h- Hour
m --minute
s -- second
eg : SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy , hh:mm:ss");
OR 
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); 


2. Parsing (use inherited API) string ----> Date
public Date parse(String s) throws ParseException

3. Formatting
public String format(Date d)



2. java.util.GregorianCalendar
month range --- 0-11
GregorianCalendar(int yr,int mon,int date);
GregorianCalendar(int yr,int mon,int date,int hr,int min,int sec);

2.5 How to find out current year ?
GregorianCalendar class API (inherited from Calendar class)
public int get(String fieldName)
eg :  gc.get(Calendar.YEAR);



3. Date/Time formatting via printf
%tc -- for complete timestamp(date & time)
%tD -- for date
%tT -- time 

Arguments --- Date, GregorianCalendar

static import syntax ---
eg -- import static java.util.Calendar.*;
or import static java.lang.System.*;

in such src   -  u can access directly static members of Calendar class or from 2nd statement u can directly use out.println("testing static imports!");

var-args  ...
variable args syntax.--- Must be last arg in the method args.
Can use primitive type as well as ref types.
Legal ---
void doStuff(int... x) {
//B.L	
 } // expects from 0 to many ints
Usage : ref.doStuff();//no args
int[] ints={1,2,3,4};
ref.doStuff(ints);//array
ref.doStuff(20,34,56);// comma separated list of args

System.out.printf("%n");//legal 
System.out.printf(1234);//javac error

// as parameters
void doStuff2(char c, int... x) {..... } // expects first a char,
// then 0 to many ints
eg : ref.doStuff2('a',1,2,3,5);//no javac err
ref.doStuff2();//javac err : 1st arg missing


class Test {
void doStuff3(Animal... animals) { 
   for(Animal a : animals)
     sop(a.getName());
} // 0 to many Animals
}
Test ref=new Test();
invocations ---
ref.doStuff3();//no javac err
Animal animals[]={new Cat(),new Dog(),new Horse()};//4 objs 
ref.doStuff3(animals);//no javac err
Animal a1=new Horse(); 
Animal a2=new Cat(); 
Animal a3=new Dog();
ref.doStuff3(a1,a2,a3);

Illegal: javac error
void doStuff4(int x...) {....} // bad syntax : javac err
void doStuff5(int... x, char... y) {...} // too many var-args
void doStuff6(String... s, byte b) { } // var-arg must be last



