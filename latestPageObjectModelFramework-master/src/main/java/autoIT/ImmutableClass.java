package autoIT;

import java.util.Date;

public final class ImmutableClass {

	private final String strImuttable;
	private final int  intImmutable;
	 private final Date dateMuttable; 
	  public ImmutableClass(String a, int b, Date date) {
		  this.strImuttable=a;
		  this.intImmutable=b;
		   this.dateMuttable=new Date(date.getTime());
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public  String getString() {
    	return strImuttable;
    }
    public Integer getInteger() {
    	return intImmutable;
    }
    public Date getDate() {
    	return new Date(dateMuttable.getTime());
    }
}
