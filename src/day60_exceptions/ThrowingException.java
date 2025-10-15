package day60_exceptions;

public class ThrowingException
{
    public static void main(String[] args) {
        System.out.println("lets create exceptions");
//        RuntimeException e = new RuntimeException();
//        throw e;
        // throw new RuntimeException();
        String userName = "";
        if(userName.isEmpty()) {
            throw new RuntimeException("Username cannot be empty");
            //Assert.fail("reason message .. ");
        }
    }
}
/*
Exception Handling in Java:
	-> Exceptions are also objects in java
	-> Each exception that happens is represented by a java class, and whenever runtime error happens, object of the matching exception is created and thrown
	-> There is hierarchy of exception classes and throwable is the parent/root class for all exceptions

How do we handle exceptions:
	we use try catch statement in java

EX:
	String str = "java";
	System.out.println(str.charAt(10)); //=> StringIndexOutOfBoundsException class object is created and thrown.
	Then we see it as error in console.

	how can we prevent this?

	try{
		String str = "java";
		System.out.println(str.charAt(10));
	} catch(Exception e) {
		//LOG.error("Exception happened with str ...")
		System.out.println("Exception took place - " + e.getMessage());
	}


As we mentioned, exceptions are errors that happen during code execution, and java creates object of the the matching exception type and throws it. Then code execution stops.

In order to prevent code execution stopping, we can handle it using try catch.

try {
	//code
} catch(Exception e) {
	//code
}
//rest of code

In the catch block, we can specify parent exception or specific child exception type.
- when we type parent exception type like Throwable, Exception or RuntimeException , the catch block will be able to catch all sorts of exceptions (thanks to polymorphism)
	ex:
		try{
			//code
		}catch(Throwable t) {
			//this catch block is able to catch all sorts exceptions in java
		}

- sometimes we need to catch only specific exception/error, not all of them, in that case we can specify child type exception
	ex:
		try{
			//code
		}catch(NullPointerException e) {
			//this catch block is able to catch ONLY NullPointerException
		}

Why we do specific catch: maybe we want to run certain code based on that specific exception.

try{
	driver.findElement(By.id("hi")).click()
} catch (Exception e) {
	//print "element was not clicked"
}

try{
	driver.findElement(By.id("hi")).click()
} catch (NoSuchElementException e) {
	//print "element was not located, please verify if locator is correct"
}
.....
===============================

Like if statement can be multi branch, we can also have multiple catch blocks with one try block.

try {
	//code
} catch (NullpointerException e) {
	//code for NullpointerException
} catch (IndexOutOfBoundsException e) {
	//code for IndexOutOfBoundsException
} catch (Exception e) {
	//
}

Only rule for this : parent exception type is be after child exception type(s)

add new class MultiCatchBlock

------------
try block -> where we protected code is
catch block -> where we catch exceptions that happened in try block code
finally block -> the code in finally, runs always. Even if there is exception happened in try block or not

EX:
	try {
		//code
	} catch(Exception e) {
		//code after exception is caught
	} finally {
		//code that always runs. error or no.
		except if we have System.exit() statement or JVM crash
	}

When do we use finally:
	Normally we can use finally block to close some connections, or make sure to close open browser instances etc or any other clean up code
	closing open files

When does finally block not execute?
	- if there is System.exit(0) in try or catch block
	- if jvm (java) crashes on the computer

add new class FinallyBlock


IQ: final vs finally vs finalize
 final is keyword:
 	final variable -> constant variable, cannot change value after assignment
 	final method -> cannot be overridden in sub class
 	final class -> cannot be extended to a sub class/ not inherited

 finally is a block:
 	it is used with exception handling in java:
 	-> code in finally block runs always, even if there is or no error in try block
 	-> only time finally block code does not run is - where we have
 	System.exit(0) statement in try or catch blocks.
 	-> or java jvm crashes

 finalize is a method:
 	it is used to run some code right before the object is removed from HEAP memory by Garbage collector.
 ================================================

Since exceptions are classes in java, we can programmatically/manually create exceptions and throw them.

THROW KEYWORD:

	ex:
	RuntimeException e = new RuntimeException();
	throw e;

add new class ThrowingException
===================================
 */