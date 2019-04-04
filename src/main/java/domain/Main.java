package domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static final String CAR_NAME_QUESTION = "������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) �������� ����)";
	static final String REPETITION_QUESTION = "�õ��� ȸ���� ��ȸ�ΰ���?";
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(CAR_NAME_QUESTION);
		
		
		
		String nameOfCars = in.readLine();
		
		String[] carNameArr = nameOfCars.split(",");
		int numOfCars = carNameArr.length;
		
		//�ڵ��� �̸��� 5�� �̻�
		if(!checkCarNameLength(carNameArr)) {
			System.out.println("�ڵ��� �̸��� 5�� �ʰ��Դϴ�. �����մϴ�.");
			return;
		}
		
		
		Car[] carArr = new Car[numOfCars];
		
		for(int i = 0; i < numOfCars; i++) {
			carArr[i] = new Car(carNameArr[i]);
		}
		
		
	}
	
	private static  boolean checkCarNameLength(String[] carNameArr) {
		for(int i = 0; i < carNameArr.length; i++) {
			if(carNameArr[i].length() > 5) {
				return false;
			}
		}
		return true;
	}
	

}
