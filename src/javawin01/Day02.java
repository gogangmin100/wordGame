package javawin01;

public class Day02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ö���� ���� �⺻ ����100���̴�
		int pointyoungsu=100; // a�¿��� int = �ڷ���, ī�� ǥ���
		int pointchulsu=100; // b�� ö��
		// ö���� �ι��̰��
		pointchulsu=pointchulsu+10;
		pointyoungsu=pointyoungsu-10;
		pointchulsu=pointchulsu+10;
		pointyoungsu=pointyoungsu-10;
		//����
		pointchulsu=pointchulsu+2;
		pointyoungsu=pointyoungsu+2;
		//�������ѹ��̰��
		pointyoungsu=pointyoungsu+10;
		pointchulsu=pointchulsu-10;
		//��������
		System.out.println("������ ����"+pointyoungsu);
		System.out.println("ö���� ����"+pointchulsu);
	}
}
