package VAsiliySessions;
import java.util.Scanner;
public class ControlPanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create an array of hotdog stands
		// this our network of hotdog stands
				int cartNumber = 0;
				String command = "";
				HotDogStand[] stands = new HotDogStand[3];
				stands[0] = new HotDogStand(0, 0);
				stands[1] = new HotDogStand(1, 0);
				stands[2] = new HotDogStand(2, 0);

				Scanner scan = new Scanner(System.in);
				while (true) {
					System.out.print("Enter command:");
					command = scan.next();

					if (command.equals("sold")) {
						System.out.println("Enter Cart Number:");
						cartNumber = scan.nextInt();
						stands[cartNumber].justSold();
					} else if (command.equals("print")) {
						System.out.println("Enter Cart Number:");
						cartNumber = scan.nextInt();
						System.out.println("Cart sold: " + stands[cartNumber].getSold());
					} else if (command.equals("print-all")) {
						System.out.println("Total sold: " + HotDogStand.getTotal());
					} else {
						return;
					}
				}

			}
		}
