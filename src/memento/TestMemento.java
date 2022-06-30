package memento;

import java.util.ArrayList;
import java.util.List;

public class TestMemento {

	public static void main(String[] args) {
		List<Memento> mementos = new ArrayList<>();
		int index = 0;
		Document doc = new Document();
		doc.setContent(doc.getContent()+"Première ligne dans le doc\n");
		doc.setContent(doc.getContent()+"Deuxième ligne dans le doc\n");
		mementos.add(doc.createMemento());
		index = mementos.size()-1;
		doc.setContent(doc.getContent()+"Troisième ligne dans le doc\n");
		doc.setContent(doc.getContent()+"Quatrième ligne dans le doc\n");
		mementos.add(doc.createMemento());
		index = mementos.size()-1;
		doc.setContent(doc.getContent()+"Dernière ligne dans le doc\n");
		
		System.out.println("doc avant restauration : "+doc.getContent());
		Memento toRestore = mementos.get(index);
		index --;
		doc.setMemento(toRestore);
		System.out.println("doc après la première restauration : "+doc.getContent());
		toRestore = mementos.get(index);
		index --;
		doc.setMemento(toRestore);
		System.out.println("doc après la deuxième restauration : "+doc.getContent());
		
		//redo :
		index+=2;
		doc.setMemento(mementos.get(index));
		System.out.println("doc après le premier redo : "+doc.getContent());
		

	}

}
