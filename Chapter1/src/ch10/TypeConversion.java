package ch10;

public class TypeConversion {

	public static void main(String[] args) {

		double dNum = 1.2;
		float fNum = 0.9F;

		int iNum1 = (int) dNum + (int) fNum;
		int iNum2 = (int) (dNum + fNum);

		System.out.println(iNum1);
		System.out.println(iNum2);

		double dnum = 1.2;
		float fnum = 0.9f;

		int inum1 = (int) dnum + (int) fnum;
		int inum2 = (int) (dnum + fnum);

		System.out.println(inum1);
		System.out.println(inum2);
	}

}