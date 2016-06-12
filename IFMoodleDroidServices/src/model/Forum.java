package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Forum {

	private long id;
	private String nome;
	private String course;
	private String intro;
	
	public Forum(long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Forum() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCourse(String course) {
		this.course = course;
		
	}
	public String getCourseForum(){
		return course;
	}
	public void setIntro(String intro) {
		this.intro = intro;
		
	}
	public String getIntro(){
		return intro;
	}
	
	
}
