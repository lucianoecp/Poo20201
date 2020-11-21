public class TestShapes {
	
	public static void main (String[] args) {
		PlayerPiece shape = new PlayerPiece();		
		TilePiece tile = new TilePiece();
		doShapes(shape);
		doShapes(tile);
	}
	
	public static void doShapes(GameShape shape) {
		shape.displayShape();
	}
}

