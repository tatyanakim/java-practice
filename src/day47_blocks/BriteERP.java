package day47_blocks;
import java.time.LocalDateTime;
import static day47_blocks.BriteERPloginTest.*;
public class BriteERP {

static {//automatically runs in the beginning
	System.out.println("Launch Brower");
	System.out.println("NAVIGATE to: "+TestData.url);


}
public static void enterEmail(){
	System.out.println("Enter email: "+TestData.email);
}
public static void enterPassword() {
	System.out.println("Enter password: "+TestData.password);

}public static void verifyLogin() {
	
	System.out.println("EXpected name : "+TestData.userName);
	System.out.println("Actual name displayed: Viktoria Lugovska");
	System.out.println("Login sucessfully- "+LocalDateTime.now());











}
}
















