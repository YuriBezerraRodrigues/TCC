package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Link {
	public Link(String name, String externalUrl) {
		super();
		this.name = name;
		this.externalUrl = externalUrl;
	}

	public Link() {
	}

	private String name;
	private String externalUrl;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExternalUrl() {
		return externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}

}
