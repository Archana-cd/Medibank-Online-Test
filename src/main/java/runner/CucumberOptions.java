package runner;

public @interface CucumberOptions {

	String glue();

	String features();

	String[] plugin();

}
