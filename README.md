retail-billing-system
====================

Action Item
===========

 On a retail website, the following discounts apply: 
1. If the user is an employee of the store, he gets a 30% discount 
2. If the user is an affiliate of the store, he gets a 10% discount 
3. If the user has been a customer for over 2 years, he gets a 5% discount. 
4. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 as a discount). 
5. The percentage based discounts do not apply on groceries. 
6. A user can get only one of the percentage based discounts on a bill.  

Project Description 
==================== 
 - Retail Billing System is a Maven project, this can be imported in eclipse as a Maven Project specifying the pom file. Run [mvn clean eclipse:eclipse] to generate eclipse files for the project.Run [mvn clean install] to install and to run all the test cases.
 
 - Cobertura for Coverage Analysis is included and Reporting.  'codecoveragecheck' profile is used in maven with Cobertura plugin.
   to generate Cobertura reports run [mvn clean cobertura:cobertura -Pcodecoveragecheck] . Reports will be generated in the target folder of the project. The Cobertura branch line coverage is greater than 80%                 	till last noticed and coverage threshold to be above 75% for the build is passed in the code coverage.
    
 - Test cases are written using Junit 4.0 and the project is kept simple following the OOPS concept.
 
 - This Application uses Java 1.7 but it is Java 1.8 compatible.
 