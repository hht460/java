package gz.itcast.contactSys_web.exception;
/**
 * 姓名重复自定义异常类
 * @author APPle
 *
 */
public class NameRepeatException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NameRepeatException(String msg){
		super(msg);
	}
}
