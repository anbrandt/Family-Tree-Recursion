package com.andrzej;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {


		FamilyTreeItems i1 = new FamilyTreeItems("Kowalski dziadek");
		FamilyTreeItems i2 = new FamilyTreeItems("Kowalski brat 2 pok");
		FamilyTreeItems i3 = new FamilyTreeItems("Kowalski brat 2 pok");
		FamilyTreeItems i4 = new FamilyTreeItems("Kowalski brat 3 pok");
		FamilyTreeItems i5 = new FamilyTreeItems("Kowalski brat 3 pok");
		FamilyTreeItems i6 = new FamilyTreeItems("Kowalski ojciec 3 pok");
		FamilyTreeItems i7 = new FamilyTreeItems("Kowalski 4 pok");
		FamilyTreeItems i8 = new FamilyTreeItems("Kowalski 5 pok");

//initialize three hash sets that encapsulate all children of a person within a SET! (hash set to be precize)
		HashSet<FamilyTreeItems> i1Children = new HashSet<FamilyTreeItems>();
		i1Children.add(i2);
		i1Children.add(i3);
		i1.setChildren(i1Children);

		System.out.println(i1Children.size());


		HashSet<FamilyTreeItems> i2ChildrenSecGen = new HashSet<FamilyTreeItems>();
		i2ChildrenSecGen.add(i4);
		i2ChildrenSecGen.add(i5);
		i2ChildrenSecGen.add(i6);
		i2.setChildren(i2ChildrenSecGen);

		System.out.println(i2ChildrenSecGen.size());


		HashSet<FamilyTreeItems> i5ChildrenThirdGen = new HashSet<FamilyTreeItems>();
		i5ChildrenThirdGen.add(i7);
		i5ChildrenThirdGen.add(i8);
		i5.setChildren(i5ChildrenThirdGen);

		System.out.println(i5ChildrenThirdGen.size());

		System.out.println("-------------------------");


		//1 - print all elements of the tree

		//the final method that is using recursion
		getAllFamilyTreeItems(i1);


		System.out.println("======================");
		//
		Iterator<FamilyTreeItems> iterator = i1Children.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---------------");


		Iterator<FamilyTreeItems> iterator2 = i2ChildrenSecGen.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println("---------------");

		System.out.println("With USING ITERATOR METHOD");
		Iterator<FamilyTreeItems> iterator3 = i5ChildrenThirdGen.iterator();
		while (iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}
		System.out.println();
		System.out.println();
		System.out.println("without using Iterator method");

		for (FamilyTreeItems familyTreeItems : i1Children) {
			System.out.println(familyTreeItems);
		}

		System.out.println("--------------");


//ćwiczenie z family tree na podstawie drzewa genealogicznego Mieszka I

	}

	//printing all elements of the tree using recursion
	public static void getAllFamilyTreeItems(FamilyTreeItems items) {
		System.out.println(items.getSurname());

		if (items.getChildren() != null) {
			Iterator iterator = items.getChildren().iterator();
			while (iterator.hasNext()) {
				getAllFamilyTreeItems((FamilyTreeItems) iterator.next());
			}
		}
	}

	//method that is not using recursion


}
