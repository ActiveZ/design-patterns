package composite;

public class File implements IFile {
	String fileName;
	public File(String name) {
		this.fileName = name;
	}

	@Override
	public boolean add(IFile file) {
		return false;
	}

	@Override
	public boolean remove(IFile file) {
		return false;
	}

	@Override
	public String toString() {
		return "File [fileName=" + fileName + "]";
	}

	
}
