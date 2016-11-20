package gz.itcast.contactSys_web.service;

import gz.itcast.contactSys_web.entity.Contact;
import gz.itcast.contactSys_web.exception.NameRepeatException;

import java.util.List;

public interface ContactService {
	public void addContact(Contact contact)throws NameRepeatException;//添加联系人
	public void updateContact(Contact contact);//修改联系人
	public void deleteContact(String id);//删除联系人
	public List<Contact> findAll();  //查询所有联系人
	public Contact findById(String id);//根据编号查询联系人
}
