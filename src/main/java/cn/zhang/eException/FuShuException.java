package cn.zhang.eException;

public class FuShuException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7115051918034326311L;
	
	private int value;
	
    public FuShuException() {
        super();
    }
    
    public FuShuException(String msg,int value) {
        super(msg);
        this.value=value;
    }
    
    public int getValue() {
        return value;
    }

}
