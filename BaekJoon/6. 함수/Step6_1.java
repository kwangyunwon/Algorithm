package six;
/*
 * ���� n���� �־����� ��, n���� ���� ���ϴ� �Լ��� �ۼ��Ͻÿ�. �ۼ��ؾ� �ϴ� �Լ��� ������ ����.
 * Java: long sum(int[] a); (Ŭ���� �̸�: Test)
 * a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
 * ���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
 */
public class Step6_1 {
    long sum(int[] a) {
		long sum = 0;
       
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
