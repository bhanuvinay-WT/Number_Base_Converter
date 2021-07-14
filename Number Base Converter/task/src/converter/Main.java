package converter;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number in decimal system:");
        int decimal = scanner.nextInt();
        System.out.println("Enter target base:");
        int choice = scanner.nextInt();
        String value = "";
        switch (choice) {
            case 2:
                value = Integer.toBinaryString(decimal);
                break;
            case 8:
                value = Integer.toOctalString(decimal);
                break;
            case 16:
                value = Integer.toHexString(decimal);
                break;
        }
        System.out.println("Conversion result:" + value);
        scanner.close();

    }

	/*public static int bConversion(int decimal) {
		int i = 0, j = 0, k = 0;
		for (; decimal > 0; decimal = decimal / 2) {
			i = decimal % 2;
			j = j * 10 + i;
		}
		i = 0;
		for (; j > 0; j = j / 10) {
			i = j % 10;
			k = k * 10 + i;
		}
		return k;
	}

	public static int oConversion(int decimal) {
		int i = 0, j = 0, k = 0;
		for (; decimal > 0; decimal = decimal / 8) {
			i = decimal % 8;
			j = j * 10 + i;
		}
		i = 0;
		for (; j > 0; j = j / 10) {
			i = j % 10;
			k = k * 10 + i;
		}
		return k;
	}

	public static int hConversion(int decimal) {
		int i = 0, j = 0, k = 0;
		for (; decimal > 0; decimal = decimal / 16) {
			i = decimal % 16;
			j = j * 10 + i;
		}
		i = 0;
		for (; j > 0; j = j / 10) {
			i = j % 10;
			k = k * 10 + i;
		}
		return k;
	}*/
}