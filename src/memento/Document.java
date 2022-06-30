package memento;

public class Document {
	
	private String content="";

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void setMemento(Memento memento) {
		this.content = memento.getContent();
	}
	
	public Memento createMemento() {
		return new Memento(content);
	}

}
