package com.techelevator;

public class FruitTree {
	public String typeOfFruit;
	int piecesOfFruitLeft;
	
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit){
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;
	}
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if (piecesOfFruitLeft - numberOfPiecesToRemove < 0) {
			piecesOfFruitLeft = 0;
					return false;
		} else {
			piecesOfFruitLeft -= numberOfPiecesToRemove;
			return true;
		}
	}

}
