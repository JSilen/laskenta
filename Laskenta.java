import java.util.Scanner;

public class Laskenta {
	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);

		System.out.println("Käytössäsi on seuraavat laskutoimitukset:");
		System.out.println("1: vähennyslasku");
		System.out.println("2: yhteenlasku");
		System.out.println("3: kertolasku");
		System.out.println("4: jakolasku");
		System.out.println("5: jakojäännös");
		System.out.println();

		int luku1, luku2;
		int laskutoimitus;

		System.out.print("Valitse laskutoimitus: ");
		laskutoimitus = lukija.nextInt();
		System.out.println();


		if (laskutoimitus >= 1 && laskutoimitus <= 5) {

			switch (laskutoimitus) {
				case 1:
					System.out.print("Anna ensimmäinen luku: ");
					luku1 = lukija.nextInt();
					System.out.print("Anna toinen luku: ");
					luku2 = lukija.nextInt();
					System.out.println();
					System.out.print(luku1 + " - " + luku2 + " = " + (luku1 - luku2));
					break;
				case 2:
					System.out.print("Anna ensimmäinen luku: ");
					luku1 = lukija.nextInt();
					System.out.print("Anna toinen luku: ");
					luku2 = lukija.nextInt();
					System.out.println();
					System.out.print(luku1 + " + " + luku2 + " = " + (luku1 + luku2));
					break;
				case 3:
					System.out.print("Anna ensimmäinen luku: ");
					luku1 = lukija.nextInt();
					System.out.print("Anna toinen luku: ");
					luku2 = lukija.nextInt();
					System.out.println();
					System.out.print(luku1 + " * " + luku2 + " = " + (luku1 * luku2));
					break;
				case 4:
					System.out.print("Anna ensimmäinen luku: ");
					luku1 = lukija.nextInt();
					System.out.print("Anna toinen luku: ");
					luku2 = lukija.nextInt();
					System.out.println();
					System.out.print(luku1 + " / " + luku2 + " = " + ((double) luku1 / luku2));
					break;
				case 5:
					System.out.print("Anna ensimmäinen luku: ");
					luku1 = lukija.nextInt();
					System.out.print("Anna toinen luku: ");
					luku2 = lukija.nextInt();
					System.out.println();
					System.out.print(luku1 + " % " + luku2 + " = " + (luku1 % luku2));
					break;
			}
		} else {
			System.out.println("Laskutoimituksen valinta pitää olla välillä 1-5.");
		}
	}
}