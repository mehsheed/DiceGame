package icas;
import java.util.Random;

public class Die {
	private int faceValue;
	private int minNum=1;
	private int maxNum=6;
	
	public int getFvalue()
	{
		return faceValue;
		
	}
	private void setFaceValue(int faceValue)
	{
		this.faceValue = faceValue;
	}
	public void rollDie()
	{
		Random random = new Random();
		int value = (int)Math.floor(Math.random()*(maxNum-minNum+1)+minNum);
		setFaceValue(value);
		
	}

}
