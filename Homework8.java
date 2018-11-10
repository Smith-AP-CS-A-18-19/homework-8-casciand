/*
Andrew Cascio
*/

public class Homework8 {

	/* Finish the constructor and create any necessary instance
	 * variables. A Homework8 object should have an array that
	 * holds n int values
	 */

	 private int[] r;

	public Homework8(int n) {
			r = new int[n];

	}

	/* Return the stored array
	 */
	public int[] problem1() {
			return r;
	}

	/* Fill the stored array with the provided int
	 */
	public void problem2(int n) {
			for (int i = 0; i < r.length; i++) {
					r[i] = n;
			}
	}

	/* Fill the stored array. The first value should be
	 * n, the second n-1, the third n-2, etc.
	 */
	public void problem3(int n) {
			for (int i = 0; i < r.length; i++) {
					r[i] = n - i;
			}
	}

	/* Find and return the maximum value in the
	 * provided array
	 */
	public int problem4(double[] arr) {
			double maximum = arr[0];
			for (int i = 1; i < arr.length; i++) {
					if (arr[i] > maximum) {
							maximum = arr[i];
					}
			}
			return (int) maximum;
	}

	/* Find and return the index of num in the
	 * provided array
	 */
	public int problem5(int[] arr, int num) {
			int index = 0;
			for (int i = 0; i < arr.length; i++) {
					if (arr[i] == num) {
							index = i + 1;
					}
			}
			return index;
	}

}
