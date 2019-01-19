
public class Forloop
{
private int i; // outer loop
private int j; //prints ampersands
private int k; // prints spaces
private int num =10; // width of pattern

public void run() {
pattern1();
pattern2();
pattern3();
pattern4();
}

public void pattern1() {
	for (i=0;i<num;i++) {
		for(j=0;j<=i;j++) {
			System.out.print("#");
		}
		System.out.println();
	}
	System.out.println();
}

public void pattern2() {
	for(i=0;i<num;i++) {
		for(k=0;k<i;k++) {
			System.out.print(" ");
		}
		for(j=num;j>k;j--) {
			System.out.print("#");
		}
		System.out.println();
	}
	System.out.println();
}

public void pattern3() {
	for(i=0;i<num;i++) {
		for(k=(num-1);k>i;k--) {
			System.out.print(" ");
		}
		for(j=0;j<=k;j++) {
			System.out.print("#");
		}
		System.out.println();
	}
	System.out.println();
}

public void pattern4() {
	for (i=0;i<num;i++) {
		for(j=num;j>i;j--) {
			System.out.print("#");
		}
		System.out.println();
	}
	System.out.println();
}

}
