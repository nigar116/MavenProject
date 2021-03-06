package com.cybertek.tests;

public class Note {
    /*
    12/15 Saturday Class


1. xpath which uses the hierarchy (parent/child) of elements to locate an object. starts with single slash and html. always starts searching from the html


a
div
div
div
body
html


/html/body/div/div/div/a

/ in between elements mean child

Absolute xpath

input
form
div
div
div
body
html

/html/body/div/div/div/form/input

disadvantages:
1. absolute xpath relies on page not being changed. if the html tree changes, xpath will stop working
2. tends to get very very long


_____


relative xpath: does not depend on html structure, doesnt start with double slashes. will search anywhere in the document


<button class="btn btn-primary" type="submit" value="Search" aria-label="Search"> Search</button>

2. using tag, attibute and name

//tag[@attibute='value']

//button[@class='btn btn-primary']
//button[@class=\"btn btn-primary\"]

3. Nth child


/html/body/div/div/div/form/input[2]  --> second input child of form

a
li: li is the second child ul
ul
div
div
div
body
html

/html/body/div/div/div/ul/li[2]/a


if it's nested within li - would we write something like

li[2]/li[17]/li[1]/...?


4. any single tag

//tag

//ul/li[2]  : any ul element in the page

//ul/li[2] =  /html/body/div/div/div/ul/li[2]/a


5. by exact text

//tag[.='text']

//tag[text()='sthg']

<h3>Frames</h3>

//h3[.='Frames']

6. by partial text

//tag[contains(text(), 'text')]

//h3[contains(text(), 'Fra')]

7. any element with certain text, attribute


//*[.='Frames']   : any tag with text 'Frames'

//*[@class='btn btn-primary']

8. Nth match

//a[.='Help']

page has Help in two places, i want the second one.
1. i write xpath that matches both
	//a[.='Help']
2. select the second match by putting the xpath in paranthesis and providing index outside the pranthises

	(//a[.='Help'])[2]
__



9. dynamic attributes: contains, starts, ends

//tag[contains(@attribute,'value')]
//tag[starts-wth(@attribute,'value')]
//tag[ends-with(@attribute,'value')]

<button id="j_idt691" ></button>

//button[contains(@id, 'j_idt')]

//button[starts-wth(@id,'j_idt')]

10. using 2 or more xpath
1. write an xpath which matches multiple elements

//a[.='Help']

2. write an xpath that locates the section of the page where my element is
//div[@id='navFooter']

3. mixx and patch

//div[@id='navFooter']//a[.='Help']

it will first find the div section then it will look for the a tag within that div

WHAT IS THE BEST XPATH?

there is no xpath which always works, in general there is not locator which works every time. all depends on the element we want to locate.

There is no best Xpath. There is good tester who use all of them.

_____

TestNG

Unit testing: testing the small pieces of the code. done by developers
Tools : Junit, TestNG  they are used for unit testing in Java

add testng dependency to your project:
	1. go to mvn reportsoty
	2. llok for testng
	3. select version
	4. copy
	5. paste in to pom file

  <scope>test</scope>   --> it means only the code in the test package can use this dependency


<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
   <groupId>org.testng</groupId>
   <artifactId>testng</artifactId>
   <version>6.14.3</version>
   <scope>test</scope>
</dependency>



___
	Create a new package
		1. right click on com.cybertek
		2. select NEW -->  package
		3. enter package name tests
		4. ENTER


____

	Create a new class:
		1. rifght click on tests package
		2. select NEW -->  class
		3. enter class name TestNGDemo
		4. ENTER


In testNG/Junit, we use annotations to indicate whether the method is a test

@Test --> it mean the method we are writing is a unit test. we dont need main method to run unit tests. when we have a method with @Test annotation we can run it as a test, no main method required

@BeforeMethod --> runs one time before any @Test method
if we have one @test, BeforeMethod will run one time
if we have two @test, BeforeMethod will run two times, once before each method

if tehre is not @Test in this class or any child class, @beforemethod will not run


@BeforeCLass: runs once time before anything in this class


@AfterMethod --> runs one time after any @Test method
if we have one @test, AfterMethod will run one time
if we have two @test, AfterMethod will run two times, once after each method

if tehre is not @Test in this class or any child class, @aftermethod will not run


@AfterCLass: runs once time after anything in this class

Crate a new class
	AssertionsDemo


TestNG assertions:  methods for asserting/verify. ALl the assertions are provided in the Assert class

assertEquals(a, b)  --> asserts if both parameters are equal


b.contains(a) --> asserts if the passed parameter is true



so assertEqauls does this in one line:
        if (expected.equals(actual)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println(expected);
            System.out.println(actual);
        }

 WHY DO WE HAVE TO USE UNIT TESTING TOOLS:
 1. we can organize tests to diffretn test methods, we cna create multpiple @Test method
	2. We can run tests selectively
3.assertion methods: TestNG provides ready methods for comparing, asserting etc
4. automatic reporting

If any assertion fails, rest of the method will not execute. other methods and before/after methods will still execute


     */
}
