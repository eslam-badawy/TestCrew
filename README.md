﻿This is a simple task using Cucumber Framework with Selenium JAVA which contains the below structure :-
• The business of this simple task is :- 
1. Navigate to the following URL https://subscribe.stctv.com/sa-en
2. Validate the Subscription Packages – Type & Price and Currency for all Countries (SA / Kuwait and Baharin)

	
The Framework specifications:-

•   Maven project: I add all the needed dependencies in the POM.xml

•	Test runner class: The place which we can run  

•	Properties file: I add the url and the browser name

•	Junit dependency: I used Junit library

•	Page object model: I followed the POM

•	Hooks class: It contains the after and before scenario

•	Pretty report Plugin: it provided me with a pretty test report

•   Base class: It contains the webDriver, initializingBrowser(), implicit wait, and prop object

•   WebElement class: Which contains the clickOnElement() and getElementText() which can be used frequently

• This is a screenshot from the test report: https://drive.google.com/file/d/1FnAh9kV7HUKc3xyzrMKex8QAkdDl3z4x/view?usp=drive_link


