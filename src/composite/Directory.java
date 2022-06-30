package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFile {
	String directoryName;
	public Directory(String name) {
		this.directoryName = name;
	}
	
	List<IFile> content = new ArrayList<>();

	@Override
	public boolean add(IFile file) {
		content.add(file);
		return true;
	}

	@Override
	public boolean remove(IFile file) {
		return content.remove(file);
	}
	
	public List<IFile> getContent(){
		return content;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Directory [directoryName=").append(directoryName).append(", content=");
		for (IFile iFile : content) {
			sb.append(iFile.toString()).append("");
		}
		sb.append("]");
		return sb.toString();
	}
	
	

}
