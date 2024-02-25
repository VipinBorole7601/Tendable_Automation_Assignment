# Tendable Web Automation Assignment

Running Steps:-

1 go to my git hub account --> VipinBorole7601 or https://github.com/VipinBorole7601/Tendable_Automation_Assignment.git

2 click on code and select download zip this will download project file to you

3 Extract this zip file in your laptop

4 Open Eclipse IDE --> click on file from header select import --> select general --> select project from folder or Archive --> click on directory and select Tendable_Automation_Assignment master folder -- > select folder --> finish

5 Wait until project completly loaded in Exclipse workspace

6 Right click on project click on show in Local Terminal --> select Terminal

7 Now in this Terminal write following command

--> mvn clean

wait until it execute then next command on same terminal

--> mvn test

8 Execution started and You are able to see results in the same Terminal command

9 also after complete run , right click on your project from package explore and refresh here now you are able to see extent reports in Extent Reports folder

Project Discription and strategy used in this Framework

1 here I used a Maven Project with TestNG Framework

2 I create a POM model to execute my test cases

3 as you see the folders src/main/java --> contains Pages package which has page element adress and oprational methods

4 in src/test/java ---> I create a Tests package , Browserclass package,Listneres package,Utility package

5 added my required dependencies in pom.xml tile

6 to run my project I have my testng.xml file

7 I used the POM hybrid Framework

8 I divide 5 scenarios in 5 Test cases and Execute Them , you can track execution in terminal window and Extent Reports

9 I also attached take screenshot method for if any failure occured during execution

Project Flow :

When we start Automation it will start testing upper menu such as home , our story, our solution ,why tendable?, along with this I tested Request a demobutton is enable and active then
we move to click on contact us seleck marketing , select contact button and fill the for withous message and capture the error

code end...
