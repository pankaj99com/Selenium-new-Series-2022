package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 36, 22, 4, 87, 9, 32, 6 };

		int temp;

		int flag = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1 - i; j++)// i is given to skip the
														// already sorted number
			{

				if (a[j] > a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

					flag = 1;// added because if number is sorted and swapping
								// happing
				}

			}

			if (flag == 0) {// if flag==0 it means no more swapping is possible.
				break;
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
