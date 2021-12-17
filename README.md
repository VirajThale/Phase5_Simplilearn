# Phase5_Simplilearn
#project used maven and testng, with background mysql and tomcat running, implementation done on Eclipse IDE 

Key point to know:
1)Project consist TestNg testcases running with DriverClass @AfterTest and @BeforeTest to start ChromeDriver
2)There are two Package inside src/test/pages/test
3)pages contains all locators and xpath to application 
4)test contains @Test method to execute methods from pages in consistant manners 
5)testcases conducted on application are :-
                                          a. to signin we need to create new member first
                                          b. sign in with newly created sign in cred
                                          c. go to home and add product to cart 3 product to cart 
                                          d. make checkout 
                                          e. make demopay for products
                                          f. if condiction follows you will see your order history

