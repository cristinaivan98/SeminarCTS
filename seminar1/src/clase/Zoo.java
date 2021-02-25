package clase;

import java.util.*;

public class Zoo implements ZooInterface{
	private Zookeeper zookeeper;
	private java.util.List<Animal> animalList;
	public Zoo(Zookeeper zookeper, List<Animal> animals) {
	
		this.zookeeper = zookeper;
		this.animalList = animals;
	}
	public Zoo() {
		
		this.animalList =new ArrayList<>();
		this.zookeeper = new Zookeeper("Ion");
	}
	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}
	public void FeedAllAnimals() {
		for(Animal animal:animalList) {
			zookeeper.feed(animal);
		}
	}
}
