package com.javaex.basic;

// �ڹ��� �⺻ �ڷ��� ����
public class TypeEx {
	
	public static void main(String[] args) {
		// intLongTest();
		// floatDoubleTest();
		// booleanEx();
		charEx();
	}
	
	// char�� ����
	public static void charEx() {
		// 2����Ʈ (��ȣ����)
		// �����ڵ� �� ������ ��ġȭ�� �ڵ�
		// ' <- char
		// "" <- string
		char ch1 = 'A';
		char ch2 = '��';
		
		System.out.println("A->" + ch1);
		System.out.println("��->" + ch2);
		
		System.out.println(ch1+ch2);
	}
	
	// boolean ����
	public static void booleanEx() {
		// ���� true or false
		// �� ����, �� ������ ����� ��ȯ
		// �帧 ����, �ݺ����� �帧�� ������ �� �� ���� ����Ѵ�
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int v1 = 3;
		int v2 = 5;
		boolean result = v1 < v2;
		// �� ����, �� ������ ����� ��ȯ
		
		System.out.println("v1 < v2 ?" + result);
	}
	
	// �Ǽ��� ����
	// float (4) < double (8)
	public static void floatDoubleTest() {
		// ���е��� ����, ǥ�� ������ ���� �ڷ���
}
	

}
