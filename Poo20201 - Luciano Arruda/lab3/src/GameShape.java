class GameShape {
	public void displayShape() {
		System.out.println("exibindo forma");
	}
	// mais codigo
}

class PlayerPiece extends GameShape {
	public void movePiece() {
		System.out.println("movimentando peca game");
    }
}
class TilePiece extends GameShape {
    public void getAdjacent() {
        System.out.println("obtendo partes adjacentes");
    }
	// mais codigo
}
