Introducing NIO

NIO was created to allow Java programmers to implement high-speed I/O without having to write custom native code. NIO moves the most time-consuming I/O activities (namely, filling and draining buffers) back into the operating system, thus allowing for a great increase in speed.

Identifying differences between IO and NIO

1) IO streams versus NIO blocks

The most important distinction between the original I/O library (found in java.io.*) and NIO has to do with how data is packaged and transmitted. As previously mentioned, original I/O deals with data in streams, whereas NIO deals with data in blocks.

A stream-oriented I/O system deals with data one or more bytes at a time. An input stream produces one byte of data, and an output stream consumes one byte of data. It is very easy to create filters for streamed data. It is also relatively simply to chain several filters together so that each one does its part in what amounts to a single, sophisticated processing mechanism. Important thing is that bytes are not cached anywhere. Furthermore, you cannot move forth and back in the data in a stream. If you need to move forth and back in the data read from a stream, you must cache it in a buffer first.

A block-oriented I/O system deals with data in blocks. Each operation produces or consumes a block of data in one step. Processing data by the block can
be much faster than processing it by the (streamed) byte. You can move forth and back in the buffer as you need to. This gives you a bit more flexibility during processing. However, you also need to check if the buffer contains all the data you need in order to fully process it. And, you need to make sure that when reading more data into the buffer, you do not overwrite data in the buffer you have not yet processed. But block-oriented I/O lacks some of the elegance and simplicity of stream-oriented I/O.

Read more: 3 ways to read files using Java NIO

2) Synchronous vs. Asynchronous IO

Java IO’s various streams are blocking or synchronous. That means, that when a thread invokes a read() or write(), that thread is blocked until there is some data to read, or the data is fully written. The thread will be in blocked state for this period. This has been cited as a good solid reason for bringing multi-threading in modern languages.

In asynchronous IO, a thread can request that some data be written to a channel, but not wait for it to be fully written. The thread can then go on and do something else in the mean time. Usually these threads spend their idle time on when not blocked in IO calls, is usually performing IO on other channels in the meantime. That is, a single thread can now manage multiple channels of input and output.

Synchronous programs often have to resort to polling, or to the creation of many, many threads, to deal with lots of connections. With asynchronous I/O, you can listen for I/O events on an arbitrary number of channels, without polling and without extra threads.
---------------------
Java NIO
Important concepts

What's a buffer ?
A Buffer is an object, which holds some data, that is to be written to a channel or that has just been read from a channel

It's main significant difference between the new library and original I/O. In stream-oriented I/O, you wrote data directly to, and read data directly from, Stream objects.

What is a channel?
A Channel is an object from which you can read data and to which you can write data.(similar to I/O streams)

In NIO --- You never write a byte directly to a channel; instead you write to a buffer containing one or more bytes.
Likewise, you don't read a byte directly from a channel; you read from a channel into a buffer, and then get the bytes from the buffer.)


Difference between I/O streams & channels
Kinds of channels
They are bi-directional, streams are uni -directional.
A Channel can be opened for reading, for writing, or for both.

----------------
Reading from a file
In I/O we would simply create a FileInputStream and read from that. 

In NIO, reading data from a file involves three steps:

1. Get the Channel from FileInputStream or FileChannel's open method
2.Create the Buffer

3.Read data from Channel & write it into the Buffer.
4. Read data from buffer into JA.


Code
1.FileInputStream fin = new FileInputStream( "test.txt" );
2. FileChannel fc = fin.getChannel();
3.ByteBuffer buffer = ByteBuffer.allocate( 1024 );
4.fc.read( buffer );

Writing to a file

1.FileOutputStream fout = new FileOutputStream( "writesomebytes.txt" );
2. FileChannel fc = fout.getChannel();
3. byte[] message="some data".getBytes();
4. ByteBuffer buffer = ByteBuffer.allocate( 1024 );
for (int i=0; i<message.length; ++i) {
buffer.put( message[i] );
}
5. buffer.flip();

6. fc.write( buffer );

