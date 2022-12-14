package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/cucumber",glue= "Tutorijali.stepDefinitionsCucumber",
monochrome=true, plugin= {"html:terget/cucumber.html"})

public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	//za juninit ne treba nasledjivanje jer vec ima, testng nema pa mora da nasledi razne ficere potrebne za testiranje
	//run as testNG test
	//cucumber ne moze sam da ide , potreban mu je ili testng ili junit ili nesto slicno sto opet zavisi od toga kakav mi je projekat
	//gore u cucumberoptions moze da se doda i tag :   tags="Regression" za regresione stetove ako imam takvu grupu i slicno. 
	//testng se koristi samo za pokretanje nama testng anotacija! 
	
	
	

}
