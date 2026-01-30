package day61_exceptions;

public class BreakTimeException extends RuntimeException {
    public BreakTimeException() {
    }

    public BreakTimeException(String message) {
        super(message); //call to parent class constructor

    }
}
/*
EXCEPTION HANDLING IN JAVA:
    -> Exception is error that happens during code execution
    -> We also call it RuntimeException
    -> When exception/error happens, execution is stopped
    -> so we can handle the error/exception using try catch statements
        -> handle exceptions -> we successfully catch the exception and code execution is not interrupted/stopped
    -> In selenium webdriver when or where do we use try catch to control or handle the exception:
        -> we should ONLY use try catch where code execution needs to continue even if exception happens, We only use with steps that is not
        important, or steps that are sometimes needed and not needed other times:
        EX:
            LETS say there is pop up box asking user to sing up for email notification that might or might not come up in front end.
            if it comes up. we click and cancel
            if it does not come up, we continue

            so the code that clicks on cancel, could be in try catch like this:
 */

/*
**Exception handling in Java**

- try catch
- try catch finally
- try catch catch
- try catch catch catch finally
- try finally
- Exception is error that happens during code execution
- We also call it RuntimeException
- When exception/error happens, execution is stopped
- so we can handle the error/exception using try catch statements
    - handle exceptions → we successfully catch the exception and code execution is not interrupted/stopped
- In selenium web driver when or where do we use try catch to control or handle the exception
    - we should ONLY use try catch where code execution needs to continue even if exception happens. We only use with steps that is not important, or steps that are sometimes needed and not needed other time

    Example:

    - Lets say there is pop up box asking user to sign up for email notifications that might or might not come up in front end.
    - if it comes up we click and cancel
    - if it does not come up, we continue
    - so the code that clicks on cancel could be in try catch like this:

    @Test        public void createAccountTest() {

    HomePage homePage = new HomePage();

    homePage.goto();

     homePage.isCurrentPage();

    try{

    homePage.cancelAddEmailPopup();

    }catch(Exception e) {

    System.out.println("Pop error is handled");

     }

    homePage.clickOnCreateAccount();

    AddAccountPage addAccountPage = new AddAccountPage();            addAccountPage.addAccountDetails("username", "email"...);            addAccountPage.isAccountCreatedSuccessfully();

      }

- So basically, we use try catch when exception happens during runtime. we do not want the code to stop execution
- We want to catch and handle and successfully continue code execution
- Throw keyword is used to manually show ERROR and STOP CODE EXECUTION

Example:

throw new RuntimeException("invalid email provided");

- We use throw new statement, when we want to the code execution to STOP when one of our requirements is NOT met.
- So we show runtimeError and stop the code execution, because we decided at this point , execution should not continue, as something invalid took place.

Example:

String email = "cybertek.gmail.com";

System.out.println("Thank you for your email: " + email);

- In above example, code will run successfully as it looks fine for java.But for us, programmers, when email is not valid, we want to show ERROR and STOP the code execution:

String email = "cybertek.gmail.com";

if(!email.contains("@")) {

//SHOW ERROR AND STOP RIGHT HERE

throw new RuntimeException("Invalid email!");

}

System.out.println("Thank you for your email: " + email);

//code that rely on email below here

- Throw keyword is used to manually SHOW ERROR and STOP CODE EXECUTION.
- throw new RuntimeException("Invalid email!");

**Exception hierarchy**

- Object → Throwable → Error → Exception

**Throwing exceptions using throw keyword**

- throw keyword → manually throw error/exception
- try catch will catch the run time exception
- throw keyword is used to throw exception during runtime

**Creating a Custom Exception Type**

- We can create a class that extends RuntimeException to create our custom error class

**Custom Exception Types**

- Java comes with many exceptions already ready to go
- We can catch them and handle them or we can throw if needed
- As exceptions are java classes, they follow inheritance hierarchy
- But sometimes, we would like to be able to throw specific exceptions that have to do with our project only
- In those cases, we can create custom exception types

HOW:

- create a custom class that extends either RuntimeException class or Exception class

Example:

public class InvalidCredentialsException extends RuntimeException {

public InvalidCredentialsException(){}

public InvalidCredentialsException(String msg) {

super(msg);
}

}

if(userName.isEmpty() || password.isEmpty()) {

throw new InvalidCredentialsException("cannot be empty");

}

---

THROW keyword is used to manually created runtime exceptions

Example:

throw new RuntimeException("invalid email provided");

- We use throw new statement, when we want the code execution to STOP when one of our requirements is not met
- So we show runtimeError and stop the execution, because we decided at this point, execution should not continue, as something invalid took place

---

**Types of exceptions**

- Throwable → Error class and its sub classes: these are errors that happen while code execution due to bad code, or environment

Example:

StackOverFlowError -> it means stack memory is full.

OutOfMemoryError -> it means heap memory is full

- We DO NOT HANDLE these types of ERRORS. We try to prevent by writing good code etc, no infinite loops, or no not exiting recursion etc.

**CHECKED VS UNCHECKED EXCEPTIONS**

- Checked exception → exception types that are checked at compile time
- Checked exceptions are throwable class, Exception class, and all sub classes of Exception except RuntimeException
- We must/mandatory to HANDLE or DECLARE checked exceptions, otherwise code will not compile
- Checked Exceptions are checked by compiler and we must either handle or declare them

Example:

Thread.sleep(1000); → this line causes a checked exception and will not compile

- we must either handle or declare the checked exception
1. HANDLE:

    try {

    Thread.sleep(1000);

    } catch (InterruptedException e)

    e.printStackTrace();

    }

2. DECLARE using THROWS keyword

    public static void sleep(int seconds) throws InterruptedException {

    Thread.sleep(seconds*1000)

    }

- CHECKED EXCEPTIONS: are checked by compliler. and we must either HANDLE or DECLARE them

Example:

public static void main(String[] args) {

String filePath = "data.txt";

 List<String> data = Files.readAllLines(Paths.get(filePath));

 }

- Files.readAllLines portion THROWS a checked exception, so code will NOT compile as is

**What do we do so that code compiles and we read data from file:**

1. HANDLE it using try catch. code will compile and if exception happens during runtime, it will be caught and handled, then execution will continue successfully

    public static void main(String[] args) {

    try {

    String filePath = "data.txt";

    List<String> data = Files.readAllLines(Paths.get(filePath));

    }catch(IOException e) {

    e.printStackTrace();

    }

    }

2. DECLARE the Exception using THROWS keyword in method signature:
    - Code will compile and run
    - But if any error happens during the execution, code will STOP and show error. throws keyword DOES NOT HANDLE the error, it just DECLARES

    Example:

    public static void main(String[] args) throws Exception {

    String filePath = "data.txt";

    List<String> data = Files.readAllLines(Paths.get(filePath));

    }

Unchecked Exceptions

- They are the exceptions that happen during RUNTIME and it is optional to handle them or declare them, Code will ALWAYS compile
- Unchecked exceptions are also called Runtime Exceptions
- Unchecked exceptions are RuntimeException class and its sub classes

Example:

int [] nums = {30, 40, 50};

System.out.println(nums[5]);

- The above code will compile just fine, because ArrayIndexOutOfBounds Exception is UN-Checked/Runtime exception
- During code execution, that line will throw an ArrayIndexOutOfBounds and stop
- We should ideally, fix the code so that to prevent the runtime exception

Example:

int[] nums = {30, 40, 50};

System.out.println(nums[1]);

**OR we can handle it using try catch. then code will not stop**

Example:

try{

int[] nums = {30, 40, 50};

System.out.println(nums[5]);

} catch(Exception e) {

e.printStackTrace();

}

**Can we declare un-checked exceptions using THROWS keyword?**

- Yes, but it will not make any benefit or difference. So no need to do so

---

**IQ: Difference between Checked vs Unchecked Exceptions?**

- checked exceptions are checked during compile time, and must be handled using TRY catch or declared using throws keyword for code to compile. Otherwise code will not compile
- try catch -> code will not stop if exception happens
- throws -> code will stop if exception happens

---

- Unchecked exceptions are also called RuntimeExceptions, they are thrown during Runtime, and normally happen due to programming mistakes like wrong index, null pointer etc.
- checked exceptions are Throwable , Exception classes and all sub classes of Exception class except RuntimeTimeException classes
- unchecked exceptions are RuntimeException and all its sub classes
- checked exceptions : Examples could be Thread.sleep. reading from files, connecting to database type of codes
- un-checked exceptions : Examples ArrayIndexOutOfBounds Exception, Nullpointer exception

**IQ: Difference between throw vs throws keywords?**

- THROW keyword is used to throw Exception manually, programmatically.

throw is followed by new object of Exception type

Example:

throw new IllegalArgumentException("message");

THROWS keyword is used to DECLARE the exception in the method signature.

We normally use throws while working with checked exceptions.

**IQ: Can we create custom exceptions?**

- Normally, we might need custom exceptions for project specific errors
- Yes, We can create a class for our custom exception and extend either Exception or RuntimeException classes

Example:

Bank application might need a custom exception like:

- InsufficientFundException
- InvalidPinException
- CannotTransferFundsException

**Try Finally**

Example:

try{

A

B

} finally {

C

}

D

- A or B has issue: C will ALWAYS run. D will not run
- we put code into try that might throw exception, but we do not want to handle it, so we do not use catch
- finally - we put code that is guaranteed to run no matter if try block was successful or no. except System.exit(0)
 */