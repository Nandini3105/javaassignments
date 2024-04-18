package assignjava;

import java.util.InputMismatchException;

import org.openqa.selenium.chrome.ChromeDriver;
//WAP for throw and throws  keyword
public class Ass60 {
public static void main(String[] args)throws ArithmeticException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
	int a='c';
	throw new InputMismatchException();
}
}
