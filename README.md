# FunWay_JavaProject

**INTRODUCTION**

FunWay Centre is a Game billing System project which aims in developing a computerized system to calculate the total bill which a customer has to pay. The user gives input of the cost of each game played by them and the total bill is calculated including tax incurred. The user can even login and logout by providing their name.
Overall, this project is developed to reduce the manual work of registering names and calculating bills.
Here is a list of some features which is provided in the application:
•	Easy way to login and logout
•	Automatic GST calculation
•	Message showing that Bill is Printed

**OBJECTIVE**:

	Automation- The application automates each and every activity of the manual system throughout. Thus the response time is very less and it works very fast.
	Accuracy-The application provides users a quick response with very accurate information regarding the user etc. any details/system in accurate manner as and when needed.
	User friendly-This project has a user friendly interface. It’s speedy and user friendly.
	Maintenance Cost- Reduces the cost of maintenance.


This billing system calculates the total amount of rides and fun games a person has played along with the taxes. also this system has a login and logout option such that to show the person printing the bill.<br>
**Also there are 8 components /panels in this project-**<br>
Topmost Panel is the header.
There are 2 panels of Indoor and Outdoor Game Prices.
2 panels to calculate the subtotal and the final total inclusive taxes.
The very bottom Panel there are 3 buttons.The TOTAL button for Displaying the final total,RESET button to reset all the entries to zero, EXIT  button to exit out from the system after pressing OK in the dialog box which appears.
Right side panels are for LOGIN and LOGOUT entries and the PRINT BILL button which uses Thread to hold down the printing process .Although the real printing process is not shown just the use of the thread is shown virtually that the bill is printed after some seconds.
The very bottom right text Area shows the credentials of the Creator.

funway.java - the main design file


there is a superClass.java file which calculates the prices of indoor and outdoor games,tax amount,subtotal,finaltotal by 
costOfIndoor(),costOfOutdoor(),getAmount(),getTax(),finalAmount() methods.

this superClass.java has a child class namesly subClass.java by which funway.java calls all the methods of the superClass.java file.


findTotalActionPerformed method - calculates the Total and subTotal along with the taxes.It takes the values /pricves from the indoor and outdoor games textfields and calculates them with the taxes .Then all the subtotals ,calculated tax and final total are set to their required text fields.


ResetActionPerformed method- It resets all the panel values to zero.

ExitActionPerformed- exiting from the system.


btn1 class used for loggin in- comprises of default constructor and parameterized constructor(name,post) .Takes the name and post of the user at the time of login and then displays the welcome message using the display method. 
here display method shows- method overloading
display() and display(name) and display (name,post) shows method overloading here.

btn2 class ehich extends btn1 class shows inheritance. basically it runs whne the logout button is pressed.
also has a default and parameterized constructor.as btn2 is inherited from btn1 class 'super()' keyword is used top get btn1 attributes.

also display() method from the btn1 class is overridden here in btn2 class as display(name,post,text) 

for printing the bill. Threading concept has been used. By clicking the PRINT BILL button a thread is started namely printThread which extends the thread class. with the hep of its run() method "the printing message is printed"  .thread.sleep(3000) for sleeping the thread for 3 seconds and so the printed text is displayed 3 seconds after we click the PRINT BILL button.
also as thread is used its body of the run(0 method is enclosed with the try catch block which also shows Exception Handling. if the thread is interrupted anyhow in between the process it will throw an InterruptedException.

Also there is a printer class(printer.java) which has a printer abstract class and has an abstract show() method. This show() method is just declared in the abstarct class and cannoty be defined.So the body of the show() method is written inside the 'p 'class which extends the printer class .This 'p' class is in the printerSubClass.java file. This shows the concept of abstract classes and abstract methods.

Also the printer.java file also has and interface called 'end' (interface end) which has a method declarted thankyou() .This thankyou() method is defined(body) in the printerSubClass .java file which has an 'ending class' which implements the 'end' interface .This shows the concept of interfaces.

A package named details has been created which has a class called detail.java which has the usn() function that returns USN and Section of the creator as String value. 
That details package is impoted in the printerSubClass.java file as import details.*;

'imported class' is made in printerSubClass.java inside which an object of detail class 'd' is creator and it calls the usn() method of detail class.<br><br>


**Total Concepts used**- 

Abstraction- Classes.<br>
Scope and Lifetime of variables.<br>
Declaring objects.<br>
Instance Variables of different data types.<br>
Constructors/Methods.<br>
'this' keyword.<br>
Inheritance.<br>
Overloading (Constructors/Methods)<br>
Overriding.<br>
Objects as parameters.<br>
Access control mechanism.<br>
Use of 'super'.<br>
Packages.<br>
Interfaces.<br>
Exception Handling.<br>
Creation of thread to execute a certain process.<br> 