How to do both (read & write ?)
FileInputStream fin = new FileInputStream( infile );
FileOutputStream fout = new FileOutputStream( outfile );

    FileChannel fcin = fin.getChannel();
    FileChannel fcout = fout.getChannel();

    ByteBuffer buffer = ByteBuffer.allocate( 1024 );

    while (true) {
      buffer.clear();

      int r = fcin.read( buffer );

      if (r==-1) {
        break;
      }

      buffer.flip();

      fcout.write( buffer );
    }
  }
------------
Unerstanding Buffer state varibales
State variables
Three values can be used to specify the state of a buffer at any given moment in time:
1. position --Current position from where next byte will be read from or written to.
Position can range from  : 0 to capacity-1

When you write data into the Buffer, you do so at a certain position. Initially the position is 0. When a byte, long etc. has been written into the Buffer the position is advanced to point to the next cell in the buffer to insert data into. 


When you read data from a Buffer you also do so from a given position. When you flip a Buffer from writing mode to reading mode, the position is reset back to 0. As you read data from the Buffer you do so from position, and position is advanced to next position to read.

For data write operation into the buffer
(2 scenarios : 1 Java application is writing the data to a buffer --using put(..) method.

eg : buf.put(bytes)
buf --ByteBuffer
bytes --byte[] 

 2. Write data from a Channel into a Buffer
From a data sink , data is read into a channel & that u want to write in a buffer.
eg : int bytesRead = fileChannel.read(buf); //read into buffer.
)
2.  capacity = total size of the buffer.

3.Limit
In write mode the limit of a Buffer is the limit of how much data you can write into the buffer. In write mode the limit is equal to the capacity of the Buffer.

When flipping the Buffer into read mode, limit means the limit of how much data you can read from the data. So when flipping a Buffer into read mode, limit is set to write position of the write mode. In other words, you can read as many bytes as were written (limit is set to the number of bytes written, which is marked by position).

Buffer's flip() method

The flip() method switches a Buffer from writing mode to reading mode. Calling flip() sets the position back to 0, and sets the limit to where position just was.

In other words, position now marks the reading position, and limit marks how many bytes, chars etc. were written into the buffer - the limit of how many bytes, chars etc. that can be read.


Scenarions for reading Data from a Buffer
There are two ways you can read data from a Buffer.

1. Read data from the buffer into a channel.
//read from buffer into channel.
int bytesWritten = fileChannel.write(buf);

2. Read data from the buffer into java application ,using  get() methods.
Here is an example of how you can read data from a buffer into a channel:


Here is an example that reads data from a Buffer using the get() method:

byte aByte = buf.get();   
---------------------
To read file data
1.Create a channel:
The file channel’s open() static method is used to create a channel. The method opens a file, returning a FileChannel to access the supplied file.
Path path = Paths.get("readfile.txt");
2. 
FileChannel fileChannel = FileChannel.open(path);
3.Create a buffer:
Create a ByteBuffer using the ByteBuffer‘s allocate() static method. The new buffer’s position will be zero, its limit will be its capacity and its elements will be initialized to zero. In this example, the initial capacity is set to 6.

ByteBuffer buffer = ByteBuffer.allocate(6);

4. Read from the channel into the buffer:

FileChannel‘s read() method reads a sequence of bytes into the given buffer. The method returns the number of bytes read, or -1 if the channel has reached the end-of-stream.

int noOfBytesRead = fileChannel.read(buffer);

position() of channel---
Bytes are read starting at the channel’s current file position (initially zero), and then the file position is updated with the number of bytes actually read (in the example, the position will be 6 after initial read). The channel’s position() method returns the current position.
The ByteBuffer also has a position() method. Initially this is zero. After the first read, the value is 6. The buffer’s flip() method makes a buffer ready for a new sequence of relative get operations: It sets the limit to the current position (in this example, 6) and then sets the position to zero.

buffer.flip();
5. Print the buffer contents:

