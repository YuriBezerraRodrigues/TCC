package model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * a semana e composta por COURSE, que esta ligada ao curso, por uma SECTION 
 * que e a semana e por um SUMMARY, que e a descricao. 
 * Todo curso tem uma SECTION com valor 0 que e sua pagina inicial
 * 
 * */
@XmlRootElement
public class Semanas {
	
	private String nameSection;//nome da semana
	private String summary;//descricao da semana
	private long idCourse;//id do curso
	private long idSection;//id da semana
	private long id; //id da instancia na tabela
	
	public Semanas( long id, long course, long section, String nameSection, String summary ){
		super();
		this.idCourse = course;
		this.idSection = section;
		this.nameSection = nameSection;
		this.summary = summary;
		this.id=id;
	}
	
	public Semanas(){
		
	}
	
	public long getSection(){
		return idSection;
	}
	
	public void setSection(long section){
		this.idSection = section;
	}
	
	public long getCourse() {
		return idCourse;
	}

	public void setCourse(long course) {
		this.idCourse = course;
	}
	
	public String getNameSection() {
		return nameSection;
	}
	
	public void setNameSection(String sectionName){
		this.nameSection = sectionName;
	}
	
	public String getSummary() {
		return summary;
	}
	
	public void setSummary(String descriptionSummary){
		this.nameSection = descriptionSummary;
	}

	public long getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(long idCourse) {
		this.idCourse = idCourse;
	}

	public long getIdSection() {
		return idSection;
	}

	public void setIdSection(long idSection) {
		this.idSection = idSection;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


}
