# Writer Class and Reader Class in Java

### Java Writer Class 

The java ```Writer Class```(java.io.Writer) is the base class for all Writer subclass. Java writer class is an abstract class which is character based ```OutputStream```.
* Some types of Writer class are as follows:
	

	* _**FileWriter**_:-

	Java FileWriter class is used to write character-oriented data to a file. It is character-oriented class which is used for file handling in java.

		**Constructor of FileWriter class are**:

		1. FileWriter(String file):-Creates a new file. It gets file name in string.
		1. FileWriter(File file):-Creates a new file. It gets file name in File object.

		**Methods of FileWriter class**:-

		1. void write(String text):-It is used to write the string into FileWriter.
		1. void write(char c):-It is used to write the char into FileWriter.
		1. void write(char[] c):-It is used to write char array into FileWriter.
		1. void flush():-It is used to flushes the data of FileWriter.
		1. void close():-It is used to close the FileWriter.

	* *__BufferdWriter__*:-

	Java BufferedWriter class is used to provide buffering for Writer instances. It makes the performance fast. It inherits Writer class.

		**Constructor in BufferedWriter class are**:

		1. BufferedWriter(Writer wrt):-It is used to create a buffered character output stream that uses the default size for an output buffer.
		1. BufferedWriter(Writer wrt, int size):-It is used to create a buffered character output stream that uses the specified size for an output buffer.

		**Methods of BufferedWriter class**:-

		1. void newLine():-It is used to add a new line by writing a line separator.
		1. void write(int c):-It is used to write a single character.
		1. void write(char[] cbuf, int off, int len):-It is used to write a portion of an array of characters.
		1. void write(String s, int off, int len):-It is used to write a portion of a string.
		1. void flush():-It is used to flushes the input stream.
		1. void close():-It is used to closes the input stream


### Java Reader Class

The java ```Reader Class``` (java.io.Reader) is the base class for all Reader subclasses in the Java IO API. A Java Reader is like a Java InputStream except that it is character based rather than byte based.
* Some types of Reader class are as follows:-
	

	* *__FileReader__*:-

	Java FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.

		**Constructor of FileReader class are**:

		1. FileReader(String file):-It gets filename in string. It opens the given file in read mode. If file doesn't exist, it throws FileNotFoundException.
		1. FileReader(File file):-It gets filename in file instance. It opens the given file in read mode. If file doesn't exist, it throws FileNotFoundException.

		**Methods of FileReader class**:-

		1. int read():-It is used to return a character in ASCII form. It returns -1 at the end of file.
		1. void close():-It is used to close the FileReader class.

	* *__BufferedReader__*:-

	Java BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line by readLine() method. It makes the performance fast.
	
			**Constructor of BufferedReader class are**:

			1. BufferedReader(Reader rd):-It is used to create a buffered character input stream that uses the default size for an input buffer.
			1. BufferedReader(Reader rd, int size):-It is used to create a buffered character input stream that uses the specified size for an input buffer.

			**Methods of BufferedReader class**:-

			1. int read():-It is used for reading a single character.
			1. int read(char[] cbuf, int off, int len):-It is used for reading characters into a portion of an array.
			1. boolean markSupported():-It is used to test the input stream support for the mark and reset method.
			1. String readLine():-It is used for reading a line of text.
			1. boolean ready():-It is used to test whether the input stream is ready to be read.
			1. long skip(long n):-It is used for skipping the characters.
			1. void reset():-It repositions the stream at a position the mark method was last called on this input stream.
			1. void mark(int readAheadLimit):-It is used for marking the present position in a stream.
			1. void close():-It closes the input stream and releases any of the system resources associated with the stream.
