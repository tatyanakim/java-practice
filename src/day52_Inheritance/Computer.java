package day52_Inheritance;

public class Computer {

	
	private String model;
	private String color;
	
	public boolean equals(Computer other) {
       if(model.contentEquals(other.model)&&(color.contentEquals(other.color))){
    	   
       }return true;
	}
	public Computer() {
		super();
	}
public Computer(String model,String color) {
	this.model=model;
	this.color=color;
}

	@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	result = prime * result + ((model == null) ? 0 : model.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Computer other = (Computer) obj;
	if (color == null) {
		if (other.color != null)
			return false;
	} else if (!color.equals(other.color))
		return false;
	if (model == null) {
		if (other.model != null)
			return false;
	} else if (!model.equals(other.model))
		return false;
	return true;
}
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
}
