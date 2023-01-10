package org.lang;

public class LanguageInfo {
//method
	//methodname 
private void tamilLanguage() {
	System.out.println("tamilLanguage is");
	System.out.println("tamil is our mother toungue");
	System.out.println("tamil is an heritage language");
}
private void englishLanguage() {
	System.out.println("englishlLanguage is");
}
private void hindiLanguage() {
	System.out.println("hindiLanguage is");
}
private void teluguLanguage() {
	System.out.println("teluguLanguage is");
}
//main 
public static void main(String[] args) {
	//object creation
	//classname obj name = new classname();
	LanguageInfo a=new LanguageInfo();
	//methoid calling
	a.tamilLanguage();
	a.englishLanguage();
	a.hindiLanguage();
	a.teluguLanguage();
	StateDetails b = new StateDetails();
	b.southIndia();
	b.northIndia();
}
}