while (buffer.hasRemaining()) {

    System.out.print((char) buffer.get());

---------------
Example of writing data to a text File using FileChannel

1. String input = "file channel example";
byte [] inputBytes = input.getBytes();

2. Create a buffer:
The ByteBuffer's wrap() static method wraps a byte array into a buffer. The new buffer’s capacity and limit will be array.length and its initial position will be zero.

ByteBuffer buffer = ByteBuffer.wrap(inputBytes);

3. Create the channel:
The FileOutputStream‘s getChannel() method is used to create a channel. The method returns a file channel that is connected to the underlying file.
FOS fout=new FileOutputStream(fileName);
FileChannel fileChannel = .getChannel();

4. Write the buffer contents into the file channel:

int noOfBytesWritten = fileChannel.write(buffer);

5. Close resources:
Close the file channel and the file output stream.

fileChannel.close();
fout.close();
-------------------------
java NIO Path/Paths/Files

1. java.nio.file.Path  --i/f 
It is a part of the Java NIO 2 from  Java 7 onwards.  

It  represents a path in the file system. 
A path can point to either a file or a directory. 
A path can be absolute or relative. An absolute path contains the full path from the root of the file system down to the file or directory it points to. 
A relative path contains the path to the file or directory relative to some other path.

It has nothing to do with the path environment variable.

Similar to the java.io.File class.

How to create a Path Instance
2. To create a Path instance use a static method in the Paths class .(java.nio.file.Paths) :  Paths.get(). 

eg : Path path = Paths.get("c:/tmp/myfile.txt");
OR on linux systems :
Path path = Paths.get("/home/user/myfile.txt");

For relative path
eg : Path projects = Paths.get("d:/data", "projects");

3. The Java NIO Files class -- java.nio.file.Files
Utility class for manipulating files in the file system. 


3.1 Files.exists()
The Files.exists() method checks if a given Path exists in the file system.
public static boolean exists(Path path,LinkOption... options)
Returns true if file exists.
eg :
Path path = Paths.get("java/log4j.properties");
boolean exists =Files.exists(path);


3.2 Files.createDirectory()
The Files.createDirectory() method creates a new directory from a Path instance. Files class API
public static Path createDirectory(Path dir,FileAttribute<?>... attrs)                        throws IOException

eg : Path path = Paths.get("d:/data/my_new_dir");

try {
    Path newDir = Files.createDirectory(path);
} catch(FileAlreadyExistsException e){
    // the directory already exists.
} catch (IOException e) {
    //if the parent directory doesn't exist or no permissions
    e.printStackTrace();
}

3.3 

Files.copy()
The Files.copy() method copies a file from one path to another. 
API
public static Path copy(Path source,Path target,CopyOption... options)
throws IOException

eg : 

Path sourcePath      = Paths.get(srcFileName);
Path destinationPath = Paths.get(destFileName);

try {
    Files.copy(sourcePath, destinationPath);
} catch(FileAlreadyExistsException e) {
    //destination file already exists
} catch (IOException e) {
    //no permissions / folder doesn't exist
    e.printStackTrace();
}

To overwrite Existing Files

try {
    Files.copy(sourcePath, destinationPath,
            StandardCopyOption.REPLACE_EXISTING);
} catch(FileAlreadyExistsException e) {
    //destination file already exists
} catch (IOException e) {
    //something else went wrong
    e.printStackTrace();
}


3.4 
Files.move()
API
public static Path move(Path source,Path target,CopyOption... options)
                 throws IOException

Move or rename a file to a target file.
 Moving a file is the same as renaming it, except moving a file can both move it to a different directory and change its name in the same operation. Similar to File class's  renameTo() method.

eg : 

Path sourcePath      = Paths.get("data/log4j.properties");
Path destinationPath = Paths.get("data/subdir/log4j-new.properties");

try {
    Files.move(sourcePath, destinationPath,
            StandardCopyOption.REPLACE_EXISTING);
} catch (IOException e) {
    //moving file failed.
    e.printStackTrace();
}


3.5 To delete a file or directory
API
public static void delete(Path path) throws IOException

The Files.delete() method can delete a file or directory.

Path path = Paths.get("my_props/log4j.properties");

try {
    Files.delete(path);
} catch (IOException e) {
    //deleting file failed
    e.printStackTrace();
}

