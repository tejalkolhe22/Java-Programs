package com.ed;
class Add{
void add(int i,int j)
{
	int s=i+j;
	System.out.println("two int sum="+s);
}
void add(byte i, byte j) {
    byte s = (byte) (i + j);
    System.out.println("two byte sum=" + s);
}


void add(short i, short j) {
	short s = (short) (i + j);
    System.out.println("two short sum=" + s);
}
void add(long i,long j) {
	long s = i + j;
    System.out.println("two long sum=" + s);
} 

void add(float i,float j) {
	float s=i+j;
	System.out.println("two float sum=" +s);
}
void add(double i,double j) {
	double s=i+j;
	System.out.println("two double sum=" +s);
}
}
public class AddMethodDatatype {


	public static void main(String[] args) {
		Add ad=new Add();
		ad.add(5, 8);
        //ad.add(113, 123);
		ad.add((byte)5, (byte) 8);
		ad.add((short)10, (short) 8);
		ad.add(10L,80L);
		ad.add(10.5f,80.7f);
		ad.add(10.70,12.50);
	}

}
